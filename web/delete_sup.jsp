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
        <title>Delete Supplier</title>
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
                <li><a href="vieworder_admin.jsp"> <i class="fa fa-sign-in"></i>Orders</a></li>
                <li><a href="viewpro.jsp"> <i class="fa fa-sign-in"></i>Products</a></li>
                <li><a href="view_feed.jsp"> <i class="fa fa-sign-in"></i> View Feedback</a></li>
                 <li><a href="logout.jsp"> <i class="fa fa-sign-in"></i>Log Out</a></li>
            </ul>
        </div>
    </nav>


    <br>
    <div class="container">

    </div>    
</head>

<body>
    <%
 try {
        String sup_id = request.getParameter("sup_id");
   //int no=Integer.parseInt(id);

       
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root", "");
            Statement stmt = con.createStatement();

            stmt = con.createStatement();
            int a = stmt.executeUpdate("DELETE FROM supplier WHERE sup_id = '" + sup_id + "'");

            response.sendRedirect("view_sup.jsp");
        } catch (Exception e) {
        }
    %>

    <div class="container">
        <div class="panel panel-default">
            <div class="panel-heading"><h2> Delete Suppliers</h2></div>
            <div class="panel-body">



                <form method="POST" action="delete_sup.jsp">



                    <%
                        try {
                             String sup_id = request.getParameter("sup_id");
                            //int no = Integer.parseInt(sup_id);

                            Class.forName("com.mysql.jdbc.Driver");

                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root", "");
                            Statement stmt = con.createStatement();

                            String query = "SELECT * FROM supplier WHERE sup_id='" + sup_id + "'";

                            ResultSet rs = stmt.executeQuery(query);

                            while (rs.next()) {

                    %>
                    <div class="form-group row 	col-sm-10">
                        <label class="control-label col-sm-2" >Sup_Id:</label>
                        <div class="col-sm-8">
                            <input type="text" name="sup_id" class="form-control" value="<%=rs.getString(1)%>" size="10">
                        </div>
                    </div>
                    <div class="form-group row 	col-sm-10">
                        <label class="control-label col-sm-2" >First name:</label>
                        <div class="col-sm-8">
                            <input type="text" name="fname" class="form-control" value="<%=rs.getString(2)%>" size="10">
                        </div>
                    </div>
                    <div class="form-group row 	col-sm-10">
                        <label class="control-label col-sm-2" >Last name:</label>
                        <div class="col-sm-8">
                            <input type="text" name="lname" class="form-control" value="<%=rs.getString(3)%>"size="10">
                        </div>
                    </div>

                    <div class="form-group row 	col-sm-10">
                        <label class="control-label col-sm-2" >NIC:</label>
                        <div class="col-sm-8">
                            <input type="text" name="nic" class="form-control" value="<%=rs.getString(4)%>"size="10">
                        </div>
                    </div>
                    <div class="form-group row 	col-sm-10">
                        <label class="control-label col-sm-2" >Contact:</label>
                        <div class="col-sm-8">
                            <input type="text" name="contact_no"  class="form-control" value="<%=rs.getInt(5)%>"size="10">
                        </div>
                    </div>
                    <div class="form-group row 	col-sm-10">
                        <label class="control-label col-sm-2" >Address:</label>
                        <div class="col-sm-8">
                            <input type="text" name="address" class="form-control" value="<%=rs.getString(6)%>"size="10">
                        </div>
                    </div>
                    <div class="form-group row 	col-sm-10">
                        <label class="control-label col-sm-2" >Email:</label>
                        <div class="col-sm-8">
                            <input type="text" name="email" class="form-control" value="<%=rs.getString(7)%>"size="10">
                        </div>
                    </div>

                    <div class="form-group row 	col-sm-10">
                        <label class="control-label col-sm-2" >Username:</label>
                        <div class="col-sm-8">
                            <input type="text" name="username" class="form-control" value="<%=rs.getString(8)%>"size="10">
                        </div>
                    </div>

                    <div class="form-group row 	col-sm-10">
                        <label class="control-label col-sm-2" >Password:</label>
                        <div class="col-sm-8">
                            <input type="password" name="password" class="form-control" value="<%=rs.getString(9)%>"size="10">
                        </div>
                    </div>

                    <div class="form-group row 	col-sm-10">

                        <div class="col-sm-8">
                            <input type="submit" name="Submit" value="Delete" style="background-color:#49743D;font-weight:bold;color:#ffffff;">
                        </div>
                    </div>




                    <%
                            }
                        } catch (Exception e) {
                        }
                    %>

                </form>
            </div>

        </div>  
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
