<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>入力フォーム</title>
</head>
<body>
<form action="/calc/toOutput" method="POST">

<input type="text" name="num1">
×
<input type="text" name="num2">
<br>

<input type="submit" value="計算">

</form>
</body>
</html>