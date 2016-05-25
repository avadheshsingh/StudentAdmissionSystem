package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class imageUpload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("        <link href=\"elementcss.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("       \n");
      out.write("        <br>  <section id=\"imgload\" style=\"margin-left: 0.5cm;float: left;padding: 20px 20px 20px 20px\">\n");
      out.write("           \n");
      out.write("            <h1 style=\"margin-left: 70px;margin-top: 10px\">IMAGE UPLOAD</h1> \n");
      out.write("        <form name=\"img\" action=\"UploadServlet\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("             \n");
      out.write("           <input type=\"submit\" value=\"upload\" name=\"upload1\" id=\"upload\"/>\n");
      out.write("                     \n");
      out.write("           UPLOAD PROFILE PIC :- <br><input type=\"file\" name=\"photo\" id=\"ip\" />\n");
      out.write("               \n");
      out.write("        </form>\n");
      out.write("           \n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form name=\"img\" action=\"SignUpload\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("          \n");
      out.write("             UPLOAD YOUR SIGN :- <br><input type=\"file\" name=\"sign\" id=\"ip\"/>\n");
      out.write("           <input type=\"submit\" value=\"upload\" name=\"upload2\" id=\"upload\"/>\n");
      out.write("           \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <form name=\"img\" action=\"ResultUpload\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("           \n");
      out.write("           UPLOAD LAST SEM RESULT:- <br><input type=\"file\" name=\"result\" id=\"ip\"/>\n");
      out.write("           <input type=\"submit\" value=\"upload\" name=\"upload3\" id=\"upload\"/>\n");
      out.write("           \n");
      out.write("        </form>\n");
      out.write("     \n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <form name=\"img\" action=\"IdUpload\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            \n");
      out.write("              UPLOAD STUDENT ID:- <br><input type=\"file\" name=\"id\" id=\"ip\"/>\n");
      out.write("           <input type=\"submit\" value=\"upload\" name=\"upload4\" id=\"upload\"/>\n");
      out.write("           \n");
      out.write("        </form>\n");
      out.write("         <h3>");
      out.print(request.getAttribute("Message"));
      out.write("</h3>\n");
      out.write("            \n");
      out.write("        </section>\n");
      out.write("   \n");
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
