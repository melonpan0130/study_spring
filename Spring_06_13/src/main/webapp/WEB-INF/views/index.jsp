<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	String context = request.getContextPath();
%>
	<form action="<%= context %>/studentView" method="post">
		<label>name : </label><input type="text" name="name"><br>
		<label>age : </label><input type="text" name="age"><br>
		<label>grade : </label><input type="number" name="gradeNum" min="1" max="3"><br>
		<label>class : </label><input type="number" name="classNum" min="1" max="6"><br>
		<input type="submit" value="submit">
	</form>
</body>
</html>