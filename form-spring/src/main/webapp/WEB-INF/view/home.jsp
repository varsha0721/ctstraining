<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processLogin" modelAttribute="user">
Email Address<form:input path="email"/><br/>
Password<form:password path="password" /><br/>
Country<form:select path="country">
 		<form:option value="uk" label="uk"/>  
        <form:option value="usa" label="usa"/>  
        <form:option value="india" label="india"/>  
        <form:option value="singapure" label="Amristarsingapure"/>  
        </form:select>  
        <br/>
Gender:
Male<form:radiobutton path="sex" value="Male"/>  
Female<form:radiobutton path="sex" value="Female"/>  
<input type="submit" value="login" />
</form:form>
</body>
</html>