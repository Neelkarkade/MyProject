package com.studentapp.controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.studentapp.model.DAOServiceImpl;


@WebServlet("/deleteInquiry")
public class DeleteControllerInquiry extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteControllerInquiry() {
        super();

    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String email = request.getParameter("email");
            DAOServiceImpl service = new DAOServiceImpl();
            service.connectDB();
            service.deleteInquiry(email);
            
            ResultSet result = service.listInquiry();
            request.setAttribute("result", result);
            RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/list_inquiry.jsp");
            rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
