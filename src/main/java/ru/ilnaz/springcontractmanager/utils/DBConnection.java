package ru.ilnaz.springcontractmanager.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static String url = "jdbc:mariadb://localhost:3306/customer";
    public static String user = "root";
    public static String pass = "";

    public static Connection getConnection () throws SQLException {
        return DriverManager.getConnection(url, user, pass);
    }

}
