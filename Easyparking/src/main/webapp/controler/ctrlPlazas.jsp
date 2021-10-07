<%@page import="TO.TOPlazas"%>
<%@page import="controllers.ContrlPlazas"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.google.gson.Gson"%>



<%ContrlPlazas plazasCtrl = new  ContrlPlazas();
String opcion= request.getParameter("opcion");
if("listar".equals(opcion)){
    ArrayList<TOPlazas>plaza= plazasCtrl.consultarPlazas();
    out.print(new Gson().toJson(plaza));
    out.print("estoy consultando la base de datos");
}else{
    out.print("opcion valida");
}


%>
