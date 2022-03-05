<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>location</title>
</head>
<body>
<h2> Location | Update Location</h2>
<form action="updateLead" method="post">
<pre>
id<input type="number" name="id" value="${location.id }">
code<input type="number" name="code">
name<input type="text" name="name">
type:
ruler:<input type="radio" name="type" value="ruler">
urban:<input type="radio" name="type" value="urban">
<input type="submit" value="save"></pre>
</form>
${msg}
</body>
</html>