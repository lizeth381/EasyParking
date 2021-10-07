<%@page import="TO.TOUsuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controllers.ContrlUsuarios"%>
<%@page import="com.google.gson.Gson"%>

<%ContrlUsuarios usuariosCtrl = new ContrlUsuarios();
    String opcion = request.getParameter("opcion");
    if ("listar".equals(opcion)) {
        ArrayList<TOUsuario> usuarios = usuariosCtrl.consultarUsuario();
        out.print(new Gson().toJson(usuarios));
        //out.print("estoy consultando la base de datos");
    } else if ("login".equals(opcion)) {
        String datos = request.getParameter("datos");
        TOUsuario usuariosTO = new Gson().fromJson(datos, TOUsuario.class);
        usuariosTO = usuariosCtrl.verificarUsuario(usuariosTO);
        out.print(new Gson().toJson(usuariosTO));
    } else if ("insertar".equals(opcion)) {
        String datos = request.getParameter("datos");
        TOUsuario usuariosTO = new Gson().fromJson(datos, TOUsuario.class);
        if (usuariosCtrl.insertarUsuarios(usuariosTO) != 0 ){
            usuariosTO.setIdUsuario(1);
        } else {
            usuariosTO.setIdUsuario(0);
        }
        out.print(new Gson().toJson(usuariosTO));
    } else if ("actualizar".equals(opcion)) {

    } else if ("eliminar".equals(opcion)) {
        
    }else {
        out.print("opcion valida");
    }
%>


