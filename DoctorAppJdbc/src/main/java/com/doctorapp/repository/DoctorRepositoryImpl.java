package com.doctorapp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.doctorapp.model.Doctor;
import com.doctorapp.util.DoctorDb;
import com.doctorapp.util.Queries;

public class DoctorRepositoryImpl  implements IDoctorRepository{
	  @Override
	    public void addDoctor(Doctor doctor) {
	        try (Connection connection= DoctorDb.openConnection();
	             PreparedStatement statement = connection.prepareStatement(Queries.InsertQuery);
	        ) {
	           statement.setString(1,doctor.getDoctorName());
	            statement.setString(2,doctor.getSpeciality());
	            statement.setInt(3,doctor.getExperience());
	            statement.setInt(4,doctor.getRatings());
	            statement.setDouble(5,doctor.getFees());
	            boolean result=statement.execute();
	            System.out.println("one row inserted"+!result);
	        }catch (Exception e){
	            e.printStackTrace();
	        }
	    }

	    @Override
	    public void updateDoctor(int doctorId, double fees) {

	    }

	    @Override
	    public void deleteDoctor(int doctorId) {

	    }

	    @Override
	    public Doctor findById(int doctorId) {

	        return null;
	    }

	    @Override
	    public List<Doctor> findAll() {
	        List<Doctor> doctors=new ArrayList<>();
	        try (Connection connection= DoctorDb.openConnection();
	             PreparedStatement statement = connection.prepareStatement(Queries.FINDALLQUERY);

	        ){
	            ResultSet resultSet=statement.executeQuery();
	            while(resultSet.next());
	            {
	                int doctorId = resultSet.getInt("doctor_id");
	                String doctorName = resultSet.getString("doctor_name");
	                String speciality = resultSet.getString("speciality");
	                int experience = resultSet.getInt("experience");
	                int ratings = resultSet.getInt("ratings");
	                double fees = resultSet.getInt("fees");
	                Doctor doctor=new Doctor( doctorId,doctorName,speciality, (double) experience,ratings, (int) fees);
	                doctors.add(doctor);
	            }

	        }catch (Exception e){
	            e.printStackTrace();
	        }
	        return null;
	    }

	    @Override
	    public List<Doctor> findBySpeciality(String speciality, int experience) {
	        List<Doctor> doctorList =new ArrayList<>();
	        try(Connection connection =DoctorDb.openConnection();
	            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECIALITY)
	        ) {
	           statement.setString(1,speciality);
	           try(ResultSet resultSet=statement.executeQuery();){
	               while ( resultSet.next()){
	                   String doctorName=resultSet.getString("doctor_name");
	                   int experience1= resultSet.getInt("experience1");
	                   int ratings=resultSet.getInt("ratings");
	                   int doctorId=resultSet.getInt("doctor_id");
	                   double fees=resultSet.getDouble("fees");
	                   Doctor doctor=new Doctor();
	                   doctor.setDoctorName(doctorName);
	                   doctor.setSpeciality(speciality);
	                   doctor.setExperience(experience);
	                   doctor.setRatings(ratings);
	                   doctor.setFees(fees);
	                   doctor.setDoctorId(doctorId);
	                   doctorList.add(doctor);
	               }
	           }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return doctorList;
	    }

	    @Override
	    public List<Doctor> findBySpecialityAndLeesFees(String speciality, double fess) {
	        List<Doctor> doctorList =new ArrayList<>();
	        try(Connection connection =DoctorDb.openConnection();
	            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECANDNAME)
	        ) {
	            statement.setString(1,speciality);
	            statement.setString(2,"%x"+fess+"%x");
	            try(ResultSet resultSet=statement.executeQuery();){
	                while ( resultSet.next()){


	                    Doctor doctor=new Doctor();
	                    doctor.setDoctorName(resultSet.getString("doctorName"));
	                    doctor.setSpeciality(resultSet.getString("speciality"));
	                    doctor.setExperience(resultSet.getInt("experience"));
	                    doctor.setRatings(resultSet.getInt("ratings"));
	                    doctor.setFees(resultSet.getInt("fees"));
	                    doctor.setDoctorId(resultSet.getInt("doctorId"));
	                    doctorList.add(doctor);
	                }
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return doctorList;

	    }

	    @Override
	    public List<Doctor> findBySpecialityAndRatings(String speciality, int ratings) {
	        List<Doctor> doctorList =new ArrayList<>();
	        try(Connection connection =DoctorDb.openConnection();
	            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECANDNAME)
	        ) {
	            statement.setString(1,speciality);
	            statement.setString(2,"%x"+ratings+"%x");
	            try(ResultSet resultSet=statement.executeQuery();){
	                while ( resultSet.next()){


	                    Doctor doctor=new Doctor();
	                    doctor.setDoctorName(resultSet.getString("doctorName"));
	                    doctor.setSpeciality(resultSet.getString("speciality"));
	                    doctor.setExperience(resultSet.getInt("experience"));
	                    doctor.setRatings(resultSet.getInt("ratings"));
	                    doctor.setFees(resultSet.getInt("fees"));
	                    doctor.setDoctorId(resultSet.getInt("doctorId"));
	                    doctorList.add(doctor);
	                }
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return doctorList;

	    }

	    @Override
	    public List<Doctor> findBySpecialityAndNameContains(String speciality, String doctorName) {
	        List<Doctor> doctorList =new ArrayList<>();
	        try(Connection connection =DoctorDb.openConnection();
	            PreparedStatement statement=connection.prepareStatement(Queries.FINDBYSPECANDNAME)
	        ) {
	            statement.setString(1,speciality);
	            statement.setString(2,"%x"+doctorName+"%x");
	            try(ResultSet resultSet=statement.executeQuery();){
	                while ( resultSet.next()){


	                    Doctor doctor=new Doctor();
	                    doctor.setDoctorName(resultSet.getString("doctorName"));
	                    doctor.setSpeciality(resultSet.getString("speciality"));
	                    doctor.setExperience(resultSet.getInt("experience"));
	                    doctor.setRatings(resultSet.getInt("ratings"));
	                    doctor.setFees(resultSet.getInt("fees"));
	                    doctor.setDoctorId(resultSet.getInt("doctorId"));
	                    doctorList.add(doctor);
	                }
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return doctorList;
	    }

}
