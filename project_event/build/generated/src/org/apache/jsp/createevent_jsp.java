package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.IOException;
import java.sql.*;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.lang.*;

public final class createevent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("    body {\n");
      out.write("        font-family: tahoma, helvetica, arial, sans-serif;\n");
      out.write("        font-size: 11px;\n");
      out.write("        text-align: center;\n");
      out.write("        background: #d3d2d1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h3, p { \n");
      out.write("        font-size: 11px; \n");
      out.write("        margin: 1em 0.5em 0.5em 0.5em; \n");
      out.write("}\n");
      out.write("\n");
      out.write("p { \n");
      out.write("        margin-top: 0.5em; \n");
      out.write("}\n");
      out.write("\n");
      out.write("img {\n");
      out.write("        border: 0;\n");
      out.write("}\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</style>\n");
      out.write("<body background = \"blur.jpg\">\n");
      out.write("           ");

               try{
               
        String ename = request.getParameter("ename");
        String eid = request.getParameter("eid");
        String time = request.getParameter("time");
        String date = request.getParameter("date");
        String place = request.getParameter("place");
        String tel = request.getParameter("tel");
       
  
            
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","root");
                    Class.forName("com.mysql.jdbc.Driver");
                String query="insert into event (ename,eid,time,date,place,tel) values ('"+ename+"','"+eid+"','"+time+"','"+date+"','"+place+"','"+tel+"')";
                Statement st=con.createStatement();
                int i= st.executeUpdate(query);
            if(i>0)
            
                  out.println("Thank you for creating an event ! !</a> to continue.");

            
            }
       catch(IOException | ClassNotFoundException | SQLException e)
       { 
           out.println(e.getMessage()); 
       }
            
    



      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
