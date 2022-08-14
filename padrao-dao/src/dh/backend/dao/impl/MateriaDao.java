package dh.backend.dao.impl;

import dh.backend.dao.ConfiguracaoJDBC;
import dh.backend.dao.IMateriaDao;
import dh.backend.model.Materia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MateriaDao implements IMateriaDao<Materia> {
    private ConfiguracaoJDBC configuracaoJDBC;

    public MateriaDao() {
        this.configuracaoJDBC = new ConfiguracaoJDBC();
    }

    @Override
    public Materia save(Materia materia) {
        Connection connection = configuracaoJDBC.conectarComBanco();
        Statement statement = null;
        String query = String.format("INSERT INTO materias(materia) VALUES('%S')", materia.getMateria());
        try{
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet keys = statement.getGeneratedKeys();
            if(keys.next()){
                materia.setId(keys.getLong(1));
            }
            statement.close();
            connection.close();
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        return materia;
    }

    @Override
    public List<Materia> findAll() {
        Connection connection = configuracaoJDBC.conectarComBanco();
        Statement statement = null;
        String query = String.format("SELECT * FROM materias");
        List<Materia> materiaList = new ArrayList<>();
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                materiaList.add(new Materia(resultSet.getLong("id"), resultSet.getString("materia")));
            }
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return materiaList;
    }
}
