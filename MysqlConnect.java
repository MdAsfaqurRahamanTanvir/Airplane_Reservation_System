/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tonmoy
 */

import java.sql.*;
import javax.swing.*;
public class MysqlConnect {
    Connection conn=null;
    
    public static Connection ConnectionDB(){
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/clouds","root","");
            /*3306*/
            //JOptionPane.showMessageDialog(null, "Connected to database");
            return conn;
        }catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, e);
           return null;
        }
    
}
    }
}
    