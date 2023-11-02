import java.sql.*;

public class PerformSQL_Operation {
public static void main(String[] args) {
	try {
		//connection to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/neel_demo_db", "root", "test");
		//  perform SQL Operations
		Statement stmnt = con.createStatement();
		stmnt.executeUpdate("insert into registration values ('stallin','chennai','stallin@gmail.com',' 96326455')");
			//      close
		con.close();
		
	} catch (Exception e) {
	     e.printStackTrace();
	}
}
}