/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dikshant
 */
public class userDAO {
    String name;
        public boolean save(String Email,String Password,String Name)
    {
        String url="jdbc:mysql://localhost:3306/project?useSSL=false";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,"root","root");
            PreparedStatement pstmt=con.prepareStatement("insert into user values(?,?,?)");
            pstmt.setString(2,Email);
            pstmt.setString(3,Password);
            pstmt.setString(1,Name);
            
            if(pstmt.executeUpdate() > 0)
            {
                
                return true;
            }
            else {
                    return false;
                    }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
        return false;
    }
        
        public boolean validate(String Email,String Password)
    {
        String url="jdbc:mysql://localhost:3306/project?useSSL=false";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,"root","root");
            PreparedStatement pstmt=con.prepareStatement("select * from user where email=? AND password =?");
            pstmt.setString(1,Email);
            pstmt.setString(2,Password);
            ResultSet rs=pstmt.executeQuery();
            if(rs.next())
            {
                name=rs.getString(2);
                return true;
            }
            else {
                    return false;
                    }
        }
        catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
        return false;
    }
}
