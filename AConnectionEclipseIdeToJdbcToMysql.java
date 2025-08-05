package p1;

import java.sql.*;

public class AConnectionEclipseIdeToJdbcToMysql {
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
		("insert into registration values('adam','adam@gmail.com','9632629045')"); // inserting adding new table to datain mysql
			
			//Close Database connection
			con.close();
		} catch ( Exception e) {
            e.printStackTrace();		
       }
	}

}
