<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Attend Page</title>
<link href="<c:url value="/resources/style1.css" />" rel="stylesheet">
</head>
<body>
<center>
	<h2>Welcome to Home Page, ${username}</h2>
	<div class="c">
		<div class="fm">
			<form action="signIn" class="vb" method="post">
				<button type="submit">Sign In</button>
			</form>
			<form action="viewReport" method="get">
				<button type="submit">View Report</button>
			</form>
		</div>
		<div class="ft">
		    <span>${msg}</span>
			<form action="signOut" class="vd" method="post">
				<button type="submit">Sign Out</button>
			</form>
			<form action="viewReport" method="get">
				<button type="submit">View Report</button>
			</form>
		</div>
	</div>
	

	</center>
</body>
</html>