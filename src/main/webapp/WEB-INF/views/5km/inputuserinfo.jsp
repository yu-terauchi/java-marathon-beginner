<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/userInfo/toOutput" method="POST">

<label for="name">名前:</label>
	<input type="text" name="name" id="name"><br>
	
<label for="age">年齢:</label>
	<input type="text" name="age" id="age"><br>
	
<label for="address">住所:</label>
	<input type="text" name="address" id="address"><br>

<input type="submit" value="送信">
</form>
</body>
</html>