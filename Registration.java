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

@WebServlet("/RegPage")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Registration() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String city=request.getParameter("city");
		String email=request.getParameter("email");
		String mobno=request.getParameter("mobno");
		System.out.println(name);
		System.out.println(city);
		System.out.println(email);
		System.out.println(mobno);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","test");
			Statement stmt=con.createStatement();
			stmt.executeUpdate("insert into student values ('"+name+"','"+city+"','"+email+"','"+mobno+"')");
			con.close();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

}
