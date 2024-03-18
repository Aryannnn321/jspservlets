<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"errorPage="errorHandler.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to JS</h1>
<% String name ="Virat";%>
<%="welcome"+name %>
<%int x=10, y=20; %>
<%="sum"+(x+y) %>
<%!int counter=1; %>
<%=counter++ %>
<%int a =10/0; %>
<%! String greet(){
	return "welcome back";}%>
<%=greet() %>
</body>
</html>