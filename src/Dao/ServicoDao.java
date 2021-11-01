/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Servico;
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
public class ServicoDao {
    
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 

    public ServicoDao() {
        
        conexao = Modulo_de_conexao.conector();

        
    }

    
    
    public ArrayList<Servico> ListarTodosServicos(){
        
        List<Servico> lista =  new ArrayList<>();
        String sql ="select *from servicos";
        
        
        try {
            pst= conexao.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while (rs.next()) {                
              Servico servico = new Servico(0, "", 0.0);
              servico.setDescricao(rs.getString("descricao"));
                System.out.println("sucesso em listar servicos");
              lista.add(servico);
              
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erro ao lista clientes");
        }
        
       return (ArrayList<Servico>) lista ;
        
        
    }


    public String SetarPreco(String ValorDoComboBoxServico) {
        
        String  Servico="";
        String sql = "select valor from servicos where descricao=\"frances\";";
        
        try {
            pst = conexao.prepareStatement(sql);
            rs=pst.executeQuery();
            if (rs.next()) {
                 Servico= rs.getString("valor");
                System.out.println("servico"+Servico); 
            }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "erro ao buscar preco do banco");

        }
        
        return Servico;
 
        
    }
    
    
    
    
    
    
    
    
}
