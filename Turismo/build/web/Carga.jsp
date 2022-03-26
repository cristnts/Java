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
                
                 <div class="input-field">
                    <input id="last_name" type="text" name="txt2">
                    <label for="last_name">Destinatario</label>
                </div>
                
                  <div class="input-field">
                    <input id="last_name" type="text" name="txt2">
                    <label for="last_name">El que envia la carga</label>
                </div>
                
                <div class="input-field">
                    <input id="last_name" type="text" name="txt2">
                    <label for="last_name">Direccion de destinatario</label>
                </div>
                
                <div class="input-field">
                    <input id="last_name" type="text" name="txt2">
                    <label for="last_name">Direccion del envio</label>
                </div>
                
                <div class="input-field">
                    <input id="last_name" type="text" name="txt2">
                    <label for="last_name">Telefono</label>
                </div>
                
                Masa(kg)
                  <form action="#">
    <p class="range-field">
      <input type="range" id="test5" min="0" max="100" />
    </p>
  </form>
                
                
  <div class="input-field">
    <select>
      <option value="" disabled selected>Naturaleza de la carga</option>
      <option value="1">Liquido</option>
      <option value="2">Solido</option>
      <option value="3">Gaseoso</option>
    </select>
    
  </div>
                
    <div class="row">
      <div class="row">
        <div class="input-field ">
          <textarea id="textarea1" class="materialize-textarea"></textarea>
          <label for="textarea1">Descripcion</label>
        </div>
      </div>
  </div>
           
               
                  <button class="btn waves-effect waves-light" type="submit" name="action">Submit
    <i class="material-icons right">send</i>
  </button>
        
                
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
