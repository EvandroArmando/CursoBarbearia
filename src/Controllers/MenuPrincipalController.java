/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import View.Agenda;
import View.MenuPrincipal;

/**
 *
 * @author Evandro Armando
 */
public class MenuPrincipalController {

    private final MenuPrincipal View;

    public MenuPrincipalController(MenuPrincipal  View) {
        this.View = View; 
    }
    
    
    
    
    public void NavegarParaAgenda(){
        Agenda  agenda = new Agenda();
        agenda.setVisible(true);
    }
    
    
    public void NavegarParaMenu(){
        
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }
    
    
}
