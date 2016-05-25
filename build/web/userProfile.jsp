<%-- 
    Document   : userProfile
    Created on : Apr 18, 2015, 7:24:57 PM
    Author     : avadhesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link href="elementcss.css" rel="stylesheet" type="text/css" />
        <title>Create Profile</title>
    </head>
    <body>
        
        <jsp:include page="header.jsp" />
        <%   String name="";
            if(session!=null){
		    name=(String)session.getAttribute("userid");
                }
            else{
                                %>
                                <jsp:include page="index.html" />
                                <%
                            }
        %>
                <form name="Profile" action="profileRecordDB.jsp" method="POST">
                    <section id="form">
                    
            <table border="0" cellspacing="14" cellpadding="1" align="center">
                <tr>
                    <td colspan="2"><h1 style="margin-left: 90px">PERSONAL DETAILS</h1></td>
                 </tr>
                
                    <tr>
                        <td>FIRST NAME </td>
                        <td><input type="text" name="fname" id="ip" value="" placeholder="First Name" pattern="[a-zA-z ]+" required/></td>
                    </tr>
                    <tr>
                        <td>LAST NAME </td>
                        <td><input type="text" name="lname" value="" id="ip" placeholder="Last Name" pattern="[a-zA-z ]+" required/></td>
                    </tr>
                    <tr>
                        <td>GENDER </td>
                        <td><input type="radio" name="gender" value="Male" />Male
                        <input type="radio" name="gender" value="Female"/>Female
                        </td>    
                    </tr> 
                    <tr>
                        <td>DATE OF BIRTH </td>
                        <td><input type="date" name="dob" id="ip" required=""></td>
                    </tr>    
                    <tr>
                        <td>
                         DEGREE 
                        </td>  
                        <td>
                            <input type="radio" name="degree" value="UG" />UG 
                            <input type="radio" name="degree" value="PG" />PG
                        </td>    
                    </tr>
                    <tr>
                        <td>BRANCH </td>
                        <td><select name="branch" id="menu" required>
                                 <option value="Not selected"> SELECT </option>
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
                        <td><input type="text" name="fathername" value="" id="ip" placeholder="Father's Name" pattern="[a-zA-z ]+"/></td>
                    </tr>
                    <tr>
                        <td>MOTHER'S NAME </td>
                        <td><input type="text" name="mothername" value="" id="ip" placeholder="Mother's Name" pattern="[a-zA-z ]+"/></td>
                    </tr>
                    <tr>
                        <td>EMAIL ID</td>
                        <td><input type="email" name="email" value="" id="ip" placeholder="Email Id" /></td>
                    </tr>
                    <tr>
                        <td>MOBILE NO </td>
                        <td><input type="tel" name="mno" value="" id="ip" placeholder="Phone No" pattern="[0-9]{10,12}"/></td>
                    </tr>
                    <tr>
                        <td>CATEGORY</td>
                        <td><input type="text" name="category" id="ip"  placeholder="category" pattern="[a-zA-z ]+"/></td>
                    </tr>
                    <tr>
                        <td>RELIGION</td>
                        <td><input type="text" name="religion" id="ip"  placeholder="religion" pattern="[a-zA-z]+"/></td>
                    </tr>
                    
                    <tr>
                        <td>PERMANENT ADDRESS</td>
                        <td><textarea name="paddress" id="ip"  placeholder="permanent address" style="width: 260px;height: 90px;resize: none" ></textarea></td>
                    </tr>
                    <tr>
                        <td>TEMPORARY ADDRESS </td>
                        <td><textarea name="taddress" id="ip" style="width: 260px;height: 90px;resize: none" placeholder="temporary address"></textarea></td>
                    </tr>
                    
                     <tr>
                        <td colspan="2">
                                 <iframe src="imageUpload.jsp" width="500" height="565" style="border-radius: 10px"></iframe>
                        </td>  
                    </tr>
                   
                </tbody>
            </table>
                        <section id="footer">
                            <input type="submit" value=" Submit " name="submit" id="myButton" style="margin-left: 7.5cm" />
                            </section>
                        
                    </section>
        </form>
        
    </body>
</html>
