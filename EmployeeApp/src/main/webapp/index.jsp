<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="employeeServlet">
		enter name<input type="text" name="employeeName"><br>
		enter employeeId<input type="text" name="employeeId"><br> enter
		salary<input type="text" name="salary"><br>
		enter city<input type="text" name="city">
			enter courses<select
			name="course">
			<option value="java">java</option>
			<option value="spring">spring</option>
			<option value="html">html</option>
		</select> 
	
		<input type="submit" value="submit">
	</form>

</body>
</html>