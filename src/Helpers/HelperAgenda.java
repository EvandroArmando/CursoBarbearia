/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import Model.Agendamento;
import Model.Cliente;
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
            agenda.getCliente(),
            agenda.getdataFormatada(),
            agenda.gethoraFormatada(),
            agenda.getObservação(),
            agenda.getValor(),
            agenda.getServico(),
            agenda.getId()
            
        });

    }

    }


    
    
    
    
    
    
    
}
