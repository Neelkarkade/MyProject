package p1;

import java.sql.*;
import java.util.Scanner;

public class CreatedMobileNumberUpdateingFromMysql {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your Email id:");
			String email = scan.next();
			System.out.println("Enter your mobile number:");
			String mobile = scan.next();
			//Connect to database
			//Use augdb ----SQL
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/augdb","root","test");
			System.out.println(con);
			//Execute sql Query
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate
		("UPDATE registration SET mobile = '"+mobile+"' WHERE email='"+email+"'");
			
			//Close Database connection
			con.close();
		} catch ( Exception e) {
            e.printStackTrace();		
       }
	}

}
