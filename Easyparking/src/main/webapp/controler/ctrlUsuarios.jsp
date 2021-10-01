<%@page import="TO.TOUsuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controllers.ContrlUsuarios"%>
<%@page import="com.google.gson.Gson"%>

<%ContrlUsuarios usuariosCtrl = new ContrlUsuarios();
String opcion= request.getParameter("opcion");
if("listar".equals(opcion)){
    ArrayList<TOUsuario>usuarios= usuariosCtrl.consultarUsuario();
    out.print(new Gson().toJson(usuarios));
    //out.print("estoy consultando la base de datos");
}else{
    out.print("opcion valida");
}


%>


