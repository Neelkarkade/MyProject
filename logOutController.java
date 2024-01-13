package comm.registrationapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logoutController")
public class logOutController   extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public logOutController() {
		super();
			}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		super.doPost(request, response);
		HttpSession session = request.getSession(false);
	 session.invalidate();
		
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
	   	rd.forward(request, response);
	}

	

}
