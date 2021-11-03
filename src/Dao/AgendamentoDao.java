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
    
    
    public void adicionar(Agendamento agenda){
            String sql ="insert into agendamentos(id,cliente) values(default,?)";
        
        try {
             pst = conexao.prepareStatement(sql);
             pst.setString(1,agenda.getCliente().getNome());
             
             int executado = pst.executeUpdate();
             System.out.println(executado);
            if (executado >0) {
                JOptionPane.showMessageDialog(null,"Agendamento Cadastrado com  sucesso ");
              //  ComboBox.setSelectedItem(null);
               
            }
        } catch (Exception e) {
            System.out.println(e);
        }
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
               Agendamento agendamento = new Agendamento(0, cliente, servico, "ew", "sw", "sw");
               agendamento.setId(rs.getInt("id"));
               agendamento.setObservação(rs.getString("observacao"));
               agendamento.setValor(rs.getString("valor"));
               agendamento.setData(rs.getDate("data"));
               servico.setDescricao(rs.getString("servico"));
               cliente.setNome(rs.getString("cliente"));
               lista.add(agendamento);
 
               
            }
        } catch (Exception e) {
            
            System.out.println("erro ao buscar a lista "+e);
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados do agendamento");

        }
         
        return (ArrayList<Agendamento>) lista;
        
        
    }


    
    
    
    
}
