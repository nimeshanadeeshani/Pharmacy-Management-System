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
        <title>Delete Product Details</title>
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
                <li class="selected"><a href="viewpro.jsp"> <i class="fa fa-sign-in"></i>Products</a></li>
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

    <section class="">
        <div class="container">
            <div class="col-md-12">

                <form name="Form1" action="deletepro.jsp" method="POST">

                    <%
                        String pro_id = request.getParameter("pro_id");
                        out.println(pro_id);

                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmacyrad", "root", "");
                        Statement stmt = con.createStatement();

                        ResultSet rs = stmt.executeQuery("select * from product  WHERE pro_id='"+pro_id+"'");


                    %>
                    <% while (rs.next()) {%>  


            </div>
            <div class="clearfix"></div>
            <div class="col-md-6">
                <img style="margin-top: 30px;" class="img-responsive addbookimg" src="images/medi.jpg">
            </div>
            <div class="col-md-6">
                <section style="margin-top: 30px;" class="panel">
                    <header class="panel-heading form-title">
                        Delete Product's
                    </header>
                    <div class="panel-body">
                        <form method="post" enctype="multipart/form-data" role="form">
                            <div class="col-md-12 offset_0">
                                <div class="col-md-6 offset_0 offset_1">

                                    <div class="form-group">
                                        <label >pro_id</label>
                                        <input type="text" class="form-control"  name="pro_id" value="<%=rs.getString("pro_id")%>" placeholder="Enter the id" autocomplete="off">
                                    </div>

                                    <div class="form-group">
                                        <label >Product Name</label>
                                        <input type="text" class="form-control"  name="pro_name" value="<%=rs.getString("pro_name")%>"  placeholder="Enter Product Name"autocomplete="off">
                                    </div>

                                    <div class="form-group">
                                        <label >Select Product Category</label>
                                        <select class="form-control" id="reporter" name="category" value="<%=rs.getString("category")%>"  placeholder="Select category">
                                            <option>- Select Category -</option> 
                                            <option value="Capsule" >Capsule</option>
                                            <option value="Pills" >Pills</option>
                                            <option value="Injection" >Injection</option>
                                            <option value="Syrup" >Syrup</option>
                                        </select>
                                    </div>

                                    <div class="form-group">
                                        <label >Quantity</label>
                                        <input type="text" class="form-control" name="qty" value="<%=rs.getString("qty")%>" placeholder="Enter Quantity " autocomplete="off">
                                    </div>
                                </div>

                                <div class="col-md-6 offset_0 offset_1">
                                    <div class="form-group">
                                        <label >Purchase Price</label>
                                        <input type="text" class="form-control" name="p_price" value="<%=rs.getString("p_price")%>" placeholder="Enter Purchase Price" autocomplete="off">
                                    </div>


                                    <div class="form-group">
                                        <label >Sales Price</label>
                                        <input type="text" class="form-control" name="s_price" value="<%=rs.getString("s_price")%>" placeholder="Enter Purchase Price" autocomplete="off">
                                    </div>


                                    <div class="form-group">
                                        <label >Manu Date</label>
                                        <input type="date" class="form-control" name="manu_date" value="<%=rs.getString("manu_date")%>" placeholder="Enter Manufacturer Date" autocomplete="off">
                                    </div>



                                    <div class="form-group">
                                        <label >Exp Date</label>
                                        <input type="date" class="form-control" name="exp_date" value="<%=rs.getString("exp_date")%>" placeholder="Enter Expire Date" autocomplete="off">
                                    </div>
                                </div>


                               

                                <div class="col-md-12 offset_0 offset_1">
                                    <button style="width: 100%;" type="submit" name="btnupdate" class="btn btn-success">DELETE PRODUCT</button>
                                </div>
                                     <%}%>

                            </div>
                        </form>
                    </div>
                </section>
            </div>
        </div>
    </section>
    
</form>
<% try {
    
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
     
%>

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
