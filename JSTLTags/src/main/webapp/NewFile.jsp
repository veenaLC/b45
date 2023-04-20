<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="ser" class="bean.JSTL.User" scope="page"></jsp:useBean>
${ser.getFirstName()}
${ser.getLastName() }


<jsp:useBean id="gr" class="bean.JSTL.User" scope="page"></jsp:useBean>
${gr.getFirstName() }
${gr.getLastName() }


</body>
</html>