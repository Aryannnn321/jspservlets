<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="errorHandler.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>user details</h2>
<%
String employeeName =(String)request.getAttribute("employeeName");
String city =(String)request.getAttribute("city");
double salary =(Double)request.getAttribute("salary");
String course =(String)request.getAttribute("course");
long mobileNum =(Long)request.getAttribute("mobileNum");
String[] hobbies =(String[])request.getAttribute("hobbies");

out.println("Name"+employeeName+"<br>");

out.println("city:"+city+"<br>");
out.println("salary"+salary+"<br>");
out.println("mobileNum,"+mobileNum+"<br>");
out.println("hobbies");
for(String hobby:hobbies){
	out.println("hobby:"+hobby.toUpperCase()+"<br>");
}

%>

</body>
</html>