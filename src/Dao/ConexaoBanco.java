/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Evandro Armando
 */
public class ConexaoBanco {
        public static Connection conector(){
      
       java.sql.Connection  conexao = null;
       String driver ="com.mysql.jdbc.Driver";  
       String url ="jdbc:mysql://localhost:3306/barbearia useTimezone=true&serverTimezone=UTC";
       String user ="root";
       String password="";
       
        try {
            Class.forName(driver);
            conexao =DriverManager.getConnection(url,user,password);
                System.out.println("sucesso na conexão");
            return conexao;
        
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        
        
        
        
    }
        
        

    
    
    
    
    
}
