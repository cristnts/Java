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
                 <h5>Formulario</h5>
                 <br>
               <br>
                <br>
                <div class="input-field">
                    <input placeholder="Placeholder" id="first_name" type="text" name="txt1">
                    <label for="first_name">Nombre</label>
                </div>
                <div class="input-field">
                    <input id="last_name" type="text" name="txt2">
                    <label for="last_name">Apellido</label>
                </div>
                <div class="input-field">
                    <i class="material-icons prefix">phone</i>
                    <input id="icon_telephone" type="tel" class="validate">
                    <label for="icon_telephone">Telefono</label>
                </div>
                 <div class="input-field ">
                 <input id="email" type="email" class="validate">
                 <label for="email">Correo Electronico</label>
               </div>
                <form action="#">
                                    
                    <p class="range-field">
                          <label>Indique su edad</label>
                        <input type="range" id="test5" min="0" max="100" />
                      
                    </p>

                </form>

                <div class="input-field ">
                    <select>
                        <option value="" disabled selected>Elige tu opcion</option>
                        <option value="1">Soltero</option>
                        <option value="2">Casado</option>
                        <option value="3">Viudo</option>
                    </select>
                    <label>Estado civil</label>
                </div>
               
                <label> Sexo </label>
                  
                <p>
                    <input type="checkbox" id="test6" checked="checked" />
                    <label for="test6">Masculino</label>
                </p>
                <p>
                    <input type="checkbox" class="filled-in" id="filled-in-box" checked="checked" />
                    <label for="filled-in-box">Femenino</label>
                </p>
                <div class="input-field">
                    <textarea id="textarea1" name="txt1" class="materialize-textarea"></textarea>
                    <label for="textarea1">Descripcion de habilidades</label>
                </div>

                <label> Fecha de nacimiento </label>
                <input type="text" class="datepicker">

                <label> Selecciona una foto de ti </label>    
                <form action="#">
                    <div class="file-field input-field">
                        <div class="btn">
                            <span>Archivo</span>
                            <input type="file">
                        </div>
                        <div class="file-path-wrapper">
                            <input class="file-path validate" type="text">
                        </div>
                    </div>
                </form>
               -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
                <label>Si completaste el formulario seleciona enviar</label>
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
        <script>
  $('.datepicker').pickadate({
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