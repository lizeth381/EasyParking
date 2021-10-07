<%@page import="TO.TOUsuario"%>
<%@page import="TO.TORegistro"%>
<%@page import="controllers.ContrlRegistros"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.google.gson.Gson"%>
<%ContrlRegistros registrosCtrl = new ContrlRegistros();
    String opcion = request.getParameter("opcion");
    if ("listar".equals(opcion)) {
        ArrayList<TORegistro> registro = registrosCtrl.consultarRegistro();
        out.print(new Gson().toJson(registro));
        //out.print("estoy consultando la base de datos");
    } else if ("insertar".equals(opcion)) {
        String datos = request.getParameter("datos");
        TOUsuario usuariosTO = new Gson().fromJson(datos, TOUsuario.class);
        TORegistro registroTO = new Gson().fromJson(datos, TORegistro.class);
        registrosCtrl.insertarRegistros(registroTO, usuariosTO);
        //out.print(new Gson().toJson(usuariosTO));
    } else if ("actualizar".equals(opcion)) {

    } else if ("eliminar".equals(opcion)) {

    } else {
        out.print("opcion valida");
    }
%>