<<<<<<< HEAD
package controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import DAO.DAOUsuario;
import TO.TOUsuario;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ContrlUsuarios {

    DAOUsuario usuariosDAO;

    public ContrlUsuarios(DAOUsuario usuariosDAO) {
        this.usuariosDAO = new DAOUsuario();
    }
    ///lo puse adicional para que no me salga error 

    public ContrlUsuarios() {
        this.usuariosDAO = new DAOUsuario();
    }

    public ArrayList<TOUsuario> consultarUsuario() {// el consultarUsuario es el nombre de la funcionpara consultar usuarios
        return usuariosDAO.consultarUsuario(); //nombretabla(en este caso usuarios
    }
    
    public TOUsuario verificarUsuario(TOUsuario nombreUsuario) {
        return usuariosDAO.verificarUsuario(nombreUsuario.getNombreUsuario(), nombreUsuario.getContrasenaUsuario()); 
    }

    public int insertarUsuarios(TOUsuario tousuario) {
        return usuariosDAO.insertarUsuarios(tousuario);
    }

    public boolean actualizarUsuario(TOUsuario tousuario) {
        return usuariosDAO.actualizarUsuario(tousuario);
    }

    public boolean eliminarUsuario(int idUsuario) {
        return usuariosDAO.eliminarUsuario(idUsuario);
    }
    
    
}
=======
package controllers;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import DAO.DAOUsuario;
import TO.TOUsuario;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class ContrlUsuarios {
    DAOUsuario usuariosDAO;

    public ContrlUsuarios(DAOUsuario usuariosDAO) {
        this.usuariosDAO = new DAOUsuario();
    }
   ///lo puse adicional para que no me salga error 
    public ContrlUsuarios() {
        this.usuariosDAO = new DAOUsuario();
    }
    
    
    public ArrayList<TOUsuario> consultarUsuario() {// el consultarUsuario es el nombre de la funcionpara consultar usuarios
         return usuariosDAO.consultarUsuario(); //nombretabla(en este caso usuarios
            
    }

    public int insertarUsuarios(TOUsuario tousuario) {
          return usuariosDAO.insertarUsuarios(tousuario);
        
    }
    
    public boolean actualizarUsuario(TOUsuario tousuario) {
       return usuariosDAO.actualizarUsuario(tousuario);
        
    }
    
    public boolean eliminarUsuario(int idUsuario) {
        return usuariosDAO.eliminarUsuario(idUsuario);
}
}
>>>>>>> c4ec623baf584a57fd7362f72f86b43a4112d902
