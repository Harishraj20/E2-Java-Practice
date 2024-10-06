package com.example.JDBCConnectivity;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {

    private static String dbUrl;
    private static String dbUser;
    private static String dbPassword;
    static {
        try (InputStream input = DatabaseConnection.class.getClassLoader().getResourceAsStream("database.properties")) {
            Properties prop = new Properties(); 
            prop.load(input);
            dbUrl = prop.getProperty("db.url");
            dbUser = prop.getProperty("db.user");
            dbPassword = prop.getProperty("db.password");

        } catch (IOException ex) {
         System.out.println(ex);
        }
    }

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
         return DriverManager.getConnection(dbUrl, dbUser, dbPassword);
    }
}
