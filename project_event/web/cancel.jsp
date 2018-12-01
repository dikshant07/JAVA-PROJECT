<%@ page language="java" import="java.sql.*" %>

 <body background = "blur.jpg">
<%
   try{
        String uid=request.getParameter("cancel");
    Class.forName("com.mysql.jdbc.Driver");
               Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "root");
             //    ----- Connection Established ------

         PreparedStatement pst=con.prepareStatement("select ename from event where ename=?");
                pst.setString(1,uid);
         ResultSet rs=pst.executeQuery();
         if(rs.next())
         {
               
                pst=con.prepareStatement("delete from event where ename=?");
                        pst.setString(1,uid);
                if((pst.executeUpdate()) > 0)
                {
                        out.println("<br><br><br><br><center><h1>    "+uid+" EVENT is cancelled.  </h1></center> ");
                }
                else
                {
                        out.println("<br><br><br><br><center><h1>    "+uid+" CANNOT CANCEL THE EVENT </h1></center>  ");
                }
         }
         else
         {
                        out.println("<br><br><br><br><center><h1>    "+uid+" Event is now not scheduled.  </h1></center> ");
         }   
       }catch(Exception e)
       {
          out.println(e);
       }
%>



<p>
<center>
      "Your Event has been cancelled ! Please <a href='index.html'>Create another Event</a> if you want !!
</center>

</body>


