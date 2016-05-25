<%-- 
    Document   : profileRecordDB
    Created on : Apr 18, 2015, 9:05:49 PM
    Author     : avadhesh
--%>
<%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revlidate");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", 0);
            %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
        <%@page language="java" import="java.sql.*;" %>
          <jsp:useBean id="db" class="com.avadhesh.DatabaseAdapter"/>
        <% 
          
            if(session!=null){
                String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
                String gender=request.getParameter("gender");
		String dob=request.getParameter("dob");
		String branch=request.getParameter("branch");
		String degree=request.getParameter("degree");
                String fathername=request.getParameter("fathername");
		String mothername=request.getParameter("mothername");
		String mno=request.getParameter("mno");
		String email=request.getParameter("email");
                String paddress=request.getParameter("paddress");
                String taddress=request.getParameter("taddress");
                String religion=request.getParameter("religion");
                String category=request.getParameter("category");
                //  db.insertImage("profilePic",request,);
                  
               
		
		String id=(String)session.getAttribute("userid");
                String loginStatus=(String)session.getAttribute("loginStatus");
                
               
                
             
                try{
			
		String query="update studentdetails set first_name=?,last_name=?,gender=?,dob=?,branch=? ,father_name=?,"
                        + "mother_name=?,email=?,mobile_no=?,permanent_address=?,temporary_address=?,degree=?,religion=?,category=?"
                        + "where userid=?";
		PreparedStatement stmt=db.con.prepareStatement(query);
		
		stmt.setString(1, fname);
		stmt.setString(2, lname);
		stmt.setString(3, gender);
		stmt.setString(4, dob);
		stmt.setString(5, branch);
		stmt.setString(6, fathername);
		stmt.setString(7, mothername);
		stmt.setString(8, email);
		stmt.setString(9, mno);
		stmt.setString(10, paddress);
                stmt.setString(11, taddress);
                stmt.setString(12, degree);
                stmt.setString(13, religion);
                stmt.setString(14, category);
		stmt.setString(15, id);
                
		int i=stmt.executeUpdate();
                
                
                if(i>0 && loginStatus.equals("createRecord"))
                {    
                     
                      out.print("<b style='color: green'>User is create successfully.Please Login again...!!<b>");
                      %>
                 
                      <jsp:include page="index.html" />
		     <%   session.invalidate();
                     
                  
                }
                if(i>0 && loginStatus.equals("updateRecord"))
                {
                    out.print("<b style='color: green'>Your Profile Successfully Updated..!!</b>");
                    %>
                      <jsp:include page="profiledetails.jsp" />
		     <% 
                }
                        
                }
                catch(Exception e)
                {
                    out.print("<b style='color: red'>data base error<b>");
                    e.printStackTrace();
                    out.print(e);
                }
                }
            else
            {
                     %>
                      <jsp:include page="index.html" />
		     <%  
            }
                
        %>
        
        
        
        
      
    </body>
</html>