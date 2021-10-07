<<<<<<< HEAD
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TO;

import java.sql.Date;

/**
 *
 * @author HP
 */
public class TOPlazas extends TORegistro{
    private int idPlaza;
    private String nombrePlaza;
    private String estadoPlaza;
    private String tipoPlaza;

    public TOPlazas() {
    }

    public TOPlazas(int idPlaza, String nombrePlaza, String estadoPlaza, String tipoPlaza) {
        this.idPlaza = idPlaza;
        this.nombrePlaza = nombrePlaza;
        this.estadoPlaza = estadoPlaza;
        this.tipoPlaza = tipoPlaza;
    }

    public TOPlazas(String nombrePlaza, String estadoPlaza, String tipoPlaza, String placavehiculo, String fechaFactura, int minutosTotales, Double iva, Double totalCancelar, int idPlaza, int idInformacionEmpresa) {
        super(placavehiculo, fechaFactura, minutosTotales, iva, totalCancelar, idPlaza, idInformacionEmpresa);
        this.nombrePlaza = nombrePlaza;
        this.estadoPlaza = estadoPlaza;
        this.tipoPlaza = tipoPlaza;
    }

    public TOPlazas(String nombrePlaza, String estadoPlaza, String tipoPlaza, int idRegistro, String placavehiculo, String fechaEntrada, String fechaSalida, String fechaFactura, String nombreCliente, int minutosTotales, Double iva, Double totalCancelar, int idPlaza, int idInformacionEmpresa, int idUsuario, String nombreUsuario, String apellidoUsuario, String cedulaUsuario, String generoUsuario, String rolUsuario, String contrasenaUsuario, String emailusuario, String celularUsuario, String direccionUsuario, int codigoUsuario) {
        super(idRegistro, placavehiculo, fechaEntrada, fechaSalida, fechaFactura, nombreCliente, minutosTotales, iva, totalCancelar, idPlaza, idInformacionEmpresa, idUsuario, nombreUsuario, apellidoUsuario, cedulaUsuario, generoUsuario, rolUsuario, contrasenaUsuario, emailusuario, celularUsuario, direccionUsuario, codigoUsuario);
        this.nombrePlaza = nombrePlaza;
        this.estadoPlaza = estadoPlaza;
        this.tipoPlaza = tipoPlaza;
    }

    public int getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(int idPlaza) {
        this.idPlaza = idPlaza;
    }

    public String getNombrePlaza() {
        return nombrePlaza;
    }

    public void setNombrePlaza(String nombrePlaza) {
        this.nombrePlaza = nombrePlaza;
    }

    public String getEstadoPlaza() {
        return estadoPlaza;
    }

    public void setEstadoPlaza(String estadoPlaza) {
        this.estadoPlaza = estadoPlaza;
    }

    public String getTipoPlaza() {
        return tipoPlaza;
    }

    public void setTipoPlaza(String tipoPlaza) {
        this.tipoPlaza = tipoPlaza;
    }
}
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TO;

import java.sql.Date;

/**
 *
 * @author HP
 */
public class TOPlazas extends TORegistro{
    private int idPlaza;
    private String nombrePlaza;
    private String estadoPlaza;
    private String tipoPlaza;

    public TOPlazas() {
    }

    public TOPlazas(int idPlaza, String nombrePlaza, String estadoPlaza, String tipoPlaza) {
        this.idPlaza = idPlaza;
        this.nombrePlaza = nombrePlaza;
        this.estadoPlaza = estadoPlaza;
        this.tipoPlaza = tipoPlaza;
    }

    public TOPlazas(String nombrePlaza, String estadoPlaza, String tipoPlaza, String placavehiculo, Date fechaFactura, int minutosTotales, Double iva, Double totalCancelar, int idPlaza, int idInformacionEmpresa) {
        super(placavehiculo, fechaFactura, minutosTotales, iva, totalCancelar, idPlaza, idInformacionEmpresa);
        this.nombrePlaza = nombrePlaza;
        this.estadoPlaza = estadoPlaza;
        this.tipoPlaza = tipoPlaza;
    }

    public TOPlazas(String nombrePlaza, String estadoPlaza, String tipoPlaza, int idRegistro, String placavehiculo, Date fechaEntrada, Date fechaSalida, Date fechaFactura, String nombreCliente, int minutosTotales, Double iva, Double totalCancelar, int idPlaza, int idInformacionEmpresa, int idUsuario, String nombreUsuario, String apellidoUsuario, String cedulaUsuario, String generoUsuario, String rolUsuario, String contrasenaUsuario, String emailusuario, String celularUsuario, String direccionUsuario, int codigoUsuario) {
        super(idRegistro, placavehiculo, fechaEntrada, fechaSalida, fechaFactura, nombreCliente, minutosTotales, iva, totalCancelar, idPlaza, idInformacionEmpresa, idUsuario, nombreUsuario, apellidoUsuario, cedulaUsuario, generoUsuario, rolUsuario, contrasenaUsuario, emailusuario, celularUsuario, direccionUsuario, codigoUsuario);
        this.nombrePlaza = nombrePlaza;
        this.estadoPlaza = estadoPlaza;
        this.tipoPlaza = tipoPlaza;
    }

    public int getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(int idPlaza) {
        this.idPlaza = idPlaza;
    }

    public String getNombrePlaza() {
        return nombrePlaza;
    }

    public void setNombrePlaza(String nombrePlaza) {
        this.nombrePlaza = nombrePlaza;
    }

    public String getEstadoPlaza() {
        return estadoPlaza;
    }

    public void setEstadoPlaza(String estadoPlaza) {
        this.estadoPlaza = estadoPlaza;
    }

    public String getTipoPlaza() {
        return tipoPlaza;
    }

    public void setTipoPlaza(String tipoPlaza) {
        this.tipoPlaza = tipoPlaza;
    }
}
>>>>>>> c4ec623baf584a57fd7362f72f86b43a4112d902
