import java.sql.*;

public class Delete_TheRecord {
public static void main(String[] args) {


	
		try {
			//connection to database
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/neel_demo_db", "root", "test");
			//  perform SQL Operations
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("DELETE FROM registration WHERE email='stallin@gmail.comcondition;");
				//      close
			con.close();
			
		} catch (Exception e) {
		     e.printStackTrace();
		}
	}
}


