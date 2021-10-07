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
public class TORegistro extends TOUsuario{
    private int idRegistro;
    private String placavehiculo;
    private String fechaEntrada;
    private String fechaSalida;
    private String fechaFactura;
    private String nombreCliente;
    private int minutosTotales;
    private Double iva;
    private Double totalCancelar;
    private int idPlaza;
    private int idInformacionEmpresa;

    // Constructor vacío
    public TORegistro() {
    }

    // Constructor de importantes
    public TORegistro(String placavehiculo, String fechaFactura, int minutosTotales, Double iva, Double totalCancelar, int idPlaza, int idInformacionEmpresa) {
        this.placavehiculo = placavehiculo;
        this.fechaFactura = fechaFactura;
        this.minutosTotales = minutosTotales;
        this.iva = iva;
        this.totalCancelar = totalCancelar;
        this.idPlaza = idPlaza;
        this.idInformacionEmpresa = idInformacionEmpresa;
    }

    // Constructor de todo
    public TORegistro(int idRegistro, String placavehiculo, String fechaEntrada, String fechaSalida, String fechaFactura, String nombreCliente, int minutosTotales, Double iva, Double totalCancelar, int idPlaza, int idInformacionEmpresa, int idUsuario, String nombreUsuario, String apellidoUsuario, String cedulaUsuario, String generoUsuario, String rolUsuario, String contrasenaUsuario, String emailusuario, String celularUsuario, String direccionUsuario, int codigoUsuario) {
        super(idUsuario, nombreUsuario, apellidoUsuario, cedulaUsuario, generoUsuario, rolUsuario, contrasenaUsuario, emailusuario, celularUsuario, direccionUsuario, codigoUsuario);
        this.idRegistro = idRegistro;
        this.placavehiculo = placavehiculo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.fechaFactura = fechaFactura;
        this.nombreCliente = nombreCliente;
        this.minutosTotales = minutosTotales;
        this.iva = iva;
        this.totalCancelar = totalCancelar;
        this.idPlaza = idPlaza;
        this.idInformacionEmpresa = idInformacionEmpresa;
    }
    //Constructor de datos de entrada

    public TORegistro(int idRegistro, String placavehiculo, String fechaEntrada) {
        this.idRegistro = idRegistro;
        this.placavehiculo = placavehiculo;
        this.fechaEntrada = fechaEntrada;
    }
    

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getPlacavehiculo() {
        return placavehiculo;
    }

    public void setPlacavehiculo(String placavehiculo) {
        this.placavehiculo = placavehiculo;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getMinutosTotales() {
        return minutosTotales;
    }

    public void setMinutosTotales(int minutosTotales) {
        this.minutosTotales = minutosTotales;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getTotalCancelar() {
        return totalCancelar;
    }

    public void setTotalCancelar(Double totalCancelar) {
        this.totalCancelar = totalCancelar;
    }

    public int getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(int idPlaza) {
        this.idPlaza = idPlaza;
    }

    public int getIdInformacionEmpresa() {
        return idInformacionEmpresa;
    }

    public void setIdInformacionEmpresa(int idInformacionEmpresa) {
        this.idInformacionEmpresa = idInformacionEmpresa;
    }

    public void setidUsuario(int insertarUsuarios) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
public class TORegistro extends TOUsuario{
    private int idRegistro;
    private String placavehiculo;
    private Date fechaEntrada;
    private Date fechaSalida;
    private Date fechaFactura;
    private String nombreCliente;
    private int minutosTotales;
    private Double iva;
    private Double totalCancelar;
    private int idPlaza;
    private int idInformacionEmpresa;

    // Constructor vacío
    public TORegistro() {
    }

    // Constructor de importantes
    public TORegistro(String placavehiculo, Date fechaFactura, int minutosTotales, Double iva, Double totalCancelar, int idPlaza, int idInformacionEmpresa) {
        this.placavehiculo = placavehiculo;
        this.fechaFactura = fechaFactura;
        this.minutosTotales = minutosTotales;
        this.iva = iva;
        this.totalCancelar = totalCancelar;
        this.idPlaza = idPlaza;
        this.idInformacionEmpresa = idInformacionEmpresa;
    }

    // Constructor de todo
    public TORegistro(int idRegistro, String placavehiculo, Date fechaEntrada, Date fechaSalida, Date fechaFactura, String nombreCliente, int minutosTotales, Double iva, Double totalCancelar, int idPlaza, int idInformacionEmpresa, int idUsuario, String nombreUsuario, String apellidoUsuario, String cedulaUsuario, String generoUsuario, String rolUsuario, String contrasenaUsuario, String emailusuario, String celularUsuario, String direccionUsuario, int codigoUsuario) {
        super(idUsuario, nombreUsuario, apellidoUsuario, cedulaUsuario, generoUsuario, rolUsuario, contrasenaUsuario, emailusuario, celularUsuario, direccionUsuario, codigoUsuario);
        this.idRegistro = idRegistro;
        this.placavehiculo = placavehiculo;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.fechaFactura = fechaFactura;
        this.nombreCliente = nombreCliente;
        this.minutosTotales = minutosTotales;
        this.iva = iva;
        this.totalCancelar = totalCancelar;
        this.idPlaza = idPlaza;
        this.idInformacionEmpresa = idInformacionEmpresa;
    }
    //Constructor de datos de entrada

    public TORegistro(int idRegistro, String placavehiculo, Date fechaEntrada) {
        this.idRegistro = idRegistro;
        this.placavehiculo = placavehiculo;
        this.fechaEntrada = fechaEntrada;
    }
    

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getPlacavehiculo() {
        return placavehiculo;
    }

    public void setPlacavehiculo(String placavehiculo) {
        this.placavehiculo = placavehiculo;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getMinutosTotales() {
        return minutosTotales;
    }

    public void setMinutosTotales(int minutosTotales) {
        this.minutosTotales = minutosTotales;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getTotalCancelar() {
        return totalCancelar;
    }

    public void setTotalCancelar(Double totalCancelar) {
        this.totalCancelar = totalCancelar;
    }

    public int getIdPlaza() {
        return idPlaza;
    }

    public void setIdPlaza(int idPlaza) {
        this.idPlaza = idPlaza;
    }

    public int getIdInformacionEmpresa() {
        return idInformacionEmpresa;
    }

    public void setIdInformacionEmpresa(int idInformacionEmpresa) {
        this.idInformacionEmpresa = idInformacionEmpresa;
    }

}
>>>>>>> c4ec623baf584a57fd7362f72f86b43a4112d902
