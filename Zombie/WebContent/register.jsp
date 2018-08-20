<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="<c:url value="/css/bootstrap.min.css" />">
<script src="<c:url value="/js/jquery.2.2.4.min.js" />"></script>
<title>Insert title here</title>
</head>
<body>
<jsp:include page="banner.jsp" />
<div class="container" style="margin-top:50px">
<h1>User Registration</h1><hr size="3" color="crimson">
<form action="register.do">
	<div class="alert alert-danger fade in">${Invalid}</div>
	<table class="table table-bordered">
		<tr><td>User ID</td>
			<td><input name="userId" required></td></tr>
		<tr><td>Password</td>
			<td><input type="password" name="password" required></td></tr>
		<tr><td>Email</td>
			<td><input type="email" name="email" required></td></tr>
		<tr><th colspan="2"><input type="submit" value="Register"></th></tr>
	</table>
</form>
</div>
</body>
</html>