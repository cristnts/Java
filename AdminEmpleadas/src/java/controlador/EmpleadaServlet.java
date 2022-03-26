/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dto.EmpleadaDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.EmpleadaServicio;

/**
 *
 * @author Vania
 */
@WebServlet(name = "EmpeladaServlet", urlPatterns = {"/EmpeladaServlet"})
public class EmpleadaServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet EmpeladaServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet EmpeladaServlet at " + request.getContextPath() + "</h1>");
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

        @EJB
    private EmpleadaServicio servicio;
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
            String boton=request.getParameter("bt");
            
                request.getSession().setAttribute("msg","");
                request.getSession().setAttribute("maga","");
                request.getSession().setAttribute("msgm","");
                request.getSession().setAttribute("mage","");
                boolean edo=true;
                
                switch(boton) {
                
                    case "Agregar":
                    try{
                        
                        int rut= Integer.parseInt(request.getParameter("rut"));
                        String nombre = request.getParameter("nombre");
                        String apellido = request.getParameter("apellido");
                        int telefono= Integer.parseInt(request.getParameter("telefono"));
                        int clasificacion= Integer.parseInt(request.getParameter("clasificacion"));

                        EmpleadaDTO empDTOcrear = new EmpleadaDTO();
                        
                        empDTOcrear.setRut(rut);
                        empDTOcrear.setNombre(nombre);
                        empDTOcrear.setApellido(apellido);
                        empDTOcrear.setTelefono(telefono);
                        empDTOcrear.setClasificacion(clasificacion);
                        servicio.createEmpleada(empDTOcrear);
                                            }catch (Exception e){
                        request.getSession().setAttribute("maga"," No ah sido posible agregar la empleada ");
                        response.sendRedirect("agregar.jsp");
                        edo=false;
                    }
                    if(edo==true){
                        request.getSession().setAttribute("maga","Empleada agregado");
                        request.getRequestDispatcher("/agregar.jsp").forward(request, response);
                       }
                    break;
                
                     case "Buscar":
                         
                      try{
                            
                        int rut= Integer.parseInt(request.getParameter("rut"));
                        String nombre = request.getParameter("nombre");
                        String apellido = request.getParameter("apellido");
                        int telefono= Integer.parseInt(request.getParameter("telefono"));
                        int clasificacion= Integer.parseInt(request.getParameter("clasificacion"));

                      EmpleadaDTO empDTOleer = servicio.readEmpleada(rut);
                      
                      request.setAttribute("rutEmpleada","rut: " + empDTOleer.getRut());
                      request.setAttribute("nombreEmpleada","nombre : "+ empDTOleer.getNombre());
                      request.setAttribute("apellidoEmpleada", "apellido : " + empDTOleer.getApellido());
                      request.setAttribute("telefonoEmpleada","telefono: " + empDTOleer.getTelefono());
                      request.setAttribute("clasificacionEmpleada","clasificacion: " + empDTOleer.getClasificacion());
                      
                      request.getRequestDispatcher("/buscar.jsp").forward(request, response);
                      
                               }catch (Exception e){
                                   request.getSession().setAttribute("mag", "el rut indicado no se encuentra registrado");
                                   response.sendRedirect("buscar.jsp");
                              }
                       break;
        
                case "Buscar rut":
                      
                  try{ 
                        int rut= Integer.parseInt(request.getParameter("rut"));
                        String nombre = request.getParameter("nombre");
                        String apellido = request.getParameter("apellido");
                        int telefono= Integer.parseInt(request.getParameter("telefono"));
                        int clasificacion= Integer.parseInt(request.getParameter("clasificacion"));

                      EmpleadaDTO empDTOleer = servicio.readEmpleada(rut);
                      
                      request.setAttribute("rutEmpleada", empDTOleer.getRut());
                      request.setAttribute("nombreEmpleada", empDTOleer.getNombre());
                      request.setAttribute("apellidoEmpleada", empDTOleer.getApellido());
                      request.setAttribute("telefonoEmpleada", empDTOleer.getTelefono());
                      request.setAttribute("clasificacionEmpleada", empDTOleer.getClasificacion());
                    
                      request.getRequestDispatcher("/modificar.jsp").forward(request, response);
                         
                        }catch (Exception e){
                                   request.getSession().setAttribute("msgm", "el rut indicado no se encuentra registrado");
                                   response.sendRedirect("modificar.jsp");
                              }
                        
                        break;
                        
                            
                    case "Actualizar":
                  
                    try{
                        
                        int rut= Integer.parseInt(request.getParameter("rut"));
                        String nombre = request.getParameter("nombre");
                        String apellido = request.getParameter("apellido");
                        int telefono= Integer.parseInt(request.getParameter("telefono"));
                        int clasificacion= Integer.parseInt(request.getParameter("clasificacion"));

                        
                     EmpleadaDTO empDTOactualizar = new EmpleadaDTO();
                     
                     empDTOactualizar.setRut(rut);
                     empDTOactualizar.setNombre(nombre);
                     empDTOactualizar.setApellido(apellido);
                     empDTOactualizar.setTelefono(telefono);
                     empDTOactualizar.setClasificacion(clasificacion);
                     
                     servicio.updateEmpleada(empDTOactualizar);
                     
                    }catch(Exception e){
                        
                        request.getSession().setAttribute("msgm", "no se ah podido actuaizar la empleada");
                        response.sendRedirect("modificar.jsp");  
                        edo=false;  }
                        if(edo==true){
                        
                        request.getSession().setAttribute("msgm", "Empleada modificada");
                        request.getRequestDispatcher("modificar.jsp").forward(request,response);
                                      
                                       
                        }
                        
                break;
                       
                       
                       
                    case "Eliminar":
                        try{
                            
                            int rut = Integer.parseInt(request.getParameter("rut"));
                            servicio.deleteEmpleada(rut);
                        }
                        
                        catch(Exception e){
                            request.getSession().setAttribute("mage","no se ah podido eliminar");
                            response.sendRedirect("eliminar.jsp");
                            edo=false;
                                                    }
                        if(edo==true){
                            request.getSession().setAttribute("mage","Empleada elimninado");
                            response.sendRedirect("eliminar.jsp");
                                                       
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
