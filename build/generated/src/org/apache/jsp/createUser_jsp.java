package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class createUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            <link href=\"myCss.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>Create User</title>\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            var request;\n");
      out.write("            function sendInfo()\n");
      out.write("            {\n");
      out.write("            var v=document.createUser.userid.value;\n");
      out.write("            var url=\"checkForUserid.jsp?val=\"+v;\n");
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
      out.write("            \n");
      out.write("            \n");
      out.write("           \n");
      out.write("\n");
      out.write("      </script>   \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         \n");
      out.write("        \n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("\t<!--SLIDE-IN ICONS-->\n");
      out.write("    <div class=\"user-icon\"></div>\n");
      out.write("    <div class=\"pass-icon\"></div>\n");
      out.write("        \n");
      out.write("        <form name=\"createUser\" class=\"login-form\" action=\"loginRecord.jsp\" method=\"POST\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("    <!--TITLE--><h1>SignUp Form</h1><!--END TITLE-->\n");
      out.write("    <!--DESCRIPTION--><span>Fill out the form below to login to my super awesome imaginary control panel.</span><!--END DESCRIPTION-->\n");
      out.write("    </div>\n");
      out.write("    <!--END HEADER-->\n");
      out.write("\t\n");
      out.write("\t<!--CONTENT--> \n");
      out.write("    <div class=\"content\">\n");
      out.write("        <span id=\"check\"></span>\n");
      out.write("        <!--USERNAME--><input name=\"userid\" type=\"text\" class=\"input username\" placeholder=\"Enter Userid..\" pattern=\"[0-9]+\" onfocus=\"this.value=''\" onkeyup=\"sendInfo()\"/>   <!--END USERNAME-->\n");
      out.write("        <!--PASSWORD--><input name=\"password\" type=\"password\" class=\"input password\" placeholder=\"Enter Password..\" pattern=\"[0-9A-Za-z]{4,20}\" onfocus=\"this.value=''\" onkeyup=\"checkUp()\"/><!--END PASSWORD-->\n");
      out.write("        <input name=\"cpassword\" type=\"password\" class=\"input password\" placeholder=\"Confirm Password..\" pattern=\"[0-9A-Za-z]{4,20}\" onfocus=\"this.value=''\" />\n");
      out.write("    </div>  \n");
      out.write("          <!--END CONTENT-->\n");
      out.write("    \n");
      out.write("    <!--FOOTER--> \n");
      out.write("    <div class=\"footer\">\n");
      out.write("        <!--LOGIN BUTTON--><input type=\"submit\" name=\"login\" value=\"Create\" class=\"button\" style=\"width: 282px\" /><!--END LOGIN BUTTON-->\n");
      out.write("  \n");
      out.write("    </div>\n");
      out.write("    <!--END FOOTER-->\n");
      out.write("        </form>\n");
      out.write("      \n");
      out.write("        </div>\n");
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
