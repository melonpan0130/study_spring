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
		��ǰ1 : <input type="text" name="orderItems[0].itemId"/>
		���� : <input type="text" name="orderItems[0].number"/>
		���� : <input type="text" name="orderItems[0].remark"/>
		<br>
		��ǰ1 : <input type="text" name="orderItems[0].itemId"/>
		���� : <input type="text" name="orderItems[0].number"/>
		���� : <input type="text" name="orderItems[0].remark"/>
		<br>
		��ǰ1 : <input type="text" name="orderItems[0].itemId"/>
		���� : <input type="text" name="orderItems[0].number"/>
		���� : <input type="text" name="orderItems[0].remark"/>
		<br>
		�����ȣ : <input type="text" name="orderItems[0].itemId"/>
		�ּ�1 : <input type="text" name="orderItems[0].number"/>
		�ּ�2 : <input type="text" name="orderItems[0].remark"/>
	</form>
</body>
</html>