<%-- 
    Document   : checkForUserid
    Created on : Apr 21, 2015, 1:58:01 AM
    Author     : avadhesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="java.sql.*;" %>
<jsp:useBean id="db" class="com.avadhesh.DatabaseAdapter"/>
<%
    String userid=request.getParameter("val");
    boolean status=db.checkForUserid(userid);
    if(status)
    {
        out.print("<i style='color: red'>Invalid Userid<i>");
    }
    else
    {
         out.print("<i style='color: green'>Valid Userid..<i>");
    }
    
    %>