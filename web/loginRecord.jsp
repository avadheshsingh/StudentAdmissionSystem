<%-- 
    Document   : profileDetail
    Created on : Apr 18, 2015, 5:21:08 PM
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
           try{
          String u_id=request.getParameter("userid");
          String pass=request.getParameter("password");
	  String cpass=request.getParameter("cpassword");  
           session=request.getSession();
	   session.setAttribute("userid",u_id);
          session.setAttribute("loginStatus", "createRecord");
          if(pass.equals(cpass))
          {
            try{
               
		int i=db.loginrecord(u_id, pass);
                db.imgUserid(u_id);
                if(i>0)
                {
                    
                    if(session!=null){
		    String name=(String)session.getAttribute("userid");
                    out.print("\n \n \n Welcome , "+"<b>"+name+"</b>");}
                    RequestDispatcher rd=request.getRequestDispatcher("userProfile.jsp");
                    out.print("<b>user is created...!!!<b>");
                     rd.include(request,response);
                     
                }
                      
                  
            }  catch(Exception e)
            {
              RequestDispatcher rd=request.getRequestDispatcher("createUser.jsp");
			rd.include(request,response);
			out.print("<b style='color: red'>  User Exits.Choose another id...!!!<b>"); 
            }
          }
          else
          {
            RequestDispatcher rd=request.getRequestDispatcher("createUser.jsp");
			rd.include(request,response);
			out.print("<b style='color: red'>  Password didn't match...!!!<b>");  
          }
          }catch(Exception e)
            {
               RequestDispatcher rd=request.getRequestDispatcher("createUser.jsp");
			rd.include(request,response);
			out.print("<b style='color: red'>  Something  went wrong please login again...!!!<b>"); 
            }  
        %>
    </body>
</html>
