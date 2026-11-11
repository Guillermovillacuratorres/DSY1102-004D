package com.example.ejerciciotipoprueba.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/personas_db";
    private static final String USER = "root";
    private static final String PASSWORD = "system";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }


    public static void main(String[] args){
        try(Connection con = DatabaseConnection.getConnection()){
            System.out.println("Conexion establecida....");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
