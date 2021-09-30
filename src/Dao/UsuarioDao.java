/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helpers.HelperUsuario;
import Model.Usuario;
import database.Modulo_de_conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Evandro Armando
 */
public class UsuarioDao {
    
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 
    public UsuarioDao( ) {        
              conexao = Modulo_de_conexao.conector();
  
    }

 
   //criar Usuer 
   public void criarUsuario(Usuario user ){
        
                    String sql ="insert into usuarios(senha,nivel_acesso,nome,sexo,data_nascimento,telefone) values(?,?,?,?,?,?)";
        
        try {
             pst = conexao.prepareStatement(sql);
             pst.setString(1,user.getSenha());             
             pst.setString(2,user.getNivel_acesso());
             pst.setString(3,user.getNome());                          
             pst.setString(4,Character.toString(user.getSexo()));
             pst.setString(5,user.getData_nascimento().toString());
             pst.setString(6,user.getTelefone());

             pst.executeUpdate();
            
             
        } catch (Exception e) {
            System.out.println(" "+e);
            
        }
        
    }

        
        
    
    
     void eliminarUsuario(){
        
    }

     
    void ActualizarUsuario(){
        
    }
    
    
    
     String consultarUsuario(Usuario user){
       
        String sql ="select *from usuarios where nome=? and senha =?";
        
        try {
             pst = conexao.prepareStatement(sql);
             pst.setString(1, user.getNome());
             pst.setString(2, user.getSenha());
              
              // a linha executa a query
              rs= pst.executeQuery();
              
           return "sucesso";   

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

        
        
    }
    
    
    
    
}
