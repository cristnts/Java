
package controlador;

import dto.CuentaDTO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.CuentaServicio;


@WebServlet(name = "CuentaServlet", urlPatterns = {"/CuentaServlet.do"})
public class CuentaServlet extends HttpServlet {

    @EJB
    private CuentaServicio servicio;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CuentaServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet CuentaServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
   
        String boton = request.getParameter("bt");

        request.getSession().setAttribute("msg", "");
        request.getSession().setAttribute("msga", "");
        request.getSession().setAttribute("msgm", "");
        request.getSession().setAttribute("msge", "");
        boolean edo = true;
        
        switch (boton) {
            case "Agregar":
                try {
                    int numeroCuenta = Integer.parseInt(request.getParameter("numeroCuenta"));
                    String fechaApertura = request.getParameter("fechaApertura");
                    String tipoCuenta = request.getParameter("tipoCuenta");
                    int saldoCuenta = Integer.parseInt(request.getParameter("saldoCuenta"));
                    
                    CuentaDTO cueDTOcrear = new CuentaDTO();
                        
                    cueDTOcrear.setNumeroCuenta(numeroCuenta);
                    cueDTOcrear.setFechaApertura(fechaApertura);
                    cueDTOcrear.setTipoCuenta(tipoCuenta);
                    cueDTOcrear.setSaldoCuenta(saldoCuenta);
                    
                    servicio.createCuenta(cueDTOcrear);

                    
                } catch (Exception e){
                    request.getSession().setAttribute("msga", "No ha sido posible crear usuario");
                    response.sendRedirect("agregarCuenta.jsp");
                    edo = false;
                }
                if (edo == true){
                    request.getSession().setAttribute("msga", "Cliente agregado con exito");
                    request.getRequestDispatcher("/agregarCuenta.jsp").forward(request, response);
                }
                break;
            
        }
    
    
    
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
