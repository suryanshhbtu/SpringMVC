<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is home page</title>
</head>
<body>
<h1>This Is AboutPage</h1>
<% 
String name = (String) request.getAttribute("name");
System.out.println("Name attribute from request: " + name);
%>
Mera Naam Hai <%= name %>
</body>

</html>