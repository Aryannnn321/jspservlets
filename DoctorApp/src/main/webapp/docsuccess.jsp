<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="com.doctorapp.model.Doctor" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	Doctor doctor =(Doctor) request.getAttribute("doctor");
	String name=doctor.getDoctorName();
	out.print("doctor"+name+"<br>");
	String speciality =doctor.getSpeciality();
	out.print("speciality"+speciality+"<br>");
	Integer doctorId =doctor.getDoctorId();
	out.print("doctorId"+doctorId+"<br>");
	
	%>
</body>
</html>