package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Turismo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  \n");
      out.write("      <!--Import Google Icon Font-->\n");
      out.write("      <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("      <!--Import materialize.css-->\n");
      out.write("      <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("      <!--Let browser know website is optimized for mobile-->\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("                \n");
      out.write("                \n");
      out.write("  <nav>\n");
      out.write("    <div class=\"nav-wrapper\">\n");
      out.write("      <a href=\"#\" class=\"brand-logo right\">FexLine</a>\n");
      out.write("      <ul id=\"nav-mobile\" class=\"left hide-on-med-and-down\">\n");
      out.write("        <li><a href=\"Formulario.jsp\">Pasajeros</a></li>\n");
      out.write("        <li><a href=\"badges.html\">Carga</a></li>\n");
      out.write("        <li><a href=\"collapsible.html\">Turismo</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("        \n");
      out.write("                \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col s3\"></div>\n");
      out.write("            <div class=\"col s6\">\n");
      out.write("                \n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col\">\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <div class=\"card-image\">\n");
      out.write("              <img src=\"https://media-cdn.tripadvisor.com/media/photo-s/0e/57/99/f2/ananda-hotel-boutique.jpg\">\n");
      out.write("              <span class=\"card-title\">Hotel -San Juan</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-content\">\n");
      out.write("              <p>Comodo Hotel con una preciada vista.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-action\">\n");
      out.write("              <a href=\"#\">Tomar paquete 1</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col \">\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <div class=\"card-image\">\n");
      out.write("              <img src=\"http://media-room5.trivago.com/wp-content/uploads/sites/3/2016/06/29160757/hoteles-de-playa-vincci-seleccion-aleysa-benalmadena-andalucia-piscina.jpg\">\n");
      out.write("              <span class=\"card-title\">Hotel -Bahamas</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-content\">\n");
      out.write("              <p>Si lo que usted quiere son buena vacaciones a buen precio eliga este hotel.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-action\">\n");
      out.write("              <a href=\"#\">Tomar Paquete 2</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col \">\n");
      out.write("          <div class=\"card\">\n");
      out.write("            <div class=\"card-image\">\n");
      out.write("              <img src=\"http://memoflores.com/fotos-de-hoteles-05.jpg\">\n");
      out.write("              <span class=\"card-title\">Hotel -Costa Azul</span>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-content\">\n");
      out.write("              <p>Un ambiente de celebridades y personas importantes.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-action\">\n");
      out.write("              <a href=\"#\">Tomar paquete 3</a>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("            \n");
      out.write("               \n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
      out.write("         <!--Import jQuery before materialize.js-->\n");
      out.write("      <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("      <script> \n");
      out.write("       $(document).ready(function() {\n");
      out.write("       $('select').material_select();\n");
      out.write("        });\n");
      out.write("      </script>\n");
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
