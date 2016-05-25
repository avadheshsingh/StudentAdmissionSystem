<%--
    Document   : profiledetails
    Created on : Apr 19, 2015, 4:35:40 AM
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
        
        <link href="myCss.css" rel="stylesheet" type="text/css" />
        
       
        <title>Profile Details</title>
    </head>
    <body style="margin-top: 7px">
        
         <jsp:include page="header.jsp" />
         <%@page language="java" import="java.sql.*;" %>
         <jsp:useBean id="db" class="com.avadhesh.DatabaseAdapter"/> 
        <%
            
            try{
            String name="",userid="",fname="",lname="",gender="",dob="",branch="",fathername="",mothername="",email="",paddress="",taddress="",degree="",category="",religion="";
            long mno=0,id=0;
             
            try{
              
            if(session!=null){
	    userid=(String)session.getAttribute("userid");
             name=(String)session.getAttribute("username");
            id=Long.parseLong(userid);
            }
            
               
            
                   
            
            PreparedStatement ps=db.con.prepareStatement("select * from studentdetails where userid=?");
	    ps.setLong(1,id);
			
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                 fname=rs.getString(3);
                  lname=rs.getString(4);
                   gender=rs.getString(5);
                    dob=rs.getString(6);
                     branch=rs.getString(7);
                      fathername=rs.getString(8);
                       mothername=rs.getString(9);
                        email=rs.getString(10);
                         mno=rs.getLong(11);
                          paddress=rs.getString(12);
                           taddress=rs.getString(13);
                            degree=rs.getString(14);
                            category=rs.getString(20);
                            religion=rs.getString(19);
                 
            }
            
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            
            
             String branc="";
                
                if(branch.equals("Computer science & Engineering"))
                    branc="CSE";
                        if(branch.equals("Electronics Communication Engineering"))
                            branc="ECE";
                         if(branch.equals("Electrical Engineering"))
                    branc="EE";
                        if(branch.equals("Mechanical Engineering"))
                            branc="ME";
                         if(branch.equals("Civil Engineering"))
                    branc="CE";
                        if(branch.equals("Information Technology"))
                            branc="IT";
                          if(branch.equals("Architecture"))
                            branc="ARCH";
                    session.setAttribute("bran",branc);
               
                  
        %>
       
       
        <div id="wrap">
            <div class="profile" style="margin-top: 60px">
                <div class="header">
             
          <table  cellspacing="19" cellpadding="1"  width="100%">
                <tr>
                    <td colspan="2" style="margin-left: 120px"><h1>PERSONAL DETAILS</h1></td>
                 </tr>
                
                    <tr>
                        <td style="width: 40%">FIRST NAME </td>
                        <td style="width: 60%"><%= fname %></td>
                    </tr>
                    <tr>
                        <td>LAST NAME </td>
                        <td><%= lname %></td>
                    </tr>
                    <tr>
                        <td>GENDER </td>
                        <td> <%= gender %></td>    
                    </tr> 
                    <tr>
                        <td>DATE OF BIRTH </td>
                        <td><%= dob %></td>
                    </tr>    
                    <tr>
                        <td>DEGREE </td>  
                        <td><%= degree %> </td>    
                    </tr>
                    <tr>
                        <td>BRANCH </td>
                        <td><%= branch %></td>    
                    </tr>    
                    <tr>
                        <td>FATHER'S NAME </td>
                        <td><%= fathername %></td>
                    </tr>
                    <tr>
                        <td>MOTHER'S NAME </td>
                        <td><%= mothername %></td>
                    </tr>
                    <tr>
                        <td>CATEGORY </td>
                        <td><%= category %></td>
                    </tr>
                    <tr>
                        <td>RELIGION </td>
                        <td><%= religion %></td>
                    </tr>
                    <tr>
                        <td>EMAIL ID</td>
                        <td><%= email %></td>
                    </tr>
                    <tr>
                        <td>MOBILE NO </td>
                        <td> <%= mno %></td>
                    </tr>
                    <tr>
                        <td>PERMANENT ADDRESS</td>
                        <td><%= paddress %></td>
                    </tr>
                    <tr>
                        <td>TEMPORARY ADDRESS </td>
                        <td><%= taddress %></td>
                    </tr>
                    <tr>
                        <td colspan="2"> <b>SEE YOUR IMAGES : </b> </td>
                        
                    <tr>
                        <td colspan="2" style="padding-left: 50px">
                           
                            <form action="imageShow.jsp">
                               <input type="text" value="profile" name="idm" style="visibility: hidden">
                           <input type="submit" value=" PROFILE PIC " name="profile" onclick="window.location.assign('profileShow.jsp')"   id="showimg"/>
                            </form>
                           
                            <form action="imageShow.jsp">
                               <input type="text" value="sign" name="idm" style="visibility: hidden">
                           <input type="submit" value=" SIGN " name="sign" onclick="window.location.assign('signShow.jsp')"           id="showimg"/>
                            </form>
                           
                            <form action="imageShow.jsp">
                               <input type="text" value="id" name="idm" style="visibility: hidden">
                           <input type="submit" value=" COLLEGE ID " name="id" id="showimg"/>
                           </form>
                           
                            <form action="imageShow.jsp">
                               <input type="text" value="result" name="idm" style="visibility: hidden">
                           <input type="submit" value="RESULT " name="result" onclick="window.location.assign('resultshow.jsp')"  id="showimg"/> 
                            </form>
                            </td>
                    </tr>
                   
            </table>
                </div>
                    <div class="footer">
                        
                        <input type="button" value=" EDIT " name="edit" onclick="window.location.assign('editProfile.jsp')" class="button2"/>
                        <input type="button" value=" NEXT " name="next" onclick="window.location.assign('paymentAndCourse.jsp')" class="button" />
                        
                 </div> 
                          
        </div>
        </div>
                        <%
                          }catch(Exception e)
                       {
                        RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request,response);
			out.print("<b>  Something  went wrong please login again...!!!<b>"); 
                        }
                        %>
    </body>
</html>
