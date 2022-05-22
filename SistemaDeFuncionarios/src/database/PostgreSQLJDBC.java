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
    Connection con = null;
    Statement stmt = null;
    ResultSet rs = null;
    
        
    public PostgreSQLJDBC(){
        // inicializa conexao
        try {
            Class.forName("org.postgresql.Driver");
            this.con = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/sisfunc",
                "postgres", "qwer1234");
            
            con.setAutoCommit(false);
            stmt = con.createStatement();
            
            System.out.println("Banco de dados acessado com sucesso!");
            
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("Erro na conexão com o banco de dados: "+e.getMessage());
        }
    }
    
    public ResultSet queryCon(String sql){
        // exemplo sql = "SELECT * FROM gestores;";
        try {
            ResultSet rs = stmt.executeQuery(sql);
            return rs;
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("Erro ao fazer query ao DB: "+e.getMessage());
        }
        return rs;
    }
    
    public boolean exec(String sql){
        try {
            stmt.executeUpdate(sql);
            con.commit();
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("Erro ao executar codigo SQL: "+e.getMessage());
            return false;
        }
        return true;
    }
    
    public void closeCon() throws Exception {
        try {
            //rs.close();
            stmt.close();
            con.close();
        }catch (Exception e){
            throw new Exception("Erro ao fechar conexão: ", e);
        }
    }
}
