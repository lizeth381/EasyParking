<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import DAO.DAOPlazas;
import TO.TOPlazas;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ContrlPlazas {
    DAOPlazas plazasDAO;

    public ContrlPlazas(DAOPlazas plazasDAO) {
        this.plazasDAO = plazasDAO;
    }

    public ContrlPlazas() {
        this.plazasDAO = plazasDAO;
    }
    
     
    public ArrayList<TOPlazas> consultarPlazas() {// el consultarUsuario es el nombre de la funcionpara consultar usuarios
        return plazasDAO.consultarPlazas();
    }
    
    public int insertarPlazas(TOPlazas toplaza ) {
       return plazasDAO.insertarPlazas(toplaza);
    }
    public boolean actualizarPlaza(TOPlazas toplaza) {
       return plazasDAO.actualizarPlaza(toplaza);
    }
    public boolean eliminarPlaza(int idPlaza) {
       return plazasDAO.eliminarPlaza(idPlaza);
       
    }
    
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import DAO.DAOPlazas;
import TO.TOPlazas;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ContrlPlazas {
    DAOPlazas plazasDAO;

    public ContrlPlazas(DAOPlazas plazasDAO) {
        this.plazasDAO = plazasDAO;
    }

    public ContrlPlazas() {
        this.plazasDAO = plazasDAO;
    }
    
     
    public ArrayList<TOPlazas> consultarPlazas() {// el consultarUsuario es el nombre de la funcionpara consultar usuarios
        return plazasDAO.consultarPlazas();
    }
    
    public int insertarPlazas(TOPlazas toplaza ) {
       return plazasDAO.insertarPlazas(toplaza);
    }
    public boolean actualizarPlaza(TOPlazas toplaza) {
       return plazasDAO.actualizarPlaza(toplaza);
    }
    public boolean eliminarPlaza(int idPlaza) {
       return plazasDAO.eliminarPlaza(idPlaza);
       
    }
    
    
}
>>>>>>> c4ec623baf584a57fd7362f72f86b43a4112d902
