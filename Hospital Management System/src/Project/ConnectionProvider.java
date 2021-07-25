
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Project;
import java.sql.*;

/**
 *
 * @author manis
 */
public class ConnectionProvider {
    public static Connection getCon() throws SQLException, ClassNotFoundException{
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
           // Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/hospital","root","");
            //  Connection con=DriverManager.getConnection("jdbc:mysql:///hospital","root","");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","anuragshka");
            Statement st=con.createStatement();
            return con;
            
        }
        catch(Exception e)
        {
           return null;   
        }
        
    }
        
    
}
