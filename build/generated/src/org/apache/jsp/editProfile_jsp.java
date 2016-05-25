package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.annotation.MultipartConfig;
import java.sql.*;;

public final class editProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("              <link href=\"elementcss.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>Edit Profile</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         \n");
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

           
            String name="",userid="",fname="",lname="",gender="",dob="",branch="",fathername="",mothername="",email="",paddress="",taddress="",degree="",religion="",category="";
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
                            religion=rs.getString(19);
                            category=rs.getString(20);
                            
            }
            
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
                
        
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("            \n");
      out.write("            <form name=\"Profile\" action=\"profileRecordDB.jsp\" method=\"POST\" >\n");
      out.write("            <section id=\"form\">\n");
      out.write("                \n");
      out.write("            <table  cellspacing=\"14\" cellpadding=\"1\" align=\"center\" width=\"50%\">\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\"><h1 style=\"margin-left: 120px\">PERSONAL DETAILS</h1><br></td>\n");
      out.write("                 </tr>\n");
      out.write("                 <br><br>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>FIRST NAME </td>\n");
      out.write("                        <td><input type=\"text\" name=\"fname\" id=\"ip\" value=\"");
      out.print( fname );
      out.write("\" placeholder=\"First Name\" pattern=\"[a-zA-z]+\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>LAST NAME </td>\n");
      out.write("                        <td><input type=\"text\" name=\"lname\" id=\"ip\" value=\"");
      out.print( lname );
      out.write("\" placeholder=\"Last Name\" pattern=\"[a-zA-z]+\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>GENDER </td>\n");
      out.write("                        <td><input type=\"radio\" name=\"gender\" value=\"Male\" />Male\n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"Female\"/>Female\n");
      out.write("                        </td>    \n");
      out.write("                    </tr> \n");
      out.write("                    <tr>\n");
      out.write("                        <td>DATE OF BIRTH </td>\n");
      out.write("                        <td><input type=\"date\" name=\"dob\" id=\"ip\" value=\"\"></td>\n");
      out.write("                    </tr>    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                         DEGREE \n");
      out.write("                        </td>  \n");
      out.write("                        <td>\n");
      out.write("                               <input type=\"radio\" name=\"degree\" value=\"UG\"/>UG \n");
      out.write("                            <input type=\"radio\" name=\"degree\" value=\"PG\" />PG\n");
      out.write("                        </td>    \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>BRANCH </td>\n");
      out.write("                        <td><select name=\"branch\" id=\"menu\" >\n");
      out.write("                                <option value=\"");
      out.print(branch);
      out.write("\"> SELECT </option>\n");
      out.write("                                <option value=\"Computer science & Engineering\"> CSE </option>\n");
      out.write("                                <option value=\"Electronics Communication Engineering\"> ECE </option>\n");
      out.write("                                <option value=\"Electrical Engineering\"> EE </option>\n");
      out.write("                                <option value=\"Mechanical Engineering\"> ME </option>\n");
      out.write("                                <option value=\"Civil Engineering\"> CE </option>\n");
      out.write("                                <option value=\"Information Technology\"> IT </option>\n");
      out.write("                                <option value=\"Architecture\"> Arch </option>\n");
      out.write("                            </select></td>    \n");
      out.write("                    </tr>    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>FATHER'S NAME </td>\n");
      out.write("                        <td><input type=\"text\" name=\"fathername\" id=\"ip\" value=\"");
      out.print( fathername );
      out.write("\" placeholder=\"Father's Name\" pattern=\"[a-zA-z]+\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>MOTHER'S NAME </td>\n");
      out.write("                        <td><input type=\"text\" name=\"mothername\" id=\"ip\" value=\"");
      out.print( mothername );
      out.write("\" placeholder=\"Mother's Name\" pattern=\"[a-zA-z]+\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>EMAIL ID</td>\n");
      out.write("                        <td><input type=\"email\" name=\"email\" id=\"ip\" value=\"");
      out.print( email );
      out.write("\" placeholder=\"Email Id\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>MOBILE NO </td>\n");
      out.write("                        <td><input type=\"tel\" name=\"mno\" id=\"ip\" value=\"");
      out.print( mno );
      out.write("\" placeholder=\"Phone No\" pattern=\"[0-9]{10,12}\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>CATEGORY</td>\n");
      out.write("                        <td><input type=\"text\" name=\"category\" id=\"ip\" value=\"");
      out.print( category );
      out.write("\" placeholder=\"category..\" pattern=\"[a-zA-z]+\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>RELIGION</td>\n");
      out.write("                        <td><input type=\"text\" name=\"religion\" id=\"ip\" value=\"");
      out.print( religion );
      out.write("\" placeholder=\"religion..\" pattern=\"[a-zA-z]+\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>PERMANENT ADDRESS</td>\n");
      out.write("                        <td><textarea name=\"paddress\" id=\"ip\"  placeholder=\"permanent address\" style=\"width: 260px;height: 90px;resize: none\">");
      out.print( paddress );
      out.write("</textarea></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>TEMPORARY ADDRESS </td>\n");
      out.write("                        <td><textarea  id=\"ip\" name=\"taddress\"  placeholder=\"temporary address\" style=\"width: 260px;height: 90px;resize: none\">");
      out.print( taddress );
      out.write("</textarea></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                            <iframe src=\"imageUpload.jsp\" width=\"500\" height=\"565\" style=\"border-radius: 10px\"></iframe>\n");
      out.write("                        </td>  \n");
      out.write("                    </tr>\n");
      out.write("                  \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("                <section id=\"footer\">\n");
      out.write("                            <input type=\"submit\" value=\" UPDATE \" name=\"submit\" id=\"myButton\" style=\"margin-left: 7.5cm\"/>\n");
      out.write("                            </section>\n");
      out.write("                    \n");
      out.write("            </section>\n");
      out.write("        </form>\n");
      out.write("                    \n");
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
