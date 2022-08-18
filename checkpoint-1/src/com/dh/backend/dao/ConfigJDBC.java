package com.dh.backend.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigJDBC {
    private String jdbcDrive;
    private String dbURL;
    private String nomeUsuario;
    private String senha;

    public ConfigJDBC() {
        this.jdbcDrive = "org.h2.Driver";
        this.dbURL = "jdbc:h2:~/test;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'data.sql'";
        this.nomeUsuario="root";
        this.senha = "";
    }

    public Connection conectarComBanco(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(dbURL,nomeUsuario,senha);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
