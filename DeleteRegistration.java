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

@WebServlet("/deleteReg")
public class DeleteRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public DeleteRegistration() {
        super();
    }
   @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do Get");

	}
   @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   String email = request.getParameter("emailId");
  try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/augdb","root","test");
	         Statement stmn= con.createStatement();
	         stmn.executeUpdate("Delete from registration where email='"+email+"'");
             con.close();
  } catch (Exception e) {
       e.printStackTrace();
    }

   }

}
