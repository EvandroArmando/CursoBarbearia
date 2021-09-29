/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Evandro Armando
 */
public class DatabaseCreat {
    
   static final String DB_URL = "jdbc:mysql://localhost/";
   static final String USER = "root";
   static final String PASS = "";
  PreparedStatement pst = null;
  ResultSet rs = null;

       Connection conexao = null;

    
public static Connection criar(){
    
           java.sql.Connection  conexao = null;

    
    try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         String sql = "CREATE DATABASE barbearia";
         stmt.executeUpdate(sql);
         System.out.println("Database created successfully..."); 
         conexao =DriverManager.getConnection(DB_URL,USER,PASS);
         CriarTabelaUsuario();
        return conexao;         
      } catch (SQLException e) {
         e.printStackTrace();
         return null;
      } 
   }
    
    
   
    
    
    
    public static Connection CriarTabelaUsuario( ){
         
         try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/barbearia", USER, PASS);
         Statement stmt = conn.createStatement();
      ) {	
         
         String sqls = " CREATE TABLE Usuarios " +
                  "(id int not null  auto_increment, " +
                   " senha Varchar(30),"
                 + "nivel_acesso varchar(30),"
                 + "nome varchar(30),"
                 + "sexo ENUM('M', 'F'),"
                 + "data  varchar(20),"
                 + "telefone varchar(20)," +
                   " PRIMARY KEY ( id ))"; 

         stmt.executeUpdate(sqls);
         System.out.println("Created table in given database...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
       return null;
        
    }
    
    
        
        
        
        
        
    
    
}
