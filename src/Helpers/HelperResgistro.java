/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import Model.Usuario;
import View.Registro;

/**
 *
 * @author Evandro Armando
 */
public class HelperResgistro {

    private final Registro view;
    private  String nome;
    private  String telefone;
    private  String nivel_acesso;
    private  String data_nascimento;
    private  String senha;
    private  char sexo;

                        

    

    public HelperResgistro(Registro view) {
        this.view = view;
    }
    
    
 
    public Usuario obterModelo(){
         
          nome = view.getjNome().getText();
          senha = view.getjSenha().getText();
          data_nascimento =view.getJdata().getText();
          nivel_acesso = view.getjAcesso().getText();
          telefone = view.getjTelefone().getText();
          String acessor =view.getJsexo().getText();
           sexo = acessor.charAt(0);
          
          Usuario  modelo  = new Usuario(senha, nivel_acesso, nome, sexo, data_nascimento, telefone);
          
          return modelo;
        
        
    }
    
    
    
    void LimparTela(){
        
      view.getJdata().setText("");
      view.getJsexo().setText("");
      view.getjAcesso().setText("");
      view.getjTelefone().setText("");
      view.getjNome().setText("");
      view.getjSenha().setText("");
      
        
        
    }
    
}
