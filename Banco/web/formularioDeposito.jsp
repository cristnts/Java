<%-- 
    Document   : index

    Created on : 15-nov-2017, 11:28:48
    Author     : cristian
--%>
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
            <div class="col s3"></div>
           <div class="col s6">

            <div class="card-panel teal">
                <span class="white-text">Depositos
                    </span>
                </div>
                                
                <form action="<c:url value="DepositosControlador"/>" method="post">
                    
                    <div class="input-field">
                <input id="fecha" type="text" class="validate" name="fecha">
                <label for="fecha"> fecha deposito : </label>
                 </div>   
            
                  <div class="input-field">
                <input id="monto" type="text" class="validate" name="monto">
                <label for="monto"> monto deposito : </label>
                 </div>   
                    
                  <div class="input-field">
                <input id="n_cuenta" type="text" class="validate" name="n_cuenta">
                <label for="n_cuenta"> numero de cuenta : </label>
                 </div>   
                    
                  <div class="input-field">
                <input id="tipo" type="text" class="validate" name="tipo">
                <label for="tipo"> tipo cuenta : </label>
                 </div>      
                    
                 <input class="btn waves-effect waves-light" type="submit" name="accion" value="crear">
                 <input class="btn waves-effect waves-light" type="submit" name="accion" value="listar">
   
                </form>
                
                <table class="striped">
                    <tr>
                        <td>fecha</td>
                        <td>tipo</td>
                        <td>monto</td>
                        <td>numero de cuenta</td>
                    </tr>
                    <c:forEach var="d" items="${listaDepositos}">
                    <tr>
                        <td>
                            <c:out value="${d.getFecha()}"/>
                        </td>
                        <td>                                               
                            <c:out value="${d.getTipoCuenta()}"/>
                        </td>
                        <td>
                            <c:out value="${d.getMonto()}"/>
                        </td>
                        <td>     
                            <c:out value="${d.getNumeroCuenta()}"/>
                        </td>
                    </tr>
                    </c:forEach>
                </table>
            
                
                         
        </div>
     </div>
     
     <script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
     <script type="text/javascript" src="js/materialize.min.js"></script>
    
           
    </body>
</html>
