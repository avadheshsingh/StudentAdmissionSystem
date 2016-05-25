<%-- 
    Document   : signShow
    Created on : Apr 26, 2015, 2:50:41 PM
    Author     : avadhesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <jsp:useBean id="db" class="com.avadhesh.DatabaseAdapter"/> 
        <%
                    response.setContentType("image/jpeg");
                    String userid="";
                     if(session!=null){
	    userid=(String)session.getAttribute("userid");   
            }
            
          byte []bar=  db.imgDownload(userid,"3");
          response.getOutputStream().write(bar);   
            %>
    </body>
</html>
