<%-- 
    Document   : formulario
    Created on : 21-08-2017, 19:29:59
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
    <body>

        <div class="row">
            <div class="col s3"></div>
            <div class="col s6">

 <nav>
    <div class="nav-wrapper">
      <a href="#" class="brand-logo right">Logo</a>
      <ul id="nav-mobile" class="left hide-on-med-and-down">
        <li><a href="promociones.jsp">Promociones</a></li>
        <li><a href="index.jsp">Productos</a></li>
        <li><a href="collapsible.html">JavaScript</a></li>
      </ul>
    </div>
  </nav>
        

                
                <nav>
                    <div class="nav-wrapper">
                        <a href="#" class="brand-logo right">Menu</a>
                        <ul id="nav-mobile" class="left hide-on-med-and-down">
                            <li><a href="index.jsp">Productos</a></li>
                            <li><a href="Promociones.jsp">Promociones</a></li>
                           
                        </ul>
                    </div>
                </nav>

                <div class="input-field">
                    <i class="material-icons prefix">account_circle</i>
                    <input id="icon_prefix" type="text" class="validate" name="user">
                    <label for="icon_prefix">Nombre Promocion</label>
                </div>
                <div class="input-field">
                    <i class="material-icons prefix">account_circle</i>
                    <input id="icon_prefix" type="text" class="validate" name="user">
                    <label for="icon_prefix">Descuento</label>
                </div>
                
                <div class="row">
                    <form class="col">
                        <div class="row">
                            <div class="input-field">
                                <textarea id="textarea1" class="materialize-textarea"></textarea>
                                <label for="textarea1">Productos</label>
                            </div>
                        </div>
                    </form>
                </div>
       <h5>fecha inicio</h5>
        <input type="text" class="timepicker"> 
        <h5>fecha termino</h5>
        <input type="text" class="timepicker"> 

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
      <script> $('.timepicker').pickatime({
    default: 'now', // Set default time: 'now', '1:30AM', '16:30'
    fromnow: 0,       // set default time to * milliseconds from now (using with default = 'now')
    twelvehour: false, // Use AM/PM or 24-hour format
    donetext: 'OK', // text for done-button
    cleartext: 'Clear', // text for clear-button
    canceltext: 'Cancel', // Text for cancel-button
    autoclose: false, // automatic close timepicker
    ampmclickable: true, // make AM PM clickable
    aftershow: function(){} //Function for after opening timepicker
  });</script>
    </body>
</html>
