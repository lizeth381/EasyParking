/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import TO.TORegistro;
import db.ConexionBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class DAORegistro {
    private final ConexionBD con = new ConexionBD();//la conexion con la base de datos
    private final String nombreTabla = "Registro";

    public DAORegistro() {
    }
    
    public ArrayList<TORegistro> consultarRegistro() {// el consultarUsuario es el nombre de la funcionpara consultar usuarios
        ArrayList<TORegistro> registro = new ArrayList();
        TORegistro toregistro;//de la clase TOUSUSARIO me crea un objeto tousuario.
        try {

            ResultSet rs = con.consultar(nombreTabla); //nombretabla(en este caso tousuarios
            while (rs.next()) {
                toregistro = new TORegistro();
                toregistro.setIdRegistro(rs.getInt("idRegistro"));//lo amarillito es lo que aparece en la base de datos.//no se si sea necesario,va un set en lugar
                toregistro.setPlacavehiculo(rs.getString("placaVehiculo")); //base de datos
                //verificar si el nombre del campo esta bien, ya que son los nombres de las colomnas.
                toregistro.setFechaEntrada(rs.getDate("fechaEntrada"));//apellidoUsuario
                toregistro.setFechaSalida(rs.getDate("fechaSalida"));
                toregistro.setFechaFactura(rs.getDate("fechaFactura"));
                toregistro.setNombreCliente(rs.getString("nombreCliente"));
                toregistro.setMinutosTotales(rs.getInt("minutosTotales"));
                toregistro.setIva(rs.getDouble("iva"));
                toregistro.setTotalCancelar(rs.getDouble("totalCancelar"));
                toregistro.setIdUsuario(rs.getInt("idUsuario"));
                toregistro.setIdPlaza(rs.getInt("IdPlaza"));
                toregistro.setIdInformacionEmpresa(rs.getInt("IdInformacionEmpresa"));
                

                registro.add(toregistro);
            }
            return registro;
        } catch (SQLException ex) {
            System.out.println("Error en DAOUsuario.consultarUsuario: " + ex.getMessage());;
            return null;
        }
    }

    public int insertarRegistros(TORegistro toregistro ) {
        String [] valores = {String.valueOf(toregistro.getIdRegistro()), String.valueOf(toregistro.getPlacavehiculo()),String.valueOf( toregistro.getFechaEntrada()), String.valueOf(toregistro.getFechaSalida()),String.valueOf(toregistro.getFechaFactura()),String.valueOf(toregistro.getMinutosTotales()),String.valueOf(toregistro.getIva()),String.valueOf(toregistro.getTotalCancelar()), String.valueOf(toregistro.getIdPlaza()),String.valueOf(toregistro.getIdInformacionEmpresa())};
        //String [] valores = {String.valueOf(toregistro.getIdRegistro()), String.valueOf(toregistro.getPlacavehiculo()),String.valueOf( toregistro.getFechaEntrada()), String.valueOf(toregistro.getFechaSalida()),String.valueOf(toregistro.getFechaFactura()),String.valueOf(toregistro.getMinutosTotales()),String.valueOf(toregistro.getIva()),String.valueOf(toregistro.getTotalCancelar()), String.valueOf(toregistro.getIdPlaza()),String.valueOf(toregistro.getIdInformacionEmpresa())};
        try {
            return con.insertar(nombreTabla, valores);
        } catch (Exception ex) {//no va el sql
            System.out.println("Error en DAOUsuario.insertarUsuario: " + ex.getMessage());
            return 0;
        }
    }
    
    
    
    public boolean actualizarUsuario(TORegistro toregistro) {
        String [] valores = {String.valueOf(toregistro.getIdRegistro()), String.valueOf(toregistro.getPlacavehiculo()),String.valueOf( toregistro.getFechaEntrada()), String.valueOf(toregistro.getFechaSalida()),String.valueOf(toregistro.getFechaFactura()),String.valueOf(toregistro.getMinutosTotales()),String.valueOf(toregistro.getIva()),String.valueOf(toregistro.getTotalCancelar()), String.valueOf(toregistro.getIdPlaza()),String.valueOf(toregistro.getIdInformacionEmpresa())};

        try {
            return con.actualizar(nombreTabla, valores, toregistro.getIdRegistro());
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuario.actualizarUsuario: " + ex.getMessage());
            return false;
        }
    }
    public boolean eliminarRegistro(int idRegistro) {
        try {
            return con.eliminar(nombreTabla, idRegistro);
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuario.eliminarUsuario: " + ex.getMessage());
            return false;
        }
    }
}
