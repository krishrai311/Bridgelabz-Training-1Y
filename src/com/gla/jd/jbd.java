package com.gla.jd;
import java.sql.*;

public class jbd {
    public static Connection getConnection() throws Exception {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "password";

        return DriverManager.getConnection(url, user, password);
    }
}
