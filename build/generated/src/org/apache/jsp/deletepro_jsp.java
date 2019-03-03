package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class deletepro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Delete Product Details</title>\n");
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
      out.write("                 <li><a href=\"logout.jsp\"> <i class=\"fa fa-sign-in\"></i>Log Out</a></li> \n");
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
      out.write("    <section class=\"\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("                <form name=\"Form1\" action=\"deletepro.jsp\" method=\"POST\">\n");
      out.write("\n");
      out.write("                    ");

                        String pro_id = request.getParameter("pro_id");
                        out.println(pro_id);

                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root", "");
                        Statement stmt = con.createStatement();

                        ResultSet rs = stmt.executeQuery("select * from product  WHERE pro_id='"+pro_id+"'");


                    
      out.write("\n");
      out.write("                    ");
 while (rs.next()) {
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <img style=\"margin-top: 30px;\" class=\"img-responsive addbookimg\" src=\"images/tab.jpg\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <section style=\"margin-top: 30px;\" class=\"panel\">\n");
      out.write("                    <header class=\"panel-heading form-title\">\n");
      out.write("                        Delete Product's\n");
      out.write("                    </header>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <form method=\"post\" enctype=\"multipart/form-data\" role=\"form\">\n");
      out.write("                            <div class=\"col-md-12 offset_0\">\n");
      out.write("                                <div class=\"col-md-6 offset_0 offset_1\">\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label >pro_id</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\"  name=\"pro_id\" value=\"");
      out.print(rs.getString("pro_id"));
      out.write("\" placeholder=\"Enter the id\" autocomplete=\"off\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label >Product Name</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\"  name=\"pro_name\" value=\"");
      out.print(rs.getString("pro_name"));
      out.write("\"  placeholder=\"Enter Product Name\"autocomplete=\"off\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label >Select Product Category</label>\n");
      out.write("                                        <select class=\"form-control\" id=\"reporter\" name=\"category\" value=\"");
      out.print(rs.getString("category"));
      out.write("\"  placeholder=\"Select category\">\n");
      out.write("                                            <option>- Select Category -</option> \n");
      out.write("                                            <option value=\"Capsule\" >Capsule</option>\n");
      out.write("                                            <option value=\"Pills\" >Pills</option>\n");
      out.write("                                            <option value=\"Injection\" >Injection</option>\n");
      out.write("                                            <option value=\"Syrup\" >Syrup</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label >Quantity</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"qty\" value=\"");
      out.print(rs.getString("qty"));
      out.write("\" placeholder=\"Enter Quantity \" autocomplete=\"off\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"col-md-6 offset_0 offset_1\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label >Purchase Price</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"p_price\" value=\"");
      out.print(rs.getString("p_price"));
      out.write("\" placeholder=\"Enter Purchase Price\" autocomplete=\"off\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label >Sales Price</label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"s_price\" value=\"");
      out.print(rs.getString("s_price"));
      out.write("\" placeholder=\"Enter Purchase Price\" autocomplete=\"off\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label >Manu Date</label>\n");
      out.write("                                        <input type=\"date\" class=\"form-control\" name=\"manu_date\" value=\"");
      out.print(rs.getString("manu_date"));
      out.write("\" placeholder=\"Enter Manufacturer Date\" autocomplete=\"off\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label >Exp Date</label>\n");
      out.write("                                        <input type=\"date\" class=\"form-control\" name=\"exp_date\" value=\"");
      out.print(rs.getString("exp_date"));
      out.write("\" placeholder=\"Enter Expire Date\" autocomplete=\"off\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                               \n");
      out.write("\n");
      out.write("                                <div class=\"col-md-12 offset_0 offset_1\">\n");
      out.write("                                    <button style=\"width: 100%;\" type=\"submit\" name=\"btnupdate\" class=\"btn btn-success\">DELETE PRODUCT</button>\n");
      out.write("                                </div>\n");
      out.write("                                     ");
}
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>\n");
      out.write("    \n");
      out.write("</form>\n");
 try {
    
           // String pro_id = request.getParameter("pro_id");
            String pro_name = request.getParameter("pro_name");
            String category= request.getParameter("category");
            int qty = Integer.parseInt(request.getParameter("qty"));
            double p_price = Double.parseDouble(request.getParameter("p_price"));
            double s_price = Double.parseDouble(request.getParameter("s_price"));
            String manu_date= request.getParameter("manu_date");
            String exp_date= request.getParameter("exp_date");

   
        Class.forName("com.mysql.jdbc.Driver");
        // Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");
        // Statement stmt = con.createStatement();

        //String query = "insert into book (id,name,quantity,bStream,bClass,auther,publisher) values ('" +id+ "','" +name+ "','" +quantity+ "','" +bStream+ "','" +bClass+ "','" +auther+ "','"+publisher+"') ";
        String query = "Delete from product  WHERE pro_id= '" + pro_id + "'";
        int a = stmt.executeUpdate(query);
        
        if (a > 0) {
           
            out.print("successfully Delete The Product");
             response.sendRedirect("viewpro.jsp");
        } else {

            out.print("Not Deleted");
        }

    } catch (Exception e) {

        out.print("" + e.getMessage());

    }
     

      out.write("\n");
      out.write("\n");
      out.write("<script src=\"assest/jquery.min.js\"></script>\n");
      out.write("<script src=\"assest/jquery.form-validator.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("    $.validate({\n");
      out.write("        // modules: 'security'\n");
      out.write("    });\n");
      out.write("</script>\n");
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
      out.write("\n");
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
