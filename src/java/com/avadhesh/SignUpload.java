

package com.avadhesh;
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


/**
 *
 * @author avadhesh
 */

@MultipartConfig   

public class SignUpload extends HttpServlet {
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // response.setContentType("text/html;charset=UTF-8");
           PrintWriter out = response.getWriter();
      
		
                HttpSession session=request.getSession(false);
		  if(session!=null){
		  String id=(String)session.getAttribute("userid");
			// input stream of the upload file
                   InputStream pic_inputStream = null;
                    
		
		// obtains the upload file part in this multipart request
		     
                        Part sign_Part = request.getPart("sign");
                       
			// obtains input stream of the upload file
			pic_inputStream = sign_Part.getInputStream();
                       
                      
                        
		
		String message = "";	// message will be sent back to client
		DatabaseAdapter db=new DatabaseAdapter();
		try {
			// connects to the database
			
			// constructs SQL statement
			String sql = "update img set sign=? where userid=?";
			PreparedStatement statement=db.con.prepareStatement(sql);
			statement.setString(2, id);
			if(pic_inputStream.available()<51200){
			
                       statement.setBinaryStream(1, pic_inputStream, pic_inputStream.available());
                       
			// sends the statement to the database server
			int row = statement.executeUpdate();
			if (row > 0) {
				message = "Sign uploaded and saved into database";
			}
                        }else{
                            message= "Image size must be less than 50kb.";
                        }
                
                
		} catch (Exception ex) {
			message = "ERROR: " + ex.getMessage();
			
		} 
			// sets the message in request scope
			request.setAttribute("Message", message);
			
			// forwards to the message page
			getServletContext().getRequestDispatcher("/imageUpload.jsp").forward(request, response);
                  }
        
         
       
      
}
      
       
}
    
    
    

    
    
