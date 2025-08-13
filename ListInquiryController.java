package com.studentapp.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.studentapp.model.DAOServiceImpl;


@WebServlet("/ListInquiry")
public class ListInquiryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
        public ListInquiryController() {
        super();

        }



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
 	   session.setMaxInactiveInterval(10);
		if(session.getAttribute("email")!=null) {
			   DAOServiceImpl service = new DAOServiceImpl();
		       service.connectDB();
		       ResultSet result = service.listInquiry();
		       request.setAttribute("result", result);
		       RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/list_inquiry.jsp");
		       rd.forward(request, response);
		}else {
			 RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
	  	     rd.forward(request, response);
		}

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
