<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LOGIN PAGE</title>
<link href="<c:url value="/resources/style.css" />" rel="stylesheet">
</head>
<body>
	<center>
		<form name="frm" action="valid" method="post">
			<h1>LOGIN PAGE!</h1>
			<input type="text" name="username" placeholder="username" value=""> <br> <br> <input
				type="text" name="password" placeholder="password" value=""> <br> <br> <input
				type="submit" name="s" class="vp" value="Login">
		        <a href="register" >Register</a>
				<span>${msg}</span>
		</form>
	</center>
</body>
</html>
