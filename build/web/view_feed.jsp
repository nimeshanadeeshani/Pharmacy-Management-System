<%-- 
    Document   : index
    Created on : Nov 23, 2018, 3:04:59 PM
    Author     : HP
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View FeedBack</title>
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
                <li><a href="admin.jsp"> <i class="fa fa-sign-in"></i>Home</a></li>
                <li><a href="view_sup.jsp"> <i class="fa fa-sign-in"></i>Suppliers</a></li>
                <li><a href="viewpro.jsp"> <i class="fa fa-sign-in"></i>Products</a></li>
                <li class="selected"><a href="view_feed.jsp"> <i class="fa fa-sign-in"></i> View Feedback</a></li>
                 <li><a href="logout.jsp"> <i class="fa fa-sign-in"></i>Log Out</a></li>
            </ul>
        </div>
    </nav>


    <br>
    <div class="container">

    </div>    
</head>

<body>
    <div class="panel-heading"><h2> View Feedback Form</h2></div>
    <div class="panel-body">

        <table  border='1' class="table">
           
            <tr><th>Feedback Id</th><th>Subject</th><th>Description</th><th>Email</th><th>Contact No</th></tr>
                    <%

                        try {

                            Class.forName("com.mysql.jdbc.Driver");

                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root", "");
                            Statement stmt = con.createStatement();
                            String query = "SELECT * FROM feed";
                            ResultSet rs = stmt.executeQuery(query);


                    %>
                    <%            while (rs.next()) {
                    %>
            <tr>
                <td>  <%=rs.getString(1)%>     </td>
                <td>  <%=rs.getString(2)%>  </td>
                <td> <%=rs.getString(3)%> </td>
                <td> <%=rs.getString(4)%> </td>
                <td> <%=rs.getString(5)%> </td>
               

                
            </tr>

            <%    }

                } catch (Exception e) {

                }%>




            <script src="assest/jquery.min.js"></script>
            <script src="assest/jquery.form-validator.min.js"></script>
            <script>
                $.validate({
                    // modules: 'security'
                });
            </script>
    </div>  
</div> 





</form>

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
