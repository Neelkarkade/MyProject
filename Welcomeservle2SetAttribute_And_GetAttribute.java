package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sixth")
public class Welcomeservle2SetAttribute_And_GetAttribute extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public Welcomeservle2SetAttribute_And_GetAttribute() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("neme ");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name =(String) request.getAttribute("x");

		System.out.println("neme ");

	}

}
