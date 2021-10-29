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

public final class Cliente extends Pessoa{
    
    private String endereco;
    private String cep;

    public Cliente(String endereco, String cep, int id, String nome, char sexo, String data_nascimento, String telefone) {
        super(id, nome, sexo, data_nascimento, telefone);
        this.endereco = endereco;
        this.cep = cep;
    }

    
    
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
      return getNome();
    }

    
    
}
