package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class DeleteUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<style>\n");
      out.write("* {\n");
      out.write("    box-sizing: border-box;\n");
      out.write("}\n");
      out.write("button\n");
      out.write("\t\t{\n");
      out.write("\t\t\tborder-radius: 2px;\n");
      out.write("\t\t\tbackground-color: crimson;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t\tfont-size: 20px;\n");
      out.write("\t\t\tpadding: 3px 3px 3px 3px;\n");
      out.write("\t\t\tmargin: 0px 5px 5px 0px;\n");
      out.write("\t\t}\n");
      out.write("h2 {\n");
      out.write("    text-align: center;\n");
      out.write("    text-transform: uppercase;\n");
      out.write("    color: #DC143C;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body background = \"blur.jpg\">\n");

   try{
        String uid=request.getParameter("uid");
    Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
             //    ----- Connection Established ------

         PreparedStatement pst=con.prepareStatement("select email from user where email=?");
                pst.setString(1,uid);
         ResultSet rs=pst.executeQuery();
         if(rs.next())
         {
               
                pst=con.prepareStatement("delete from user where email=?");
                        pst.setString(1,uid);
                if((pst.executeUpdate()) > 0)
                {
                        out.println("<br><br><br><br><center><h1>   User "+uid+" User deleted.  </h1></center> ");
                }
                else
                {
                        out.println("<br><br><br><br><center><h1>   User "+uid+" Can't be Deleted from Login. </h1></center>  ");
                }
         }
         else
         {
                        out.println("<br><br><br><br><center><h1>   User "+uid+" Does not Exist.  </h1></center> ");
         }   
       }catch(Exception e)
       {
          out.println(e);
       }

      out.write("\n");
      out.write("\n");
      out.write("<p>\n");
      out.write("<center>\n");
      out.write("    \n");
      out.write("        <a href=\"logout.jsp\"> User Deleted Sign Up Again </a>\n");
      out.write("</center>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
