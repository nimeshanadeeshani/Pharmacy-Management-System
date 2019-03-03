package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.PreparedStatement;
import javax.mail.Authenticator;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public final class feed_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


                public static class SMTPAuthenticator extends Authenticator{
                    public PasswordAuthentication getPasswordAuthentication(){
                        return new PasswordAuthentication("suwasewanaphama@gmail.com", "suwasewana12345");
                    }
                }
            
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Feedback Form</title>\n");
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
      out.write("                <li><a href=\"about.jsp\"> <i class=\"fa fa-sign-in\"></i> About Us</a></li>\n");
      out.write("                 <li><a href=\"products.jsp\"> <i class=\"fa fa-sign-in\"></i>Products</a></li>\n");
      out.write("                <li><a href=\"login.jsp\"> <i class=\"fa fa-sign-in\"></i> Login</a></li>\n");
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
      out.write("    <div class=\"panel-heading\"><h2>Feedback Form</h2></div>\n");
      out.write("    <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form>\n");
      out.write("            <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                <label class=\"control-label col-sm-2\" >Subject:</label>\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"subject\" data-validation=\"required\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("           <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("               <label class=\"control-label col-sm-2\" >Description:</label>\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("               <textarea type=\"text\"  class=\"form-control\" name=\"des\" data-validation=\"required\" rows=\"5\"></textarea>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                <label class=\"control-label col-sm-2\" >Email</label>\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"email\"  data-validation=\"required\" data-validation=\"required\" >\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"form-group row \tcol-sm-10\">\n");
      out.write("                <label class=\"control-label col-sm-2\" >Contact No:</label>\n");
      out.write("                <div class=\"col-sm-8\">\n");
      out.write("                    <input type=\"text\" class=\"form-control\" name=\"contact_no\" data-validation=\"number\" >\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"form-group row col-sm-10\">        \n");
      out.write("                <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                    <button type=\"submit\" value=\"submit\" name=\"submit\" class=\"btn btn-default\">Save</button>\n");
      out.write("                    <button type=\"reset\" value=\"reset\" name=\"reset\" class=\"btn btn-default\">Reset</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        ");

            String ch = request.getParameter("submit");
            if (ch != null){
            Connection conn = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root", "");
            
      out.write("\n");
      out.write("            ");

            }catch(Exception e){
            
      out.write(" \n");
      out.write("                <script>alert(\"Connection Dead\");</script>\n");
      out.write("            ");

            }
        
      out.write("\n");
      out.write("        ");

            try{
            String subject = request.getParameter("subject");
                String decription = request.getParameter("des");
                String email = request.getParameter("email");
                int contact_no = Integer.parseInt(request.getParameter("contact_no"));
                String query = "INSERT INTO feed (subject,decription,email,contact_no) VALUES('" + subject + "','" + decription + "','" + email + "','" + contact_no + "')";
            
                PreparedStatement pst = conn.prepareCall(query);
            
            int update = pst.executeUpdate();
            
            if(update > 0){
                String getCustomerEmailSql = "SELECT * FROM feed WHERE email='"+email+"'";
                PreparedStatement pst2 = conn.prepareCall(getCustomerEmailSql);
                ResultSet rt = pst2.executeQuery();
                rt.next();
                
            
      out.write("   \n");
      out.write("                <!--        Mailing Function using javax.mailer-->\n");
      out.write("            ");
      out.write("\n");
      out.write("            ");

                int mailsent = 0;
                String d_uname = "suwasewanaphama@gmail.com";
                String d_password = "suwasewana12345";
                String d_host = "smtp.gmail.com";
                int d_port = 465;

                String m_to = new String();
                String m_from = "suwasewanaphama@gmail.com";
                String m_subject = new String();
                String m_text = new String();

                m_to = "suwasewanaphama@gmail.com";
                m_subject = "New Message Arrive";
                m_text = "<h3>Hi Admin ";
                m_text = m_text.concat("");
                m_text = m_text.concat("</h3>");
                m_text = m_text.concat("<p>New Feedback From Site</p>");
                m_text = m_text.concat("<h3>Email and Pno:</h3>");
                m_text = m_text.concat("<b>");
                m_text = m_text.concat(email);
                m_text = m_text.concat("</b>");
                m_text = m_text.concat("<br><b>");
                m_text = m_text.concat(String.valueOf(contact_no));
                m_text = m_text.concat("<br><b>Message: ");
                m_text = m_text.concat(decription);
                m_text = m_text.concat("</b>");
                m_text = m_text.concat("<br><br><br><p>Thank You</p><br>");
                m_text = m_text.concat("<b>SuvaSewana Pharmacy </b>");

                Properties props = new Properties();
                SMTPAuthenticator auth = new SMTPAuthenticator();
                Session sess = Session.getInstance(props, auth);
                MimeMessage msg = new MimeMessage(sess);

                msg.setContent(m_text, "text/html");
                msg.setSubject(m_subject);
                msg.setFrom(new InternetAddress(m_from));
                msg.addRecipient(Message.RecipientType.TO, new InternetAddress(m_to));

                try{
                    Transport trans = sess.getTransport("smtps");
                    trans.connect(d_host,d_port,d_uname,d_password);
                    trans.sendMessage(msg, msg.getAllRecipients());
                    trans.close();
                }catch(Exception e){
                    out.print(e);
                }
            
      out.write("\n");
      out.write("            %>\n");
      out.write("                <script>alert(\"Feedback Sucssesfully Submited\");</script>\n");
      out.write("            ");

                response.sendRedirect("feed.jsp");
            }else{
            
      out.write("\n");
      out.write("                <script>alert(\"Somthing Wrong\");</script>\n");
      out.write("            ");
 
                response.sendRedirect("feed.jsp");
            }
        }catch(Exception e){
            out.print(e);
        }
}
        
      out.write("\n");
      out.write("    </div>\n");
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
