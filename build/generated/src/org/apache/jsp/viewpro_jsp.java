package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class viewpro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>View Product Details</title>\n");
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
      out.write("                <li class=\"selected\"><a href=\"viewpro.jsp\"> <i class=\"fa fa-sign-in\"></i>Products</a></li>\n");
      out.write("                <li><a href=\"view_feed.jsp\"> <i class=\"fa fa-sign-in\"></i> View Feedback</a></li>\n");
      out.write("                <li><a href=\"logout.jsp\"> <i class=\"fa fa-sign-in\"></i>Log Out</a></li>  \n");
      out.write("\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("            <div class=\"panel-heading\" align=\"left\"><h2> Manage Products</h2></div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                <h4><a href=\"addpro.jsp\">Add New Products</a></h4>\n");
      out.write("\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div style=\"margin-top: 30px;\">\n");
      out.write("                        <div style=\"text-align: center;border-bottom: 1px solid #757575;margin-bottom: 15px;\">\n");
      out.write("                            <h3>View Product Details</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <table class=\"table table-striped table-bordered\"  cellspacing=\"0\" width=\"100%\" role=\"grid\" style=\"background-color: #fff;\">\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <th width=\"100\">Product Id</th>\n");
      out.write("                                <th>Product Name</th>\n");
      out.write("                                <th>Category</th>\n");
      out.write("                                <th>Quantity</th>\n");
      out.write("                                <th>Purchase Price</th>\n");
      out.write("                                <th>Sales Price</th>\n");
      out.write("                                <th width=\"150\">Manufactured Date</th>\n");
      out.write("                                <th width=\"150\">Expired Date</th>\n");
      out.write("                                <th width=\"100\">Action</th>\n");
      out.write("                                <th width=\"100\">Action</th>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tbody>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                                </div>\n");
      out.write("                                ");

                                    try {

                                        Class.forName("com.mysql.jdbc.Driver");
                                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root", "");
                                        Statement stmt = con.createStatement();
                                        String query = "select * from product order by pro_id asc";
                                        ResultSet rs = stmt.executeQuery(query);
      out.write("\n");
      out.write("\n");
      out.write("                                ");

                                    while (rs.next()) {

                                
      out.write("\n");
      out.write("                                <tr>\t\t\t\n");
      out.write("                                    <td>");
      out.print(rs.getString("pro_id"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString("pro_name"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString("category"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString("qty"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString("p_price"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString("s_price"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString("manu_date"));
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(rs.getString("exp_date"));
      out.write("</td>\n");
      out.write("                                    <td align=\"center\" style=\"background-color:skyblue;\">\n");
      out.write("                                        <a href=\"editpro.jsp?pro_id=");
      out.print(rs.getString("pro_id"));
      out.write("\" class=\"editbtn\">Edit</a>\n");
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                    <td align=\"center\" style=\"background-color:tomato;\">\n");
      out.write("                                        <a href=\"deletepro.jsp?pro_id=");
      out.print(rs.getString("pro_id"));
      out.write("\" class=\"deletebtn\">Delete</a>\n");
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                        ");

                                rs.close();
                                stmt.close();
                                con.close();
                            } catch (Exception e) {
                                out.println("error");
                            }
                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div id=\"\" align=center style=\"background-color:skyblue;float:center;margin:5px;hight:50% ;text-align:left\"> \n");
      out.write("                <p align=center>\n");
      out.write("                <Marquee direction=\"right\" width=1000>\n");
      out.write("\n");
      out.write("                    <img src=images/6.jpg  width=250 height=150 style=\"float:left;border-radius:20px; align:center\">\n");
      out.write("                    <img src=images/7.jpg  width=250 height=150 style=\"float:left;border-radius:20px; align:center\">\n");
      out.write("                    <img src=images/8.jpg  width=250 height=150 style=\"float:left;border-radius:20px; align:center\">\n");
      out.write("                    <img src=images/9.jpg  width=250 height=150 style=\"float:left;border-radius:20px; align:center\">\n");
      out.write("                    <img src=images/10.jpg  width=250 height=150 style=\"float:left;border-radius:20px; align:center\">\n");
      out.write("                    <img src=images/11.jpg  width=250 height=150 style=\"float:left;border-radius:20px; align:center\">\n");
      out.write("                    <img src=images/12.jpg  width=250 height=150 style=\"float:left;border-radius:20px; align:center\">\n");
      out.write("                    <img src=images/13.jpg  width=250 height=150 style=\"float:left;border-radius:20px; align:center\">\n");
      out.write("                    <img src=images/14.jpg  width=250 height=150 style=\"float:left;border-radius:20px; align:center\">\n");
      out.write("                    <img src=images/15.jpg  width=250 height=150 style=\"float:left;border-radius:20px; align:center\">\n");
      out.write("                    <img src=images/16.jpg  width=250 height=150 style=\"float:left;border-radius:20px; align:center\">\n");
      out.write("                </marquee>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <script src=\"assest/jquery.min.js\"></script>\n");
      out.write("            <script src=\"assest/jquery.form-validator.min.js\"></script>\n");
      out.write("            <script>\n");
      out.write("                $.validate({\n");
      out.write("                    // modules: 'security'\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("        </div>  \n");
      out.write("    </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</br>\n");
      out.write("</br>\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"w3-container w3-cyan navbar-fixed-bottom\">\n");
      out.write("    <div class=\"container_12\">\n");
      out.write("        <p class=\"m-0 text-center text-white\"> <i>&copy; All Right Reserved (IIT- Group N0 04)</i></p>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("</footer>\n");
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
