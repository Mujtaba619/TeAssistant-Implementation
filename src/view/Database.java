package view;
import java.sql.*;
public class Database {
    Connection con;
    Statement stm;
    Database()
    {
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/teacherassistant","root","");
            stm=con.createStatement();
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }
            
            
    
}
