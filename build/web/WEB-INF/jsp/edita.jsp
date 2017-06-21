
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"  %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EDIT</title>
    </head>
    <body>

        <f:form action="update.html" modelAttribute="Usuario"  >
            
            <input type="hidden" name="id" value="${u.id}"/>
            <label for="nombreid">Cedula:</label>
            <input type="text" name="cedula" value="${u.cedula}" id="cedula"/>
            <label for="nombreid">Nombre:</label>
            <input type="text" name="nombre" value="${u.nombre}" id="nombre"/>
            <label for="nombreid">Apellido:</label>
            <input type="text" name="apellidos" value="${u.apellidos}" id="apellido"/>
            
             
            <input type="submit" id="nombredptid" value="Save"/>
        </f:form>
            

    </body>
</html>

