<%-- 
    Document   : createUser
    Created on : Apr 18, 2015, 4:35:26 PM
    Author     : avadhesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link href="myCss.css" rel="stylesheet" type="text/css" />
        <title>Create User</title>
        
        <script>
            
            var request;
            function sendInfo()
            {
            var v=document.createUser.userid.value;
            var url="checkForUserid.jsp?val="+v;

            if(window.XMLHttpRequest){
            request=new XMLHttpRequest();
            }
            else if(window.ActiveXObject){
            request=new ActiveXObject("Microsoft.XMLHTTP");
            }

            try
            {
            request.onreadystatechange=getInfo;
            request.open("GET",url,true);
            request.send();
            }
            catch(e)
            {
            alert("Unable to connect to server");
            }
            }

            function getInfo(){
            if(request.readyState==4){
            var val=request.responseText;
            document.getElementById('check').innerHTML=val;
            }
            }
            
            
           

      </script>   
        
        
    </head>
    <body>
        
         
        
        <div id="wrapper">

	<!--SLIDE-IN ICONS-->
    <div class="user-icon"></div>
    <div class="pass-icon"></div>
        
        <form name="createUser" class="login-form" action="loginRecord.jsp" method="POST">
            <div class="header">
    <!--TITLE--><h1>SignUp Form</h1><!--END TITLE-->
    <!--DESCRIPTION--><span>Fill out the form below to login to my super awesome imaginary control panel.</span><!--END DESCRIPTION-->
    </div>
    <!--END HEADER-->
	
	<!--CONTENT--> 
    <div class="content">
        <span id="check"></span>
        <!--USERNAME--><input name="userid" type="text" class="input username" placeholder="Enter Userid..[0-9]" pattern="[0-9]+" onfocus="this.value=''" onkeyup="sendInfo()"/>   <!--END USERNAME--
        <!--PASSWORD--><input name="password" type="password" class="input password" placeholder="Enter Password.." pattern="[0-9A-Za-z]{4,20}" onfocus="this.value=''" onkeyup="checkUp()"/><!--END PASSWORD--><b>Password must be between 4 to 20.</b>
        <input name="cpassword" type="password" class="input password" placeholder="Confirm Password.." pattern="[0-9A-Za-z]{4,20}" onfocus="this.value=''" />
    </div>  
          <!--END CONTENT-->
    
    <!--FOOTER--> 
    <div class="footer">
        <!--LOGIN BUTTON--><input type="submit" name="login" value="Create" class="button" style="width: 282px" /><!--END LOGIN BUTTON-->
  
    </div>
    <!--END FOOTER-->
        </form>
      
        </div>
    </body>
</html>
