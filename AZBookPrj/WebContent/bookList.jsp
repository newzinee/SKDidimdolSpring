<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BookList</title>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<style type="text/css">
	.insert {
		font-size: 20px;
		margin-right: 50px;
	}
</style>
</head>
<body>
	<div id="title" class="container">
		<h1>내가 읽은 책 목록</h1>
	</div>
	<div class="insert container col-md-offset-10 col-md-1">
		<a href="insertBookForm.do">등록</a>
	</div>
	<div class="container">
		<table class="table">
			<tr>
				<th>#</th>
				<th>제목</th>
				<th>지은이</th>
				<th>한 줄 요약</th>
				<th>쪽수</th>
				<th></th>
				<th></th>
			</tr>
			<c:forEach var="book" items="${ bookList }">
				<tr>
					<td>${ book.seq }</td>
					<td>${ book.title }</td>
					<td>${ book.author }</td>
					<td>${ book.summary }</td>
					<td>${ book.page }</td>
					<td><a href="updateBookForm.do?seq=${ book.seq }">수정</a></td>
					<td><a href="deleteBook.do?seq=${ book.seq }">삭제</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>