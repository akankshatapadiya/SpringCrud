<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
th{
 align-content: center;
 column-span: 2;
}

</style>
</head>
<body>
	<div style="color:red">${errorMsg}</div>
	<form action="authenticate.do">
    	<table>
    		<tr>
	    		<th>Username</th>
	    		<td><input type="text" name="username"></td>
			</tr>
			<tr>
	    		<th>Password</th>
	    		<td><input type="password" name="password"></td>
			</tr>
			<tr>
	    		<th><input type="submit"></th>
			</tr>
		</table>
	</form>
</body>
</html>