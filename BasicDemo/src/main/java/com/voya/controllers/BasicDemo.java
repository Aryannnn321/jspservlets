package com.voya.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BasicDemo
 */
@WebServlet("/Basic")
public class BasicDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] hobby1;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BasicDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String username =request.getParameter("username");
		String city=request.getParameter("city");
		String sal=request.getParameter("salary");
		double salary= Double.parseDouble(sal);
		String mob=request.getParameter("salary");
		double mobile= Long.parseLong(mob);
		String course =request.getParameter("course");
		String [] hobby=request.getParameterValues("hobby");
		PrintWriter writer=response.getWriter();
		writer.print("<html><body>");
	
		writer.print("welcome"+username+"<br>");
		writer.print("your city"+city);
		writer.print("salary"+salary);
		writer.print("mobile"+mobile);
		writer.print("course"+course);
		
		for(String hobby1:hobby1) {
			writer.print("hobby"+hobby1);
		}
		writer.print("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
