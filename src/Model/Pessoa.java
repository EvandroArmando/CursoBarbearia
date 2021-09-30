/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Evandro Armando
 */
public class Pessoa {
    
  protected int id;
  protected String nome;
  protected char sexo;
  protected Date data_nascimento;
  protected String telefone;
  protected String email;
  protected String kg;

    public Pessoa(int id, String nome, char sexo, Date data_nascimento, String telefone, String email, String kg) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.data_nascimento = data_nascimento;
        this.telefone = telefone;
        this.email = email;
        this.kg = kg;
    }

    public Pessoa(int id, String nome, char sexo, String data_nascimento, String telefone) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
         this.telefone = telefone;
      try {
          this.data_nascimento = new SimpleDateFormat("dd-MM-yyyy").parse(data_nascimento);
      } catch (ParseException ex) {
          Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
      }

       
    }

   public Pessoa( String nome, char sexo, String data_nascimento, String telefone) {
        this.nome = nome;
        this.sexo = sexo;
         this.telefone = telefone;
      try {
          this.data_nascimento = new SimpleDateFormat("dd-MM-yyyy").parse(data_nascimento);
      } catch (ParseException ex) {
          Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
      }

      
      
      
      
      
      
      
      
      
      
      
      
      
      
       
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

  
  
  
  
  
  
  
  
  
  
  
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKg() {
        return kg;
    }

    public void setKg(String kg) {
        this.kg = kg;
    }
  
  
  
  
    
}
