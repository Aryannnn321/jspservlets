package com.movieapp.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session =request.getSession();
		PrintWriter writer =response.getWriter();
		writer.print(session.getId());
		writer.print("SessionId"+session.getCreationTime()+"<br>");
		writer.print("Maxinactive"+session.getMaxInactiveInterval());
		response.setContentType("text/html");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		if(username.equals("Arya")&&password.equals("arya")) {
			session.setAttribute("username",username);
			RequestDispatcher dispatcher =request.getRequestDispatcher("logsuccess.jsp");
			dispatcher.forward(request, response);	
		}
		else{
			response.sendRedirect("index.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
