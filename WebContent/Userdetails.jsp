<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.app.component.User"%>
<% User user = (User)session.getAttribute("user");%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<title>User Details</title>
</head>
<body>
	<div class="container">
		<div class="form-group">
			<label for="text">User Name</label> <label for="text"> <%=user.getDisplayName() %></label>
		</div>
		<div class="form-group">
			<label for="email">Email:</label> <label for="text"><%=user.getEmail() %></label>
		</div>
		<div class="form-group">
			<label for="locality">Area</label> <label for="text"><%=user.getLocality() %></label>
		</div>
	</div>

	<script src="bootstrap/js/jquery.min.js"></script>
	<script src="bootstrap/js/bootstrap.min.js"></script>
</body>
</html>