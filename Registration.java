package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Registration() {
        super();
    }
   @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do Get");

	}
   @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
String name = request.getParameter("firstName");	
String email = request.getParameter("emailId");
String mobile = request.getParameter("mobile");
System.out.println(name);
System.out.println(email);
System.out.println(mobile);
  try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/augdb","root","test");
	         Statement stmnt= con.createStatement();
	         stmnt.executeUpdate("insert into registration values ('"+name+"','"+email+"','"+mobile+"')");
             con.close();
  } catch (Exception e) {
       e.printStackTrace();
    }

   }

}
