/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dto.PersonaDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.PersonaServicio;

/**
 *
 * @author alumnossur
 */
@WebServlet(name = "PersonaServlet", urlPatterns = {"/PersonaServlet"})
public class PersonaServlet extends HttpServlet {

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
    private PersonaServicio servicio;
    
  
    
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
                        PersonaDTO perDTOcrear = new PersonaDTO();
                        perDTOcrear.setRut(rut);
                        perDTOcrear.setNombre(nombre);
                        perDTOcrear.setApellido(apellido);
                        servicio.createPersona(perDTOcrear);
                    }catch (Exception e){
                        request.getSession().setAttribute("maga","No ah sido posible agregar el registro");
                        response.sendRedirect("agregar.jsp");
                        edo=false;
                    }
                    if(edo==true){
                        request.getSession().setAttribute("maga","registro agregado");
                        request.getRequestDispatcher("/agregar.jsp").forward(request, response);
                       }
                    
                    case "Buscar":
                        try{
                        int rut= Integer.parseInt(request.getParameter("rut"));
                        String nombre = request.getParameter("nombre");
                        String apellido = request.getParameter("apellido");
                      PersonaDTO perDTOleer = servicio.readPersona(rut);
                      request.setAttribute("rutPersona","rut: " + perDTOleer.getRut());
                      request.setAttribute("nombrePersona","nombre : "+ perDTOleer.getNombre());
                      request.setAttribute("apellidoPersona", "apellido : " + perDTOleer.getApellido());
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
                      PersonaDTO perDTOleer = servicio.readPersona(rut);
                      request.setAttribute("rutPersona",perDTOleer.getRut());
                      request.setAttribute("nombrePersona", perDTOleer.getNombre());
                      request.setAttribute("apellidoPersona",  perDTOleer.getApellido());
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
                     PersonaDTO perDTOactualizar = new PersonaDTO();
                     perDTOactualizar.setRut(rut);
                     perDTOactualizar.setNombre(nombre);
                     perDTOactualizar.setApellido(apellido);
                     servicio.updatePersona(perDTOactualizar);
                    }catch(Exception e){
                        request.getSession().setAttribute("msgm", "no se ah podido actuaizat el registro");
                        response.sendRedirect("modificar.jsp");  
                        edo=false;  }
                        if(edo==true){
                        
                        request.getSession().setAttribute("msgm", "registro modificado");
                        request.getRequestDispatcher("modificar.jsp").forward(request,response);
                                       ;
                                       
                        }
                        
                break;
                
                
                    case "Eliminar":
                        try{
                            
                            int rut = Integer.parseInt(request.getParameter("rut"));
                            servicio.deletePersona(rut);
                        }
                        
                        catch(Exception e){
                            request.getSession().setAttribute("mage","no se ah podido eliminar");
                         response.sendRedirect("eliminar.jsp");
                         edo=false;
                                                    }
                        if(edo==true){
                            request.getSession().setAttribute("mage","regsitro elimninado");
                            response.sendRedirect("eliminar.jsp");
                                                       
                        }
                        break;
                
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
