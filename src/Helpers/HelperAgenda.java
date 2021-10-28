/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import Model.Cliente;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;

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


    
    
    
    
    
    
    
}
