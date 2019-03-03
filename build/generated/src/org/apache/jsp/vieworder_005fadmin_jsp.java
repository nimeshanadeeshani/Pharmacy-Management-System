package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class vieworder_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assest/bootstrap.min.css\">\n");
      out.write("        <script src=\"assest\\jquery-3.2.1.js\"></script>\n");
      out.write("        <script src=\"assest/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"assest/w3.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <nav class=\"w3-bar w3-blue\" style=\"background-color:light brown\">\n");
      out.write("\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\" >\n");
      out.write("                    <a class=\"navbar-brand\" href=\"#\">Pharmacy</a >\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"active\"><a href=\"admin.jsp\">Home</a></li>   \n");
      out.write("                    <li><a href=\"viewpro.jsp\">Appointments</a></li>\n");
      out.write("                    <li><a href=\"\">My Account</a></li>\n");
      out.write("                        ");
 if (session.getAttribute("uid") != null) {
      out.write("\n");
      out.write("                    <li> \n");
      out.write("                        <a href=\"logout.jsp\">Logout</a>\n");
      out.write("                    </li>\n");
      out.write("                    ");
} else {
      out.write("\n");
      out.write("                    <li> \n");
      out.write("                        <a href=\"login.jsp\">Login</a>\n");
      out.write("                    </li>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"panel-heading\" align=\"left\"><h2> View Orders</h2></div>\n");
      out.write("                <div class=\"panel-body\"\n");
      out.write("                     <h2><a href=\"order.jsp\">Place New Order</a></h2>\n");
      out.write("                    <table  border='1' class=\"table\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <tr><th>Order ID</th><th>Product Name</th><th>Qty</th><th>Supplier Name</th><th>Order Date</th><th>Expected Date</th><th>State</th></tr>\n");
      out.write("                          ");

                           
                            try {

                                Class.forName("com.mysql.jdbc.Driver");

                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root", "");
                                Statement stmt = con.createStatement();
                               // 
                                String query = "SELECT * FROM orders";
                                ResultSet rs = stmt.executeQuery(query);


                        
      out.write("\n");
      out.write("                        ");
            while (rs.next()) {
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td>  ");
      out.print(rs.getString(1));
      out.write("     </td>\n");
      out.write("                            <td>  ");
      out.print(rs.getString(3));
      out.write("  </td>\n");
      out.write("                            <td> ");
      out.print(rs.getString(4));
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print(rs.getString(6));
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print(rs.getString(7));
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print(rs.getString(8));
      out.write(" </td>\n");
      out.write("                            <td> ");
      out.print(rs.getString(9));
      out.write(" </td>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                          \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                         \n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        ");
    }

                            } catch (Exception e) {

                            }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>  \n");
      out.write("        </div>  \n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer class=\"w3-container w3-blue navbar-fixed-bottom\">\n");
      out.write("            <div class=\"container_12\">\n");
      out.write("                <p class=\"m-0 text-center text-white\">Copyright &copy;RAD GROUP-G-2017</p>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container -->\n");
      out.write("        </footer> \n");
      out.write("\n");
      out.write("\n");
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
