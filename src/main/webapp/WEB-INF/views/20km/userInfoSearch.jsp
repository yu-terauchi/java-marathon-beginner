<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/search/toDaoToOutput" method="POST">
		<label for="id">ID:</label>
		<input type="text" name="id" id="id"><br>
		
		<input type="submit" value="検索">
	</form>
</body>
</html>