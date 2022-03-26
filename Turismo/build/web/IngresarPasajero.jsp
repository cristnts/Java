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
                 <form action="Controlador.do" method ="POST">
                <div class="input-field">
                    <input id="last_name" type="text" name="nombre">
                    <label for="last_name">Nombre y apellido</label>
                </div>
                
                 <div class="input-field">
                    <input id="last_name" type="text" name="telefono">
                    <label for="last_name">Telefono</label>
                </div>
                
                 <div class="input-field">
                    <input id="last_name" type="text" name="email">
                    <label for="last_name">email</label>
                </div>
                
                <div class="input-field">
                    <input id="last_name" type="text" name="destino">
                    <label for="last_name">Destino</label>
                </div>

                  <div class="input-field">
                    <input id="last_name" type="text" name="transporte">
                    <label for="last_name">Ingresa transporte(Aereo,Taxi,Van)</label>
                </div>    
                     
                 

                 <div class="input-field">
                    <input id="last_name" type="text" name="hotel">
                    <label for="last_name">Paqete de hotel (1)(2)(3)</label>
                </div>
                
                

                

                  <div class="input-field">
                    <input id="last_name" type="text" name="ida">
                    <label for="last_name">Fecha ida</label>
                </div>     
                     
                <div class="input-field">
                    <input id="last_name" type="text" name="vuelta">
                    <label for="last_name">Fecha vuelta</label>
                </div>
               

                 <input class="btn waves-effect waves-orange" type="submit" name="bt"
                           value ="Registrar">
                
                </form>
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
      <script>  $('.datepicker').pickadate({
    selectMonths: true, // Creates a dropdown to control month
    selectYears: 15, // Creates a dropdown of 15 years to control year,
    today: 'Today',
    clear: 'Clear',
    close: 'Ok',
    closeOnSelect: false // Close upon selecting a date,
  });
        </script>
      
      
    </body>
</html>
