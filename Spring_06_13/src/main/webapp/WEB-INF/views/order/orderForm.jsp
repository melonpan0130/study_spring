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
		String content = request.getContextPath();
	%>
	<form action="<%= content%>/order/orderCompletion" method="post">
		상품1 : <input type="text" name="orderItems[0].itemId"/>
		개수 : <input type="text" name="orderItems[0].number"/>
		주의 : <input type="text" name="orderItems[0].remark"/>
		<br>
		상품1 : <input type="text" name="orderItems[0].itemId"/>
		개수 : <input type="text" name="orderItems[0].number"/>
		주의 : <input type="text" name="orderItems[0].remark"/>
		<br>
		상품1 : <input type="text" name="orderItems[0].itemId"/>
		개수 : <input type="text" name="orderItems[0].number"/>
		주의 : <input type="text" name="orderItems[0].remark"/>
		<br>
		우편번호 : <input type="text" name="orderItems[0].itemId"/>
		주소1 : <input type="text" name="orderItems[0].number"/>
		주소2 : <input type="text" name="orderItems[0].remark"/>
	</form>
</body>
</html>