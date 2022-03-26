<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
  
      <!--Import Google Icon Font-->
      <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
      <!--Import materialize.css-->
      <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>

      <!--Let browser know website is optimized for mobile-->
      <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

    </head>
    
    <nav class="nav-extended">
    <div class="nav-wrapper">
      <a href="#!" class="brand-logo">Agregar Empleadas</a>
      <ul class="right hide-on-med-and-down">
        <li><a href="agregar.jsp">agregar</a></li>
        <li><a href="buscar.jsp">buscar</a></li>
        <li><a href="eliminar.jsp">eliminar</a></li>
        <li><a href="modificar.jsp">modificar</a></li>
     </ul>
    </div>
    </nav>
    
   <body>
        <div class="row">
            <div class="col s3"></div>
            <div class="col s6">
               

                        <form action="<c:url value="EmpledaServlet"/>" method="post">

                <div class="input-field">
                    <input id="rut" type="text" class="validate" name="rut" value="<c:out value="${rutEmpleada}"/>">
                    <label for="rut">rut</label>
                </div>

                 <div class="input-field">
                    <input id="nombre" type="text" class="validate" name="nombre" value="<c:out value="${nombreEmpleada}"/>">
                    <label for="nombre">nombre</label>  
                </div>            
                            
                <div class="input-field">
                    <input id="apellido" type="text" class="validate" name="apellido" value="<c:out value="${apellidoEmpleada}"/>">
                    <label for="apellido">apellido</label>  
                </div>      
                            
                 <div class="input-field">
                    <input id="telefono" type="text" class="validate" name="telefono" value="<c:out value="${telefonoEmpleada}"/>">
                    <label for="telefono">telefono</label>
                </div>
                
                <div class="input-field">
                    <input id="clasificacion" type="text" class="validate" name="clasificacion" value="<c:out value="${clasificacionEmpleada}"/>">
                    <label for="clasificacion">clasificacion</label>
                </div>
                            
                            
               <input class="btn waves-effect waves-light" type="submit" name="bt" value="Buscar Rut">
               <input class="btn waves-effect waves-light" type="submit" name="bt" value="Actualizar">

        </form>
               
                        ${msgm}
                                              
            </div>  
        </div>
         <!--Import jQuery before materialize.js-->
      <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
      <script type="text/javascript" src="js/materialize.min.js"></script>
      <script> 
       $(document).ready(function() {
       $('select').material_select();
        });
      </script>
    </body>
</html>
