/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modal;

import static java.lang.Character.UnicodeBlock.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dikshant
 */
public class adminDAO {
    
    
    String name;
    public boolean validate(String Email,String Password) 
    {
        String url="jdbc:mysql://localhost:3306/project?useSSL=false";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(url,"root","root");
            PreparedStatement pstmt=con.prepareStatement("select * from admin where email=? AND password =?");
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
            System.err.println(e);
        }
        return false;
    }
    public boolean saveuser()
    {
        return false;
    }
    public String getName()
    {
        return name;
    }
}
