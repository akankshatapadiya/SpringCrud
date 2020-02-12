<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color: orange;">Akshuuu Lets sing one song for me!!!</h1>
	<table>
		<tr>
			<th>Employee ID</th>
			<th>Employee Names</th>
		</tr>
		<!-- Repeat this lines -->
		<c:forEach items="${empList}" var="emp">
		<tr>
			<td>${emp.empNo}</td> <!-- empNo==> Property Name/variable name -->
			<td>${emp.empName}</td><!-- empName==> Property Name/variable name -->
		</tr>
		</c:forEach>
		<!-- End Repeat -->
	</table>
</body>
</html>