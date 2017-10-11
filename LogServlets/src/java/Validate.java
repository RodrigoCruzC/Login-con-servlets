
import java.sql.*;

public class Validate
 {
     public static boolean checkUser(String email,String pass) 
     {
      boolean st =true;
      try{

	 
         Class.forName("com.mysql.jdbc.Driver");

 	 
         Connection con=DriverManager.getConnection
                        ("jdbc:mysql:/ /localhost:3306/test","root","n0m3l0");
         PreparedStatement ps =con.prepareStatement
                             ("select * from register where emaill= "+email+"and passs= "+pass+";");
         ps.setString(1, email);
         ps.setString(2, pass);
         ResultSet rs =ps.executeQuery();
         st = rs.next();
        
      }catch(Exception e)
      {
          e.printStackTrace();
      }
         return st;                 
  }   
}
