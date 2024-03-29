package com.voya.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BasicDemo
 */
@WebServlet("/Basic")
public class RegisterServelets extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] hobby1;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServelets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String employeeName =request.getParameter("employeeName");
		String city=request.getParameter("city");
		String sal=request.getParameter("salary");
		double salary= Double.parseDouble(sal);
		String mob=request.getParameter("salary");
		long mobileNum= Long.parseLong(mob);
		String course =request.getParameter("course");
		String [] hobbies=request.getParameterValues("hobbies");
	
		request.setAttribute("employeeName", employeeName);
		request.setAttribute("city", city);
		request.setAttribute("salary", salary);
		request.setAttribute("course", course);
	
		request.setAttribute("mobileNum", mobileNum);
		request.setAttribute("hobbies", hobbies);
		PrintWriter writer=response.getWriter();
		writer.print("this is from services");
		RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
		dispatcher.forward(request,  response);
//		response.sendRedirect("success.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
