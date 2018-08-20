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
<form action="User.hola">
<table width="400" align="center">
	<tr><th colspan="2">Registration Form</th></tr>
	<tr><td>Name</td><td><input name="name" required></td></tr>
	<tr><td>Email ID</td><td><input name="email" required></td></tr>
	<tr><td>Password</td><td><input name="password" type="password" required></td></tr>
	<tr><td>Age</td><td><select name="age">
						<%	for(int a=18;a<=60;a++) { %>
							<option value="<%=a%>"><%=a%></option>
						<%	} %>
						</select></td></tr>
	<tr><td>Gender</td><td><input type="radio" name="gender" value="Male" checked>Male
							<input type="radio" name="gender" value="Female">Female</td></tr>
	<tr><td>City</td><td><select name="city">
						<%	String[] cities = {"Mumbai","Pune","Mangalore","Noida","Kanpur"};
							for(String ct : cities) {%>
							<option value="<%=ct%>"><%=ct%></option>
						<%	} %>
						</select></td></tr>
	<tr><td>Favourite Movie</td><td><input name="movie" required></td></tr>
	<tr><td>Photo</td><td><input type="file" name="photo"></td></tr>
	<tr><th colspan="2"><input type="submit" value="Register"></th></tr>
</table>
</form>
<%@ include file="footer.html" %>
</body>
</html>
