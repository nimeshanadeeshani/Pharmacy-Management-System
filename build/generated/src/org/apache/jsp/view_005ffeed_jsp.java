package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class view_005ffeed_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View FeedBack</title>\n");
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
      out.write("                <li><a href=\"index.jsp\"> <i class=\"fa fa-sign-in\"></i>Home</a></li>\n");
      out.write("                <li><a href=\"view_sup.jsp\"> <i class=\"fa fa-sign-in\"></i>Suppliers</a></li>\n");
      out.write("                <li><a href=\"viewpro.jsp\"> <i class=\"fa fa-sign-in\"></i>Products</a></li>\n");
      out.write("                <li class=\"selected\"><a href=\"view_feed.jsp\"> <i class=\"fa fa-sign-in\"></i> View Feedback</a></li>\n");
      out.write("                 <li><a href=\"logout.jsp\"> <i class=\"fa fa-sign-in\"></i>Log Out</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("    </div>    \n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"panel-heading\"><h2> View Feedback Form</h2></div>\n");
      out.write("    <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("        <table  border='1' class=\"table\">\n");
      out.write("           \n");
      out.write("            <tr><th>Feedback Id</th><th>Subject</th><th>Description</th><th>Email</th><th>Contact No</th></tr>\n");
      out.write("                    ");


                        try {

                            Class.forName("com.mysql.jdbc.Driver");

                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root", "");
                            Statement stmt = con.createStatement();
                            String query = "SELECT * FROM feed";
                            ResultSet rs = stmt.executeQuery(query);


                    
      out.write("\n");
      out.write("                    ");
            while (rs.next()) {
                    
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>  ");
      out.print(rs.getString(1));
      out.write("     </td>\n");
      out.write("                <td>  ");
      out.print(rs.getString(2));
      out.write("  </td>\n");
      out.write("                <td> ");
      out.print(rs.getString(3));
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print(rs.getString(4));
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print(rs.getString(5));
      out.write(" </td>\n");
      out.write("               \n");
      out.write("\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            ");
    }

                } catch (Exception e) {

                }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <script src=\"assest/jquery.min.js\"></script>\n");
      out.write("            <script src=\"assest/jquery.form-validator.min.js\"></script>\n");
      out.write("            <script>\n");
      out.write("                $.validate({\n");
      out.write("                    // modules: 'security'\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("    </div>  \n");
      out.write("</div> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write(" <!-- Footer -->\n");
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
