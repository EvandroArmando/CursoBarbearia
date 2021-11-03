/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import Model.Usuario;
import View.Login;
import javax.swing.JTextField;

/**
 *
 * @author Evandro Armando
 */
public class HelperUsuario implements Helpers{
    
    private final Login view;
    String nome,password;
    

    public HelperUsuario(Login view) {
        this.view = view;
    }
    
    
    @Override                             //obter dos dados vindos da tela
    public Usuario obterModelo() {
    String nome = this.view.getjUsuario().getText();
    String password = this.view.getjPassword().getText();
       
    Usuario modelo = new Usuario(password,nome);
    return modelo;
    

    }
//limpar os campos vindos da tela
    @Override
    public void limpaTela() {
      this.view.getjUsuario().setText("");//limpar tela usuario
      this.view.getjPassword().setText("");//limpar tela password

    }
    
}
