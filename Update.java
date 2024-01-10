
import java.sql.*;

public class Update {
	public static void main(String[] args) {
		
	
	try {
		//connection to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/neel_demo_db", "root", "test");
		//  perform SQL Operations
		Statement stmnt = con.createStatement();
		stmnt.executeUpdate("UPDATE  registration SET mobile = '9632629033'WHERE email='stallin@gmail.com'");
			//      close
		con.close();
		
	} catch (Exception e) {
	     e.printStackTrace();
	}
}

}
