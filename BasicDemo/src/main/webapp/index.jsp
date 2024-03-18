<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Basic">
		enter name<input type="text" name="employeeName"><br>
		enter city<input type="text" name="city"><br> enter
		salary<input type="text" name="salary"><br> enter mobile<input
			type="text" name="mobile"><br> courses<select
			name="course">
			<option value="java">java</option>
			<option value="spring">spring</option>
			<option value="html">html</option>
		</select> Hobby <input type="checkbox" name="hobbies" value="sports">sports <input
			type="checkbox" name="hobbies" value="music">music <input type="checkbox"
			name="hobbies" value="dance">dance <input type="checkbox" name="hobbies" value="travel">travel
		<input type="submit" value="submit">
	</form>
</body>
</html>