package p1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fifth")
public class Welcomeservle1SetAttribute_And_GetAttribute extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Welcomeservle1SetAttribute_And_GetAttribute() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	String name = request.getParameter("name");
	request.setAttribute("x",name);
		RequestDispatcher rd = request.getRequestDispatcher("second");//1st will run (Do post)
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
