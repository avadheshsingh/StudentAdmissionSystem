package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class print_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      com.avadhesh.DatabaseAdapter db = null;
      synchronized (_jspx_page_context) {
        db = (com.avadhesh.DatabaseAdapter) _jspx_page_context.getAttribute("db", PageContext.PAGE_SCOPE);
        if (db == null){
          db = new com.avadhesh.DatabaseAdapter();
          _jspx_page_context.setAttribute("db", db, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <title>REGISTRATION PRINT</title>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         ");

            
            
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
           
        
      out.write("\n");
      out.write("        \n");
      out.write("      ");
  
       
        
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
        
	            
             
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        \n");
      out.write("        ");

            
            
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
                     
        
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write(" <body >\n");
      out.write("     \n");
      out.write("     <section  ><h1 style=\"margin-left: 8cm;font-size: 1cm;color: #990033;text-shadow: 5px 5px 8px green\">PROVISIONAL REGISTRATION FORM</h1>\n");
      out.write("         <h3 style=\"margin-left: 15cm;\">Registration Form No :</h3>\n");
      out.write("     </section>     \n");
      out.write(" <table   align='center' cellspacing=\"20\" style=\"width: 70% ;border-top-style: dashed ;border-top-width: 4px\">\n");
      out.write("    <tr>\n");
      out.write("    <tr>\n");
      out.write("        <td colspan=\"2\">\n");
      out.write("           <h2 style=\"color: #990033\">PERSONAL DETAILS :</h2> \n");
      out.write("        </td>\n");
      out.write("    </tr>  \n");
      out.write("     \n");
      out.write("      <td style=\"width: 50% ;\"> \n");
      out.write("                    <table border=\"1\"  cellspacing=\"12\" cellpadding='5' style=\"width: 100% ;\">\n");
      out.write("                                <tr >\n");
      out.write("                                    <td style=\"width: 50% ;\">NAME </td>\n");
      out.write("                                    <td style=\"width: 50% ;\">");
      out.print( fname );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>FATHER'S NAME</td>\n");
      out.write("                                     <td>");
      out.print( fathername );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>MOTHER'S NAME</td>\n");
      out.write("                                     <td>");
      out.print( mothername );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>DATE OF BIRTH</td>\n");
      out.write("                                     <td>");
      out.print( dob );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>CATEGORY</td>\n");
      out.write("                                     <td>");
      out.print( category );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>DEGREE</td>\n");
      out.write("                                     <td>");
      out.print( degree );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>BRANCH</td>\n");
      out.write("                                     <td>");
      out.print( branch );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>ROLL NO</td>\n");
      out.write("                                     <td>");
      out.print( userid );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>ENROLLMENT NO</td>\n");
      out.write("                                     <td>");
      out.print( year );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>SEM</td>\n");
      out.write("                                     <td>");
      out.print( sem );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                            \n");
      out.write("                    </table>\n");
      out.write("       </td>\n");
      out.write("       <td style=\"width: 50% ;\">\n");
      out.write("                        \n");
      out.write("                    <table border=\"1\"  cellspacing=\"12\" cellpadding='7' style=\"width: 100% ;\">\n");
      out.write("                                <tr >\n");
      out.write("                                    <td colspan=\"2\" align=\"center\" style=\"height: 170px;\"><img src=\"profileShow.jsp\" width=\"130\" height=\"160\" alt=\"\" onerror=\"this.src='user.jpg'\" />\n");
      out.write("                                    </td>   \n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td style=\"width: 50% ;\">CONTACT</td>\n");
      out.write("                                     <td style=\"width: 50% ;\">");
      out.print( mno );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>EMAIL</td>\n");
      out.write("                                     <td>");
      out.print( email );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                 <tr>\n");
      out.write("                                    <td>RELIGION</td>   \n");
      out.write("                                    <td>");
      out.print( religion );
      out.write("</td> \n");
      out.write("                                </tr>\n");
      out.write("                                \n");
      out.write("                                <tr>\n");
      out.write("                                    <td>PROGRAM SESSION</td>\n");
      out.write("                                    <td>");
      out.print( ssn );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>EXAM TYPE</td>\n");
      out.write("                                     <td>");
      out.print( examtype );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                \n");
      out.write("                    </table>\n");
      out.write("       </td>\n");
      out.write("   </tr>\n");
      out.write("   <tr>\n");
      out.write("      \n");
      out.write("       <td colspan=\"2\">\n");
      out.write("           <h2 style=\"color: #990033\">COURSE DETAILS :</h2></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      \n");
      out.write("        <td colspan=\"2\">");
 out.print(coursetable); 
      out.write("  </td>\n");
      out.write("       \n");
      out.write("   <tr>\n");
      out.write("      \n");
      out.write("       <td colspan=\"2\">\n");
      out.write("           <h2 style=\"color: #990033\">PAYMENT DETAILS :</h2>    \n");
      out.write("          \n");
      out.write("       </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        \n");
      out.write("        <td>\n");
      out.write("            \n");
      out.write("                   <table border=\"1\" width=\"100%\" cellspacing=\"10\" cellpadding='7'>\n");
      out.write("\n");
      out.write("                            <tbody>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td style=\"width: 50% ;\">PAYMENT MODE</td>\n");
      out.write("                                    <td style=\"width: 50% ;\">");
      out.print( mode );
      out.write("</td>\n");
      out.write("                                    \n");
      out.write("                                </tr>\n");
      out.write("                               \n");
      out.write("                                \n");
      out.write("                                <tr>\n");
      out.write("                                    \n");
      out.write("                                    <td>BANK NAME</td>\n");
      out.write("                                    <td>");
      out.print( bankname );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>AMOUNT</td>\n");
      out.write("                                    <td>");
      out.print( amount );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("       </td>\n");
      out.write("       <td>\n");
      out.write("                      <table border=\"1\" width=\"100%\" cellspacing=\"14\" cellpadding='7'>\n");
      out.write("                                <tr>\n");
      out.write("                      \n");
      out.write("                                    <td style=\"width: 50% ;\">DATE OF PAYMENT</td>\n");
      out.write("                                    <td style=\"width: 50% ;\">");
      out.print( date );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                \n");
      out.write("                                 <tr>\n");
      out.write("                                    <td> DD/CHALLAN/CHEQUE/NEFT NO</td>\n");
      out.write("                                    <td>");
      out.print( no );
      out.write("</td>                                 \n");
      out.write("                                </tr>\n");
      out.write("                              \n");
      out.write("                        </table>\n");
      out.write("           \n");
      out.write("                \n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("     <tr>\n");
      out.write("      \n");
      out.write("       <td colspan=\"2\">\n");
      out.write("           <p>* Take the print out of the form and submit it to your department/faculty advisor.</p>  \n");
      out.write("           <p>* This form is subjected to verified by concerned department.</p> \n");
      out.write("       </td>\n");
      out.write("    </tr>\n");
      out.write("     <tr>\n");
      out.write("      \n");
      out.write("       <td>\n");
      out.write("         -----------------------------<br>\n");
      out.write("               Student Signature\n");
      out.write("       </td>\n");
      out.write("       <td>\n");
      out.write("         -----------------------------<br>\n");
      out.write("          Department Faculty Advisor   \n");
      out.write("       </td>\n");
      out.write("    </tr>\n");
      out.write("   \n");
      out.write("    <tr >\n");
      out.write("      \n");
      out.write("        <td colspan=\"2\" > <br> <br>\n");
      out.write("           <input type=\"button\" value=\" PRINT \" onclick=\"window.print()\" style=\"margin-left: 12cm;\"> <br> <br>\n");
      out.write("       </td>\n");
      out.write("    </tr>\n");
      out.write("           \n");
      out.write(" </table>\n");
      out.write("\n");
      out.write("       \n");
      out.write(" </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
