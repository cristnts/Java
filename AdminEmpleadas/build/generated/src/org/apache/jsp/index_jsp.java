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
      out.write("\n");
      out.write("    <head>\n");
      out.write("  \n");
      out.write("      <!--Import Google Icon Font-->\n");
      out.write("      <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("      <!--Import materialize.css-->\n");
      out.write("      <link type=\"text/css\" rel=\"stylesheet\" href=\"css/materialize.min.css\"  media=\"screen,projection\"/>\n");
      out.write("      <!--Let browser know website is optimized for mobile-->\n");
      out.write("      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <nav class=\"nav-extended\">\n");
      out.write("    <div class=\"nav-wrapper\">\n");
      out.write("      <a href=\"#!\" class=\"brand-logo\">Menu Principal</a>\n");
      out.write("      <ul class=\"right hide-on-med-and-down\">\n");
      out.write("        <li><a href=\"agregar.jsp\">agregar</a></li>\n");
      out.write("        <li><a href=\"buscar.jsp\">buscar</a></li>\n");
      out.write("        <li><a href=\"eliminar.jsp\">eliminar</a></li>\n");
      out.write("        <li><a href=\"modificar.jsp\">modificar</a></li>\n");
      out.write("     </ul>\n");
      out.write("    </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    \n");
      out.write("   <body>\n");
      out.write("        \n");
      out.write("       <div class=\"row\">\n");
      out.write("            <div class=\"col s3\"></div>\n");
      out.write("            <div class=\"col s6\">\n");
      out.write("              \n");
      out.write("                              \n");
      out.write("    <div class=\"carousel\">\n");
      out.write("    <a class=\"carousel-item\" href=\"#one!\"><img src=\"http://www.zoominmobiliario.com/uploadzoom/cms/20120326094313_17202.jpg\"></a>\n");
      out.write("    <a class=\"carousel-item\" href=\"#two!\"><img src=\"http://4.bp.blogspot.com/-C_KqO4E_h_U/TZ0XF59A1NI/AAAAAAAAE40/JsTCD7gL_sc/s1600/planchar.jpg\"></a>\n");
      out.write("    <a class=\"carousel-item\" href=\"#three!\"><img src=\"https://www.google.cl/url?sa=i&rct=j&q=&esrc=s&source=imgres&cd=&cad=rja&uact=8&ved=0ahUKEwi9g_3kgvHXAhWIkJAKHf_VBZsQjRwIBw&url=http%3A%2F%2Fdiasenmicasa.blogspot.com%2F2011%2F04%2Fse-prohibecontinuando-con-el-planchado.html&psig=AOvVaw2q6JbSyuZmeNE3taaWS4f5&ust=1512499751008695\"></a>\n");
      out.write("    <a class=\"carousel-item\" href=\"#four!\"><img src=\"https://st.depositphotos.com/2317051/2512/v/950/depositphotos_25122743-stock-illustration-busy-housewife-cartoon-showing-woman.jpg\"></a>\n");
      out.write("    <a class=\"carousel-item\" href=\"#five!\"><img src=\"https://www.google.cl/url?sa=i&rct=j&q=&esrc=s&source=imgres&cd=&cad=rja&uact=8&ved=0ahUKEwiN9v-Ig_HXAhXHgpAKHaNED9IQjRwIBw&url=http%3A%2F%2Fhotnews.bg%2Flaugh%2Fphotos%2Fmultifunktsionalna-zhena.1817.html&psig=AOvVaw2q6JbSyuZmeNE3taaWS4f5&ust=1512499751008695\"></a>\n");
      out.write("    </div>\n");
      out.write("                               \n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("       \n");
      out.write("       \n");
      out.write("       <!--Import jQuery before materialize.js-->\n");
      out.write("      <script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.2.1.min.js\"></script>\n");
      out.write("      <script type=\"text/javascript\" src=\"js/materialize.min.js\"></script>\n");
      out.write("      <script> $('.carousel.carousel-slider').carousel({fullWidth: true});\n");
      out.write("                </script>\n");
      out.write("        <script>   $(document).ready(function(){\n");
      out.write("      $('.carousel').carousel();\n");
      out.write("    });  </script>\n");
      out.write("      \n");
      out.write("    </body>\n");
      out.write("\n");
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
