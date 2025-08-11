package com.studentapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentapp.model.DAOServiceImpl;


@WebServlet("/addInquiry")
public class InquiryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public InquiryController() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name = request.getParameter("name");
	     String email = request.getParameter("email");
	     String mobile = request.getParameter("mobile");
	     DAOServiceImpl service = new DAOServiceImpl();
	     service.connectDB();
	     service.createInquiry(name, email, mobile);
  	     
	     request.setAttribute("message", "saved!!");
	     RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/inquiry.jsp");
  	     rd.forward(request, response);

	}

}
