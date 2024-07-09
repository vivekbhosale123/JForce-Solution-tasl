<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>User Attendance Report</title>
</head>
<body>
    <h2>Attendance Report for ${username}</h2>
    <table border="1">
        <tr>
            <th>Date</th>
            <th>Sign In</th>
            <th>Sign Out</th>
        </tr>
        <c:forEach var="attend" items="${attendanceReport}">
            <tr>
                <td>${attend.date}</td>
                <td>${attend.signin}</td>
                <td>${attend.signout}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="homeAttendPage.jsp">Back</a>
</body>
</html>
