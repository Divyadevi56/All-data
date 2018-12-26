<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b>welcome</b>
<br/>
<%! 
private static int count=0; 
public void countVisit()
{
	count++;
}
%>

<%
countVisit();

%>

visitor count:&nbsp;&nbsp;&nbsp;<%= count  %>
<br/>


<% try{ int a=10/0; }
catch(Exception e) {
System.out.println("error"); } %>
<%@include file="page.jsp" %>

</body>
</html>