<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>A web application in MVC Design Pattern | JDBC | CRUD Operation </h1>
<a href="<%=request.getContextPath() %>/InsertData?page=insertdata">CREATE Operation</a>
<br>
<a href="<%= request.getContextPath() %>/RetrieveData?page=retrievedata"> Retrieve Data</a>
<br>
<a href="<%=request.getContextPath() %>/UpdateData?page=updatedata">update Data</a>
<br>


</body>
</html>