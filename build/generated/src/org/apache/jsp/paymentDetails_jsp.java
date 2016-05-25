package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class paymentDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Payment Details</title>\n");
      out.write("        <script>\n");
      out.write("            function showcommentform() {\n");
      out.write("            document.getElementById('mylocation').innerHTML= \"<table cellspacing='10' width='60%' align='center'>\"+\n");
      out.write("            \n");
      out.write("           \" <tbody><tr><td colspan='4' align='center'><h3>PAYMENT DETAILS</h3></td></tr>\"+\n");
      out.write("                \"<tr><td>AMOUNT(in Rs.)</td><td><input type='text' name='amount'/></td><td>DATE OF PAYMENT</td>\"+\n");
      out.write("                   \" <td><input type='date' name='amount'/></td>\"+\n");
      out.write("               \" </tr> <tr><td>CHALLAN/DD/NEFT NO</td> <td><input type='text' name='no'/></td>\"+\n");
      out.write("                   \"<td>BANK NAME</td><td><input type='text' name='bank'/></td></tr>\"+\n");
      out.write("              \" </tbody></table>\";\n");
      out.write("            \n");
      out.write("\n");
      out.write("            }\n");
      out.write("          \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        ");
  
            String userid="",name="";
            
        if(session!=null){
           userid=(String)session.getAttribute("userid");
             name=(String)session.getAttribute("username");
             out.print("<br><b>WELCOME , </b>"+name); 
        }     
       
	    
        
        
      out.write("\n");
      out.write("        \n");
      out.write("          <a href=\"Logout.jsp\" style=\"margin-left: 29cm;font-weight: bold\">LOGOUT</a><br>\n");
      out.write("        <table align=\"center\" cellspacing=\"10\" width=\"60%\" >\n");
      out.write("            <tr>\n");
      out.write("                <td>PROGRAM-SESSION</td> \n");
      out.write("                <td><input type=\"text\" name=\"session\"></td>\n");
      out.write("                <td>REG. FORM ENTRY YEAR</td>\n");
      out.write("                <td><input type=\"text\" name=\"session\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td> EXAM TYPE</td> \n");
      out.write("               <td><select name=\"examtype\">\n");
      out.write("                                 <option value=\"Not selected\"> SELECT </option>\n");
      out.write("                                 <option value=\"JAN-JUN\"> JAN-JUN </option>\n");
      out.write("                                 <option value=\"JUL-DEC\"> JUL-DEC </option>\n");
      out.write("                   </select>\n");
      out.write("               </td>\n");
      out.write("                <td>SEMESTER</td>\n");
      out.write("                <td>\n");
      out.write("                    <select name=\"sem\" >\n");
      out.write("                                 <option value=\"Not selected\"> SELECT </option>\n");
      out.write("                                 <option > sem 1 </option>\n");
      out.write("                                 <option > sem 2 </option>\n");
      out.write("                                 <option > sem 3 </option>\n");
      out.write("                                 <option > sem 4 </option>\n");
      out.write("                                 <option > sem 5 </option>\n");
      out.write("                                 <option > sem 6 </option>\n");
      out.write("                                 <option > sem 7 </option>\n");
      out.write("                                 <option > sem 8 </option>\n");
      out.write("                   </select>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("          <br>  <section style=\"border-top:  dashed\"><h2 style=\"padding-left: 30PX\">REGISTRATION FEE : </h2></section>\n");
      out.write("         <section style=\" padding-left: 30px\"> PAYMENT MODE :  <select name=\"paymentmode\" onchange=\"showcommentform()\">\n");
      out.write("                <option value=\"Not selected\"> SELECT MODE </option>\n");
      out.write("                                 <option > DD </option>\n");
      out.write("                                 <option > CHALLAN </option>\n");
      out.write("                                 <option > CHEQUE </option>\n");
      out.write("                                 <option > NEFT </option>\n");
      out.write("                   </select>\n");
      out.write("          <section id=\"mylocation\"></section>\n");
      out.write("          </section>\n");
      out.write("        \n");
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
