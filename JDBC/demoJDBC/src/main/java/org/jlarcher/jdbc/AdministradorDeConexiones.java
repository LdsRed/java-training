package org.jlarcher.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdministradorDeConexiones {

    private static String url = "jdbc:mariadb://localhost:3306/ejercicio04";
    private static String dbUser = "phreacker";
    private static String dbPassword ="1998";
    private static Connection connection;


    public static Connection getConnection() throws SQLException {

        if(connection == null ){
            connection = DriverManager.getConnection(url, dbUser, dbPassword);
        }
        return connection;

    }
}
