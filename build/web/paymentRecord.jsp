<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : paymentRecord
    Created on : Apr 23, 2015, 9:54:43 PM
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
         <%@page language="java" import="java.sql.*;" %>
          <jsp:useBean id="db" class="com.avadhesh.DatabaseAdapter"/>
          <% 
          
              if(session!=null){
              try{
              
                String mode=request.getParameter("paymentmode");
		String amount=request.getParameter("amount");
                String no=request.getParameter("no");
		String date=request.getParameter("date");
		String bank=request.getParameter("bank");
                
                String id=(String)session.getAttribute("userid");
                
                
		// TODO Auto-generated method stub
		int i=0;
	
		PreparedStatement ps=db.con.prepareStatement("insert into payment  values(?,?,?,?,?,?)");
		ps.setString(1,id);
		ps.setString(2,mode);
                ps.setString(3,amount);
                ps.setString(4,date);
                  ps.setString(5,no);
                ps.setString(6,bank);
		i=ps.executeUpdate();
                if(i>0)
                {
                    
                }
		

           
                String ssn=request.getParameter("session");
		String examtype=request.getParameter("examtype");
                String semester=request.getParameter("sem");
		String year=request.getParameter("year");
		
                
              
                
                
		// TODO Auto-generated method stub
		int j=0;
                String query="UPDATE studentdetails SET ssn = ?,examtype=?,sem=?,year=? WHERE userid = ?";
                        
                                        
		
	        ps=db.con.prepareStatement(query);
		ps.setString(1,ssn);
		ps.setString(2,examtype);
                ps.setString(3,semester);
                ps.setString(4,year);
                  ps.setString(5,id);
     
		i=ps.executeUpdate();
                if(i>0)
                {
                   
                    %>
                     <jsp:include page="print.jsp" />
                    <%
                }
		}catch (Exception e) {
			
                      %>
                          <jsp:include page="print.jsp" />
                      <%
		  }
		
              }
            
            %>
            
    </body>
</html>
