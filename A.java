import java.sql.*;

public class A {
	public static void main(String[] args) {
		
		//Connect to database
		try {
			

			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/neel_demo_db", "root", "test");
			System.out.println(con);
			
			
		} catch (Exception e) {
			
		}
		
		//perform sql Operation
		
		//close the connecction
		
	}

}