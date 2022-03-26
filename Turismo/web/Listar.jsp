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
    
    <nav>
    <div class="nav-wrapper">
      <a href="#" class="brand-logo right">FexLine</a>
      <ul id="nav-mobile" class="left hide-on-med-and-down">
        <li><a href="IngresarPasajero.jsp">Pasajeros</a></li>
        <li><a href="Carga.jsp">Carga</a></li>
        <li><a href="Turismo.jsp">Turismo</a></li>
      </ul>
    </div>
  </nav>
        
    <body>
       
        <div class="row">
            <div class="col s3"></div>
            <div class="col s6">
                
                 <table class="striped">
        <thead>
          <tr>
              
            <th>transporte</th>
             <th>hotel</th>
             <th>ida</th>
            <th>vuelta</th>
          </tr>
        </thead>

        <tbody>
            <c:forEach items="${listaP}" var="item">
          <tr>
            
            <td>$(item.transporte)</td>
            <td>$(item.hotel)</td>
            <td>$(item.ida)</td>
            <td>$(item.vuelta)</td>
          </tr>
           </c:forEach>
        </tbody>
      </table>
               
        <table class="striped">
        <thead>
          <tr>
              <th>Nombre y apellido</th>
              <th>telefono</th>
           <th>email</th>
            <th>destino</th>
            <th>transporte</th>
             <th>hotel</th>
             <th>ida</th>
            <th>vuelta</th>
          </tr>
        </thead>

        <tbody>
            <c:forEach items="${listaP}" var="item">
          <tr>
            <td>${item.nombre}</td>
            <td>${item.telefono}</td>
            <td>${item.email}</td>
            <td>${item.destino}</td>
            <td>$(item.transporte)</td>
            <td>$(item.hotel)</td>
            <td>$(item.ida)</td>
            <td>$(item.vuelta)</td>
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
