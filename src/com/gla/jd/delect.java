package com.gla.jd;
import java.sql.*;
public class delect {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();

        String sql = "DELETE FROM employee WHERE salary < 15000";
        Statement st = con.createStatement();

        st.executeUpdate(sql);
        System.out.println("Low salary employees deleted");
    }
}
