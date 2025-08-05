package p1;

import java.sql.*;
import java.util.Scanner;

public class CreateingNewDataInMySqlFromEclipseJdbc {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your name:");
			String name = scan.next();
			System.out.println("Enter your Email id:");
			String email = scan.next();
			System.out.println("Enter your mobile number:");
			String mobile = scan.next();
			
			
			Connection con = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/augdb","root","test");
			System.out.println(con);
			//Execute sql Query
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate
		("insert into registration values('"+name+"','"+email+"','"+mobile+"')"); // inserting adding new table to datain mysql
			
			//Close Database connection
			con.close();
		} catch ( Exception e) {
            e.printStackTrace();		
       }
	}

}
