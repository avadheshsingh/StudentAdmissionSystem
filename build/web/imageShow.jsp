<%-- 
    Document   : imageShow
    Created on : Apr 26, 2015, 4:52:19 PM
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
         <link href="elementcss.css" rel="stylesheet" type="text/css" />
        <title>Your Image</title>
    </head>
    <body>
        <jsp:include page="header.jsp" />
        <%
             String  u_id="";
                    u_id=request.getParameter("idm");
           %>
           <section id="imgshow"  style="">
               
               
           <%  
            if(u_id.equals("id"))
            {
            %>
            <h1 style="margin-left: 220px">COLLEGE ID</h1><br>
            <img src="idShow.jsp" width="550" height="350" alt="" onerror="this.src='altimg.jpg'" style="margin-left: 70px"/>

             <%
            }
            if(u_id.equals("profile"))
            {
            %>
            <h1 style="margin-left: 220px">PROFILE PIC</h1><br>
             <img src="profileShow.jsp" width="350" height="400" alt="" onerror="this.src='altimg.jpg'" style="margin-left: 150px"/>
             <% 
            }
            if(u_id.equals("sign"))
            {
            %>
            <h1 style="margin-left: 220px">YOUR SIGN</h1><br>
             <img src="signShow.jsp" width="400" height="300" alt="" onerror="this.src='altimg.jpg'" style="margin-left: 130px"/>
             <%
            }
            if(u_id.equals("result"))
            {
            %>
            <h1 style="margin-left: 220px">PREVIOUS RESULT</h1><br>
             <img src="resultshow.jsp" width="650" height="400" alt="" onerror="this.src='altimg.jpg'" style="margin-left: 25px"/>
            <%
            }
            %>
             
            <section id="footer" style="margin-top: 40px">
                <input type="button" value=" BACK " name="back" id="myButton" style="margin-left: 5cm ;width: 5.5cm" onclick="window.location.assign('profiledetails.jsp')"/>
                           </section>
            
    </section>
    </body>
</html>
