<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<table border="1">
<c:forEach items="${SearchList}" var="i">
<tr>
<td>${i.id}</td>
<td>${i.firstName}</td>
<td>${i.lastName}</td>
<td>${i.loginVO.username}</td>
<td>${i.loginVO.password}</td>
<td><a href="delete.html?id=${i.id}">Delete</a></td>
<td><a href="edit.html?id=${i.id}">Edit</a></td>
</c:forEach>
</table>
</body>
</html>