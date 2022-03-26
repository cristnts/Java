/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dto.ClienteDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.ClienteServicio;

/**
 *
 * @author CamiloAntonio
 */
@WebServlet(name = "ClienteServlet", urlPatterns = {"/ClienteServlet.do"})
public class ClienteServlet extends HttpServlet {

    @EJB
    private ClienteServicio servicio;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ClienteServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ClienteServlet at " + request.getContextPath() + "</h1>");
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

        String boton = request.getParameter("bt");

        request.getSession().setAttribute("msg", "");
        request.getSession().setAttribute("msga", "");
        request.getSession().setAttribute("msgm", "");
        request.getSession().setAttribute("msge", "");
        boolean edo = true;

        switch (boton) {
            case "Agregar":
                try {
                    int rut = Integer.parseInt(request.getParameter("rut"));
                    String nombre = request.getParameter("nombre");
                    String apellido = request.getParameter("apellido");
                    String celular = request.getParameter("celular");
                    String mail = request.getParameter("mail");
                    String usuario = request.getParameter("usuario");
                    String pass = request.getParameter("pass");

                    ClienteDTO cliDTOcrear = new ClienteDTO();

                    cliDTOcrear.setRut(rut);
                    cliDTOcrear.setNombre(nombre);
                    cliDTOcrear.setApellido(apellido);
                    cliDTOcrear.setCelular(celular);
                    cliDTOcrear.setMail(mail);
                    cliDTOcrear.setUsuario(usuario);
                    cliDTOcrear.setPass(pass);
                    
                    servicio.createCliente(cliDTOcrear);
                    

                    
                } catch (Exception e) {
                    request.getSession().setAttribute("msga", "No ha sido posible crear usuario");
                    response.sendRedirect("agregar.jsp");
                    edo = false;
                }
                if (edo == true) {
                    request.getSession().setAttribute("msga", "Cliente agregado con exito");
                    request.getRequestDispatcher("/agregar.jsp").forward(request, response);
                }
                break;

            case "Buscar":
                try {
                    int rut = Integer.parseInt(request.getParameter("rut"));
                    String nombre = request.getParameter("nombre");
                    String apellido = request.getParameter("apellido");
                    String celular = request.getParameter("celular");
                    String mail = request.getParameter("mail");
                    String usuario = request.getParameter("usuario");
                    String pass = request.getParameter("pass");
                    ClienteDTO cliDTOleer = servicio.readCliente(rut);
                    
                    request.setAttribute("rutCliente", "rut: " + cliDTOleer.getRut());
                    request.setAttribute("nombreCliente", "nombre: " + cliDTOleer.getNombre());
                    request.setAttribute("apellidoCliente", "apellido: " + cliDTOleer.getApellido());
                    request.setAttribute("celularCliente", "celular: " + cliDTOleer.getCelular());
                    request.setAttribute("mailCliente", "mail: " + cliDTOleer.getMail());
                    request.setAttribute("usuarioCliente", "usuario: " + cliDTOleer.getUsuario());
                    request.setAttribute("passCliente", "pass: " + cliDTOleer.getPass());
                    
                    request.getRequestDispatcher("/buscar.jsp").forward(request, response);

                } catch (Exception e) {
                    request.getSession().setAttribute("msg", "El Cliente indicado no existe");
                    response.sendRedirect("buscar.jsp");
                }
                break;

            case "Buscar Rut":
                try {
                    int rut = Integer.parseInt(request.getParameter("rut"));
                    String nombre = request.getParameter("nombre");
                    String apellido = request.getParameter("apellido");
                    String celular = request.getParameter("celular");
                    String mail = request.getParameter("mail");
                    String usuario = request.getParameter("usuario");
                    String pass = request.getParameter("pass");
                    ClienteDTO cliDTOleer = servicio.readCliente(rut);
                    request.setAttribute("rutCliente", cliDTOleer.getRut());
                    request.setAttribute("nombreCliente", cliDTOleer.getNombre());
                    request.setAttribute("apellidoCliente", cliDTOleer.getApellido());
                    request.setAttribute("celularCliente", cliDTOleer.getCelular());
                    request.setAttribute("mailCliente", cliDTOleer.getMail());
                    request.setAttribute("usuarioCliente", cliDTOleer.getUsuario());
                    request.setAttribute("passCliente", cliDTOleer.getPass());
                    request.getRequestDispatcher("/modificar.jsp").forward(request, response);

                } catch (Exception e) {
                    request.getSession().setAttribute("msgm", "El Rut indicado no existe");
                    response.sendRedirect("modificar.jsp");

                }
                break;

            case "Actualizar":
                try {
                    int rut = Integer.parseInt(request.getParameter("rut"));
                    String nombre = request.getParameter("nombre");
                    String apellido = request.getParameter("apellido");
                    String celular = request.getParameter("celular");
                    String mail = request.getParameter("mail");
                    String usuario = request.getParameter("usuario");
                    String pass = request.getParameter("pass");
                    ClienteDTO cliDTOactualizar = new ClienteDTO();
                    cliDTOactualizar.setRut(rut);
                    cliDTOactualizar.setNombre(nombre);
                    cliDTOactualizar.setApellido(apellido);
                    cliDTOactualizar.setCelular(celular);
                    cliDTOactualizar.setMail(mail);
                    cliDTOactualizar.setUsuario(usuario);
                    cliDTOactualizar.setPass(pass);
                    servicio.updateCliente(cliDTOactualizar);

                } catch (Exception e) {
                    request.getSession().setAttribute("msgm", "no se ha podido actualizar el cliente");
                    response.sendRedirect("modificar.jsp");
                    edo = false;
                }
                if (edo == true) {
                    request.getSession().setAttribute("msgm", "registro modificado ");
                    request.getRequestDispatcher("/modificar.jsp").forward(request, response);
                }
                break;

            case "Eliminar":
                try {
                    int rut = Integer.parseInt(request.getParameter("rut"));
                    servicio.deletePersona(rut);
                } catch (Exception e) {
                    request.getSession().setAttribute("msge", "no se ha podido eliminar el registro");
                    response.sendRedirect("eliminar.jsp");
                    edo = false;
                }
                if (edo == true) {
                    request.getSession().setAttribute("msge", "registro eliminado");
                    response.sendRedirect("eliminar.jsp");
                }
                break;

            case "IniciarSesion":
                try {
                    int rut = Integer.parseInt(request.getParameter("rut"));
                    String clave = request.getParameter("pass");
                    ClienteDTO cliDTOleer = servicio.readCliente(rut);

                    if (cliDTOleer.getPass().equals(clave)) {
                        response.sendRedirect("index.jsp");
                    }else{
                         request.getSession().setAttribute("msg", "usuario y/o contraseña incorrecta");
                    response.sendRedirect("login.jsp");
                    }
                } catch (Exception e) {
                    request.getSession().setAttribute("msg", "usuario y/o contraseña incorrecta");
                    response.sendRedirect("login.jsp");
                }
                break;
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
