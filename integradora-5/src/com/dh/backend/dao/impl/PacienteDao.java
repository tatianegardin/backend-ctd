package com.dh.backend.dao.impl;

import com.dh.backend.dao.ConfiguracaoJDBC;
import com.dh.backend.dao.IPacienteDao;
import com.dh.backend.model.Paciente;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PacienteDao implements IPacienteDao<Paciente> {
    private ConfiguracaoJDBC configuracaoJDBC;

    public PacienteDao() {
        this.configuracaoJDBC = new ConfiguracaoJDBC();

    }

    @Override
    public Paciente save(Paciente paciente) {
        Connection connection = configuracaoJDBC.conectarComBanco();
        String queryPaciente ="INSERT INTO paciente(nome, sobrenome, rg, data, endereco) VALUES(?,?,?,?,?)";
        String queryEndereco ="INSERT INTO endereco(rua, numero, cidade, bairro) VALUES(?,?,?,?)";
       // String query = String.format("INSERT INTO paciente VALUES('%S, %S, %S', %S, %S)", paciente.getNome(), paciente.getSobrenome(), paciente.getRg() );
        try{

            PreparedStatement SQLInsertEndereco = connection.prepareStatement(queryEndereco, Statement.RETURN_GENERATED_KEYS);

            SQLInsertEndereco.setString(1, paciente.getEndereco().getRua());
            SQLInsertEndereco.setString(2, paciente.getEndereco().getNumero());
            SQLInsertEndereco.setString(3, paciente.getEndereco().getCidade());
            SQLInsertEndereco.setString(4, paciente.getEndereco().getBairro());
            SQLInsertEndereco.execute();
            ResultSet keys = SQLInsertEndereco.getGeneratedKeys();
            int id = 0;
            while (keys.next()){
                id = keys.getInt(1);
            }

            PreparedStatement SQLInsert = connection.prepareStatement(queryPaciente, Statement.RETURN_GENERATED_KEYS);
            SQLInsert.setString(1,paciente.getNome());
            SQLInsert.setString(2,paciente.getSobrenome());
            SQLInsert.setString(3,paciente.getRg());
            SQLInsert.setObject(4,paciente.getData());
            SQLInsert.setInt(5, id );
            SQLInsert.execute();
            ResultSet key = SQLInsert.getGeneratedKeys();
            if(key.next()){
                paciente.setId(key.getInt(1));
            }
            connection.close();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return paciente;
    }

    @Override
    public List<Paciente> findAll() {
        Connection connection = configuracaoJDBC.conectarComBanco();
        Statement statement = null;
        String query = String.format("SELECT * FROM paciente");
        List<Paciente> pacienteList = new ArrayList<>();
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                pacienteList.add(new Paciente(resultSet.getInt("id"), resultSet.getString("nome")));
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return pacienteList;
    }

    @Override
    public Paciente findById(int id) {
        Connection connection = configuracaoJDBC.conectarComBanco();
        String query = "SELECT * FROM paciente WHERE id = ?";
        Paciente paciente = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
            ResultSet resultSet = preparedStatement.getResultSet();

            while (resultSet.next()){
                paciente = new Paciente(resultSet.getInt("id"), resultSet.getString("nome"));
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return paciente;
    }

    @Override
    public void deleteById(int id) {
        Connection connection = configuracaoJDBC.conectarComBanco();
        String query = "DELETE FROM paciente WHERE id = ?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1,id);
            preparedStatement.execute();
            System.out.println("Deletado com sucesso!");

        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
