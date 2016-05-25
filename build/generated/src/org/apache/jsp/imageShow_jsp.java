package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class imageShow_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link href=\"elementcss.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>Your Image</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("        ");

             String  u_id="";
                    u_id=request.getParameter("idm");
           
      out.write("\n");
      out.write("           <section id=\"imgshow\"  style=\"margin-left: 0.5cm;float: left;padding: 40px 40px 40px 40px\">\n");
      out.write("               \n");
      out.write("               \n");
      out.write("           ");
  
            if(u_id.equals("id"))
            {
            
      out.write("\n");
      out.write("            <h1>COLLEGE ID</h1>\n");
      out.write("            <img src=\"idShow.jsp\" width=\"550\" height=\"400\" alt=\"Image Doesn't Exists\"/>\n");
      out.write("\n");
      out.write("             ");

            }
            if(u_id.equals("profile"))
            {
            
      out.write("\n");
      out.write("            <h1>PROFILE PIC</h1>\n");
      out.write("             <img src=\"profileShow.jsp\" width=\"350\" height=\"400\" alt=\"Image Doesn't Exists\"/>\n");
      out.write("             ");
 
            }
            if(u_id.equals("sign"))
            {
            
      out.write("\n");
      out.write("            <h1>YOUR SIGN</h1>\n");
      out.write("             <img src=\"signShow.jsp\" width=\"400\" height=\"400\" alt=\"Image Doesn't Exists\"/>\n");
      out.write("             ");

            }
            if(u_id.equals("result"))
            {
            
      out.write("\n");
      out.write("            <h1>PREVIOUS RESULT</h1>\n");
      out.write("             <img src=\"resultshow.jsp\" width=\"650\" height=\"400\" alt=\"Image Doesn't Exists\"/>\n");
      out.write("            ");

            }
            
      out.write("\n");
      out.write("           </section> \n");
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
