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


@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public DeleteController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
       String email = request.getParameter("email");
    //   System.out.println(email);
       DAOServiceImpl service = new DAOServiceImpl();
       service.connectDB();
       service.deleteByEmail(email);
       
       ResultSet res = service.readAllReg();
   	
   	request.setAttribute("res", res);
   	RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/list_registrations.jsp");
   	rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
