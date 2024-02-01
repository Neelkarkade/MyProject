package Finally;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PraticalExample_FinallyBloclCanUse {
public static void main(String[] args) {
	Connection con = null;
	try {
		
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/neel_demo_db", "root", "test");
		//  perform SQL Operations
				Statement stmnt = con.createStatement();
				stmnt.executeUpdate("insert into registration values('mike','chennai','mike@gmail.com','9632629033')");
	} catch (Exception e) {
		System.out.println(e);
	}finally {
		try {
			con.close();
		} catch (SQLException e2) {
			
			e2.printStackTrace();
		}
		
		
	}
}
}
