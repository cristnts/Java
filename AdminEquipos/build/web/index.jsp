<%-- 
    Document   : index
    Created on : 08-08-2017, 21:44:20
    Author     : Francisco
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
           <title>Administración</title>

    <head>
             <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
        </head>
   <body>
        <div class="col s3"></div>
            <div class="col s6">                
                <form action="<c:url value="EquipoControlador"/>" method="post">
                    <h3>Crear equipo</h3>
                                <table>
                                    <tr>
                                        <td>Nombre equipo :
                                        </td>
                                        <td>
                                            <input type="text" name="nombre_equipo">
                                        </td>
                                    </tr>
                                </table>
                    <input type="submit" value="Crear equipo">
                    </form>
                    <table border="2">
                        <tr>    
                            <td>
                                ID equipo
                            </td>
                            <td>
                                Nombre equipo
                            </td>
                        </tr>
                      <c:forEach var="e" items="${listaEquipos}">
                         <tr>
                           <td>
                               <c:out value="${e.getId_equipo()}"/>
                               </td>
                               <td>
                                <c:out value="${e.getNombre_equipo()}"/>
                               </td>
                        </tr>
                   </c:forEach>
            </table> 
           <form action="<c:url value="JugadorControlador"/>" method="post">
               <h3>Crear/listar jugadores</h3>
               <table>
                   <tr>
                       <td>
                           Nombre jugador:
                       </td>
                       <td>
                            <input type="text" value="nombre_jugador">
                       </td>    
                   </tr>
                   <tr>
                       <td>
                           N°camiseta:
                       </td>
                       <td>
                           <input type="number" name="numero_camiseta">
                       </td>
                   </tr>
                   <tr>
                       <td>
                           ID de equipo:
                       </td>    
                       <td>
                           <input type="number" name="id_equipo">
                       </td>
                   </tr>
                   <tr>
                       <td>
                           Accion:
                       </td>
                       <td>
                           <select name="accion">
                               <option value="crear">Crear</option>
                               <option value="listar">Listar</option>
                           </select>
                       </td>    
                   </tr>
               </table>
              <input type="submit" value="Ejecutar">
           </form>
               <table border="2">
                   <tr>
                       <td>
                           ID Jugador
                       </td>
                       <td>
                           Nombre jugador
                       </td>
                       <td>
                           N°Camiseta
                       </td>
                   </tr>
        <c:forEach var="j" items="${listaJugadores}">
            <tr>
                <td>
                   <c:out value="${j.getId_jugador()}"/>
                </td>
                  <td>
                   <c:out value="${j.getNombre_jugador()}"/>
                </td>
                <td>
                   <c:out value="${j.getNumero_camiseta()}"/>
                </td>
            </tr>      
         </c:forEach>
     </table>
      </div>
    </body>
</html>
