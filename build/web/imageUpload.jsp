<%-- 
    Document   : imageUpload
    Created on : Apr 24, 2015, 1:34:29 AM
    Author     : avadhesh
--%>


        <link href="elementcss.css" rel="stylesheet" type="text/css" />
       
        <br>  <section id="imgload" style="margin-left: 0.5cm;float: left;padding: 20px 20px 20px 20px">
           
            <h1 style="margin-left: 70px;margin-top: 10px">IMAGE UPLOAD</h1> 
        <form name="img" action="UploadServlet" method="post" enctype="multipart/form-data">
             
           <input type="submit" value="upload" name="upload1" id="upload"/>
                     
           UPLOAD PROFILE PIC :- <br><input type="file" name="photo" id="ip" />
               
        </form>
           
        <br>
        
        
        <form name="img" action="SignUpload" method="post" enctype="multipart/form-data">
          
             UPLOAD YOUR SIGN :- <br><input type="file" name="sign" id="ip"/>
           <input type="submit" value="upload" name="upload2" id="upload"/>
           
        </form>
        
        <br>
        
        <form name="img" action="ResultUpload" method="post" enctype="multipart/form-data">
           
           UPLOAD LAST SEM RESULT:- <br><input type="file" name="result" id="ip"/>
           <input type="submit" value="upload" name="upload3" id="upload"/>
           
        </form>
     
        <br>
        
        <form name="img" action="IdUpload" method="post" enctype="multipart/form-data">
            
              UPLOAD STUDENT ID:- <br><input type="file" name="id" id="ip"/>
           <input type="submit" value="upload" name="upload4" id="upload"/>
           
        </form>
         <h3><%=request.getAttribute("Message")%></h3>
            
        </section>
   
