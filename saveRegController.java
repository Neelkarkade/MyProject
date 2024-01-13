package comm.registrationapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import comm.registrationapp.model.DAOServiceImpl;

@WebServlet("/saveReg")
public class saveRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public saveRegController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/new_registration.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		
		HttpSession session = request.getSession(false);
	session.setMaxInactiveInterval(10);
	if(session.getAttribute("email")!=null) {
		String name = request.getParameter("name");
	String city = request.getParameter("city");
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	
	
	
	DAOServiceImpl service = new DAOServiceImpl();
	service.connectDB();
	service.saveRegistration(name, city, email, mobile);
	request.setAttribute("msg", " Record is saved!!");
	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/new_registration.jsp");
	rd.forward(request, response);
	}else {
		request.setAttribute("msg","session Expired. login Again!!");
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}
	} catch (Exception e) {
		request.setAttribute("msg","session Expired. login Again!!");
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}
		
	}
}
