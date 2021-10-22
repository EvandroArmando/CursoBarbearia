/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Dao.ClienteDao;
import Dao.UsuarioDao;
import Helpers.HelperViewUsuario;
import Model.Cliente;
import Model.Usuario;
import View.UsuarioView;
import java.util.ArrayList;

/**
 *
 * @author Evandro Armando
 */
public class ControllerViewUSuario {

    private final UsuarioView view;
    private final HelperViewUsuario helper;

    public ControllerViewUSuario(UsuarioView  view) {
      
        this.view = view;
        this.helper = new HelperViewUsuario(view);
        
    }
    
    
    
    public void actualizarTabela(){
        UsuarioDao user = new UsuarioDao();
        ArrayList<Usuario> usuarios =user.ListarTodosUsuarios();
        
        helper.preencherTabela(usuarios);
    }
    
    
    public void actualizarjComboBoxCliente(){
        ClienteDao cliente = new ClienteDao();
        ArrayList<Cliente> clientes = cliente.ListarTodosClientes();
        helper.preencherJComboBoxClientes(clientes);
        
    }
    
}
