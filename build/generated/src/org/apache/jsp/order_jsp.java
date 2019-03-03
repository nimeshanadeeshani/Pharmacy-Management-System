package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class order_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("           <link rel=\"stylesheet\" href=\"assest/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write(" <link rel=\"stylesheet\" href=\"assest/jquery-ui-1.12.1.custom/jquery-ui.css\">\n");
      out.write("      <link rel=\"stylesheet\" href=\"assest/w3.css\">\n");
      out.write("        <script src=\"assest/jquery-ui-1.12.1.custom/jquery-ui.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#datepicker\").datepicker();\n");
      out.write("                $(\"#datepicker\").datepicker(\"option\", \"dateFormat\", \"DD, dd-mm-yy\");\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("<nav class=\"w3-bar w3-cyan\" style=\"background-color:light brown\">\n");
      out.write("\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"navbar-header\" >\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Pharmacy</a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("               <li><a href=\"admin.jsp\"> <i class=\"fa fa-sign-in\"></i>Home</a></li>               \n");
      out.write("                <li><a href=\"viewpro.jsp\"> <i class=\"fa fa-sign-in\"></i>Products</a></li>\n");
      out.write("                <li><a href=\"view_sup.jsp\"> <i class=\"fa fa-sign-in\"></i>Suppliers</a></li> \n");
      out.write("                <li><a href=\"vieworder_admin.jsp\"> <i class=\"fa fa-sign-in\"></i>Orders</a></li>\n");
      out.write("                <li><a href=\"view_feed.jsp\"> <i class=\"fa fa-sign-in\"></i> View Feedback</a></li>\n");
      out.write("                <li><a href=\"logout.jsp\"> <i class=\"fa fa-sign-in\"></i>Log Out</a></li> \n");
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
      out.write("\n");
      out.write("    <div class=\"panel-heading\"><h2>ORDER FORM</h2></div>\n");
      out.write("    <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("        <form action=\"order.jsp\" method=\"POST\">\n");
      out.write("          \n");
      out.write("                  <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                <label class=\"control-label col-sm-2\" >Product Name:</label>\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <select class=\"form-control\" name=\"productname\" id=\"productname\">\n");
      out.write("                        ");

                    Class.forName("com.mysql.jdbc.Driver");
    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root","");
    Statement s = con.createStatement();

ResultSet re = s.executeQuery("select * from product");
while(re.next())
{
String un=re.getString("pro_name");



      out.write("\n");
      out.write("<option value=\"");
      out.print( un);
      out.write('"');
      out.write('>');
      out.print( un);
      out.write("</option>\n");
      out.write("\n");
      out.write(" \n");
 
}

      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                   \n");
      out.write("                  \n");
      out.write("            <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                <label class=\"control-label col-sm-2\" >Qty:</label>\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"qty\" data-validation=\"required\"  >\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          \n");
      out.write("            <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                <label class=\"control-label col-sm-2\" >Supplier Name</label>\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <select class=\"form-control\"name=\"supname\" id=\"supname\">\n");
      out.write("                        ");

                    

ResultSet re2 = s.executeQuery("select * from supplier");
while(re2.next())
{
    
    
String un=re2.getString("name");
     
 
 
 

      out.write("\n");
      out.write("<option value=\"");
      out.print( un);
      out.write('"');
      out.write('>');
      out.print( un);
      out.write("</option>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
}

      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("                    \n");
      out.write("             <div class=\"form-group row col-sm-10\">\n");
      out.write("                <label class=\"control-label col-sm-2\"for=\"spe\">Select Date:</label>\n");
      out.write("               <div class=\"col-sm-8\">\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"datepicker\" name=\"edate\" data-validation=\"required\">\n");
      out.write("                            </div>   \n");
      out.write("            </div>\n");
      out.write("                                \n");
      out.write("                                  <div class=\"form-group row col-sm-10\">        \n");
      out.write("                <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("\n");
      out.write("                                 <button type=\"submit\" value=\"submit\" name=\"submit\" class=\"btn btn-default\">order</button>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                             </form>\n");
      out.write("\n");
      out.write(" \n");
      out.write("                        \n");
      out.write("\n");
      out.write("        ");

                               if (request.getParameter("submit")  != null) {
                                 
       
        String proname=request.getParameter("productname");
        String qty=request.getParameter("qty");
       
        String sname=request.getParameter("supname");
        String edate=request.getParameter("edate");

        
        Date date1 = new Date();
      
String today = new String("");
SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY");
today = format.format(date1);


          

    
    try{
        String sid="";
        String pid="";
    
    
 ResultSet re3 = s.executeQuery("select * from product where pro_name='"+proname+"'");
while(re3.next())
{
    
    
 pid=re3.getString("pro_id");
}
 ResultSet re4 = s.executeQuery("select * from supplier where name='"+sname+"'");
while(re4.next())
{
    
    
sid=re4.getString("sup_id");

}   
    
    String query = "INSERT INTO orders(pro_id,pro_name,qty,sup_id,sup_name,expected_date,order_date)VALUES('"+pid+"','"+proname+"','"+qty+"','"+sid+"','"+sname+"','"+edate+"','"+today+"')";
    
   int a= s.executeUpdate(query);
            
    if(a>0)
    {
         
      out.write("\n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("    alert(\"Successfully oredered\");\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    ");

    
    }
    
    
   } 
    
    
    catch(Exception e){
        out.println("Error:"+ e.getMessage());
    }
                               }
                                 
    
    
      out.write("\n");
      out.write("                         <script src=\"assest/jquery.form-validator.min.js\"></script>\n");
      out.write("                <script>\n");
      out.write("            $.validate({\n");
      out.write("                // modules: 'security'\n");
      out.write("            });\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("                </script>\n");
      out.write("                \n");
      out.write("                    </div>  \n");
      out.write("                    </div>  \n");
      out.write("        </div>\n");
      out.write("<!-- Footer -->\n");
      out.write("    <footer class=\"w3-container w3-cyan navbar-fixed-bottom\">\n");
      out.write("      <div class=\"container_12\">\n");
      out.write("        <p class=\"m-0 text-center text-white\">Copyright &copy;RAD GROUP-G-2017</p>\n");
      out.write("      </div>\n");
      out.write("      <!-- /.container -->\n");
      out.write("    </footer>\n");
      out.write("                    </body>\n");
      out.write("                    </html>\n");
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
