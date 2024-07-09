<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Report Page</title>
</head>
<body>
<table border="1">
        <tr>
            <th>User ID</th>
            <th>Username</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Attendance Report</th>
        </tr>
        <c:forEach var="user" items="${allUsers}">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.emailId}</td>
                <td>${user.phoneNo}</td>
                <td><a href="viewReport?userId=${user.id}">View Report</a></td>
            </tr>
        </c:forEach>
    </table>
    <a href="/">Logout</a>
</body>
</html>