<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><center>
<h1>Capgemini India Pvt. Ltd</h1>
<h3>${pageHead}</h3>
<form action="authenticate.hr" method="post">
<Table border="1">
<tr >
<td colspan="2" >Login</td>
</tr>
<tr ><td colspan="2" style="color:red">${userDetails.message}</td></tr>
<tr><th>User Name:</th><td><input type="text" name="userName"></td></tr>
<tr><th>Password:</th><td><input type="password" name="password"></td></tr>
<tr >
<td colspan="2" ><input type="submit" value="Submit"></td>
</tr>

</Table>
</form>
</center>
</body>
</html>