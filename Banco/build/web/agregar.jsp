

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <link href="http//fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
       
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css" media="screen,projection"/>
        
        <meta name="viewport" content="width=device-width, initial-scalet=1.0"/>
    </head>
    <body>
        <div classs="row">
            <nav class="nav-extended">
               
                <div class="nav-wrapper light-green darken-2">
                    <a href="#!" class="brand-logo">AdminPersonas</a>
                    <ul class="right hide-on-med-and-down">
                        <li><a href="agregar.jsp">Menu Principal</a></li>
                        <li><a href="buscar.jsp">Buscar</a>
                        <li><a href="modificar.jsp">Modificar</a></li>
                        <li><a href="login.jsp">login</a></li>
                 </ul>
               </div>
                
         </nav>
            <div class="row">
            <div class="col s3"></div>
            
            <div class="col s6">
                <span class="white-text">Agregar</span>
                
            <form action="<c:url value="ClienteServlet.do"/>" method="post">
            
            <div class="input-field">
                <input id="rut" type="text" class="validate" name="rut">
                <label for="rut">rut</label>
            </div>
            
            <div class="input-field">
                <input id="nombre" type="text" class="validate" name="nombre">
                <label for="nombre">nombre</label>
            </div>
           
            <div class="input-field">
                <input id="apellido" type="text" class="validate" name="apellido">
                <label for="apellido">apellido</label>
            </div>   
                
            <div class="input-field">
                <input id="celular" type="text" class="validate" name="celular">
                <label for="celular">celular</label>
            </div>  
                <div class="input-field">
                <input id="mail" type="text" class="validate" name="mail">
                <label for="mail">mail</label>
            </div>  
                <div class="input-field">
                <input id="user" type="text" class="validate" name="usuario">
                <label for="usuario">usuario</label>
            </div>  
                <div class="input-field">
                <input id="pass" type="text" class="validate" name="pass">
                <label for="pass">pass</label>
            </div>  
                
            <input class="btn waves-effect waves-light" type="submit" name="bt" value="Agregar">
            </div>
                
            
            </div>
            
               

            </form>
            ${msga}
            
        </div>
     
     <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
     <script type="text/javascript" src="js/materialize.min.js"></script>

    </body>
</html>
