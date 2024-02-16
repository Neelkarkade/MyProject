package com.web_app_6.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.web_app_6.model.Add;


@WebServlet("/addController")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AddController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		int num1 = Integer .parseInt (request.getParameter("num1"));
		int num2 = Integer .parseInt (request.getParameter("num2"));
        Add a = new Add();
       int result =a.addNumber(num1, num2);
       request.setAttribute("result", result);
       
       RequestDispatcher rd =request.getRequestDispatcher("add.jsp");
       rd.forward(request, response);
	}

}
