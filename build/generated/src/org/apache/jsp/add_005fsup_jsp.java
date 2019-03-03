package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class add_005fsup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Supplier</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assest/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assest/w3.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assest/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"assest/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"assest/jquery-3.2.1.js\"></script>\n");
      out.write("        <script src=\"assest/bootstrap.min.js\"></script>\n");
      out.write("    <nav class=\"w3-bar w3-blue\" style=\"background-color:light brown\">\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\" >\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Pharmacy</a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li><a href=\"admin.jsp\"> <i class=\"fa fa-sign-in\"></i>Home</a></li>\n");
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
      out.write("\n");
      out.write("    \n");
      out.write("                <div class=\"panel-heading\"><h2>Add New Supplier</h2></div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                        <form>\n");
      out.write("                        <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" >Sup Id:</label>\n");
      out.write("                            <div class=\"col-sm-8\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"sup_id\" data-validation=\"required\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" >Company name:</label>\n");
      out.write("                            <div class=\"col-sm-8\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"name\" data-validation=\"required\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                       \n");
      out.write("                        <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" >Contact No</label>\n");
      out.write("                            <div class=\"col-sm-8\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"contact_no\"  data-validation=\"number\" data-validation=\"required\" >\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" >Address:</label>\n");
      out.write("                            <div class=\"col-sm-8\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"address\" data-validation=\"required\" >\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" >Email:</label>\n");
      out.write("                            <div class=\"col-sm-8\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"email\" data-validation=\"required\" >\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" >Username</label>\n");
      out.write("                            <div class=\"col-sm-8\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" name=\"username\" data-validation=\"required\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                            <label class=\"control-label col-sm-2\" >Password:</label>\n");
      out.write("                            <div class=\"col-sm-8\">\n");
      out.write("                                <input type=\"password\" class=\"form-control\" name=\"password\" data-validation=\"length\" data-validation-length=\"min3\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group row col-sm-10\">        \n");
      out.write("                            <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                                <button type=\"submit\" value=\"submit\" name=\"submit\" class=\"btn btn-default\">Save</button>\n");
      out.write("                                <button type=\"reset\" value=\"reset\" name=\"reset\" class=\"btn btn-default\">Reset</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                            \n");
      out.write("                           \n");
      out.write("                    </form>\n");
      out.write("                    ");

                //if (request.getParameter("sup_id") != null) {
                  try {
                String sup_id = request.getParameter("sup_id");    

                String name = request.getParameter("name");
               
                int contact_no = Integer.parseInt(request.getParameter("contact_no"));
                String address = request.getParameter("address");
                String email = request.getParameter("email");
                String username = request.getParameter("username");
                String password = request.getParameter("password");
                String type="supplier";
                
                Class.forName("com.mysql.jdbc.Driver");

                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root", "");
                    Statement stmt = con.createStatement();

                    String query = "INSERT INTO supplier (sup_id,name,contact_no,address,email,username,password) VALUES('" + sup_id + "','" + name + "','" + contact_no + "','" + address + "','"+email+"','" + username + "','" + password + "')";
                    String query1 = "insert into login (username,password,type)values('" + username + "','" + password + "','"+type+"')";
                    int a = stmt.executeUpdate(query);
                    if (a > 0) {
                        
                        int b = stmt.executeUpdate(query1);
                        if (b > 0) {
                            out.println("<p> Successfully Registered  </p>");
                        }

                    } else {
                        out.println("<p>Unsuccessfull</p>");
                    }

                } catch (Exception e) {
                    //out.print("" + e.getMessage());
                   // e.printStackTrace();
                }

            //}


                    
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                 \n");
      out.write("                <script src=\"assest/jquery.min.js\"></script>\n");
      out.write("                <script src=\"assest/jquery.form-validator.min.js\"></script>\n");
      out.write("                <script>\n");
      out.write("                    $.validate({\n");
      out.write("                        // modules: 'security'\n");
      out.write("                    });\n");
      out.write("                </script>\n");
      out.write(" </div>  \n");
      out.write("                    </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("        </br>\n");
      out.write("        </br>\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer class=\"w3-container w3-blue navbar-fixed-bottom\">\n");
      out.write("            <div class=\"container_12\">\n");
      out.write("                <p class=\"m-0 text-center text-white\">Copyright &copy;RAD GROUP-04(IIT)-2018</p>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.container -->\n");
      out.write("        </footer>\n");
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
