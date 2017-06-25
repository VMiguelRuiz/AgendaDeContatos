package br.com.agenda.cf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private Connection connection;
    private String user;
    private String password;
    private String server;
    private String url;

    public Connection getConnection() throws SQLException {
        url = "jdbc:mysql://localhost/Agenda";
        user = "root";
        password = "1234";
        try {
            connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (SQLException e) {
            return null;
        }
    }
}
