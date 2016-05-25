<%-- 
    Document   : header
    Created on : Apr 25, 2015, 2:25:57 PM
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
          
           <style>
      #head {
	width: 750px;
	margin: 0 auto;
	position: relative;
	z-index:5;
      
        padding-top: 15px;
	
	background: #f3f3f3;
	border: 1px solid #fff;
	border-radius: 5px;
	
	box-shadow: 0 1px 3px rgba(0,0,0,0.5);
	-moz-box-shadow: 0 1px 3px rgba(0,0,0,0.5);
	-webkit-box-shadow: 0 1px 3px rgba(0,0,0,0.5);
       }
       
      #title {
	font-family: 'GEORGIA',serif;
	font-weight: 600;
	font-size: 45px;
        padding-bottom: 40px;
        margin-left: 50px;
	line-height:34px;
	color: #990033;
	text-shadow: 3px 3px 0 rgba(200,160,256,1.0);
	margin-bottom: 10px;
        }
               
        </style>
       
    </head>
    <body >
        <%   String name="",id="";
                            if(session!=null){
                            id=(String)session.getAttribute("userid"); 
                              name=(String)session.getAttribute("username");
                             try{
                            if(id.equals("null")){
                               
                            }
                            
                             }catch(Exception e)
                             {
                                 RequestDispatcher rd=request.getRequestDispatcher("index.html");
			         rd.forward(request,response);
			      out.print("<b>  Please login again...!!!<b>"); 
                             }
                            } 
                            else{
                                RequestDispatcher rd=request.getRequestDispatcher("index.html");
			         rd.forward(request,response);
                                out.print("hello");
                            }
                            
         %>
        <section id="head" style="width: 87%">
            <table style="width: 100%">
                <tr><td><img src="nitlogo.png" width="100" height="100" alt="nitlogo" style="margin-left: 20px"/>
                    </td>
                    <td><h1 id="title">STUDENT ADMISSION SYSTEM</h1>
                      </td>
                      <td><img src="profileShow.jsp" width="90" height="90" alt="" onerror="this.src='user.jpg'" style="border-radius: 50px;margin-right: 10px"/>
                      </td>
                         
                </tr>
                <tr>     
                    <td> </td>
                    <td></td>
                </tr>
               
                        
            </table>
        </section>
        <table style="width: 85%;margin-left: 100px;margin-top: 6px"><tr><td>
        
         <h4>WELCOME ,<%= name %>;</h4>
        </td><td>
            <input type="button" id="logout" value="LOGOUT" name="Logout" onclick="window.location.assign('Logout.jsp')"/>
                </td></tr></table>
        </body>
</html>
