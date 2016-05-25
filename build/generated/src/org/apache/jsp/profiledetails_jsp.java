package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class profiledetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <link href=\"myCss.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        <title>Profile Details</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"margin-top: 7px\">\n");
      out.write("        \n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("         \n");
      out.write("         ");
      com.avadhesh.DatabaseAdapter db = null;
      synchronized (_jspx_page_context) {
        db = (com.avadhesh.DatabaseAdapter) _jspx_page_context.getAttribute("db", PageContext.PAGE_SCOPE);
        if (db == null){
          db = new com.avadhesh.DatabaseAdapter();
          _jspx_page_context.setAttribute("db", db, PageContext.PAGE_SCOPE);
        }
      }
      out.write(" \n");
      out.write("        ");

            
            try{
            String name="",userid="",fname="",lname="",gender="",dob="",branch="",fathername="",mothername="",email="",paddress="",taddress="",degree="",category="",religion="";
            long mno=0,id=0;
             
            try{
              
            if(session!=null){
	    userid=(String)session.getAttribute("userid");
             name=(String)session.getAttribute("username");
            id=Long.parseLong(userid);
            }
            
               
            
                   
            
            PreparedStatement ps=db.con.prepareStatement("select * from studentdetails where userid=?");
	    ps.setLong(1,id);
			
            ResultSet rs=ps.executeQuery();
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
                            category=rs.getString(20);
                            religion=rs.getString(19);
                 
            }
            
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            
            
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
                    session.setAttribute("bran",branc);
               
                  
        
      out.write("\n");
      out.write("       \n");
      out.write("       \n");
      out.write("        <div id=\"wrap\">\n");
      out.write("            <div class=\"profile\" style=\"margin-top: 60px\">\n");
      out.write("                <div class=\"header\">\n");
      out.write("             \n");
      out.write("          <table  cellspacing=\"19\" cellpadding=\"1\"  width=\"100%\">\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\" style=\"margin-left: 120px\"><h1>PERSONAL DETAILS</h1></td>\n");
      out.write("                 </tr>\n");
      out.write("                \n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"width: 40%\">FIRST NAME </td>\n");
      out.write("                        <td style=\"width: 60%\">");
      out.print( fname );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>LAST NAME </td>\n");
      out.write("                        <td>");
      out.print( lname );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>GENDER </td>\n");
      out.write("                        <td> ");
      out.print( gender );
      out.write("</td>    \n");
      out.write("                    </tr> \n");
      out.write("                    <tr>\n");
      out.write("                        <td>DATE OF BIRTH </td>\n");
      out.write("                        <td>");
      out.print( dob );
      out.write("</td>\n");
      out.write("                    </tr>    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>DEGREE </td>  \n");
      out.write("                        <td>");
      out.print( degree );
      out.write(" </td>    \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>BRANCH </td>\n");
      out.write("                        <td>");
      out.print( branch );
      out.write("</td>    \n");
      out.write("                    </tr>    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>FATHER'S NAME </td>\n");
      out.write("                        <td>");
      out.print( fathername );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>MOTHER'S NAME </td>\n");
      out.write("                        <td>");
      out.print( mothername );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>CATEGORY </td>\n");
      out.write("                        <td>");
      out.print( category );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>RELIGION </td>\n");
      out.write("                        <td>");
      out.print( religion );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>EMAIL ID</td>\n");
      out.write("                        <td>");
      out.print( email );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>MOBILE NO </td>\n");
      out.write("                        <td> ");
      out.print( mno );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>PERMANENT ADDRESS</td>\n");
      out.write("                        <td>");
      out.print( paddress );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>TEMPORARY ADDRESS </td>\n");
      out.write("                        <td>");
      out.print( taddress );
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\"> <b>SEE YOUR IMAGES : </b> </td>\n");
      out.write("                        \n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\" style=\"padding-left: 50px\">\n");
      out.write("                           \n");
      out.write("                            <form action=\"imageShow.jsp\">\n");
      out.write("                               <input type=\"text\" value=\"profile\" name=\"idm\" style=\"visibility: hidden\">\n");
      out.write("                           <input type=\"submit\" value=\" PROFILE PIC \" name=\"profile\" onclick=\"window.location.assign('profileShow.jsp')\"   id=\"showimg\"/>\n");
      out.write("                            </form>\n");
      out.write("                           \n");
      out.write("                            <form action=\"imageShow.jsp\">\n");
      out.write("                               <input type=\"text\" value=\"sign\" name=\"idm\" style=\"visibility: hidden\">\n");
      out.write("                           <input type=\"submit\" value=\" SIGN \" name=\"sign\" onclick=\"window.location.assign('signShow.jsp')\"           id=\"showimg\"/>\n");
      out.write("                            </form>\n");
      out.write("                           \n");
      out.write("                            <form action=\"imageShow.jsp\">\n");
      out.write("                               <input type=\"text\" value=\"id\" name=\"idm\" style=\"visibility: hidden\">\n");
      out.write("                           <input type=\"submit\" value=\" COLLEGE ID \" name=\"id\" id=\"showimg\"/>\n");
      out.write("                           </form>\n");
      out.write("                           \n");
      out.write("                            <form action=\"imageShow.jsp\">\n");
      out.write("                               <input type=\"text\" value=\"result\" name=\"idm\" style=\"visibility: hidden\">\n");
      out.write("                           <input type=\"submit\" value=\"RESULT \" name=\"result\" onclick=\"window.location.assign('resultshow.jsp')\"  id=\"showimg\"/> \n");
      out.write("                            </form>\n");
      out.write("                            </td>\n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("            </table>\n");
      out.write("                </div>\n");
      out.write("                    <div class=\"footer\">\n");
      out.write("                        \n");
      out.write("                        <input type=\"button\" value=\" EDIT \" name=\"edit\" onclick=\"window.location.assign('editProfile.jsp')\" class=\"button2\"/>\n");
      out.write("                        <input type=\"button\" value=\" NEXT \" name=\"next\" onclick=\"window.location.assign('paymentAndCourse.jsp')\" class=\"button\" />\n");
      out.write("                        \n");
      out.write("                 </div> \n");
      out.write("                          \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("                        ");

                          }catch(Exception e)
                       {
                        RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request,response);
			out.print("<b>  Something  went wrong please login again...!!!<b>"); 
                        }
                        
      out.write("\n");
      out.write("    </body>\n");
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
