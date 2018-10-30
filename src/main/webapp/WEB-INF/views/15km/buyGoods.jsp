<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/register/toOutput" method="POST">

	<label for="1">商品1:</label>
		<input type="text" name="goods1" id="1">円<br>
		
	<label for="2">商品2:</label>
		<input type="text" name="goods2" id="2">円<br>
		
	<label for="3">商品3:</label>
		<input type="text" name="goods3" id="3">円<br>
	
	<input type="submit" value="購入">
	
</form>
</body>
</html>