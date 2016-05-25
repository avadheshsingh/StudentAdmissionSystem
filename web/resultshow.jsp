<%-- 
    Document   : resultshow
    Created on : Apr 26, 2015, 2:51:04 PM
    Author     : avadhesh
--%>
 <jsp:useBean id="db" class="com.avadhesh.DatabaseAdapter"/> 
        <%
                    response.setContentType("image/jpeg");
                    String userid="";
                     if(session!=null){
	    userid=(String)session.getAttribute("userid");   
            }
            
          byte []bar=  db.imgDownload(userid,"5");
          response.getOutputStream().write(bar);   
            %>
           