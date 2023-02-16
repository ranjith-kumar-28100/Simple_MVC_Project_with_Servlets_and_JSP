<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student List</title>
</head>
<body>
<h1 align="center">Student Names</h1>
<ul>
<c:forEach var="tempStudent" items="${studentList}">
<li><i>${tempStudent}</i></li>
</c:forEach>
</ul>
</body>
</html>