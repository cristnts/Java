/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dto.JugadorDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.JugadorServicio;

/**
 *
 * @author Vania
 */
@WebServlet(name = "JugadorControlador", urlPatterns = {"/JugadorControlador"})
public class JugadorControlador extends HttpServlet {
    @EJB
    private JugadorServicio jugadorServicio;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet JugadorControlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet JugadorControlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      try{
          String accion;
          accion = request.getParameter("accion");
          
       switch(accion){
      
          case "crear":
            String nombre_jugador = request.getParameter("nombre_jugador");
            int numero_camiseta = Integer.parseInt(request.getParameter("numero_camiseta"));
            int id_equipo = Integer.parseInt(request.getParameter("id_equipo"));
            JugadorDTO jDTO = new JugadorDTO();
            jDTO.setNombre_jugador(nombre_jugador);
            jDTO.setNumero_camiseta(numero_camiseta);
            jDTO.setId_equipo(id_equipo);
            jugadorServicio.createJugador(jDTO);
            request.getRequestDispatcher("/index.jsp").forward(request, response);
            break;
          case "listar":
            int equipo = Integer.parseInt(request.getParameter("id_equipo"));
            request.setAttribute("listaJugadores", jugadorServicio.allJugadoresEquipo(equipo));
            request.getRequestDispatcher("/index.jsp").forward(request, response);
            break;
       }
        }catch(NumberFormatException | ServletException | IOException e){
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
