<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

if(session.getAttribute("username")!=null)
{
	

%>
<div>
welcome <%=session.getAttribute("username") %></div>
<form action="sentitem.jsp" method="post">
<input type="submit" value="Sent items">
</form>
<form action="Logout" method="post">

<input type="submit"  value="log out">

</form>
<%
} else {
	%>
	<jsp:forword page="error.jsp"/>
	<%
}
	%>
</body>
</html>