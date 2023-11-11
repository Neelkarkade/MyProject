package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read5Reg")
public class RegistrationBuildOneTable extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Object stmnt;
   
    public RegistrationBuildOneTable() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	out.print("<table border='1'>");
	out.print("<tr>");
	out.print("<th>");
	out.print("Name");
	out.print("</th>");
	out.print("<th>");
	out.print("City");
	out.print("</th>");
	out.print("<th>");
	out.print("Email");
	out.print("</th>");
	out.print("<th>");
	out.print("Mobile");
	out.print("</th>");
	out.print("</tr>");
	
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentinfo","root","test");
		Statement stmt=con.createStatement();
		ResultSet result  = stmt.executeQuery("Select * from student");
	 while(result.next()){
		  out.print("<tr>");
		  
			out.print("<td>");
			out.print(result.getString(1));
			out.print("</td>");
			
			out.print("<td>");
			out.print(result.getString(2));
			out.print("</td>");
			
			out.print("<td>");
			out.print(result.getString(3));
			out.print("</td>");
			
			out.print("<td>");
			out.print(result.getString(4));
			out.print("</td>");
			
			out.print("</tr>");
	 }
	 out.print("</table>");
	System.out.println("Suc");
	 con.close();
	 } 
	  catch (Exception e) {
		e.printStackTrace();
	} 
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		// TODO Auto-generated method stub
  System.out.println("Post");
	}
}


