import java.sql.*;

public class TO_Read_RecordSQLEX1 {
public static void main(String[] args) {
	try {
		//connection to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/neel_demo_db", "root", "test");
		//  perform SQL Operations
		Statement stmnt = con.createStatement();
		stmnt.executeUpdate("insert into registration values('mike','chennai','mike@gmail.com','9632629033')");
			//      close
		con.close();
		
	} catch (Exception e) {
	     e.printStackTrace();
	}
}
}

