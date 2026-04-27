package com.gla.jd;
import java.sql.*;
public class update {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();

        String sql = "UPDATE employee SET salary = salary * 1.10 WHERE id = ?";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, 1);

        ps.executeUpdate();
        System.out.println("Salary updated");
    }
}