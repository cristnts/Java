package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <!--Import Google Icon Font-->       \n");
      out.write("         <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\"> \n");
      out.write("         <!--Import materialize.css-->      \n");
      out.write("         <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>       \n");
      out.write("         <!--Let browser know website is optimized for mobile-->        \n");
      out.write("         <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/> \n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"estilo.css\" media=\"screen\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col s3\"></div>\n");
      out.write("            <div class=\"col s6\">\n");
      out.write("                <div class=\"card-panel orange accent-1\"><strong>Aplicación de supermercado</strong></div>\n");
      out.write("                <br></br>\n");
      out.write("                <form action=\"Controlador.do\" method=\"post\">\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        <input id=\"id\" type=\"text\" name=\"id\">\n");
      out.write("                        <label for=\"id\">ID producto</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        <input id=\"nombre\" type=\"text\" name=\"nombre\">\n");
      out.write("                        <label for=\"nombre\">Nombre </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field \">\n");
      out.write("                        <select name=\"dia\">\n");
      out.write("                            <option value=\"\" disabled selected>Elige un dia  </option>\n");
      out.write("                            <option value=\"lunes\">Lunes</option>\n");
      out.write("                            <option value=\"martes\">Martes</option>\n");
      out.write("                            <option value=\"miercoles\">Miercoles</option>\n");
      out.write("                            <option value=\"jueves\">Jueves</option>\n");
      out.write("                            <option value=\"viernes\">Viernes</option>\n");
      out.write("\n");
      out.write("                        </select>\n");
      out.write("    <label>Materialize Select</label>\n");
      out.write("  </div>\n");
      out.write("                    <div class=\"input-field\">\n");
      out.write("                        <input id=\"cantidad\" type=\"text\" name=\"cantidad\">\n");
      out.write("                        <label for=\"cantidad\">Cantidad</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"input-field \">\n");
      out.write("                        <select name=\"categoria\">\n");
      out.write("                            <option value=\"\" disabled selected>Elige un dia  </option>\n");
      out.write("                            <option value=\"hogar\">Hogar</option>\n");
      out.write("                            <option value=\"frutayverdura\">Fruta y verdura</option>\n");
      out.write("                            <option value=\"electro\">Electro</option>\n");
      out.write("                        </select>\n");
      out.write("    <label>Materialize Select</label>\n");
      out.write("  </div>\n");
      out.write("                    \n");
      out.write("                     <div class=\"input-field\">\n");
      out.write("                        <input id=\"precio\" type=\"text\" name=\"precio\">\n");
      out.write("                        <label for=\"precio\">Precio</label>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                 \n");
      out.write("                    \n");
      out.write("                    <input type= \"submit\" class=\"btn waves-effect waves-orange\"  name=\"bt\" value=\"Procesar\">\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("                <br></br>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <!--Import jQuery before materialize.js--> \n");
      out.write("        <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-2.1.1.min.js\"></script>     \n");
      out.write("         <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script> \n");
      out.write("         <script>\n");
      out.write("             $(document).ready(function() {\n");
      out.write("             $('select').material_select();\n");
      out.write("             });\n");
      out.write("         </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
