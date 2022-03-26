<%-- 
    Document   : index
    Created on : 08-08-2017, 21:44:20
    Author     : Francisco
--%>

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
    
                
                
   <nav>
    <div class="nav-wrapper">
      <a href="#" class="brand-logo right">FexLine</a>
      <ul id="nav-mobile" class="left hide-on-med-and-down">
        <li><a href="ingresarPasajero.jsp">Pasajeros</a></li>
        <li><a href="Carga.jsp">Carga</a></li>
        <li><a href="Turismo.jsp">Turismo</a></li>
      </ul>
    </div>
  </nav>
        
                
    
    <body>
        <div class="row">
            <div class="col s3"></div>
            <div class="col s6">
                <br>
                <br>
    
                
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
