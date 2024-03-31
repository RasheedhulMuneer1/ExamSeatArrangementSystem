package com.mycompany.esaswithdv;

import View.Login;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ESASwithDV {

    public static Connection conn() throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/exam_seat_arrangement_db";
        String user = "root";
        String password = "";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, password);
        return conn;
    }

    public static void main(String[] args) {
        
        Login login = new Login();
        login.setVisible(true);
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            conn = ESASwithDV.conn();
            String sqlquery = "SELECT * FROM application_user";
            pst = conn.prepareStatement(sqlquery);
            rs = pst.executeQuery();
           /* if (rs.next()) {
                String name = rs.getString(0);
                String password = rs.getString(1);
                
                System.out.println("Name of the user:" + name);
                System.out.println("Password of user:" + password);
            } */
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (pst != null) {
                    pst.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}
