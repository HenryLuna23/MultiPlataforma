<%-- 
    Document   : menuAdmin
    Created on : 05-10-2018, 05:07:46 PM
    Author     : Luna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true"%>

<%
    HttpSession sesion = request.getSession();
    if (sesion.getAttribute("nivel")==null)
    {
        response.sendRedirect("index.jsp");
    }
    else
    {
        String nivel=sesion.getAttribute("nivel").toString();
        if (!nivel.equals("2")) 
        {
            response.sendRedirect("login.jsp");
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Bienvenid@ <%= sesion.getAttribute("nombre")%></h2>
        <h1>Pagina Prueba Empresa</h1>
    </body>
</html>
