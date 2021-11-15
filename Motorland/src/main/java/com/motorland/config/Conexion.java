package com.motorland.config;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Conexion {
    public DriverManagerDataSource getConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/motorland");
        dataSource.setUsername("root");
        dataSource.setPassword("pwdrootmysql");

        return dataSource;
    }
}
