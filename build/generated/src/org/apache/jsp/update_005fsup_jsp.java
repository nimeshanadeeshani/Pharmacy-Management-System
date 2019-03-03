package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class update_005fsup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Update Supplier</title>\n");
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
      out.write("                <li><a href=\"view_feed.jsp\"> <i class=\"fa fa-sign-in\"></i> View Feedback</a></li>\n");
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
      out.write("    \n");
      out.write("    ");

          try {
    String sup_id = request.getParameter("sup_id");
    String fname = request.getParameter("fname");
    String lname = request.getParameter("lname");
   
    String nic = request.getParameter("nic");
    int contact_no = Integer.parseInt(request.getParameter("contact_no"));
    String address = request.getParameter("address");
    String email = request.getParameter("email");


  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root", "");
        Statement stmt = con.createStatement();

        stmt = con.createStatement();
        int a = stmt.executeUpdate("UPDATE supplier SET fname='" + fname + "',lname='" + lname + "',nic='" + nic + "',contact_no=" + contact_no + ",address='" + address + "',email='"+ email+"' WHERE sup_id='" + sup_id + "'");
        if (a > 0) {
            
             response.sendRedirect("view_sup.jsp");
        }
           
        
    } catch (Exception e) {
        out.println("unsuccess");
        System.out.println(e);
    }

      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("            <div class=\"panel-heading\"><h2> Edit Suppliers</h2></div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <form method=\"POST\" action=\"update_sup.jsp\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");

                         try {
                        String sup_id = request.getParameter("sup_id");
                        //int no = Integer.parseInt(sup_id);

                       
                            Class.forName("com.mysql.jdbc.Driver");

                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root", "");
                            Statement stmt = con.createStatement();

                            String query = "SELECT sup_id,fname,lname,nic,contact_no,address,email FROM supplier WHERE sup_id='" +sup_id+ "'";

                            ResultSet rs = stmt.executeQuery(query);

                            while (rs.next()) {

                    
      out.write("\n");
      out.write("                    <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" >Sup_Id:</label>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <input type=\"text\" name=\"sup_id\" class=\"form-control\" value=\"");
      out.print(rs.getString(1));
      out.write("\" size=\"10\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" >First name:</label>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <input type=\"text\" name=\"fname\" class=\"form-control\" value=\"");
      out.print(rs.getString(2));
      out.write("\" size=\"10\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" >Last name:</label>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <input type=\"text\" name=\"lname\" class=\"form-control\" value=\"");
      out.print(rs.getString(3));
      out.write("\"size=\"10\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                   \n");
      out.write("                    <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" >NIC:</label>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <input type=\"text\" name=\"nic\" class=\"form-control\" value=\"");
      out.print(rs.getString(4));
      out.write("\"size=\"10\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" >Contact:</label>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <input type=\"text\" name=\"contact_no\"  class=\"form-control\" value=\"");
      out.print(rs.getInt(5));
      out.write("\"size=\"10\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" >Address:</label>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <input type=\"text\" name=\"address\" class=\"form-control\" value=\"");
      out.print(rs.getString(6));
      out.write("\"size=\"10\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                        <label class=\"control-label col-sm-2\" >Email:</label>\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <input type=\"text\" name=\"email\" class=\"form-control\" value=\"");
      out.print(rs.getString(7));
      out.write("\"size=\"10\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("\n");
      out.write("                        <div class=\"col-sm-8\">\n");
      out.write("                            <input type=\"submit\" name=\"Submit\" value=\"Update\" style=\"background-color:#49743D;font-weight:bold;color:#ffffff;\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");

                            }
                        } catch (Exception e) {
                        }
                    
      out.write("\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>  \n");
      out.write("    </div>  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <script src=\"assest/jquery.min.js\"></script>\n");
      out.write("    <script src=\"assest/jquery.form-validator.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        $.validate({\n");
      out.write("            // modules: 'security'\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</div>  \n");
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
