<%-- 
    Document   : logout
    Created on : Nov 26, 2018, 3:07:29 PM
    Author     : HP
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    session.invalidate();
    response.sendRedirect("index.jsp");
%>

