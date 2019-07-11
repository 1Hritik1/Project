import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect 
{
    Connection cn;
    public static Connection ConnecrDb()
    {
       try
       {
           Class.forName("com.mysql.jdbc.Driver");
           Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?","root","1234");
           return cn;
       }catch(Exception e)
       {
          JOptionPane.showMessageDialog(null,e);
          return null;
       }
    }
}
