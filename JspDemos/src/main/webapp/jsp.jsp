<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% request.setAttribute("message", "Great day"); %>
<%String message=(String)request.getAttribute("message");
out.println(message);
%>
<br>

<h1>Today is a ${message}</h1><br>
<c:out value=" Today is a ${message }"></c:out>
<c:set var="message" value="Good day" scope="session"></c:set>
${sessionScope.mess}
<c:out value="today is a${mess }"></c:out>
<%List<String> fruits=
	Arrays.asList("apple", "guava","mango","banana", "kiwi");
session.setAttribute("fruitsList", fruits);
%>
<h2>using EL</h2>
${fruitsList}<br>
<h2>using c:forEach</h2>
<c:forEach items="${fruitsList }" var="fruit" step="2">
${fruit }<br>
</c:forEach>
</body>
</html>