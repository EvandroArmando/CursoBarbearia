/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Cliente;
import database.Modulo_de_conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Evandro Armando
 */
public class ClienteDao {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 

    public ClienteDao() {
        
           conexao = Modulo_de_conexao.conector();
    }
    
    
    
      public ArrayList <Cliente> ListarTodosClientes(){
        
        List<Cliente> lista = new ArrayList<>();
          String sql ="select *from clientes ";
        
        try {
             pst = conexao.prepareStatement(sql);
              // a linha executa a query
              rs  = pst.executeQuery();
            while (rs.next()) {                
               Cliente c = new Cliente("0", "0", 0,"0", '0', "0", "0");
               c.setNome(rs.getString("nome"));
               lista.add(c);
            }
            pst.close();
            rs.close();
        } catch (Exception e) {
            System.out.println("erro ao buscar a lista "+e);
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados da databse");
        }
         
        return (ArrayList<Cliente>) lista;
        
        
    }
        
    
    
    
}
