package com.doctorapp.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
	
IDoctorService doctorservice =new DoctorServiceImpl();
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AddServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String doctorName=request.getParameter("doctorName");
	
		String speciality=request.getParameter("speciality");
		String fee=request.getParameter("fees");
		double fees= Double.parseDouble(fee);
		Doctor doctor =new Doctor();
		
		doctor.setSpeciality(speciality);
		doctor.setDoctorName(doctorName);
		doctor.setFees(fees);
		
//		request.setAttribute("doctor", doctor);
		RequestDispatcher dispatcher =request.getRequestDispatcher("adddoctor.jsp");
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
