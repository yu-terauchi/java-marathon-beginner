<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>合計金額</h2>

	<h3>□税抜き価格</h3>
	<fmt:formatNumber value="${total}" />
	円
	<h3>□税込み価格</h3>
	<fmt:formatNumber value="${includeTax}" />
	円
</body>
</html>