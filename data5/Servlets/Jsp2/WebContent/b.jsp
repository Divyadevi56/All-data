<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
10
20
30<br/>
<jsp:useBean id="l" class="com.cg.Login" scope="request"></jsp:useBean>
<jsp:getProperty property="username" value="bow" name="l">

<jsp:getProperty property="password" value="bow" name="l"> 
</body>
</html>