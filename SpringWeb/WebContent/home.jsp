<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="coral" text="honeydew">
<h1>Login Screen</h1><hr size="3" color="gold">
<form action="login.go">
	<font color="red">${Invalid}</font>
	<table border="2">
		<tr><td>Email ID</td>
			<td><input type="email" name="email" required></td></tr>
		<tr><td>Password</td>
			<td><input type="password" name="password" required></td></tr>
		<tr><th colspan="2"><input type="submit" value="Login"></th></tr>
	</table>
</form>
</body>
</html>