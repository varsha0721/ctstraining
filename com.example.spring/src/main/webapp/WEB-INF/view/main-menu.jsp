<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>spring hello world page</title>
</head>
<body>
<h3> welcome to spring mvc</h3>
<h3> i am in main menu</h3>
<a href="${pageContext.request.contextPath}/student/showForm">Show Form</a>
<h3> going to student controller class</h3>
</body>
</html>