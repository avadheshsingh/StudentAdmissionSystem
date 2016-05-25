

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

public class ResultUpload extends HttpServlet {
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // response.setContentType("text/html;charset=UTF-8");
           PrintWriter out = response.getWriter();
      
		
                HttpSession session=request.getSession(false);
		  if(session!=null){
		  String id=(String)session.getAttribute("userid");
		
		  InputStream pic_inputStream = null;	// input stream of the upload file
                   
		// obtains the upload file part in this multipart request
		      
                        Part result_Part = request.getPart("result");
			
                      pic_inputStream = result_Part.getInputStream();
                        
		
		String message = "";	// message will be sent back to client
		DatabaseAdapter db=new DatabaseAdapter();
		try {
			// connects to the database
			
			// constructs SQL statement
			String sql = "update img set result=? where userid=?";
			PreparedStatement statement=db.con.prepareStatement(sql);
			statement.setString(2, id);
			if(pic_inputStream.available()<51200){
			statement.setBinaryStream(1, pic_inputStream, pic_inputStream.available());
                      
			int row = statement.executeUpdate();
			if (row > 0) {
				message = "Result uploaded and saved into database";
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
    
    
    

    
    
