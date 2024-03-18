package com.doctorapp.repository;

import java.util.List;

import com.doctorapp.model.Doctor;

public interface IDoctorRepository {

	List<Doctor> findBySpecialityAndRatings(String speciality, int ratings);

	List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName);

	List<Doctor> findBySpecialityAndLeesFees(String speciality, double fess);

	void addDoctor(Doctor doctor);

	void updateDoctor(int doctorId, double fees);

	void deleteDoctor(int doctorId);

	Doctor findById(int doctorId);

	List<Doctor> findAll();

	List<Doctor> findBySpeciality(String speciality, int experience);

}
