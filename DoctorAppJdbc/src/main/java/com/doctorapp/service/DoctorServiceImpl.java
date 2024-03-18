package com.doctorapp.service;

import java.util.List;

import com.doctorapp.exception.DoctorNotFoundException;
import com.doctorapp.exception.IdNotFoundException;
import com.doctorapp.model.Doctor;

public class DoctorServiceImpl implements IDoctorService {

	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateDoctor(int doctorId, double fees) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDoctor(int doctorId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Doctor getById(int doctorId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpeciality(String speciality) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpecialityAndExp(String speciality, int experience) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpecialityAndLeesFees(String speciality, double fess) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpecialityAndRatings(String speciality, int ratings) throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Doctor> getBySpecialityAndNameContains(String speciality, String doctorName)
			throws DoctorNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
