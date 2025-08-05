package p1;

import java.sql.*;

public class DeleteingDataFromMysql {
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
		("DELETE FROM registration WHERE email='stallin@gmail.com'");
			
			//Close Database connection
			con.close();
		} catch ( Exception e) {
            e.printStackTrace();		
       }
	}

}
