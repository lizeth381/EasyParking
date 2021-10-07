<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TOPlazas;
import db.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DAOPlazas {
    private final ConexionBD con = new ConexionBD();//la conexion con la base de datos
    private final String nombreTabla = "Plaza";

    public DAOPlazas() {
    }
    
    public ArrayList<TOPlazas> consultarPlazas() {// el consultarUsuario es el nombre de la funcionpara consultar usuarios
        ArrayList<TOPlazas> plaza = new ArrayList();
        TOPlazas toplaza;//de la clase TOUSUSARIO me crea un objeto tousuario.
        try {

            ResultSet rs = con.consultar(nombreTabla); //nombretabla(en este caso tousuarios
            while (rs.next()) {
                toplaza = new TOPlazas();
                toplaza.setIdPlaza(rs.getInt("idPlaza"));//no se si sea necesario,va un set en lugar
                toplaza.setNombrePlaza(rs.getString("nombrePlaza"));  //verificar si el nombre del campo esta bien, ya que son los nombres de las colomnas.
                toplaza.setEstadoPlaza(rs.getString("estadoPlaza"));//apellidoUsuario
                toplaza.setTipoPlaza(rs.getString("tipoPlaza"));
                               

                plaza.add(toplaza);
            }
            return plaza;
        } catch (SQLException ex) {
            System.out.println("Error en DAOUsuario.consultarUsuario: " + ex.getMessage());;
            return null;
        }
    }
    
    public int insertarPlazas(TOPlazas toplaza ) {
        String [] valores = {String.valueOf(toplaza.getIdPlaza()), toplaza.getNombrePlaza(),toplaza.getEstadoPlaza(), toplaza.getTipoPlaza()};

        try {
            return con.insertar(nombreTabla, valores);
        } catch (Exception ex) {//no va el sql
            System.out.println("Error en DAOUsuario.insertarUsuario: " + ex.getMessage());
            return 0;
        }
    }
    public boolean actualizarPlaza(TOPlazas toplaza) {
        String [] valores = {String.valueOf(toplaza.getIdPlaza()), toplaza.getNombrePlaza(),toplaza.getEstadoPlaza(), toplaza.getTipoPlaza()};

        try {
            return con.actualizar(nombreTabla, valores, toplaza.getIdPlaza());
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuario.actualizarUsuario: " + ex.getMessage());
            return false;
        }
    }
    public boolean eliminarPlaza(int idPlaza) {
        try {
            return con.eliminar(nombreTabla, idPlaza);
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuario.eliminarUsuario: " + ex.getMessage());
            return false;
        }
    }
    
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TOPlazas;
import db.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DAOPlazas {
    private final ConexionBD con = new ConexionBD();//la conexion con la base de datos
    private final String nombreTabla = "Plaza";

    public DAOPlazas() {
    }
    
    public ArrayList<TOPlazas> consultarPlazas() {// el consultarUsuario es el nombre de la funcionpara consultar usuarios
        ArrayList<TOPlazas> plaza = new ArrayList();
        TOPlazas toplaza;//de la clase TOUSUSARIO me crea un objeto tousuario.
        try {

            ResultSet rs = con.consultar(nombreTabla); //nombretabla(en este caso tousuarios
            while (rs.next()) {
                toplaza = new TOPlazas();
                toplaza.setIdPlaza(rs.getInt("idPlaza"));//no se si sea necesario,va un set en lugar
                toplaza.setNombrePlaza(rs.getString("nombrePlaza"));  //verificar si el nombre del campo esta bien, ya que son los nombres de las colomnas.
                toplaza.setEstadoPlaza(rs.getString("estadoPlaza"));//apellidoUsuario
                toplaza.setTipoPlaza(rs.getString("tipoPlaza"));
                               

                plaza.add(toplaza);
            }
            return plaza;
        } catch (SQLException ex) {
            System.out.println("Error en DAOUsuario.consultarUsuario: " + ex.getMessage());;
            return null;
        }
    }
    
    public int insertarPlazas(TOPlazas toplaza ) {
        String [] valores = {String.valueOf(toplaza.getIdPlaza()), toplaza.getNombrePlaza(),toplaza.getEstadoPlaza(), toplaza.getTipoPlaza()};

        try {
            return con.insertar(nombreTabla, valores);
        } catch (Exception ex) {//no va el sql
            System.out.println("Error en DAOUsuario.insertarUsuario: " + ex.getMessage());
            return 0;
        }
    }
    public boolean actualizarPlaza(TOPlazas toplaza) {
        String [] valores = {String.valueOf(toplaza.getIdPlaza()), toplaza.getNombrePlaza(),toplaza.getEstadoPlaza(), toplaza.getTipoPlaza()};

        try {
            return con.actualizar(nombreTabla, valores, toplaza.getIdPlaza());
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuario.actualizarUsuario: " + ex.getMessage());
            return false;
        }
    }
    public boolean eliminarPlaza(int idPlaza) {
        try {
            return con.eliminar(nombreTabla, idPlaza);
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuario.eliminarUsuario: " + ex.getMessage());
            return false;
        }
    }
    
}
>>>>>>> c4ec623baf584a57fd7362f72f86b43a4112d902
