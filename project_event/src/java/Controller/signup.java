
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Modal.*;

public class signup extends HttpServlet {

  
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
       PrintWriter out=response.getWriter();
         try
         {
         String Email=request.getParameter("email");
         String Password=request.getParameter("psw");
         String name=request.getParameter("name");
         
         userDAO ld=new userDAO();
           if(ld.save(Email, Password, name))
        {
            out.println("<script type=\"text/javascript\">");
         out.println("alert('Signup Successful');");
         out.println("location='login.html';");
         out.println("</script>");
        }
        else
        {
         out.println("<script type=\"text/javascript\">");
         out.println("alert('Signup Failed');");
         out.println("location='signup.html';");
         out.println("</script>");
        }
    }
    catch(Exception e)
    {
        out.println(e + "<br>");
    }
    }
}