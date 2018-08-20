<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="banner.jsp" />

<%	if(request.getParameter("invalid") != null) { %>
	<font size="3" color="Red">Invalid Email ID / Password</font>
<%	} %>

<form action="User.hola">
<table width="300" align="center">
	<tr><th colspan="2">Login Screen</th></tr>
	<tr><td>Email ID</td><td><input name="email" required></td></tr>
	<tr><td>Password</td><td><input name="password" type="password" required></td></tr>
	<tr><th colspan="2"><input type="submit" value="Login"></th></tr>
	<tr><td colspan="2"><a href="forget.jsp">Forget Password! Change it</a></td></tr>
	<tr><td colspan="2"><a href="register.jsp">New User! Register Now</a></td></tr>
</table>
</form>

<%@ include file="footer.html" %>
</body>
</html>
