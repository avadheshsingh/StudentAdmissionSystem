<%-- 
    Document   : login.jsp
    Created on : Apr 19, 2015, 4:14:42 AM
    Author     : avadhesh
--%>
   <%
       
           response.setHeader("Cache-Control", "no-cache, no-store, must-revlidate");
           response.setHeader("Pragma", "no-cache");
           response.setDateHeader("Expires", 0);
           
          
            %>

<%@page import="java.sql.*;"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
    <head>
          
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>profile Page</title>
    </head>
    <body>
          <jsp:useBean id="db" class="com.avadhesh.DatabaseAdapter"/>
          <%
        try{    
               String  u_id=request.getParameter("userid");
		String pass=request.getParameter("password");
		if(db.validate(u_id, pass)){
		 	
                 PreparedStatement    stmt=db.con.prepareStatement("select first_name from studentdetails where userid="+u_id);
                  ResultSet   rs=stmt.executeQuery();
                   String name="";
                    
                    while(rs.next()){
                    name= rs.getString("First_name");}
                   
                    session.setAttribute("username",name);
                    session.setAttribute("userid",u_id);
                    session.setAttribute("loginStatus", "updateRecord");
                    
                    
                    
                %>
                <jsp:forward page="profiledetails.jsp" />
		<%
		
		}
		else
		{
			out.print("<b>Sorry username or password error</b>");
			%>
                           <jsp:include page="index.html" />
                         <%
		}
		
                          }catch(Exception e)
                       {
                        RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.forward(request,response);
			out.print("<b>  Something  went wrong. please login again...!!!<b>"); 
                        }
                        %>
        
               
                       
    </body>
</html>
