/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import Model.Cliente;
import Model.Usuario;
import View.UsuarioView;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Evandro Armando
 */
public class HelperViewUsuario {

    private final UsuarioView view;

    public HelperViewUsuario(UsuarioView view) {
        this.view = view;
        
        
    }
    
    public void preencherTabela(ArrayList<Usuario> usuarios){
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getjTabela().getModel();
        tableModel.setNumRows(0);
        
        //precorrer a lista preencher
        
        for (Usuario usuario : usuarios) {
            tableModel.addRow(new Object[]{
            usuario.getNome(),
            usuario.getSenha()
            
        });
    }
    
       }

    public void preencherJComboBoxClientes(ArrayList<Cliente> clientes) {
        
       DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getjComboBoxCliente().getModel();
       
        for (Cliente cliente : clientes) {
            comboBoxModel.addElement(cliente.getNome());
        }
        
    }
    
    
    
}
