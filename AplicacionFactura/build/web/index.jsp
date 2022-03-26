<%-- 
    Document   : index
    Created on : 16-10-2017, 19:15:25
    Author     : Francisco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <!--Import Google Icon Font-->       
         <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"> 
         <!--Import materialize.css-->      
         <link type="text/css" rel="stylesheet" href="css/materialize.min.css"  media="screen,projection"/>       
         <!--Let browser know website is optimized for mobile-->        
         <meta name="viewport" content="width=device-width, initial-scale=1.0"/> 
         <link rel="stylesheet" type="text/css" href="estilo.css" media="screen" />
    </head>
    <body>
      
        <div class="row">
            <div class="col s3"></div>
            <div class="col s6">
                <div class="card-panel orange accent-1"><strong>Aplicación de supermercado</strong></div>
                <br></br>
                <form action="Controlador.do" method="post">
                    <div class="input-field">
                        <input id="id" type="text" name="id">
                        <label for="id">ID producto</label>
                    </div>
                    <div class="input-field">
                        <input id="nombre" type="text" name="nombre">
                        <label for="nombre">Nombre </label>
                    </div>
                    <div class="input-field ">
                        <select name="dia">
                            <option value="" disabled selected>Elige un dia  </option>
                            <option value="lunes">Lunes</option>
                            <option value="martes">Martes</option>
                            <option value="miercoles">Miercoles</option>
                            <option value="jueves">Jueves</option>
                            <option value="viernes">Viernes</option>

                        </select>
    <label>Materialize Select</label>
  </div>
                    <div class="input-field">
                        <input id="cantidad" type="text" name="cantidad">
                        <label for="cantidad">Cantidad</label>
                    </div>
                    <div class="input-field ">
                        <select name="categoria">
                            <option value="" disabled selected>Elige un dia  </option>
                            <option value="hogar">Hogar</option>
                            <option value="frutayverdura">Fruta y verdura</option>
                            <option value="electro">Electro</option>
                        </select>
    <label>Materialize Select</label>
  </div>
                    
                     <div class="input-field">
                        <input id="precio" type="text" name="precio">
                        <label for="precio">Precio</label>
                    </div>
                    
                 
                    
                    <input type= "submit" class="btn waves-effect waves-orange"  name="bt" value="Procesar">

                </form>
                <br></br>
            </div>
        </div>
        
        
        
        
         <!--Import jQuery before materialize.js--> 
        <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>     
         <script type="text/javascript" src="js/materialize.min.js"></script> 
         <script>
             $(document).ready(function() {
             $('select').material_select();
             });
         </script>
    </body>
</html>
