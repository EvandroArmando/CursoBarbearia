/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Dao.UsuarioDao;
import Helpers.HelperResgistro;
import Model.Usuario;
import View.Registro;

/**
 *
 * @author Evandro Armando
 */
public class RegistroController {

    private final Registro view;
    private final HelperResgistro helper;

    public RegistroController(Registro view) {
        this.view = view;
        this.helper = new HelperResgistro(view);
    }
    
    
    
    public void TarefaCadastro(){
       
         Usuario modelo = helper.obterModelo();
         UsuarioDao salvar = new UsuarioDao();
         salvar.criarUsuario(modelo);
         
         view.MostrarMensagem("Cadastro Realizado com sucesso");
         
     }
    
    
}
