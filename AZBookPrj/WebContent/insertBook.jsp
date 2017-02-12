<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>책등록</title>
</head>
<body>
	<div>
		<h1>책 등록</h1>
	</div>
	<div>
		<form method="POST" action="insertBook.do">
			<table>
				<tr>
					<td>제목</td>
					<td><input type="text" name="title" placeholder="책 제목"
						size="35"></td>
				</tr>
				<tr>
					<td>지은이</td>
					<td><input type="text" name="author" placeholder="지은이"
						size="35"></td>
				</tr>
				<tr>
					<td>요약</td>
					<td><input type="text" name="summary" placeholder="요약"
						size="35"></td>
				</tr>
				<tr>
					<td>쪽 수</td>
					<td><input type="number" name="page" placeholder="쪽 수" size="35"></td>
				</tr>
				<tr>
					<td><input type="submit" value="등록"></td>
					<td><a href="getBookList.do">취소</a></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>