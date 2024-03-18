package com.voya.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServelets
 */
@WebServlet("/Login")
public class LoginServelets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     * 
     */
    public LoginServelets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		set the content type for the browser
		response.setContentType("text/html");
		//	get the values from the form fields
		String username =request.getParameter("username");
		String city=request.getParameter("city");
//		print in the browser using
		PrintWriter writer=response.getWriter();
		writer.print("<html><body>");
		writer.print("<html><bodu>");
		writer.print("welcome"+username+"<br>");
		writer.print("your city"+city);
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
