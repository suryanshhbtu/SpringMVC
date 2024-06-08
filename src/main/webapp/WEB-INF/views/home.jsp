<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is home page</title>
</head>
<body>
	<h1>This Is Homepages</h1>
	<%
	int id = (Integer) request.getAttribute("id");
	List<String> list = (ArrayList) request.getAttribute("list");
	%>
	Mera Naam Hai
	${name}<br>
	<br> Mera Id Hai
	<%=id%><br>
	<br>
	<%
	for (String s : list) {
	%>
	<h1><%=s%></h1>
	<%
	}
	%>
</body>

</html>