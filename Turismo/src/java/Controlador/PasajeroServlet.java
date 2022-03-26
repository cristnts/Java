/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Pasajero;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alumnossur
 */
@WebServlet(name = "PasajeroServlet", urlPatterns = {"/Controlador.do"})
public class PasajeroServlet extends HttpServlet {
  
    ArrayList<Pasajero> lPasajero;

    public PasajeroServlet() {
        this.lPasajero = new ArrayList<Pasajero>();
    }
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
         
            String boton = request.getParameter("bt");
            if(boton.equals("Registrar")){
            
                String Nombre = request.getParameter("nombre");
                String Telefono = request.getParameter("telefono");
                String Email= request.getParameter("email");
                String Destino = request.getParameter("destino");
                String Transporte = request.getParameter("transporte");
                String Hotel = request.getParameter("hotel");
                String Ida = request.getParameter("ida");
                String Vuelta = request.getParameter("vuelta");
            
                Pasajero p = new Pasajero(Nombre,Telefono,Email,Destino,Transporte,Hotel,Ida,Vuelta);
            
                lPasajero.add(p);
                
                request.getSession().setAttribute("listaP", lPasajero);
                response.sendRedirect("Listar.jsp");
                
            }
            
            
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
        processRequest(request, response);
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
