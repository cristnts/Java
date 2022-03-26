/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.facturaSessionBeanLocal;

/**
 *
 * @author alumnossur
 */
@WebServlet(name = "facturaServlet", urlPatterns = {"/Controlador.do"})
public class facturaServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @EJB
    private facturaSessionBeanLocal logica;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String nroFactura = request.getParameter("nroFactura");
            String rutEmpresa = request.getParameter("rutEmpresa");
            String nombreEmpersa = request.getParameter("nombreEmpresa");
            double monto = Double.parseDouble(request.getParameter("monto"));

            double iva = logica.calcularIva(monto);
            double montoBruto = logica.montoBruto(monto);

            request.getSession().setAttribute("nroFactura", nroFactura);
            request.getSession().setAttribute("rut", rutEmpresa);

            request.getSession().setAttribute("nombre", nombreEmpersa);

            request.getSession().setAttribute("monto", monto);

            request.getSession().setAttribute("coniva", iva);

            request.getSession().setAttribute("bruto", montoBruto);

            response.sendRedirect("Resultado.jsp");

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
