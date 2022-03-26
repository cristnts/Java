package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Promociones_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       \n");
      out.write("      <!--Import Google Icon Font-->\n");
      out.write("      <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("      <!--Import materialize.css-->\n");
      out.write("      <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("      <!--Let browser know website is optimized for mobile-->\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col s3\"></div>\n");
      out.write("            <div class=\"col s6\">\n");
      out.write("\n");
      out.write(" <nav>\n");
      out.write("    <div class=\"nav-wrapper\">\n");
      out.write("      <a href=\"#\" class=\"brand-logo right\">Logo</a>\n");
      out.write("      <ul id=\"nav-mobile\" class=\"left hide-on-med-and-down\">\n");
      out.write("        <li><a href=\"promociones.jsp\">Promociones</a></li>\n");
      out.write("        <li><a href=\"index.jsp\">Productos</a></li>\n");
      out.write("        <li><a href=\"collapsible.html\">JavaScript</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("        \n");
      out.write("\n");
      out.write("                \n");
      out.write("                <nav>\n");
      out.write("                    <div class=\"nav-wrapper\">\n");
      out.write("                        <a href=\"#\" class=\"brand-logo right\">Menu</a>\n");
      out.write("                        <ul id=\"nav-mobile\" class=\"left hide-on-med-and-down\">\n");
      out.write("                            <li><a href=\"index.jsp\">Productos</a></li>\n");
      out.write("                            <li><a href=\"Promociones.jsp\">Promociones</a></li>\n");
      out.write("                           \n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <div class=\"input-field\">\n");
      out.write("                    <i class=\"material-icons prefix\">account_circle</i>\n");
      out.write("                    <input id=\"icon_prefix\" type=\"text\" class=\"validate\" name=\"user\">\n");
      out.write("                    <label for=\"icon_prefix\">Nombre Promocion</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input-field\">\n");
      out.write("                    <i class=\"material-icons prefix\">account_circle</i>\n");
      out.write("                    <input id=\"icon_prefix\" type=\"text\" class=\"validate\" name=\"user\">\n");
      out.write("                    <label for=\"icon_prefix\">Descuento</label>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <form class=\"col\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"input-field\">\n");
      out.write("                                <textarea id=\"textarea1\" class=\"materialize-textarea\"></textarea>\n");
      out.write("                                <label for=\"textarea1\">Productos</label>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("       <h5>fecha inicio</h5>\n");
      out.write("        <input type=\"text\" class=\"timepicker\"> \n");
      out.write("        <h5>fecha termino</h5>\n");
      out.write("        <input type=\"text\" class=\"timepicker\"> \n");
      out.write("\n");
      out.write("            </div>    \n");
      out.write("        </div>  \n");
      out.write("\n");
      out.write(" \n");
      out.write("          \n");
      out.write("                \n");
      out.write("         <!--Import jQuery before materialize.js-->\n");
      out.write("      <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("      <script> \n");
      out.write("       $(document).ready(function() {\n");
      out.write("       $('select').material_select();\n");
      out.write("        });\n");
      out.write("      </script>\n");
      out.write("      <script> $('.timepicker').pickatime({\n");
      out.write("    default: 'now', // Set default time: 'now', '1:30AM', '16:30'\n");
      out.write("    fromnow: 0,       // set default time to * milliseconds from now (using with default = 'now')\n");
      out.write("    twelvehour: false, // Use AM/PM or 24-hour format\n");
      out.write("    donetext: 'OK', // text for done-button\n");
      out.write("    cleartext: 'Clear', // text for clear-button\n");
      out.write("    canceltext: 'Cancel', // Text for cancel-button\n");
      out.write("    autoclose: false, // automatic close timepicker\n");
      out.write("    ampmclickable: true, // make AM PM clickable\n");
      out.write("    aftershow: function(){} //Function for after opening timepicker\n");
      out.write("  });</script>\n");
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
