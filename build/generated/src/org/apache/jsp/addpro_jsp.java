package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class addpro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Add Products</title>\n");
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
      out.write("                <li><a href=\"index.jsp\"> <i class=\"fa fa-sign-in\"></i>Home</a></li>               \n");
      out.write("                <li><a href=\"view_sup.jsp\"> <i class=\"fa fa-sign-in\"></i>Suppliers</a></li>\n");
      out.write("                <li class=\"selected\"><a href=\"viewpro.jsp\"> <i class=\"fa fa-sign-in\"></i>Products</a></li>\n");
      out.write("                <li><a href=\"view_feed.jsp\"> <i class=\"fa fa-sign-in\"></i> View Feedback</a></li>\n");
      out.write("                 <li><a href=\"logout.jsp\"> <i class=\"fa fa-sign-in\"></i>Log Out</a></li>\n");
      out.write("               \n");
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
      out.write(" ");

       if (request.getParameter("pro_id") != null) {
            String pro_id = request.getParameter("pro_id");
            String pro_name = request.getParameter("pro_name");
            String category= request.getParameter("category");
            int qty = Integer.parseInt(request.getParameter("qty"));
            double p_price = Double.parseDouble(request.getParameter("p_price"));
            double s_price = Double.parseDouble(request.getParameter("s_price"));
            String manu_date= request.getParameter("manu_date");
            String exp_date= request.getParameter("exp_date");
            
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root", "");
                Statement stmt = con.createStatement();
                String query = "insert into product(pro_id, pro_name,category,qty,p_price,s_price,manu_date,exp_date) values('" + pro_id + "','"+pro_name+"','" +category + "','" + qty + "','"+p_price+"','"+s_price+"','"+manu_date+"','"+exp_date+"')";
                int a = stmt.executeUpdate(query);
                if(a>0){
                    out.println("<h1>Product added Successful</h1>");
                }else{
                    out.println("<h1>ERROR</h1>");
                       
                }
             

            } catch (Exception e) {
                 e.printStackTrace();
            }
            
      }
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    \t<section class=\"\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t<img style=\"margin-top: 30px;\" class=\"img-responsive addbookimg\" src=\"images/tab.jpg\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-6\">\n");
      out.write("\t\t\t\t<section style=\"margin-top: 30px;\" class=\"panel\">\n");
      out.write("                <header class=\"panel-heading form-title\">\n");
      out.write("                Add New Product's\n");
      out.write("                </header>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                <form method=\"post\"   role=\"form\" action=\"addpro.jsp\">\n");
      out.write("                  \n");
      out.write("                <div class=\"col-md-12 offset_0\">\n");
      out.write("                <div class=\"col-md-6 offset_0 offset_1\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label >Product Id</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"pro_id\" placeholder=\"Enter Product Id\" autocomplete=\"off\">\n");
      out.write("                    </div>\n");
      out.write("                     \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label >Product Name</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"pro_name\" placeholder=\"Enter Product Name\" autocomplete=\"off\">\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label >Select Product Category</label>\n");
      out.write("                    <select class=\"form-control\" id=\"reporter\" name=\"category\">\n");
      out.write("                  \t\t<option>- Select Category -</option> \n");
      out.write("                  \t\t<option value=\"Capsule\" >Capsule</option>\n");
      out.write("                  \t\t<option value=\"Pills\" >Pills</option>\n");
      out.write("                  \t\t<option value=\"Injection\" >Injection</option>\n");
      out.write("                                <option value=\"Syrup\" >Syrup</option>\n");
      out.write("                  \t</select>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label >Quantity</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"qty\" placeholder=\"Enter Quantity \" autocomplete=\"off\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6 offset_0 offset_1\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label >Purchase Price</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"p_price\" placeholder=\"Enter Purchase Price\" autocomplete=\"off\">\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                 \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label >Sales Price</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"s_price\" placeholder=\"Enter Purchase Price\" autocomplete=\"off\">\n");
      out.write("                    </div>\n");
      out.write("                                  \n");
      out.write("                   \n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                    <label >Manu Date</label>\n");
      out.write("                    <input type=\"date\" class=\"form-control\" name=\"manu_date\" placeholder=\"Enter Manufacturer Date\" autocomplete=\"off\">\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                     <div class=\"form-group\">\n");
      out.write("                    <label >Exp Date</label>\n");
      out.write("                    <input type=\"date\" class=\"form-control\" name=\"exp_date\" placeholder=\"Enter Expire Date\" autocomplete=\"off\">\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                <div class=\"col-md-12 offset_0 offset_1\">\n");
      out.write("                \t<button style=\"width: 100%;\" type=\"submit\" name=\"btnsave\" class=\"btn btn-success\">ADD Product</button>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("                </div>\n");
      out.write("                </section>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</section>\n");
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
      out.write("        </form>\n");
      out.write("\n");
      out.write("        </br>\n");
      out.write("        </br>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("\n");
      out.write("         <!-- Footer -->\n");
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
