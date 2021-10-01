
<%@page import="TO.TORegistro"%>
<%@page import="controllers.ContrlRegistros"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.google.gson.Gson"%>


<%ContrlRegistros registrosCtrl = new ContrlRegistros();
String opcion= request.getParameter("opcion");
if("listar".equals(opcion)){
    ArrayList<TORegistro>registro= registrosCtrl.consultarRegistro();
    out.print(new Gson().toJson(registro));
    out.print("estoy consultando la base de datos");
}else{
    out.print("opcion valida");
}


%>