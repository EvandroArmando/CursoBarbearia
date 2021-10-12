/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Dao.UsuarioDao;
import Helpers.HelperUsuario;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

/**
 *
 * @author Evandro Armando
 */
public class LoginController {

    private final Login view;
    private final HelperUsuario helper;
    private final MenuPrincipalController controladorViewPrincipal;

    public LoginController(Login view, MenuPrincipalController  controladorViewPrincipal ) {  //controlador da tela login
        this.view = view;
        this.helper = new HelperUsuario(view);
        this.controladorViewPrincipal = controladorViewPrincipal;
        
    }

    public LoginController(Login aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void fizTarefa(){
        
        this.view.exibirMensagem("Login realizado com sucesso");
    }
    
    
    public void EntrarSistema(){
       
      Usuario modelo = helper.obtermodelo();
      UsuarioDao usuarioAutenticado = new UsuarioDao();
      usuarioAutenticado.consultarUsuario(modelo);
      
        if (usuarioAutenticado.consultarUsuario(modelo)==null) {
            
            this.view.exibirMensagem("Usario ou pass erradas");
            
        }else {
            this.view.exibirMensagem("Usuario Logado");
            this.view.dispose();
            this.controladorViewPrincipal.NavegarParaAgenda();
                       
        }
      
    }
    
    
    
}
