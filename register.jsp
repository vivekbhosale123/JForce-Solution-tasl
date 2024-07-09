<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link href="<c:url value="/resources/style.css" />" rel="stylesheet">
</head>
<body>

	<form name="frm" action="registerUser" class="n" method="get">
		<h1>Register PAGE!</h1>
		<input type="text" name="username" placeholder="username" value="">
		<br> <br> <input type="text" name="password"
			placeholder="password" value=""> <br> <br> 
			<input type="text" name="emailId" placeholder="emailId" value=""><br> <br> 
			<input type="text" name="phoneNo" placeholder="phoneNo" value=""><br> <br> 
			<a href="home">Login</a>
			 <input
			type="submit" name="s" class="vp" value="Register"> <br>
			<span>${msg}</span>
		<br>
	</form>
	
</body>
</html>