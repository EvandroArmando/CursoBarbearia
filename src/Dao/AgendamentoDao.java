/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import database.Modulo_de_conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeArray.map;
import static jdk.nashorn.internal.objects.NativeJava.type;

/**
 *
 * @author Evandro Armando
 */
public class AgendamentoDao {
    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null; 

    public AgendamentoDao() {
        conexao = Modulo_de_conexao.conector();
        
        

    }
    
        public ArrayList <Agendamento> ListarTodosAgendamentos(){
        
        List<Agendamento> lista = new ArrayList<>();
          String sql ="select *from agendamentos ";
        
        try {
             pst = conexao.prepareStatement(sql);
              // a linha executa a query
              rs  = pst.executeQuery();
            while (rs.next()) {  
               //listar a tabela de coisas
                Cliente cliente = new Cliente("0", "0", 0,"0", '0', "0", "0");
                Servico servico = new Servico(0, "", 0);
               Agendamento agendamento = new Agendamento(0, cliente, servico, "sw", "sw", "sw");
               String servicoConvertido = cliente.toString();
               agendamento.setId(rs.getInt("id"));
               agendamento.setObservação(rs.getString("observacao"));
               agendamento.setValor(rs.getString("valor"));
               agendamento.setData(rs.getDate("data"));
               cliente.setNome(rs.getString("cliente"));
               servico.setDescricao(rs.getString("servico"));
               lista.add(agendamento);
               
               
            }
            pst.close();
            rs.close();
        } catch (Exception e) {
            System.out.println("erro ao buscar a lista "+e);
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados da databse");
        }
         
        return (ArrayList<Agendamento>) lista;
        
        
    }


    
    
    
    
}
