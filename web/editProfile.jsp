<%-- 
    Document   : editProfile
    Created on : Apr 19, 2015, 3:05:02 PM
    Author     : avadhesh
--%>
<%
            response.setHeader("Cache-Control", "no-cache, no-store, must-revlidate");
            response.setHeader("Pragma", "no-cache");
            response.setDateHeader("Expires", 0);
            %>
<%@page import="javax.servlet.annotation.MultipartConfig"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
              <link href="elementcss.css" rel="stylesheet" type="text/css" />
        <title>Edit Profile</title>
    </head>
    <body>
         
         <jsp:include page="header.jsp" />
         <%@page language="java" import="java.sql.*;" %>
         <jsp:useBean id="db" class="com.avadhesh.DatabaseAdapter"/> 
        <%
           
            String name="",userid="",fname="",lname="",gender="",dob="",branch="",fathername="",mothername="",email="",paddress="",taddress="",degree="",religion="",category="";
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
                            religion=rs.getString(19);
                            category=rs.getString(20);
                            
            }
            
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
                
        %>
        
        
            
            
           
            
            <form name="Profile" action="profileRecordDB.jsp" method="POST" >
            <section id="form">
                
            <table  cellspacing="14" cellpadding="1" align="center" width="50%">
                <tr>
                    <td colspan="2"><h1 style="margin-left: 120px">PERSONAL DETAILS</h1><br></td>
                 </tr>
                 <br><br>
                    <tr>
                        <td>FIRST NAME </td>
                        <td><input type="text" name="fname" id="ip" value="<%= fname %>" placeholder="First Name" pattern="[a-zA-z ]+" required /></td>
                    </tr>
                    <tr>
                        <td>LAST NAME </td>
                        <td><input type="text" name="lname" id="ip" value="<%= lname %>"  placeholder="Last Name" pattern="[a-zA-z ]+"  required /></td>
                    </tr>
                    <tr>
                        <td>GENDER </td>
                        <td><input type="radio" name="gender" value="Male" />Male
                        <input type="radio" name="gender" value="Female"/>Female
                        </td>    
                    </tr> 
                    <tr>
                        <td>DATE OF BIRTH </td>
                        <td><input type="date" name="dob" id="ip" value="" required></td>
                    </tr>    
                    <tr>
                        <td>
                         DEGREE 
                        </td>  
                        <td>
                               <input type="radio" name="degree" value="UG"/>UG 
                            <input type="radio" name="degree" value="PG" />PG
                        </td>    
                    </tr>
                    <tr>
                        <td>BRANCH </td>
                        <td><select name="branch" id="menu" >
                                <option value="<%=branch%>"> SELECT </option>
                                <option value="Computer science & Engineering"> CSE </option>
                                <option value="Electronics Communication Engineering"> ECE </option>
                                <option value="Electrical Engineering"> EE </option>
                                <option value="Mechanical Engineering"> ME </option>
                                <option value="Civil Engineering"> CE </option>
                                <option value="Information Technology"> IT </option>
                                <option value="Architecture"> Arch </option>
                            </select></td>    
                    </tr>    
                    <tr>
                        <td>FATHER'S NAME </td>
                        <td><input type="text" name="fathername" id="ip" value="<%= fathername %>" placeholder="Father's Name" pattern="[a-zA-z ]+"/></td>
                    </tr>
                    <tr>
                        <td>MOTHER'S NAME </td>
                        <td><input type="text" name="mothername" id="ip" value="<%= mothername %>" placeholder="Mother's Name" pattern="[a-zA-z ]+"/></td>
                    </tr>
                    <tr>
                        <td>EMAIL ID</td>
                        <td><input type="email" name="email" id="ip" value="<%= email %>" placeholder="Email Id"/></td>
                    </tr>
                    <tr>
                        <td>MOBILE NO </td>
                        <td><input type="tel" name="mno" id="ip" value="<%= mno %>" placeholder="Phone No" pattern="[0-9]{10,12}"/></td>
                    </tr>
                    <tr>
                        <td>CATEGORY</td>
                        <td><input type="text" name="category" id="ip" value="<%= category %>" placeholder="category.." pattern="[a-zA-z ]+"/></td>
                    </tr>
                    <tr>
                        <td>RELIGION</td>
                        <td><input type="text" name="religion" id="ip" value="<%= religion %>" placeholder="religion.." pattern="[a-zA-z]+"/></td>
                    </tr>
                    <tr>
                        <td>PERMANENT ADDRESS</td>
                        <td><textarea name="paddress" id="ip"  placeholder="permanent address" style="width: 260px;height: 90px;resize: none"><%= paddress %></textarea></td>
                    </tr>
                    <tr>
                        <td>TEMPORARY ADDRESS </td>
                        <td><textarea  id="ip" name="taddress"  placeholder="temporary address" style="width: 260px;height: 90px;resize: none"><%= taddress %></textarea></td>
                    </tr>
                    
                    <tr>
                        <td colspan="2">
                            <iframe src="imageUpload.jsp" width="500" height="565" style="border-radius: 10px"></iframe>
                        </td>  
                    </tr>
                  
                </tbody>
            </table>
                <section id="footer">
                            <input type="submit" value=" UPDATE " name="submit" id="myButton" style="margin-left: 7.5cm"/>
                            </section>
                    
            </section>
        </form>
                    
    </body>
</html>
