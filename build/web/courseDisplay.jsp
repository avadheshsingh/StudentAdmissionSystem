<%-- 
    Document   : courseDisplay
    Created on : Apr 21, 2015, 3:12:34 PM
    Author     : avadhesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="java.sql.*;" %>
<jsp:useBean id="db" class="com.avadhesh.DatabaseAdapter"/>
<%
        String sem=request.getParameter("val");
        String branch=request.getParameter("branch");
        // String branch= "Computer science & Engineering";
       
        String query="select * from courses where sem=? and branch=?";
       PreparedStatement stmt=db.con.prepareStatement(query);

   
  
			stmt.setString(1,sem);
			stmt.setString(2, branch);
                        
			out.print("<table border=1 width=85% align='center' cellspacing='10' cellpadding='10' style='margin-top: 1cm;border-color: green; ;border: thick;border-style: dotted;padding: 4mm '>");
		
                        out.print("<tr><td colspan='4' align='center'><h2 align='center' style='color: purple'> REGULAR COURSES</h2><b>"+ branch+"</b> </td></tr>");
                        out.print("<tr><th>COURSE CODE</th><th>COURSE TITLE</th><th>CREDIT</th><th>PAPER TYPE</th></tr>");
                        
			ResultSet rs=stmt.executeQuery();
				
			/* Printing column names */
			ResultSetMetaData rsmd=rs.getMetaData();
			int total=rsmd.getColumnCount();
                        
			while(rs.next())
			{    
		
			out.print("<tr><td>"+rs.getString(3)+"</td>"+"<td>"+rs.getString(4)+"</td>"+"<td>"+rs.getString(5)+"</td>"+"<td>"+rs.getString(6)+"</td></tr>");
			
			   
			
			}

			out.print("</table>");
			
	             rs.close();
                     out.close();
    
    %>
    