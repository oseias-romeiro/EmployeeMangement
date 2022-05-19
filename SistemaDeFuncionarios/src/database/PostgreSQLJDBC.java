/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author oseia
 */
public class PostgreSQLJDBC {
    public PostgreSQLJDBC(){
    
        Connection con = null;
        Statement stmt = null;
        
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/sisfunc",
            "postgres", "qwer1234");
            
            con.setAutoCommit(false);
            
            System.out.println("Opened database successfully");
        
            stmt = con.createStatement();
            String sql = "SELECT * FROM gestores;";
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                System.out.println(rs.getString("Nome"));
            }
            
            rs.close();
            stmt.close();
            con.close();
        
        }catch (Exception e){
            e.printStackTrace();
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
    }
}
