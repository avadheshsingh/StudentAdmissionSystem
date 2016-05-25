package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          ");
      com.avadhesh.DatabaseAdapter db = null;
      synchronized (_jspx_page_context) {
        db = (com.avadhesh.DatabaseAdapter) _jspx_page_context.getAttribute("db", PageContext.PAGE_SCOPE);
        if (db == null){
          db = new com.avadhesh.DatabaseAdapter();
          _jspx_page_context.setAttribute("db", db, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        ");
 
                 if(session!=null)
                 {
                        String u_id=(String)session.getAttribute("userid");
                      PreparedStatement stmt=db.con.prepareStatement("select first_name from studentdetails where userid="+u_id);
                    ResultSet rs=stmt.executeQuery();
                    String name="";
                    
                    while(rs.next()){
                    name= rs.getString("First_name");}
                   
                    session.setAttribute("username",name);
                    session.setAttribute("userid",u_id);
                    session.setAttribute("loginStatus", "updateRecord");
                
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "profiledetails.jsp", out, false);
      out.write("\n");
      out.write("\t\t");

		
                 }
        else
                 {
        
                String u_id=request.getParameter("userid");
		String pass=request.getParameter("password");
		if(db.validate(u_id, pass)){
			
                    PreparedStatement stmt=db.con.prepareStatement("select first_name from studentdetails where userid="+u_id);
                    ResultSet rs=stmt.executeQuery();
                    String name="";
                    
                    while(rs.next()){
                    name= rs.getString("First_name");}
                   
                    session.setAttribute("username",name);
                    session.setAttribute("userid",u_id);
                    session.setAttribute("loginStatus", "updateRecord");
                
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "profiledetails.jsp", out, false);
      out.write("\n");
      out.write("\t\t");

		
		}
		else
		{
			out.print("<b>Sorry username or password error</b>");
			
      out.write("\n");
      out.write("                           ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "index.html", out, false);
      out.write("\n");
      out.write("                         ");

		}
		
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
