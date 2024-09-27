<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
if(session.getAttribute("uname")==null){
	response.sendRedirect("hello.html");
}
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.setHeader("Pragma", "no-cache"); 
response.setDateHeader("Expires", 0);

%>
   <h2>User Information</h2>
    <p>Name: ${uname}</p>
    <p>Age: ${age}</p>
    <p>Gender: ${gender}</p>
    <p>Email: ${email}</p>
<form action="LogOutServlet" method="post">
	<input type="submit" value="LogOut">
</form>
</body>
</html>