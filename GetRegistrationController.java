package comm.registrationapp.controller;

import java.io.IOException;
import java.sql.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.protocol.Resultset;

import comm.registrationapp.model.DAOServiceImpl;

@WebServlet("/allReg")
public class GetRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public GetRegistrationController () {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession(false);
		session.setMaxInactiveInterval(10);
		if(session.getAttribute("email")!=null) {
		
	DAOServiceImpl service = new DAOServiceImpl();
	service.connectDB();
	ResultSet res = service.readAllReg();
	
	request.setAttribute("res", res);
	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/list_registrations.jsp");
	rd.forward(request, response);
	}else {
		request.setAttribute("msg","session Expired. login Again!!");
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	}
