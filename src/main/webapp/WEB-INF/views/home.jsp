<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is home page</title>
</head>
<body>
<h1>This Is Homepages</h1>
<% 
String name = (String) request.getAttribute("name");
int id = (Integer) request.getAttribute("id");
%>
Mera Naam Hai <%= name %><br><br>
Mera Id Hai <%= id %>
</body>

</html>