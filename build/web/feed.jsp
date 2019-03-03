<%-- 
    Document   : index
    Created on : Nov 23, 2018, 3:04:59 PM
    Author     : HP
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="javax.mail.Authenticator"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.mail.*"%>
<%@page import="javax.mail.internet.*"%>
<%@page import="java.util.Properties"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback Form</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="assest/bootstrap.min.css">
        <link rel="stylesheet" href="assest/w3.css">
        <link rel="stylesheet" href="assest/font-awesome-4.7.0/css/font-awesome.min.css">
        <script src="assest/bootstrap.min.js"></script>


        <script src="assest/jquery-3.2.1.js"></script>
        <script src="assest/bootstrap.min.js"></script>
    <nav class="w3-bar w3-cyan" style="background-color:light brown">

        <div class="container-fluid">
            <div class="navbar-header" >
                <a class="navbar-brand" href="#">Pharmacy</a>
            </div>
            <ul class="nav navbar-nav">

            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="index.jsp"> <i class="fa fa-sign-in"></i>Home</a></li>               
                <li><a href="about.jsp"> <i class="fa fa-sign-in"></i> About Us</a></li>
                 <li><a href="products.jsp"> <i class="fa fa-sign-in"></i>Products</a></li>
                <li><a href="login.jsp"> <i class="fa fa-sign-in"></i> Login</a></li>
            </ul>
        </div>
    </nav>


    <br>
    <div class="container">

    </div>    
</head>

<body>
    <div class="panel-heading"><h2>Feedback Form</h2></div>
    <div class="panel-body">


        <form>
            <div class="form-group row 	col-sm-10">
                <label class="control-label col-sm-2" >Subject:</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" name="subject" data-validation="required">
                </div>
            </div>
            
           <div class="form-group row 	col-sm-10">
               <label class="control-label col-sm-2" >Description:</label>
                <div class="col-sm-8">
               <textarea type="text"  class="form-control" name="des" data-validation="required" rows="5"></textarea>
            </div>
            </div>


            <div class="form-group row 	col-sm-10">
                <label class="control-label col-sm-2" >Email</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" name="email"  data-validation="required" data-validation="required" >
                </div>
            </div>

            <div class="form-group row 	col-sm-10">
                <label class="control-label col-sm-2" >Contact No:</label>
                <div class="col-sm-8">
                    <input type="text" class="form-control" name="contact_no" data-validation="number" >
                </div>
            </div>


            <div class="form-group row col-sm-10">        
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" value="submit" name="submit" class="btn btn-default">Submit</button>
                    <button type="reset" value="reset" name="reset" class="btn btn-default">Reset</button>
                </div>
            </div>


        </form>
        
        <%
            String ch = request.getParameter("submit");
            if (ch != null){
            Connection conn = null;
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root", "");
            %>
            <%
            }catch(Exception e){
            %> 
                <script>alert("Connection Dead");</script>
            <%
            }
        %>
        <%
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
                
            %>   
                <!--        Mailing Function using javax.mailer-->
            <%!
                public static class SMTPAuthenticator extends Authenticator{
                    public PasswordAuthentication getPasswordAuthentication(){
                        return new PasswordAuthentication("suwasewanaphama@gmail.com", "suwasewana12345");
                    }
                }
            %>
            <%
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
            %>
            %>
                <script>alert("Feedback Sucssesfully Submited");</script>
            <%
                response.sendRedirect("feed.jsp");
            }else{
            %>
                <script>alert("Somthing Wrong");</script>
            <% 
                response.sendRedirect("feed.jsp");
            }
        }catch(Exception e){
            out.print(e);
        }
}
        %>
    </div>

    <script src="assest/jquery.min.js"></script>
    <script src="assest/jquery.form-validator.min.js"></script>
    <script>
        $.validate({
            // modules: 'security'
        });
    </script>
</div>  
</div> 
</br>
</br>

 <!-- Footer -->
    <footer class="w3-container w3-cyan navbar-fixed-bottom">
        <div class="container_12">
            <p class="m-0 text-center text-white"> <i>&copy; All Right Reserved (IIT- Group N0 04)</i></p>
        </div>
        <!-- /.container -->
    </footer>





</body>
</html>
