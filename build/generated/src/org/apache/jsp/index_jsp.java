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
      out.write("        <title>Home</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assest/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assest/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assest/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"assest/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"assest/jquery-3.2.1.js\"></script>\n");
      out.write("        <script src=\"assest/bootstrap.min.js\"></script>\n");
      out.write("    <nav class=\"w3-bar w3-cyan\" style=\"background-color:light brown\">\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\" >\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Pharmacy</a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li class=\"selected\"><a href=\"index.jsp\"> <i class=\"fa fa-home\"></i>Home</a></li>               \n");
      out.write("                <li><a href=\"about.jsp\"> <i class=\"fa fa-sign-in\"></i> About Us</a></li>\n");
      out.write("                <li><a href=\"login.jsp\"> <i class=\"fa fa-sign-in\"></i> Login</a></li>\n");
      out.write("                <li><a href=\"products.jsp\"> <i class=\"fa fa-flag\"></i>Products</a></li>\n");
      out.write("                <li><a href=\"feed.jsp\"> <i class=\"fa fa-comments-o\"></i>Feedback</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div id=\"carousel-example\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#carousel-example\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#carousel-example\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#carousel-example\" data-slide-to=\"2\"></li>\n");
      out.write("            </ol>\n");
      out.write("\n");
      out.write("            <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"item active\">\n");
      out.write("                    <a href=\"#\"><img src=\"images/1.jpg\" height=\"50%\" width=\"100%\"/></a>\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <h3 style=\"color:black\"> Welcome to SUWA SEWANA Pharmacy </h3>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <a href=\"#\"><img src=\"images/2.jpg\"  height=\"30%\" width=\"100%\"/></a>\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <h3 style=\"color:black\" >Healthy and Wellness</h3>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <a href=\"#\"><img src=\"images/3.jpg\" height=\"30%\" width=\"100%\" /></a>\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <h3 style=\"color:black\">Take care Your selves</h3>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                     <div class=\"item\">\n");
      out.write("                    <a href=\"#\"><img src=\"images/4.jpg\"  height=\"30%\" width=\"100%\"/></a>\n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                        <h3 style=\"color:black\"> Welcome to SUWA SEWANA Pharmacy </h3>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <a class=\"left carousel-control\" href=\"#carousel-example\" data-slide=\"prev\">\n");
      out.write("                <i class=\"fa fa-arrow-left\"></i>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"right carousel-control\" href=\"#carousel-example\" data-slide=\"next\">\n");
      out.write("                <i class=\"fa fa-arrow-right\"></i>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </div>    \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <!-- Footer -->\n");
      out.write("    <footer class=\"w3-container w3-cyan navbar-fixed-bottom\">\n");
      out.write("        <div class=\"container_12\">\n");
      out.write("            <p class=\"m-0 text-center text-white\"> <i>&copy; All Right Reserved (IIT- Group N0 04)</i></p>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
