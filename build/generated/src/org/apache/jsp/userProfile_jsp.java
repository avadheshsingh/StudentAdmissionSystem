package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <link href=\"elementcss.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>Create Profile</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        ");
   String name="";
            if(session!=null){
		    name=(String)session.getAttribute("userid");
                }
            else{
                                
      out.write("\n");
      out.write("                                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "index.html", out, false);
      out.write("\n");
      out.write("                                ");

                            }
        
      out.write("\n");
      out.write("                <form name=\"Profile\" action=\"profileRecordDB.jsp\" method=\"POST\">\n");
      out.write("                    <section id=\"form\">\n");
      out.write("                    \n");
      out.write("            <table border=\"0\" cellspacing=\"14\" cellpadding=\"1\" align=\"center\">\n");
      out.write("                <tr>\n");
      out.write("                    <td colspan=\"2\"><h1 style=\"margin-left: 90px\">PERSONAL DETAILS</h1></td>\n");
      out.write("                 </tr>\n");
      out.write("                \n");
      out.write("                    <tr>\n");
      out.write("                        <td>FIRST NAME </td>\n");
      out.write("                        <td><input type=\"text\" name=\"fname\" id=\"ip\" value=\"\" placeholder=\"First Name\" pattern=\"[a-zA-z]+\" required/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>LAST NAME </td>\n");
      out.write("                        <td><input type=\"text\" name=\"lname\" value=\"\" id=\"ip\" placeholder=\"Last Name\" pattern=\"[a-zA-z]+\" required/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>GENDER </td>\n");
      out.write("                        <td><input type=\"radio\" name=\"gender\" value=\"Male\" />Male\n");
      out.write("                        <input type=\"radio\" name=\"gender\" value=\"Female\"/>Female\n");
      out.write("                        </td>    \n");
      out.write("                    </tr> \n");
      out.write("                    <tr>\n");
      out.write("                        <td>DATE OF BIRTH </td>\n");
      out.write("                        <td><input type=\"date\" name=\"dob\" id=\"ip\" required=\"\"></td>\n");
      out.write("                    </tr>    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                         DEGREE \n");
      out.write("                        </td>  \n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"radio\" name=\"degree\" value=\"UG\" />UG \n");
      out.write("                            <input type=\"radio\" name=\"degree\" value=\"PG\" />PG\n");
      out.write("                        </td>    \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>BRANCH </td>\n");
      out.write("                        <td><select name=\"branch\" id=\"menu\" required>\n");
      out.write("                                 <option value=\"Not selected\"> SELECT </option>\n");
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
      out.write("                        <td><input type=\"text\" name=\"fathername\" value=\"\" id=\"ip\" placeholder=\"Father's Name\" pattern=\"[a-zA-z]+\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>MOTHER'S NAME </td>\n");
      out.write("                        <td><input type=\"text\" name=\"mothername\" value=\"\" id=\"ip\" placeholder=\"Mother's Name\" pattern=\"[a-zA-z]+\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>EMAIL ID</td>\n");
      out.write("                        <td><input type=\"email\" name=\"email\" value=\"\" id=\"ip\" placeholder=\"Email Id\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>MOBILE NO </td>\n");
      out.write("                        <td><input type=\"tel\" name=\"mno\" value=\"\" id=\"ip\" placeholder=\"Phone No\" pattern=\"[0-9]{10,12}\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>CATEGORY</td>\n");
      out.write("                        <td><input type=\"text\" name=\"category\" id=\"ip\"  placeholder=\"category\" pattern=\"[a-zA-z]+\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>RELIGION</td>\n");
      out.write("                        <td><input type=\"text\" name=\"religion\" id=\"ip\"  placeholder=\"religion\" pattern=\"[a-zA-z]+\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>PERMANENT ADDRESS</td>\n");
      out.write("                        <td><textarea name=\"paddress\" id=\"ip\"  placeholder=\"permanent address\" style=\"width: 260px;height: 90px;resize: none\" ></textarea></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>TEMPORARY ADDRESS </td>\n");
      out.write("                        <td><textarea name=\"taddress\" id=\"ip\" style=\"width: 260px;height: 90px;resize: none\" placeholder=\"temporary address\"></textarea></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                     <tr>\n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                                 <iframe src=\"imageUpload.jsp\" width=\"500\" height=\"565\" style=\"border-radius: 10px\"></iframe>\n");
      out.write("                        </td>  \n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("                        <section id=\"footer\">\n");
      out.write("                            <input type=\"submit\" value=\" Submit \" name=\"submit\" id=\"myButton\" style=\"margin-left: 7.5cm\" />\n");
      out.write("                            </section>\n");
      out.write("                        \n");
      out.write("                    </section>\n");
      out.write("        </form>\n");
      out.write("        \n");
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
