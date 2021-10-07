<%@page import="TO.TOInformacionEmpresa"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controllers.ContlInformacionEmpresa"%>
<%@page import="com.google.gson.Gson"%>

<%ContlInformacionEmpresa infoCtrl = new ContlInformacionEmpresa();
String opcion= request.getParameter("opcion");
if("listar".equals(opcion)){
    ArrayList<TOInformacionEmpresa>info= infoCtrl.consultarInformacionEmpresa();
    out.print(new Gson().toJson(info));
    //out.print("estoy consultando la base de datos");
}else{
    out.print("opcion valida");
}


%>