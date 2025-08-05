package p1;

import java.sql.*;

public class MobileNumberUpdateing {
	public static void main(String[] args) {
		try {
			//Connect to database
			//Use augdb ----SQL
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/augdb","root","test");
			System.out.println(con);
			//Execute sql Query
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate
		("UPDATE registration SET mobile = '9632629455' WHERE email='mike@gmail.com'"); // inserting adding new table to datain mysql
			
			//Close Database connection
			con.close();
		} catch ( Exception e) {
            e.printStackTrace();		
       }
	}

}
