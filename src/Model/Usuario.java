/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Evandro Armando
 */
public final  class Usuario extends Pessoa{
    
    private String senha;
    private String nivel_acesso;

    public Usuario(String senha, String nivel_acesso, int id, String nome, char sexo, String data_nascimento, String telefone) {
        super(id, nome, sexo, data_nascimento, telefone);
        this.senha = senha;
        this.nivel_acesso = nivel_acesso;
    }

        public Usuario(String senha, String nivel_acesso, String nome, char sexo, String data_nascimento, String telefone) {
        super( nome, sexo, data_nascimento, telefone);
        this.senha = senha;
        this.nivel_acesso = nivel_acesso;
    }

    public Usuario(String senha, String nome) {
        super(nome);
        this.senha = senha;
    }

   
          
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivel_acesso() {
        return nivel_acesso;
    }

    public void setNivel_acesso(String nivel_acesso) {
        this.nivel_acesso = nivel_acesso;
    }

    public String toString(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


     


    
}
