
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
        <link href="http//fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link type="text/css" rel="stylesheet" href="css/materialize.min.css" media="screen,projection"/>
    </head>
    <body>
        <div classs="row">
            <nav class="nav-extended">
                <div class="nav-wrapper light-orange darken-2">
                    <a href="#!" class="brand-logo ">BANCO</a>
                    <ul class="right hide-on-med-and-down">
                        <li><a href="login.jsp">Ingresar</a></li>
                        <li><a href="logeoAdministracion.jsp">Administracion</a>
                        
                 </ul>
               </div>
                
         </nav>
            
            <div class="col s3"></div>
            
            <div class="card-panel teal">
                <span class="white-text">Menú principal
                    </span>
                </div>
            
            <div class="slider">
                <ul class="slides">
                   <li>
                       <img src="https://www.gacetadental.com/wp-content/uploads/2015/09/grupo-personas.jpg">
                       <div class="caption left-align">
                           <h3><font color="black">BANCO</font></h3>
                           <h5 class="light green-text text-lighten-3"> </h5>
                           </div>
                       </li>
                       
                </ul>
           </div>
        </div>
     </div>
     
     <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
     <script type="text/javascript" src="js/materialize.min.js"></script>
     <script type="text/javascript"> $(document).ready(function () {
              $('.carousel').carousel();
     });</script>
     <script type="text/javascript">$('.carousel.carousel-slider').carousel({fullWidth: true}); </script>
     <script type="text/javascript">$(document).ready(function(){
         $('.slider').slider();
     });</script>
           
    </body>
</html>
