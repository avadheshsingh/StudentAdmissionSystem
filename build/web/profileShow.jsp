<%-- 
    Document   : imageShow
    Created on : Apr 25, 2015, 6:26:15 PM
    Author     : avadhesh
--%>

<%@page import="java.awt.Image"%>
<%@page import="java.sql.*;"%>
<%@page import="java.io.FileOutputStream"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
          <jsp:useBean id="db" class="com.avadhesh.DatabaseAdapter"/> 
        <%
                    response.setContentType("image/jpeg");
                    String userid="";
                     if(session!=null){
	    userid=(String)session.getAttribute("userid");   
            }
            
          byte []bar=  db.imgDownload(userid,"2");
          response.getOutputStream().write(bar);   
            %>
    </body>
</html>
