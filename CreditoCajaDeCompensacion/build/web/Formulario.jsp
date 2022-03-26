<%-- 
    Document   : index
    Created on : 23-10-2017, 19:01:58
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
                <div class="card-panel orange accent-1"><strong>Aplicación de Supermercado</strong></div>
                <br></br>
                <form action="ProductoServlet" method="post">
                    <div class="input-field">
                        <input id="nCredito" type="text" name="nCredito">
                        <label for="nCredito">Nro de Crédito : </label>
                    </div>
                    <div class="input-field">
                        <input id="montoCredito" type="text" name="montoCredito">
                        <label for="montoCredito">Monto de Crédito :</label>
                    </div>
                    
                    <div class="input-field ">
                        <select name="tipoCredito">
                            <option value="" disabled selected>Elija el tipo de crédito </option>
                            <option value="consumo">Consumo</option>
                            <option value="automotriz">Automotriz</option>
                            <option value="hipotecario">Hipotecario</option>
                        </select>
                    </div>
                    
                    <div class="input-field">
                        <input id="nCuotas" type="text" name="nCuotas">
                        <label for="nCuotas">Nro de Cuotas</label>
                    </div> 
                    
                    <div class="input-field">
                        <input id="rutB" type="text" name="rutB">
                        <label for="rutB">Rut del beneficiario : </label>
                    </div> 
                     <div class="input-field">
                        <input id="montoPagado" type="text" name="montoPagado">
                        <label for="montoPagado">Monto Pagado : </label>
                    </div>
                    <div class="input-field">
                        <input id="porPagar" type="text" name="porPagar">
                        <label for="porPagar">Monto por pagar : </label>
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
