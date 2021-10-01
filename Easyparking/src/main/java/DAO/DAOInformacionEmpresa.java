/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TOInformacionEmpresa;
import db.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DAOInformacionEmpresa {
     private final ConexionBD con = new ConexionBD();//la conexion con la base de datos
    private final String nombreTabla = "InformacionEmpresa";

    public DAOInformacionEmpresa() {
    }
    @SuppressWarnings("empty-statement")
    public ArrayList<TOInformacionEmpresa> consultarInformacionEmpresa() {// el consultarUsuario es el nombre de la funcionpara consultar usuarios
        ArrayList<TOInformacionEmpresa> informacionEmpresa = new ArrayList();
        TOInformacionEmpresa toinfoEmpresa;//de la clase TOUSUSARIO me crea un objeto tousuario.
        try {

            ResultSet rs = con.consultar(nombreTabla); //nombretabla(en este caso tousuarios
            while (rs.next()) {
                toinfoEmpresa = new TOInformacionEmpresa();
                toinfoEmpresa.setIdEmpresa(rs.getInt("idInformacionEmpresa"));//no se si sea necesario,va un set en lugar
                toinfoEmpresa.setNitEmpresa(rs.getString("nitEmpresa"));  //verificar si el nombre del campo esta bien, ya que son los nombres de las colomnas.
                toinfoEmpresa.setNombreEmpresa(rs.getString("nombreEmpresa"));//apellidoUsuario
                toinfoEmpresa.setDireccionEmpresa(rs.getString("direccionEmpresa"));
                toinfoEmpresa.setValorMinutoCarro(rs.getString("valorMinutoCarro"));
                toinfoEmpresa.setValorMinutoMoto(rs.getString("valorMinutoMoto"));
                toinfoEmpresa.setIvaActual(rs.getString("ivaActual"));
                

                informacionEmpresa.add(toinfoEmpresa);
            }
            return informacionEmpresa;
        } catch (SQLException ex) {
            System.out.println("Error en DAOUsuario.consultarUsuario: " + ex.getMessage());;
            return null;
        }
    }
    
     public int insertarInformacionEmpresa(TOInformacionEmpresa toinfoEmpresa ) {
        String [] valores = {String.valueOf(toinfoEmpresa.getIdEmpresa()),toinfoEmpresa.getNitEmpresa(),toinfoEmpresa.getNombreEmpresa(),toinfoEmpresa.getDireccionEmpresa(),toinfoEmpresa.getValorMinutoCarro(),toinfoEmpresa.getValorMinutoMoto(),toinfoEmpresa.getIvaActual() };

        try {
            return con.insertar(nombreTabla, valores);
        } catch (Exception ex) {//no va el sql
            System.out.println("Error en DAOUsuario.insertarUsuario: " + ex.getMessage());
            return 0;
        }
    }
     public boolean actualizarInformacionEmpresa(TOInformacionEmpresa toinfoEmpresa) {
        String [] valores = {String.valueOf(toinfoEmpresa.getIdEmpresa()),toinfoEmpresa.getNitEmpresa(),toinfoEmpresa.getNombreEmpresa(),toinfoEmpresa.getDireccionEmpresa(),toinfoEmpresa.getValorMinutoCarro(),toinfoEmpresa.getValorMinutoMoto(),toinfoEmpresa.getIvaActual() };

        try {
            return con.actualizar(nombreTabla, valores, toinfoEmpresa.getIdEmpresa());
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuario.actualizarUsuario: " + ex.getMessage());
            return false;
        }
    }
    public boolean eliminarInformacionEmpresa(int idEmpresa) {
        try {
            return con.eliminar(nombreTabla, idEmpresa);
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuario.eliminarUsuario: " + ex.getMessage());
            return false;
        }
    }
     
     
}
