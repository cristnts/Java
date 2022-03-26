
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <link href="http//fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css" media="screen,projection"/>
        <meta name="viiwport" content="width=device-width, initial-sacale=1.0"/>    

    </head>
    <body>
        <div classs="row">
            <nav class="nav-extended">
                <div class="nav-wrapper light-green darken-2">
                    <a href="#!" class="brand-logo">AdminPersonas</a>
                    <ul class="right hide-on-med-and-down">
                        <li><a href="agregar.jsp">Agregar</a></li>
                        <li><a href="modificar.jsp">Modificar</a></li>
                        <li><a href="eliminar.jsp">Eliminar</a></li>
                        <li><a href="index.jsp">Menú principal</a>
                 </ul>
               </div>
            </nav>
            
            <div class="col s3"></div>
            
            <div class="col s6">
                <div class="card-panel teal">
                    <span class="white-text">Buscar
                    </span>
                </div>
                <form action="<c:url value="ClienteServlet.do"/>" method="post">
                    
                    <div class="input-field">
                        <input id="rut" type="text" class="validate" name="rut">
                        <label for="rut">rut</label>
                    </div>
                    
                    <input class="btn waves-effect waves-light" type="submit" name="bt" value="Buscar">
                </form>
                
                <c:out value="${rutCliente}"/><br>
                <c:out value="${nombreCliente}"/><br>
                <c:out value="${apellidoCliente}"/><br>
                <c:out value="${celularCliente}"/><br>
                <c:out value="${mailCliente}"/><br>
                <c:out value="${userCliente}"/><br>
                <c:out value="${passCliente}"/><br>
                ${msg}
            </div>
        </div>
   
         <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
     <script type="text/javascript" src="js/materialize.min.js"></script>

    </body>
</html>

                
                        