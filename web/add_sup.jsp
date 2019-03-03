<%-- 
    Document   : index
    Created on : Nov 23, 2018, 3:04:59 PM
    Author     : HP
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Supplier</title>
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

    
                <div class="panel-heading"><h2>Add New Supplier</h2></div>
                <div class="panel-body">

                        <form>
                        <div class="form-group row 	col-sm-10">
                            <label class="control-label col-sm-2" >Sup Id:</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" name="sup_id" data-validation="required">
                            </div>
                        </div>

                        <div class="form-group row 	col-sm-10">
                            <label class="control-label col-sm-2" >Company name:</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" name="name" data-validation="required">
                            </div>
                        </div>
                       
                        <div class="form-group row 	col-sm-10">
                            <label class="control-label col-sm-2" >Contact No</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" name="contact_no"  data-validation="number" data-validation="required" >
                            </div>
                        </div>
                        <div class="form-group row 	col-sm-10">
                            <label class="control-label col-sm-2" >Address:</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" name="address" data-validation="required" >
                            </div>
                        </div>
                        <div class="form-group row 	col-sm-10">
                            <label class="control-label col-sm-2" >Email:</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" name="email" data-validation="required" >
                            </div>
                        </div>
                        <div class="form-group row 	col-sm-10">
                            <label class="control-label col-sm-2" >Username</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" name="username" data-validation="required">
                            </div>
                        </div>
                        <div class="form-group row 	col-sm-10">
                            <label class="control-label col-sm-2" >Password:</label>
                            <div class="col-sm-8">
                                <input type="password" class="form-control" name="password" data-validation="length" data-validation-length="min3">
                            </div>
                        </div>
                        
                        <div class="form-group row col-sm-10">        
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" value="submit" name="submit" class="btn btn-default">Save</button>
                                <button type="reset" value="reset" name="reset" class="btn btn-default">Reset</button>
                            </div>
                        </div>
                            
                           
                    </form>
                    <%
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





        </form>

        </br>
        </br>

        <!-- Footer -->
        <footer class="w3-container w3-cyan navbar-fixed-bottom">
            <div class="container_12">
                <p class="m-0 text-center text-white">Copyright &copy;RAD GROUP-04(IIT)-2018</p>
            </div>
            <!-- /.container -->
        </footer>





</body>
</html>
