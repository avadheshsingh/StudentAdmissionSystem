package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class paymentAndCourse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"elementcss.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>Payment Details</title>\n");
      out.write("        ");
  String branch=(String)session.getAttribute("bran"); 
        
        
      out.write("\n");
      out.write("   \n");
      out.write("        <script>\n");
      out.write("            function showcommentform() {\n");
      out.write("            document.getElementById('mylocation').innerHTML= \"<table cellspacing='10' width='85%' align='center'>\"+\n");
      out.write("            \n");
      out.write("                        \" <tbody><tr><td colspan='4' align='center'><h3>PAYMENT DETAILS</h3></td></tr>\"+\n");
      out.write("                             \"<tr><td>AMOUNT(in Rs.)</td><td><input type='text' name='amount' id='ip1'/></td><td>DATE OF PAYMENT</td>\"+\n");
      out.write("                                \" <td><input type='date' name='date' id='ip1'/></td>\"+\n");
      out.write("                            \" </tr> <tr><td>CHALLAN/DD/NEFT NO</td> <td><input type='text' name='no' id='ip1'/></td>\"+\n");
      out.write("                                \"<td>BANK NAME</td><td><input type='text' name='bank' id='ip1'/></td></tr>\"+\n");
      out.write("                           \" </tbody></table>\";\n");
      out.write("\n");
      out.write("                 }\n");
      out.write("                 \n");
      out.write("                 \n");
      out.write("            var request;\n");
      out.write("            function receiveCourseInfo()\n");
      out.write("            {\n");
      out.write("                var branch=document.paymentAndCourse.branch.value;; \n");
      out.write("                \n");
      out.write("            var v=document.paymentAndCourse.sem.value;\n");
      out.write("            var url=\"courseDisplay.jsp?val=\"+v+\"&branch=\"+branch;\n");
      out.write("\n");
      out.write("            if(window.XMLHttpRequest){\n");
      out.write("            request=new XMLHttpRequest();\n");
      out.write("            }\n");
      out.write("            else if(window.ActiveXObject){\n");
      out.write("            request=new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            try\n");
      out.write("            {\n");
      out.write("            request.onreadystatechange=getInfo;\n");
      out.write("            request.open(\"GET\",url,true);\n");
      out.write("            request.send();\n");
      out.write("            }\n");
      out.write("            catch(e)\n");
      out.write("            {\n");
      out.write("            alert(\"Unable to connect to server\");\n");
      out.write("            }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function getInfo(){\n");
      out.write("            if(request.readyState==4){\n");
      out.write("            var val=request.responseText;\n");
      out.write("            document.getElementById('check').innerHTML=val;\n");
      out.write("            }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("    \n");
      out.write("      function   finalsubmit()\n");
      out.write("         {\n");
      out.write("             confirm(\"Are you sure\");\n");
      out.write("         }\n");
      out.write("          \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #f0f0f0\">\n");
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
      out.write("        \n");
      out.write("          <a href=\"Logout.jsp\" style=\"margin-left: 29cm;font-weight: bold\">LOGOUT</a><br>\n");
      out.write("          \n");
      out.write("          <form name=\"paymentAndCourse\" action =\"paymentRecord.jsp\" method=\"post\">\n");
      out.write("              \n");
      out.write("              <section id=\"payment\">\n");
      out.write("                  \n");
      out.write("                  <h1 style=\"margin-left: 70px\">COURSES AND REGISTRATION FEE DETAILS</h1><br><br>\n");
      out.write("              \n");
      out.write("            <input type=\"text\" style=\"visibility: hidden\" value=\"");
      out.print(branch  );
      out.write("\" name=\"branch\" >\n");
      out.write("            \n");
      out.write("            <table align=\"center\" cellspacing=\"10\" width=\"60%\" >\n");
      out.write("            <tr>\n");
      out.write("                <td>PROGRAM-SESSION</td> \n");
      out.write("                <td><input type=\"text\" name=\"session\" id=\"ip1\"></td>\n");
      out.write("                <td>ENROLLMENT NO</td>\n");
      out.write("                <td><input type=\"text\" name=\"year\" id=\"ip1\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td> EXAM TYPE</td> \n");
      out.write("               <td><select name=\"examtype\" id=\"menu\">\n");
      out.write("                                 <option value=\"Not selected\"> SELECT </option>\n");
      out.write("                                 <option value=\"JAN-JUN\"> JAN-JUN </option>\n");
      out.write("                                 <option value=\"JUL-DEC\"> JUL-DEC </option>\n");
      out.write("                   </select>\n");
      out.write("               </td>\n");
      out.write("                <td>SEMESTER</td>\n");
      out.write("                <td>\n");
      out.write("                    <select name=\"sem\" onchange=\"receiveCourseInfo()\" id=\"menu\" >\n");
      out.write("                                 <option value=\"Not selected\"> SELECT </option>\n");
      out.write("                                 <option value=\"1\" > sem 1 </option>\n");
      out.write("                                 <option value=\"2\"> sem 2 </option>\n");
      out.write("                                 <option value=\"3\"> sem 3 </option>\n");
      out.write("                                 <option value=\"4\"> sem 4 </option>\n");
      out.write("                                 <option value=\"5\"> sem 5 </option>\n");
      out.write("                                 <option value=\"6\"> sem 6 </option>\n");
      out.write("                                 <option value=\"7\"> sem 7 </option>\n");
      out.write("                                 <option value=\"8\"> sem 8 </option>\n");
      out.write("                   </select>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("              \n");
      out.write("              <h2 style=\"padding-left: 25PX;font-size: 25px;\">COURSES DETAILS : </h2>\n");
      out.write("              <section><span id=\"check\" ></span></section>\n");
      out.write("              \n");
      out.write("              <br> <br>  <section style=\"border-top:  dashed\"><h2 style=\"padding-left: 25PX;font-size: 25px;\">REGISTRATION FEE : </h2></section>\n");
      out.write("         <section style=\" padding-left: 25px\">\n");
      out.write("             <table><tr>\n");
      out.write("                     <td> PAYMENT MODE : </td> <td> <select name=\"paymentmode\" onchange=\"showcommentform()\" id=\"menu\">\n");
      out.write("                                 <option value=\"Not selected\">SELECT</option>\n");
      out.write("                                 <option > DD </option>\n");
      out.write("                                 <option > CHALLAN </option>\n");
      out.write("                                 <option > CHEQUE </option>\n");
      out.write("                                 <option > NEFT </option>\n");
      out.write("                   </select>\n");
      out.write("                 </td>        </tr>    </table>\n");
      out.write("             \n");
      out.write("                 <section id=\"mylocation\" style=\"padding-bottom: 20px\"></section> \n");
      out.write("         \n");
      out.write("          \n");
      out.write("         </section>\n");
      out.write("              <section id=\"footer\">\n");
      out.write("                  <input type=\"submit\" name=\"submit\" value=\"SUBMIT\" id=\"myButton\" style=\"margin-left: 350px\" > \n");
      out.write("              </section >\n");
      out.write("                 \n");
      out.write("              </section>\n");
      out.write("            \n");
      out.write("          </form> \n");
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
