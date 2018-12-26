<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
1
2<br/>
<!-- 
Login l=new Login();
l.setUsername("bow");
l.setPassword("meow");
 -->
<jsp:useBean id="l" class="com.cg.Login" scope="request"></jsp:useBean>
<jsp:setProperty property="username" value="bow" name="l"/>
<jsp:setProperty property="password" value="meow" name="l"/>
<jsp:forword page="b.jsp">
<jsp:param value="bowbow" name="name"/>
</jsp:forword>
3
4
5
</body>
</html>