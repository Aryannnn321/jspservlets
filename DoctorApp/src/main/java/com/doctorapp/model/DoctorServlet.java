package com.doctorapp.model;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.empapp.model.Employee;

/**
 * Servlet implementation class DoctorServlet
 */
@WebServlet("/Doctor")
public class DoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoctorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String doctorName=request.getParameter("doctorName");
		String id=request.getParameter("doctorId");
		Integer doctorId=Integer.parseInt(id);
		String speciality=request.getParameter("speciality");
		String fee=request.getParameter("fees");
		double fees= Double.parseDouble(fee);
		Doctor doctor =new Doctor();
		doctor.setDoctorId(doctorId);
		doctor.setSpeciality(speciality);
		doctor.setDoctorName(doctorName);
		doctor.setFees(fees);
		
		request.setAttribute("doctor", doctor);
		RequestDispatcher dispatcher =request.getRequestDispatcher("docsuccess.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
