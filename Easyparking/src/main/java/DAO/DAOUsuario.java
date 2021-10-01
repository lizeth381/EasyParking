package DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import db.ConexionBD;
import TO.TOUsuario;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author HP
 */
public class DAOUsuario {
    

    private final ConexionBD con = new ConexionBD();//la conexion con la base de datos
    private final String nombreTabla = "Usuario";
    
                                        //nombreUsuario,ApellidoUsuario//etc
    public DAOUsuario() {
    }

    //nombres de las columnas de las tablas
    @SuppressWarnings("empty-statement")
    public ArrayList<TOUsuario> consultarUsuario() {// el consultarUsuario es el nombre de la funcionpara consultar usuarios
        ArrayList<TOUsuario> usuario = new ArrayList();
        TOUsuario tousuario;//de la clase TOUSUSARIO me crea un objeto tousuario.
        try {

            ResultSet rs = con.consultar(nombreTabla); //nombretabla(en este caso tousuarios
            while (rs.next()) {
                tousuario = new TOUsuario();
                tousuario.setIdUsuario(rs.getInt("idUsuario"));//no se si sea necesario,va un set en lugar
                tousuario.setNombreUsuario(rs.getString("nombreUsuario"));  //verificar si el nombre del campo esta bien, ya que son los nombres de las colomnas.
                tousuario.setApellidoUsuario(rs.getString("apellidoUsuario"));//apellidoUsuario
                tousuario.setCedulaUsuario(rs.getString("cedulaUsuario"));
                tousuario.setGeneroUsuario(rs.getString("generoUsuario"));
                tousuario.setRolUsuario(rs.getString("rolUsuario"));
                tousuario.setContrasenaUsuario(rs.getString("contrasenaUsuario"));
                tousuario.setEmailusuario(rs.getString("emailUsuario"));
                tousuario.setCelularUsuario(rs.getString("celularUsuario"));
                tousuario.setDireccionUsuario(rs.getString("direccionUsuario"));
                tousuario.setCodigoUsuario(rs.getInt("codigoUsuario"));

                usuario.add(tousuario);
            }
            return usuario;
        } catch (SQLException ex) {
            System.out.println("Error en DAOUsuario.consultarUsuario: " + ex.getMessage());;
            return null;
        }
    }

    public int insertarUsuarios(TOUsuario tousuario) {
        String [] valores = {String.valueOf(tousuario.getIdUsuario()),tousuario.getNombreUsuario(), tousuario.getApellidoUsuario(), tousuario.getCedulaUsuario(), tousuario.getRolUsuario(), tousuario.getContrasenaUsuario(), tousuario.getEmailusuario(), tousuario.getCelularUsuario(), tousuario.getDireccionUsuario(),String.valueOf(tousuario.getCodigoUsuario())};

        try {
            return con.insertar(nombreTabla, valores);
        } catch (Exception ex) {//no va el sql
            System.out.println("Error en DAOUsuario.insertarUsuario: " + ex.getMessage());
            return 0;
        }
    }
    
    public boolean actualizarUsuario(TOUsuario tousuario) {
        String [] valores = {String.valueOf(tousuario.getIdUsuario()),tousuario.getNombreUsuario(), tousuario.getApellidoUsuario(), tousuario.getCedulaUsuario(), tousuario.getRolUsuario(), tousuario.getContrasenaUsuario(), tousuario.getEmailusuario(), tousuario.getCelularUsuario(), tousuario.getDireccionUsuario(), /*tousuario.getCodigoUsuario()*/};

        try {
            return con.actualizar(nombreTabla, valores, tousuario.getIdUsuario());
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuario.actualizarUsuario: " + ex.getMessage());
            return false;
        }
    }
    
    public boolean eliminarUsuario(int idUsuario) {
        try {
            return con.eliminar(nombreTabla, idUsuario);
        } catch (Exception ex) {
            System.out.println("Error en DAOUsuario.eliminarUsuario: " + ex.getMessage());
            return false;
        }
    }
}

