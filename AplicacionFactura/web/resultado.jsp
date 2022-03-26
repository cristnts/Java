<%-- 
    Document   : formulario
    Created on : 21-08-2017, 19:29:59
    Author     : Francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <body>
       
        <div class="row">
            <div class="col s3"></div>
            <div class="col s6">
               
        <table class="striped">
        <thead>
          <tr>
              <th>id</th>
              <th>nombre</th>
              <th>dia</th>
              <th>cantidad</th>
              <th>categoria</th>
              <th>precio</th>
              <th>descuento</th>
              <th>precio final</th>
             
          </tr>
        </thead>

        <tbody>
           <c:forEach items="${listaProductos}" var="item">
          <tr>
            <td>${item.id}</td>
            <td>${item.nombre}</td>
            <td>${item.dia}</td>
            <td>${item.cantidad}</td>
            <td>${item.categoria}</td>
            <td>${item.descuento}</td>
            <td>${item.precioFinal}</td>
            
          </tr>
           </c:forEach>
        </tbody>
      </table>
                
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
