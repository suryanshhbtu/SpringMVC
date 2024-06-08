<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is HELP page</title>
</head>
<body>
	<h1>This Is HelpPages</h1>
	<%-- <%
	String name = (String) request.getAttribute("name");
	int id = (Integer) request.getAttribute("id");
	LocalDateTime time = (LocalDateTime) request.getAttribute("time");
	%> --%>
	Mera Naam Hai ${name}
	<br>
	<br> Mera Id Hai : ${id}
	<br>
	<br> abhi ka time :
	<h1>${ time}</h1>
</body>

</html>