package com.gla.jd;
import java.sql.*;

public class employee {
    public static void main(String[] args) throws Exception {
        Connection con = DBConnection.getConnection();

        String sql = "INSERT INTO employee VALUES (?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, 1);
        ps.setString(2, "Rahul");
        ps.setDouble(3, 35000);

        ps.executeUpdate();
        System.out.println("Employee added");
    }
}
