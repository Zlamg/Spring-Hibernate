<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<link rel="stylesheet" tye="text/css" href="{pageContext.request.contextPath}WEB-INF/css/estilos.css"
            -->
         <!-- <pring:url  value="/resources/css/estilos.css"/>-->
        <title>Crear Departamento</title>
    </head>
    <body>

        <f:form action="add.html" modelAttribute="Usuarios">
            <label for="Idid">Id:</label>
            <input type="text" name="id" id="Idid" value=""/>
            <label for="nombreid">Cedula :</label>
            <input type="text" id="cedula" name="cedula" value=""/> 
            <label for="nombreid">Nombre :</label>
            <input type="text" id="nombre" name="nombre" value=""/> 
            <label for="nombreid">Apellido :</label>
            <input type="text" id="apellido" name="apellidos" value=""/> 
            <input type="submit" value="Save"/>
        </f:form>

    </body>
</html>

