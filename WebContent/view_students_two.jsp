<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Student Details</title>
</head>
<body>
<h2 align="center" style="color:red;">Student Table Demo</h2>
<hr>
<div>
<table border="1">
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email Id</th>
</tr>
<c:forEach var="tempStudent" items="${studentList}">
<tr>
<td>${tempStudent.firstName}</td>
<td>${tempStudent.lastName}</td>
<td>${tempStudent.email}</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>