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
public class HelperUsuario {
    
    private final Login view;
    String nome,password;
    

    public HelperUsuario(Login view) {
        this.view = view;
    }
    
    
    public Usuario obtermodelo(){  //funcao que retorna um objecto usuario
    String nome = this.view.getjUsuario().getText();
    String password = this.view.getjPassword().getText();
       
    Usuario modelo = new Usuario(nome, password);
    return modelo;
    
    
        
    }
    
    public void setaModelo(Usuario modelo){
       nome = modelo.getNome();
       password = modelo.getSenha();
              
       this.view.getjUsuario().setText(nome);
       this.view.getjPassword().setText(password);
       
       
    }
    
    
    void limparTela(){
        
      this.view.getjUsuario().setText("");//limpar tela usuario
      this.view.getjPassword().setText("");//limpar tela password
    }
    
}
