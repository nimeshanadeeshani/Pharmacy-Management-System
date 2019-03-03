package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>About</title>\n");
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
      out.write("                <a class=\"navbar-brand\" href=\"index.jsp\">Pharmacy</a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                <li><a href=\"index.jsp\"> <i class=\"fa fa-sign-in\"></i>Home</a></li>               \n");
      out.write("                <li class=\"selected\"><a href=\"about.jsp\"> <i class=\"fa fa-sign-in\"></i> About Us</a></li>\n");
      out.write("                <li><a href=\"products.jsp\"> <i class=\"fa fa-sign-in\"></i>Products</a></li>\n");
      out.write("                <li><a href=\"feed.jsp\"> <i class=\"fa fa-sign-in\"></i>Feedback</a></li>\n");
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"panel panel-default\">\n");
      out.write("            <div class=\"panel-heading\"><h2>About Us</h2></div>\n");
      out.write("            <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                <div id=\"contents\">\n");
      out.write("<div>                   \n");
      out.write("<h2>Vision</h2>\n");
      out.write("<p>To become Sri Lanka’s most trusted multifaceted health care sector service provider delivers innovative pharmacy, health and wellness solutions, and consumer goods and services to Sri Lankan citizen for utmost satisfaction</p>\n");
      out.write("</div>\n");
      out.write("                    \n");
      out.write("<div>\n");
      out.write("<h2>Mission</h2>\n");
      out.write("<p>Deliver dedicated customer service beyond expectations becoming the trusted provider delivers high quality pharmaceutical products , health care services & solutions at most affordable prize with utmost care towards patient’s Life and safety while strongly supporting to achieve objectives of national health care policy.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("    <h2>OUR CORE VALUES</h2>\n");
      out.write("    <p>Quality and patient care are the top concerns in our core values and our team is dedicated around the clock throughout the year to deliver high quality pharmaceutical solutions to our prestigious customers to their utmost satisfaction. Our innovative business processes are designed in order to deliver a high quality service to our patients as well as to all our business partners.</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("<h2>EMPLOYEES</h2>\n");
      out.write("<p>We have taken efforts to enhance knowledge and quality of life of our employee’s through out and offering extra responsibility and benefits have given us good results in return and we have taken every effort to look after our workforce to the level best and in return they have taken care of our patients with the best of their ability and today we are able to offer unmatched patient care service through satisfied workforce</p>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("<h2>OUR PASSION</h2>\n");
      out.write("<p>Our passion is our devotion towards patient’s satisfaction.</p>\n");
      out.write("</div>\n");
      out.write("                    \n");
      out.write("<div>\n");
      out.write("<h2>CUSTOMER CARE</h2>\n");
      out.write("<p>We are glad to offer dedicated healthcare sector services beyond customer expectations.</p>\n");
      out.write("</div>\n");
      out.write("                    \n");
      out.write("<div>\n");
      out.write("<h2>ACCESSIBLE</h2>\n");
      out.write("<p>Our fast growing retail pharmacy chain empowered with modern pharmaceutical infrastructure backed by high skilled team of healthcare professionals are glad to offer wide access to our Clients Island wide. Our strong whole sale unit equipped with modern fleet of vehicles including temperature controlled trucks provides access for our patients living in remote areas.</p>\n");
      out.write("</div>\n");
      out.write("                    \n");
      out.write("<div>\n");
      out.write("<h2>AFFORDABILITY</h2>\n");
      out.write("<p>We are determined to offer cost effective pharmaceutical solutions for right value to our clients understanding each market segment while adhering to international standards..</p>\n");
      out.write("</div>\n");
      out.write("                    \n");
      out.write("<div>\n");
      out.write("    <h2>QUALITY</h2>\n");
      out.write("<p>We have adopted effective pharmaceutical quality management system in order to meet standards in storage, distribution and processes.</p>\n");
      out.write("</div>\n");
      out.write("                    \n");
      out.write("<div>                   \n");
      out.write("<h2>INNOVATION</h2>\n");
      out.write("<p>We are always looking forward towards novel pharmaceutical solutions to address unmet needs of our patients. We believe innovation is the key in achieving health care sector sustainable growth.</p>\n");
      out.write(" </div>                  \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Footer -->\n");
      out.write("                <footer class=\"w3-container w3-cyan navbar-fixed-bottom\">\n");
      out.write("                    <div class=\"container_12\">\n");
      out.write("                        <p class=\"m-0 text-center text-white\"> <i>&copy; All Right Reserved (IIT- Group N0 04)</i></p>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.container -->\n");
      out.write("                </footer>\n");
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </body>\n");
      out.write("                </html>\n");
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
