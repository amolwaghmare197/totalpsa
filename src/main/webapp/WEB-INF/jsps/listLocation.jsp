<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Location</title>
</head>
<body>
	<h2>All Location</h2>
	<hr>
	<table border="1">
		<thead>
			<tr>
				<th>id</th>
				<th>code</th>
				<th>name</th>
				<th>type</th>
				<th>delete</th>
				<th>update</th
			</tr>
		</thead>
		<c:forEach var="loc" items="${location}">
		
		<tbody>
			<tr>
				<td>${loc.id}</td>
				<td>${loc.code}</td>
				<td>${loc.name}</td>
				<td>${loc.type}</td>
				<td><a href="delete?id=${loc.id }">delete</a></td>
				<td><a href="update?id=${loc.id }">update</a></td>
			</tr>
		</tbody>
		
		</c:forEach>
		
	</table>
</body>
</html>