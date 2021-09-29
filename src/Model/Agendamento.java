/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import javafx.scene.chart.PieChart.Data;

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
 private Date hora;
 private String Observação;

    public Agendamento(int id, Cliente cliente, Servico servico, String Valor, Date data, Date hora, String Observação) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.Valor = Valor;
        this.data = data;
        this.hora = hora;
        this.Observação = Observação;
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

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getObservação() {
        return Observação;
    }

    public void setObservação(String Observação) {
        this.Observação = Observação;
    }
 


    
}
