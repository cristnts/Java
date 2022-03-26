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
                
                <br>
                <br>
                

      <div class="row">
        <div class="col">
          <div class="card">
            <div class="card-image">
              <img src="https://media-cdn.tripadvisor.com/media/photo-s/0e/57/99/f2/ananda-hotel-boutique.jpg">
              <span class="card-title">Hotel -San Juan</span>
            </div>
            <div class="card-content">
              <p>Comodo Hotel con una preciada vista.</p>
            </div>
            <div class="card-action">
              <a href="#">Tomar paquete 1</a>
            </div>
          </div>
        </div>
      </div>
            
                

      <div class="row">
        <div class="col ">
          <div class="card">
            <div class="card-image">
              <img src="http://media-room5.trivago.com/wp-content/uploads/sites/3/2016/06/29160757/hoteles-de-playa-vincci-seleccion-aleysa-benalmadena-andalucia-piscina.jpg">
              <span class="card-title">Hotel -Bahamas</span>
            </div>
            <div class="card-content">
              <p>Si lo que usted quiere son buena vacaciones a buen precio eliga este hotel.</p>
            </div>
            <div class="card-action">
              <a href="#">Tomar Paquete 2</a>
            </div>
          </div>
        </div>
      </div>
            
                

      <div class="row">
        <div class="col ">
          <div class="card">
            <div class="card-image">
              <img src="http://memoflores.com/fotos-de-hoteles-05.jpg">
              <span class="card-title">Hotel -Costa Azul</span>
            </div>
            <div class="card-content">
              <p>Un ambiente de celebridades y personas importantes.</p>
            </div>
            <div class="card-action">
              <a href="#">Tomar paquete 3</a>
            </div>
          </div>
        </div>
      </div>
            
               
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
