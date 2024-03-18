<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
out.println("SessionId"+session.getId()+"<br>");
out.println("Maxinactive"+session.getMaxInactiveInterval()+"<br>");
String username=(String)session.getAttribute("username");
session.setMaxInactiveInterval(1);
out.println("welcome"+username+"<br>");
%>
<form action="movieServlet">
	select language
	<select name="language">
	<option value="english">english</option>
	<option value="kannada">kannada</option>
	<option value="hindi">hindi</option>
	<option value="tamil">tamil</option>
	</select>
	<input type="submit" value="submit">
</form>

</body>
</html>