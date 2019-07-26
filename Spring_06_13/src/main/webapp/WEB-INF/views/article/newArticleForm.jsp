<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>new article form</title>
</head>
<body>
	<%
		String context = request.getContextPath();
	%>
	<form method="post" action="<%= context %>/article/newArticleSubmitted">
		<label>title : </label><input type="text" name="title">
		<label>content : </label><textarea name="content"></textarea>
		<input type="submit" value="submit">
	</form>
</body>
</html>