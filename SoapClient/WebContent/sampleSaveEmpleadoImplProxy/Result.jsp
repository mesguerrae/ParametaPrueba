<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleSaveEmpleadoImplProxyid" scope="session" class="com.service.soap.SaveEmpleadoImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleSaveEmpleadoImplProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleSaveEmpleadoImplProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleSaveEmpleadoImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.service.soap.SaveEmpleadoImpl getSaveEmpleadoImpl10mtemp = sampleSaveEmpleadoImplProxyid.getSaveEmpleadoImpl();
if(getSaveEmpleadoImpl10mtemp == null){
%>
<%=getSaveEmpleadoImpl10mtemp %>
<%
}else{
        if(getSaveEmpleadoImpl10mtemp!= null){
        String tempreturnp11 = getSaveEmpleadoImpl10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String apellidos_2id=  request.getParameter("apellidos18");
            java.lang.String apellidos_2idTemp = null;
        if(!apellidos_2id.equals("")){
         apellidos_2idTemp  = apellidos_2id;
        }
        String tipo_Documento_3id=  request.getParameter("tipo_Documento20");
            java.lang.String tipo_Documento_3idTemp = null;
        if(!tipo_Documento_3id.equals("")){
         tipo_Documento_3idTemp  = tipo_Documento_3id;
        }
        String cargo_4id=  request.getParameter("cargo22");
            java.lang.String cargo_4idTemp = null;
        if(!cargo_4id.equals("")){
         cargo_4idTemp  = cargo_4id;
        }
        String nombres_5id=  request.getParameter("nombres24");
            java.lang.String nombres_5idTemp = null;
        if(!nombres_5id.equals("")){
         nombres_5idTemp  = nombres_5id;
        }
        String fecha_Nacimiento_6id=  request.getParameter("fecha_Nacimiento26");
            java.lang.String fecha_Nacimiento_6idTemp = null;
        if(!fecha_Nacimiento_6id.equals("")){
         fecha_Nacimiento_6idTemp  = fecha_Nacimiento_6id;
        }
        String numero_Documento_7id=  request.getParameter("numero_Documento28");
            java.lang.String numero_Documento_7idTemp = null;
        if(!numero_Documento_7id.equals("")){
         numero_Documento_7idTemp  = numero_Documento_7id;
        }
        String fecha_vincula_8id=  request.getParameter("fecha_vincula30");
            java.lang.String fecha_vincula_8idTemp = null;
        if(!fecha_vincula_8id.equals("")){
         fecha_vincula_8idTemp  = fecha_vincula_8id;
        }
        String salario_9id=  request.getParameter("salario32");
            java.lang.Double salario_9idTemp = null;
        if(!salario_9id.equals("")){
         salario_9idTemp  = java.lang.Double.valueOf(salario_9id);
        }
        %>
        <jsp:useBean id="com1service1util1Empleado_1id" scope="session" class="com.service.util.Empleado" />
        <%
        com1service1util1Empleado_1id.setApellidos(apellidos_2idTemp);
        com1service1util1Empleado_1id.setTipo_Documento(tipo_Documento_3idTemp);
        com1service1util1Empleado_1id.setCargo(cargo_4idTemp);
        com1service1util1Empleado_1id.setNombres(nombres_5idTemp);
        com1service1util1Empleado_1id.setFecha_Nacimiento(fecha_Nacimiento_6idTemp);
        com1service1util1Empleado_1id.setNumero_Documento(numero_Documento_7idTemp);
        com1service1util1Empleado_1id.setFecha_vincula(fecha_vincula_8idTemp);
        com1service1util1Empleado_1id.setSalario(salario_9idTemp);
        boolean addEmpleado13mtemp = sampleSaveEmpleadoImplProxyid.addEmpleado(com1service1util1Empleado_1id);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addEmpleado13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>