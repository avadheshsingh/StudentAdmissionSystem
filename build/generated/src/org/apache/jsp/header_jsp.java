package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("           <link href=\"elementcss.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("           \n");
      out.write("           <style>\n");
      out.write("      #head {\n");
      out.write("\twidth: 750px;\n");
      out.write("\tmargin: 0 auto;\n");
      out.write("\tposition: relative;\n");
      out.write("\tz-index:5;\n");
      out.write("        margin-bottom: 20px;\n");
      out.write("        padding-top: 15px;\n");
      out.write("\t\n");
      out.write("\tbackground: #f3f3f3;\n");
      out.write("\tborder: 1px solid #fff;\n");
      out.write("\tborder-radius: 5px;\n");
      out.write("\t\n");
      out.write("\tbox-shadow: 0 1px 3px rgba(0,0,0,0.5);\n");
      out.write("\t-moz-box-shadow: 0 1px 3px rgba(0,0,0,0.5);\n");
      out.write("\t-webkit-box-shadow: 0 1px 3px rgba(0,0,0,0.5);\n");
      out.write("       }\n");
      out.write("       \n");
      out.write("      #title {\n");
      out.write("\tfont-family: 'GEORGIA',serif;\n");
      out.write("\tfont-weight: 600;\n");
      out.write("\tfont-size: 45px;\n");
      out.write("        padding-bottom: 40px;\n");
      out.write("        margin-left: 50px;\n");
      out.write("\tline-height:34px;\n");
      out.write("\tcolor: #990033;\n");
      out.write("\ttext-shadow: 3px 3px 0 rgba(200,160,256,1.0);\n");
      out.write("\tmargin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("               \n");
      out.write("        </style>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("        ");
   String name="";
                            if(session!=null){
                            name=(String)session.getAttribute("userid");  } 
                          
      out.write("\n");
      out.write("        <section id=\"head\" style=\"width: 87%\">\n");
      out.write("            <table style=\"width: 100%\">\n");
      out.write("                <tr><td><img src=\"nitlogo.png\" width=\"100\" height=\"100\" alt=\"nitlogo\" style=\"margin-left: 20px\"/>\n");
      out.write("                    </td>\n");
      out.write("                    <td><h1 id=\"title\">STUDENT ADMISSION SYSTEM</h1>\n");
      out.write("                      </td>\n");
      out.write("                      <td><img src=\"profile.jpg\" width=\"90\" height=\"90\" alt=\"profile\" style=\"border-radius: 50px;margin-right: 10px\"/>\n");
      out.write("                      </td>\n");
      out.write("                         \n");
      out.write("                </tr>\n");
      out.write("                <tr>     \n");
      out.write("                    <td> </td>\n");
      out.write("                    <td></td>\n");
      out.write("                </tr>\n");
      out.write("               \n");
      out.write("                        \n");
      out.write("            </table>\n");
      out.write("        </section>\n");
      out.write("        <table style=\"width: 85%\"><tr><td>\n");
      out.write("        \n");
      out.write("         <h4>WELCOME ,");
      out.print( name );
      out.write(";</h4>\n");
      out.write("        </td><td>\n");
      out.write("            <input type=\"button\" value=\"LOGOUT\" name=\"Logout\" onclick=\"window.location.assign('Logout.jsp')\"/>\n");
      out.write("                </td></tr></table>\n");
      out.write("        </body>\n");
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
