<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>Capgemini India Pvt. Ltd</h1>
<h3>${pageHead}</h3>
Welcome Mr./Ms. ${userDetails.fullName}<br/>

<a href="getEmpList.hr">1. view Employee List</a><br/>
<a href="insertNewEmp.hr">2. Insert new Employee</a><br/>

<br/>
<a href="index.jsp">Home</a><br/>
</center>
</body>
</html>