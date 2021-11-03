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
public final class Agendamento {
    
    
 private int id;
 private Cliente cliente;
 private Servico servico;
 private String Valor;
 private Date data;
 private String Observação;

    public Agendamento(int id, Cliente cliente, Servico servico, String Valor, String data, String Observação) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.Valor = Valor;
        this.Observação = Observação;
        
        
        try {
          this.data = new SimpleDateFormat("dd-MM-yyyy").parse(data);
      } catch (ParseException ex) {
          Logger.getLogger(Pessoa.class.getName()).log(Level.SEVERE, null, ex);
      }

    }

    public Agendamento() {
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String Valor) {
        this.Valor = Valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }



    public String getObservação() {
        return Observação;
    }

    public void setObservação(String Observação) {
        this.Observação = Observação;
    }
 
   public String gethoraFormatada(){
     return new SimpleDateFormat("HH:mm").format(data);
       
   }
   
   public String getdataFormatada(){
     return new SimpleDateFormat("dd/MM/yyyy").format(data);
       
   }


    
}
