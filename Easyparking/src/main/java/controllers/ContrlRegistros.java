/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import DAO.DAORegistro;
import TO.TORegistro;
import TO.TOUsuario;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ContrlRegistros {
    DAORegistro registroDAO;

    public ContrlRegistros(DAORegistro registroDAO) {
        this.registroDAO = registroDAO;
    }

    public ContrlRegistros() {
        this.registroDAO = registroDAO;
    }
    
    public ArrayList<TORegistro> consultarRegistro() {// el consultarUsuario es el nombre de la funcionpara consultar usuarios
        return registroDAO.consultarRegistro() ;
        
    }
    public int insertarRegistros(TORegistro toregistro, TOUsuario tousuario) {
        ContrlUsuarios usuariosCtrl = new ContrlUsuarios();
        toregistro.setidUsuario(usuariosCtrl.insertarUsuarios(tousuario));
        
        
        return registroDAO.insertarRegistros(toregistro );
       }
    
    public boolean actualizarUsuario(TORegistro toregistro) {
        return registroDAO.actualizarUsuario(toregistro);
    }
  
    public boolean eliminarRegistro(int idRegistro) {
        return registroDAO.eliminarRegistro(idRegistro);
    }        
}   
    
    
    

