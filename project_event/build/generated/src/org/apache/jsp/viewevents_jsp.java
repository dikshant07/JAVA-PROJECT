package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.lang.*;

public final class viewevents_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("     ");

         try{
  String url="jdbc:mysql://localhost:3306/project";
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn=DriverManager.getConnection(url,"root","root");
        String query="select * from event";
        Statement st=conn.createStatement();
        ResultSet Rs=st.executeQuery(query);

      out.write("\n");
      out.write("\n");
      out.write("   \n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <head>\n");
      out.write("\t<title>Events Table</title>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!--===============================================================================================-->\t\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"images/icons/favicon.ico\"/>\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/animate/animate.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/select2/select2.min.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"vendor/perfect-scrollbar/perfect-scrollbar.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/util.css\">\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\">\n");
      out.write("<!--===============================================================================================-->\n");
      out.write("</head>\n");
      out.write("<style>button\n");
      out.write("\t\t{\n");
      out.write("\t\t\tborder-radius: 5px;\n");
      out.write("\t\t\tbackground-color: crimson;\n");
      out.write("\t\t\tcolor: white;\n");
      out.write("\t\t\tfont-size: 20px;\n");
      out.write("\t\t\tpadding: 3px 3px 3px 3px;\n");
      out.write("\t\t\tmargin: 0px 5px 5px 0px;\n");
      out.write("\t\t}</style>\n");
      out.write("\n");
      out.write("<title>SCHEDULED CONFERENCES</title>\n");
      out.write("</head>\n");
      out.write(" <body background = \"blur.jpg\">\n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("     \n");
      out.write("<h2 align=\"center\" >SCHEDULED MEETINGS</h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"limiter\">\n");
      out.write("\t\t<div class=\"container-table100\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t<div class=\"wrap-table100\">\n");
      out.write("\t\t\t\t<div class=\"table100\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<table border=\"2\" align=center>\n");
      out.write("        <button type=\"button\" onclick=\"goBack()\" class=\"button\">Back</button>\n");
      out.write("<thead>\n");
      out.write("<tr bgcolor=\"#260d14\">\n");
      out.write("<FONT FACE=\"Impact\" COLOR=\"#FFFF99\">\n");
      out.write("<th><font size=\"3\" COLOR=\"#FFFF99\">EVENT NAME</th>\n");
      out.write("<th><font size=\"3\" COLOR=\"#FFFF99\">EVENT ID</th>\n");
      out.write("<th><font size=\"3\" COLOR=\"#FFFF99\">EVENT TIME</th>\n");
      out.write("<th><font size=\"3\" COLOR=\"#FFFF99\">EVENT DATE</th>\n");
      out.write("<th><font size=\"3\" COLOR=\"#FFFF99\">EVENT PLACE</th>\n");
      out.write("<th><font size=\"3\" COLOR=\"#FFFF99\">CONTACT</th>\n");
      out.write("</FONT>\n");

while(Rs.next())
{

      out.write("<tr bgcolor=\"#e9beca\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("   <td>");
out.println(Rs.getString(1));
      out.write("</td>\n");
      out.write("   <td>");
out.println(Rs.getString(2));
      out.write("</td>\n");
      out.write("  <td>");
out.println(Rs.getString(3));
      out.write("</td>\n");
      out.write("  <td>");
out.println(Rs.getString(4));
      out.write("</td>\n");
      out.write("  <td>");
out.println(Rs.getString(5));
      out.write("</td>\n");
      out.write("  <td>");
out.println(Rs.getString(6));
      out.write("</td>\n");
      out.write(" \n");
      out.write("   </tr>\n");
      out.write("</table>\n");
      out.write("                                </div>\n");
      out.write("                        </div>\n");
      out.write("                </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("               <script>\n");
      out.write("function goBack()\n");
      out.write("{\n");
      out.write("  window.history.back();\n");
      out.write("}\n");
      out.write("</script>\n");
 
  }

      out.write("\n");
      out.write("\n");
      out.write("</thead>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");

}
catch(Exception e){out.println(e.getMessage());}


      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
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
