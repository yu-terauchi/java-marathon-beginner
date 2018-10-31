<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>詳細情報</title>
</head>
<body>
	<h2>詳細情報</h2>
	名前:
	<c:out value="${userInfo.name}" /><br> 
	年齢:
	<c:out value="${userInfo.age}" /><br>
	 住所:
	<c:out value="${userInfo.address}" />
	
</body>
</html>