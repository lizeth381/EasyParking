<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import DAO.DAOInformacionEmpresa;
import TO.TOInformacionEmpresa;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ContlInformacionEmpresa {
    DAOInformacionEmpresa infoEmpresaDAO;

    public ContlInformacionEmpresa(DAOInformacionEmpresa infoEmpresaDAO) {
        this.infoEmpresaDAO = infoEmpresaDAO;
    }

    public ContlInformacionEmpresa() {
        this.infoEmpresaDAO = infoEmpresaDAO;
    }
    
    
    public ArrayList<TOInformacionEmpresa> consultarInformacionEmpresa() {// el consultarUsuario es el nombre de la funcionpara consultar usuarios
      return infoEmpresaDAO.consultarInformacionEmpresa();
    }
    
     public int insertarInformacionEmpresa(TOInformacionEmpresa toinfoEmpresa ) {
         return infoEmpresaDAO.insertarInformacionEmpresa(toinfoEmpresa);
     }
      
    
     public boolean actualizarInformacionEmpresa(TOInformacionEmpresa toinfoEmpresa) {
      return infoEmpresaDAO.actualizarInformacionEmpresa(toinfoEmpresa);
       
    }
    public boolean eliminarInformacionEmpresa(int idEmpresa) {
        return infoEmpresaDAO.eliminarInformacionEmpresa(idEmpresa);
    }
       
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import DAO.DAOInformacionEmpresa;
import TO.TOInformacionEmpresa;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ContlInformacionEmpresa {
    DAOInformacionEmpresa infoEmpresaDAO;

    public ContlInformacionEmpresa(DAOInformacionEmpresa infoEmpresaDAO) {
        this.infoEmpresaDAO = infoEmpresaDAO;
    }

    public ContlInformacionEmpresa() {
        this.infoEmpresaDAO = infoEmpresaDAO;
    }
    
    
    public ArrayList<TOInformacionEmpresa> consultarInformacionEmpresa() {// el consultarUsuario es el nombre de la funcionpara consultar usuarios
      return infoEmpresaDAO.consultarInformacionEmpresa();
    }
    
     public int insertarInformacionEmpresa(TOInformacionEmpresa toinfoEmpresa ) {
         return infoEmpresaDAO.insertarInformacionEmpresa(toinfoEmpresa);
     }
      
    
     public boolean actualizarInformacionEmpresa(TOInformacionEmpresa toinfoEmpresa) {
      return infoEmpresaDAO.actualizarInformacionEmpresa(toinfoEmpresa);
       
    }
    public boolean eliminarInformacionEmpresa(int idEmpresa) {
        return infoEmpresaDAO.eliminarInformacionEmpresa(idEmpresa);
    }
       
}
>>>>>>> c4ec623baf584a57fd7362f72f86b43a4112d902
