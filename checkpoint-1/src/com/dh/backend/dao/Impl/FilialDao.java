package com.dh.backend.dao.Impl;

import com.dh.backend.dao.ConfigJDBC;
import com.dh.backend.dao.IFilialDao;
import com.dh.backend.model.Filial;
import org.apache.log4j.Logger;

import java.sql.*;
import java.util.List;

public class FilialDao implements IFilialDao<Filial> {
    private ConfigJDBC configuracaoJDBC;
    private Logger logger = Logger.getLogger(FilialDao.class);

    public FilialDao() {
        this.configuracaoJDBC = new ConfigJDBC();

    }

    @Override
    public Filial save(Filial filial) {
        Connection connection = configuracaoJDBC.conectarComBanco();
        logger.info("Conexão com o banco");
        PreparedStatement statement = null;
        String sqlInsert = "INSERT INTO filial(nome, rua, numero, cidade, estado, e5Estrela) VALUES(?,?,?,?,?,?)";
        try {
            statement = connection.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, filial.getNomeFilial());
            statement.setString(2, filial.getRua());
            statement.setString(3, filial.getNumero());
            statement.setString(4, filial.getCidade());
            statement.setString(5, filial.getEstado());
            statement.setBoolean(6, filial.isCincoEstrelas());
            statement.execute();
            logger.info("Filial persistida no banco");

            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next()){
                filial.setId(keys.getInt(1));
            }
            logger.debug("Filial adicionada com sucesso" + filial);

        }catch (SQLException exception){
            logger.error(exception.getMessage());
        }
        return filial;
    }


}
