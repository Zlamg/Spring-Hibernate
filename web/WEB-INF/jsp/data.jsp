<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="crear.html">Agregar</a>
         <table style="border-collapse: collapse" cellpadding="7px" border="1">
            <tr>
                <th>Id</th><th>Cedula</th><th>Nombre</th><th>Apellidos</th>
            </tr>
            <c:forEach  items="${lst}" var="u">
                <tr>
                    <td>${u.id}</td>
                    <td>${u.cedula}</td>
                    <td>${u.nombre}</td>
                    <td>${u.apellidos}</td>
                     <td>
                        <a href="edit.html?id=${u.id}"> Editar </a>
                     </td><td>
                        <a href="remove.html?id=${u.id}" onclick="return confirm('Esta seguro?')">Eliminar</a>
                    </td>    
                </tr>                
            </c:forEach>
        </table>
    </body>
</html>
