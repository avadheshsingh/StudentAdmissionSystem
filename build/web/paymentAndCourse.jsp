<%-- 
    Document   : paymentDetails
    Created on : Apr 19, 2015, 3:48:55 PM
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
        <title>Payment Details</title>
        <%  String branch=(String)session.getAttribute("bran"); 
        
        %>
   
        <script>
            function showcommentform() {
            document.getElementById('mylocation').innerHTML= "<table cellspacing='10' width='85%' align='center'>"+
            
                        " <tbody><tr><td colspan='4' align='center'><h3>PAYMENT DETAILS</h3></td></tr>"+
                             "<tr><td>AMOUNT(in Rs.)</td><td><input type='text' name='amount' id='ip1' pattern='[0-9]+' placeholder='amount [0-9]' required/></td><td>DATE OF PAYMENT</td>"+
                                " <td><input type='date' name='date' id='ip1' required/></td>"+
                            " </tr> <tr><td>CHALLAN/DD/NEFT NO</td> <td><input type='text' name='no' id='ip1' pattern='[0-9]+' placeholder='enter [0-9]' required/></td>"+
                                "<td>BANK NAME</td><td><input type='text' name='bank' id='ip1' pattern='[A-Za-z ]+' placeholder='bank name...' required/></td></tr>"+
                           " </tbody></table>";

                 }
                 
                 
            var request;
            function receiveCourseInfo()
            {
                var branch=document.paymentAndCourse.branch.value;; 
                
            var v=document.paymentAndCourse.sem.value;
            var url="courseDisplay.jsp?val="+v+"&branch="+branch;

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

    
      function   finalsubmit()
         {
             confirm("Are you sure");
         }
          
        </script>
    </head>
    <body style="background-color: #f0f0f0">
         <jsp:include page="header.jsp" />
        
        <%  
            String userid="",name="";
            
        if(session!=null){
           userid=(String)session.getAttribute("userid");
             name=(String)session.getAttribute("username");
              
        }     
       
	    
        
        %>
        
          
          <form name="paymentAndCourse" action ="paymentRecord.jsp" method="post">
              
              <section id="payment">
                  
                  <h1 style="margin-left: 70px">COURSES AND REGISTRATION FEE DETAILS</h1><br><br>
              
            <input type="text" style="visibility: hidden" value="<%=branch  %>" name="branch" >
            
            <table align="center" cellspacing="10" width="60%" >
            <tr>
                <td>PROGRAM-SESSION</td> 
                <td><input type="text" name="session" id="ip1" pattern="[0-9- ]+" placeholder="session xxxx-xxxx" required></td>
                <td>ENROLLMENT NO</td>
                <td><input type="text" name="year" id="ip1" pattern="[0-9]+" required placeholder="enrollment no..[0-9]"></td>
            </tr>
            <tr>
                <td> EXAM TYPE</td> 
               <td><select name="examtype" id="menu">
                                 <option value="Not selected"> SELECT </option>
                                 <option value="JAN-JUN"> JAN-JUN </option>
                                 <option value="JUL-DEC"> JUL-DEC </option>
                   </select>
               </td>
                <td>SEMESTER</td>
                <td>
                    <select name="sem" onchange="receiveCourseInfo()" id="menu" >
                                 <option value="Not selected"> SELECT </option>
                                 <option value="1" > sem 1 </option>
                                 <option value="2"> sem 2 </option>
                                 <option value="3"> sem 3 </option>
                                 <option value="4"> sem 4 </option>
                                 <option value="5"> sem 5 </option>
                                 <option value="6"> sem 6 </option>
                                 <option value="7"> sem 7 </option>
                                 <option value="8"> sem 8 </option>
                   </select>
                </td>
            </tr>
        </table>
              
              <h2 style="padding-left: 25PX;font-size: 25px;">COURSES DETAILS : </h2>
              <section><span id="check" ></span></section>
              
              <br> <br>  <section style="border-top:  dashed"><h2 style="padding-left: 25PX;font-size: 25px;">REGISTRATION FEE : </h2></section>
         <section style=" padding-left: 25px">
             <table><tr>
                     <td> PAYMENT MODE : </td> <td> <select name="paymentmode" onchange="showcommentform()" id="menu">
                                 <option value="Not selected">SELECT</option>
                                 <option > DD </option>
                                 <option > CHALLAN </option>
                                 <option > CHEQUE </option>
                                 <option > NEFT </option>
                   </select>
                 </td>        </tr>    </table>
             
                 <section id="mylocation" style="padding-bottom: 20px"></section> 
         
          
         </section>
              <section id="footer">
                  <input type="submit" name="submit" value="SUBMIT" id="myButton" style="margin-left: 350px" > 
              </section >
                 
              </section>
            
          </form> 
        
    </body>
</html>
