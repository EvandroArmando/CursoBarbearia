/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Dao.ConexaoBanco;
import Dao.DatabaseCreat;
import  Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Evandro Armando
 */
public class NewMain {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        
    Usuario user = new Usuario("1234", "adm", 12, "rui", 'C', "27-09-1997", "911825429"); 
    
        System.out.println("");
        System.out.println(user.getData_nascimento());
        
        
        
        
     Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    
            
       
        if (ConexaoBanco.conector()==null) {
            DatabaseCreat.criar();
        
        } else {
        
            

            
            
            
        }
        
        
        
        
    }
    
}
