import java.sql.*;

public class Execute_QueryEX2 {
public static void main(String[] args) {
	try {
		//connection to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/neel_demo_db", "root", "test");
		//  perform SQL Operations
		Statement stmnt = con.createStatement();
		
		ResultSet result = stmnt.executeQuery("select* from registration");//Exe Query SHutcut key
		
		while (result.next()) {
			
			System.out.println(result.getString(1));
			System.out.println(result.getString(2));
			System.out.println(result.getString(3));
			System.out.println(result.getString(4));
		}
		
			//      close
		con.close();
		
	} catch (Exception e) {
	     e.printStackTrace();
	}
}
}

