package comm.registrationapp.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.registrationapp.model.DAOServiceImpl;

@WebServlet("/update")
public class UpdateRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public UpdateRegistrationController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
    System.out.println(email);
	System.out.println(mobile);
	request.setAttribute("email",email);
	request.setAttribute("mobile",mobile);
	
 	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/update_registration.jsp");
   	rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		DAOServiceImpl service = new DAOServiceImpl();
		service.connectDB();
		service.updateRegistration(email,mobile);
		  
		ResultSet res = service.readAllReg();
		   	
		   	request.setAttribute("res", res);
		   	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/list_registrations.jsp");
		   	rd.forward(request, response);
	}

}
