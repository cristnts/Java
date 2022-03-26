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
    <body>
        <div class="row">
            <div class="col s3"></div>
            <div class="col s6">
                <br>
                <br>
                
                <form action="Controlador.do" method="post">
                <div class="input-field">
                    <input id="num1" type="text" name="num1">
                    <label for="num1"> primer numero  </label>
                </div>
                
                <div class="input-field">
                    <input id="num2" type="text" name="num2">
                    <label for="num2"> segundo numero  </label>
                </div>
                
                <div class="input-field ">
<select name="operador">
<option value="" disabled selected>Selecciona operacion</option>
<option value="1">sumar</option>
<option value="2">restar</option>
<option value="3">multiplicar</option>
<option value="4">dividir</option>
</select>
</div>
                
                <input class="btn waves-effect waves-orange" type="submit" name="bt"
                           value ="Resultado">
                </form>
                
                <label>(${resultado}) </label>
                
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
