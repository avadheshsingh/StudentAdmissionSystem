<%-- 
    Document   : print
    Created on : Apr 22, 2015, 11:14:06 PM
    Author     : avadhesh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" import="java.sql.*;" %>
<jsp:useBean id="db" class="com.avadhesh.DatabaseAdapter"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>REGISTRATION PRINT</title>
        
        
         <%
            
            
            String name="",userid="",fname="",lname="",gender="",dob="",branch="",fathername="",mothername="",email="",paddress="",taddress="",degree="",ssn="",examtype="",sem="",year="",religion="",category="";
            long mno=0;
             
        
             
           if(session!=null){
	    userid=(String)session.getAttribute("userid");
             name=(String)session.getAttribute("username");
             out.print("<br><b>WELCOME , </b>"+name+";");
            
            }
            
          
        PreparedStatement  stmt=db.con.prepareStatement("select * from studentdetails where userid=?");
	    stmt.setString(1,userid);
	    		
       ResultSet   rs=stmt.executeQuery();
            while(rs.next())
            {
                 fname=rs.getString(3);
                  lname=rs.getString(4);
                   gender=rs.getString(5);
                    dob=rs.getString(6);
                     branch=rs.getString(7);
                      fathername=rs.getString(8);
                       mothername=rs.getString(9);
                        email=rs.getString(10);
                         mno=rs.getLong(11);
                          paddress=rs.getString(12);
                           taddress=rs.getString(13);
                            degree=rs.getString(14);
                             ssn=rs.getString(15);
                              examtype=rs.getString(16);
                               sem=rs.getString(17);
                              year=rs.getString(18);
                               religion=rs.getString(19);
                                category=rs.getString(20);
                
            }
           
        %>
        
      <%  
       
        
        // String branch= "Computer science & Engineering";
        //out.print(branch);
            
             String branc="";
                
                if(branch.equals("Computer science & Engineering"))
                    branc="CSE";
                        if(branch.equals("Electronics Communication Engineering"))
                            branc="ECE";
                         if(branch.equals("Electrical Engineering"))
                    branc="EE";
                        if(branch.equals("Mechanical Engineering"))
                            branc="ME";
                         if(branch.equals("Civil Engineering"))
                    branc="CE";
                        if(branch.equals("Information Technology"))
                            branc="IT";
                          if(branch.equals("Architecture"))
                            branc="ARCH";
            
        String query="select * from courses where sem=? and branch=?";
              stmt=db.con.prepareStatement(query);

   
  
			stmt.setString(1,sem);
			stmt.setString(2, branc);
                        rs=stmt.executeQuery();
				
			/* Printing column names */
            
			ResultSetMetaData rsmd=rs.getMetaData();
			int total=rsmd.getColumnCount();
        
		String coursetable="<table border=1 width=100% align='center' cellspacing='10' cellpadding='7' style='border-color: green; ;border: thick;border-style: dotted; '>"
		+"<tr><td colspan='4' align='center'><h2 align='center' style='color: purple'>REGULAR COURSES</h2> </td></tr>"
                       +" <tr><th>COURSE CODE</th><th>COURSE TITLE</th><th>CREDIT</th><th>PAPER TYPE</th></tr>";
                        
			while(rs.next())
			{   
			coursetable=coursetable+"<tr><td>"+rs.getString(3)+"</td>"+"<td>"+rs.getString(4)+"</td>"+"<td>"+rs.getString(5)+"</td>"+"<td>"+rs.getString(6)+"</td></tr>";
			}
		     coursetable=coursetable+"</table>";
        
	            
             
        %>
        
        

        
        <%
            
            
            String mode="",amount="",date="",no="",bankname="";
            try{
         
            stmt=db.con.prepareStatement("select * from payment where userid=?");
	    stmt.setString(1,userid);
			
            rs=stmt.executeQuery();
            while(rs.next())
                
            {
                mode=rs.getString(2);
                 amount=rs.getString(3);
                  date=rs.getString(4);
                   no=rs.getString(5);
                    bankname=rs.getString(6);
            
            }
            
            }
            catch (Exception e)
            {
                e.printStackTrace();
                out.print("database eror");
            }
             rs.close();
                     stmt.close(); 
                     
        %>

        
        
    </head>
 <body >
     
     <section  ><h1 style="margin-left: 8cm;font-size: 1cm;color: #990033;text-shadow: 5px 5px 8px green">PROVISIONAL REGISTRATION FORM</h1>
         <h3 style="margin-left: 15cm;">Registration Form No :</h3>
     </section>     
 <table   align='center' cellspacing="20" style="width: 70% ;border-top-style: dashed ;border-top-width: 4px">
    <tr>
    <tr>
        <td colspan="2">
           <h2 style="color: #990033">PERSONAL DETAILS :</h2> 
        </td>
    </tr>  
     
      <td style="width: 50% ;"> 
                    <table border="1"  cellspacing="12" cellpadding='5' style="width: 100% ;">
                                <tr >
                                    <td style="width: 50% ;">NAME </td>
                                    <td style="width: 50% ;"><%= fname %></td>
                                </tr>
                                <tr>
                                    <td>FATHER'S NAME</td>
                                     <td><%= fathername %></td>
                                </tr>
                                <tr>
                                    <td>MOTHER'S NAME</td>
                                     <td><%= mothername %></td>
                                </tr>
                                <tr>
                                    <td>DATE OF BIRTH</td>
                                     <td><%= dob %></td>
                                </tr>
                                <tr>
                                    <td>CATEGORY</td>
                                     <td><%= category %></td>
                                </tr>
                                <tr>
                                    <td>DEGREE</td>
                                     <td><%= degree %></td>
                                </tr>
                                <tr>
                                    <td>BRANCH</td>
                                     <td><%= branch %></td>
                                </tr>
                                <tr>
                                    <td>ROLL NO</td>
                                     <td><%= userid %></td>
                                </tr>
                                <tr>
                                    <td>ENROLLMENT NO</td>
                                     <td><%= year %></td>
                                </tr>
                                <tr>
                                    <td>SEM</td>
                                     <td><%= sem %></td>
                                </tr>
                            
                    </table>
       </td>
       <td style="width: 50% ;">
                        
                    <table border="1"  cellspacing="12" cellpadding='7' style="width: 100% ;">
                                <tr >
                                    <td colspan="2" align="center" style="height: 170px;"><img src="profileShow.jsp" width="130" height="160" alt="" onerror="this.src='user.jpg'" />
                                    </td>   
                                </tr>
                                <tr>
                                    <td style="width: 50% ;">CONTACT</td>
                                     <td style="width: 50% ;"><%= mno %></td>
                                </tr>
                                <tr>
                                    <td>EMAIL</td>
                                     <td><%= email %></td>
                                </tr>
                                 <tr>
                                    <td>RELIGION</td>   
                                    <td><%= religion %></td> 
                                </tr>
                                
                                <tr>
                                    <td>PROGRAM SESSION</td>
                                    <td><%= ssn %></td>
                                </tr>
                                <tr>
                                    <td>EXAM TYPE</td>
                                     <td><%= examtype %></td>
                                </tr>
                                
                    </table>
       </td>
   </tr>
   <tr>
      
       <td colspan="2">
           <h2 style="color: #990033">COURSE DETAILS :</h2></td>
    </tr>
    <tr>
      
        <td colspan="2"><% out.print(coursetable); %>  </td>
       
   <tr>
      
       <td colspan="2">
           <h2 style="color: #990033">PAYMENT DETAILS :</h2>    
          
       </td>
    </tr>
    <tr>
        
        <td>
            
                   <table border="1" width="100%" cellspacing="10" cellpadding='7'>

                            <tbody>
                                <tr>
                                    <td style="width: 50% ;">PAYMENT MODE</td>
                                    <td style="width: 50% ;"><%= mode %></td>
                                    
                                </tr>
                               
                                
                                <tr>
                                    
                                    <td>BANK NAME</td>
                                    <td><%= bankname %></td>
                                </tr>
                                <tr>
                                    <td>AMOUNT</td>
                                    <td><%= amount %></td>
                                </tr>
                            </tbody>
                        </table>
       </td>
       <td>
                      <table border="1" width="100%" cellspacing="14" cellpadding='7'>
                                <tr>
                      
                                    <td style="width: 50% ;">DATE OF PAYMENT</td>
                                    <td style="width: 50% ;"><%= date %></td>
                                </tr>
                                
                                 <tr>
                                    <td> DD/CHALLAN/CHEQUE/NEFT NO</td>
                                    <td><%= no %></td>                                 
                                </tr>
                              
                        </table>
           
                
        </td>
    </tr>
     <tr>
      
       <td colspan="2">
           <p>* Take the print out of the form and submit it to your department/faculty advisor.</p>  
           <p>* This form is subjected to verified by concerned department.</p> 
       </td>
    </tr>
     <tr>
      
       <td>
         -----------------------------<br>
               Student Signature
       </td>
       <td>
         -----------------------------<br>
          Department Faculty Advisor   
       </td>
    </tr>
   
    <tr >
      
        <td colspan="2" > <br> <br>
           <input type="button" value=" PRINT " onclick="window.print()" style="margin-left: 12cm;"> <br> <br>
       </td>
    </tr>
           
 </table>

       
 </body>
</html>
