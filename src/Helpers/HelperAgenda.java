/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import Dao.ServicoDao;
import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import View.Agenda;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Evandro Armando
 */
public class HelperAgenda  implements  Helpers{

    private final Agenda view;
    public HelperAgenda(Agenda ViewAgenda) {
        this.view = ViewAgenda;
    }


    public void PreecherJComboBox(ArrayList<Cliente> clientes) {
               DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel) view.getTextCliente().getModel();
               
               for (Cliente cliente : clientes) {
               comboBoxModel.addElement(cliente);
            
        }
               
     

    }

    public void PreencherTabelaAgendamentos(ArrayList<Agendamento> agendamentos) {
        
        DefaultTableModel tableModel = (DefaultTableModel) view.getTableAgendamentos().getModel();
        tableModel.setNumRows(0);
        
        //precorrer a lista preencher
        
        for (Agendamento agenda : agendamentos) {
            tableModel.addRow(new Object[]{
            agenda.getId(),
            agenda.getCliente(),
            agenda.getServico().getDescricao()
            
 
            
        });

    }
        Agendamento  agenda = new Agendamento();
        System.out.println("Valor da data"+agenda.getdataFormatada().toString());
    }

    public void PreencherJComboBoxServico(ArrayList<Servico> servicos) {
        
        DefaultComboBoxModel  comboBoxModel =(DefaultComboBoxModel) view.getTextServico().getModel();
        
        for (Servico servico : servicos) {
            comboBoxModel.addElement(servico.getDescricao());
            
        }
    }

    public Servico obterServico() {
       //return  (Servico) view.getTextServico().getSelectedItem();
       String ValorDoComboBoxServico = view.getTextServico().getSelectedItem().toString();
       ServicoDao dao = new ServicoDao();
       String resultadoDaBuscaDoPeco ="";
       resultadoDaBuscaDoPeco =dao.SetarPreco(ValorDoComboBoxServico);
       Double valor =Double.parseDouble(resultadoDaBuscaDoPeco);//converter
       Servico servico = new Servico(0, "",valor);
       return servico;
               
        

    }

    public void setarValor(double valor) {
        
        view.getTextValor().setText(valor+"");
    }

    public Cliente obterDaJcomboboxCliente(){
        
       String Cliente= view.getTextCliente().getSelectedItem().toString();
       Cliente modelo = new  Cliente(Cliente);
        return modelo;
    }
    
    
    public Servico obterDaJcomboboxServico(){
         String servico =view.getTextServico().getSelectedItem().toString();
         Servico modelo = new Servico(0, servico, 0);
         return modelo;
    }
    
    @Override
    public Agendamento obterModelo() {
       
        Cliente cliente = obterDaJcomboboxCliente();
       Servico servico = obterDaJcomboboxServico();
       String valor = view.getTextValor().getText();
       String data = view.getTextFormatedData().getText();
       String hora = view.getTextFormatedHora().getText();
       String dataFormatada =data+""+hora;
       String obs = view.getTextObservacao().getText();
       Agendamento agenda = new Agendamento(0, cliente, servico, valor, dataFormatada, obs);
       System.out.println("");
        return agenda;
    }

    @Override
    public void limpaTela() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
    
    
    
    
    
    
}
