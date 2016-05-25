package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class courseDisplay_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      com.avadhesh.DatabaseAdapter db = null;
      synchronized (_jspx_page_context) {
        db = (com.avadhesh.DatabaseAdapter) _jspx_page_context.getAttribute("db", PageContext.PAGE_SCOPE);
        if (db == null){
          db = new com.avadhesh.DatabaseAdapter();
          _jspx_page_context.setAttribute("db", db, PageContext.PAGE_SCOPE);
        }
      }
      out.write('\n');

        String sem=request.getParameter("val");
        String branch=request.getParameter("branch");
        // String branch= "Computer science & Engineering";
        out.print(branch);
        String query="select * from courses where sem=? and branch=?";
       PreparedStatement stmt=db.con.prepareStatement(query);

   
  
			stmt.setString(1,sem);
			stmt.setString(2, branch);
			out.print("<table border=1 width=60% align='center' cellspacing='10' style='margin-top: 1cm;border-color: green; ;border: thick;border-style: dotted;padding: 4mm '>");
			out.print("<tr><td colspan='4' align='center'><h2 align='center' style='color: purple'>** REGULAR COURSES **</h2> </td></tr>");
                        out.print("<tr><th>COURSE CODE</th><th>COURSE TITLE</th><th>CREDIT</th><th>PAPER TYPE</th></tr>");
                        
			ResultSet rs=stmt.executeQuery();
				
			/* Printing column names */
			ResultSetMetaData rsmd=rs.getMetaData();
			int total=rsmd.getColumnCount();
                        
			while(rs.next())
			{    
		
			out.print("<tr><td>"+rs.getString(3)+"</td>"+"<td>"+rs.getString(4)+"</td>"+"<td>"+rs.getString(5)+"</td>"+"<td>"+rs.getString(6)+"</td></tr>");
			
			   
			
			}

			out.print("</table>");
			
	             rs.close();
                     out.close();
    
    
      out.write("\n");
      out.write("    ");
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
