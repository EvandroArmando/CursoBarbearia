/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Dao.AgendamentoDao;
import Dao.ClienteDao;
import Dao.ServicoDao;
import Dao.UsuarioDao;
import Helpers.HelperAgenda;
import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;

/**
 *
 * @author Evandro Armando
 */
public class AgendaController {

    private final Agenda view;
    private final HelperAgenda helper;

    public AgendaController(Agenda view) {
      
     this.view = view;  
     this.helper = new HelperAgenda(view);
    }
    
    
    public void actualizarjcomboBoxCliente(){
        
         ClienteDao cliente = new ClienteDao();
         ArrayList<Cliente> clientes = cliente.ListarTodosClientes();
         
         this.helper.PreecherJComboBox(clientes);
         
         
    }
    
    
    public void actualizarjcomboBoxServico(){
       
        ServicoDao servico = new  ServicoDao();
        ArrayList<Servico> servicos = servico.ListarTodosServicos();
        this.helper.PreencherJComboBoxServico(servicos);
        
        
    }

    
    public void actualizarTabela(){
        AgendamentoDao agendamento = new AgendamentoDao();
        ArrayList<Agendamento> agendamentos = agendamento.ListarTodosAgendamentos();
        this.helper.PreencherTabelaAgendamentos(agendamentos);
    }  
    
    
    public void actualizarPrecoServico(){
        
        Servico servico = helper.obterServico();
        System.out.println("oi  "+servico.getValor());
        helper.setarValor(servico.getValor());
    }
    
}
