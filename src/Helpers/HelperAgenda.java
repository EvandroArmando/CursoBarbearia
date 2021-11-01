/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import Dao.ServicoDao;
import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Evandro Armando
 */
public class HelperAgenda {

    private final Agenda view;

    public HelperAgenda(Agenda ViewAgenda) {
        this.view = ViewAgenda;
    }


    public void PreecherJComboBox(ArrayList<Cliente> clientes) {
               DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getTextCliente().getModel();
               
               for (Cliente cliente : clientes) {
               comboBoxModel.addElement(cliente);
            
        }
               
     

    }

    public void PreencherTabelaAgendamentos(ArrayList<Agendamento> agendamentos) {
        
               DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
        tableModel.setNumRows(0);
        
        //precorrer a lista preencher
        
        for (Agendamento agenda : agendamentos) {
            tableModel.addRow(new Object[]{
            agenda.getId(),
            agenda.getCliente(),
            agenda.getServico().getDescricao(),
            agenda.getValor(),
            agenda.getdataFormatada(),
            agenda.gethoraFormatada(),
            agenda.getObservação(),
            
        });

    }

    }

    public void PreencherJComboBoxServico(ArrayList<Servico> servicos) {
        
        DefaultComboBoxModel  comboBoxModel =(DefaultComboBoxModel) view.getTextServico().getModel();
        
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico.getDescricao());
            
        }
    }

    public Servico obterServico() {
       //return  (Servico) view.getTextServico().getSelectedItem();
       String ValorDoComboBoxServico = view.getTextServico().getSelectedItem().toString();
       ServicoDao dao = new ServicoDao();
       String resultadoDaBuscaDoPeco ="";
       resultadoDaBuscaDoPeco =dao.SetarPreco(ValorDoComboBoxServico);
       
        Servico servico = new Servico(0, resultadoDaBuscaDoPeco, 0);
        return servico;
               
        

    }

    public void setarValor(double valor) {
        
        view.getTextValor().setText(valor+"");
    }


    
    
    
    
    
    
    
}
