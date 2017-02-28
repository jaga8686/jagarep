
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DbConnect {
	
	private final static String DB_URL = "jdbc:mysql://127.0.0.1:3306/jaga_1";
	 private final static String USER = "root";
	 private final static String PASS = "root";

	 public static void main(String[] args) {
	   Connection conn = null;  
	   System.out.println("jaga");
	   try {    
	     Class.forName("com.mysql.jdbc.Driver"); 
	     System.out.println("Connecting to database...");    
	     conn = DriverManager.getConnection(DB_URL,USER,PASS);    
	     System.out.println("ok");
	     
	     String sql="SELECT *FROM students";
	     PreparedStatement stmt = conn.prepareStatement(sql);
	    // stmt.setString( 1, "1");
	     ResultSet rs = stmt.executeQuery();
	     while (rs.next()) {
	   String userid = rs.getString("no");
	   	String username = rs.getString("name");
	   	String age=rs.getString("age");
	   	System.out.println(userid);
	   	System.out.println(username);
	   	System.out.println(age);
	   	
	   	}
	     
	   } catch (Exception e) {    
	     e.printStackTrace();    
	   } finally {    
	     if (conn != null) {    
	       try {    
	         conn.close();    
	       } catch (SQLException e) {    
	         // ignore    
	       }    
	     }    
	   }            
	 } 
}
