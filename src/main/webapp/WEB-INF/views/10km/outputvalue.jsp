<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>計算</title>
</head>
<body>
<c:out value="${num1}"/>
×
<c:out value="${num2}"/>
=
<c:out value="${num1 * num2}"/>
<br>
<a href="/calc/toOutput2">次へ</a>
</body>
</html>