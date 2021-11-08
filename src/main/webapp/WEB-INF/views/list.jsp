<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>데이터 리스트</title>
<style>
	*{box-sizing:border-box;}
	input{width: 100%;border:none;}
</style>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
	<h1 style="text-align:center;">MyBatis Test Data Table</h1>
	<table border=1 align="center" style="width: 500px;text-align:center;">
		<colgroup>
			<col width="30%">
			<col width="50%">
			<col width="20%">
		</colgroup>
		<tr>
			<th>title</th>
			<th>contents</th>
			<th>button</th>
		</tr>
		<c:forEach var="i" items="${list}">
			<tr>
				<td class="title">${i.title}</td>
				<td class="contents">${i.contents}</td>
				<td class="btns">
					<button class="btn_del" onclick="location.href='delete?title=${i.title}'">
						삭제
					</button>
					<button class="btn_modify">수정</button>
				</td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<form action="input" method="post" id="inputForm">
		<table border=1 align=center style="width: 500px;text-align:center;">
			<tr>
				<th colspan="2">Input</th>
			</tr>
			<tr>
				<td colspan="2"><input type="text" name="title" id="title" placeholder="Input title"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="text" name="contents" id="contents" placeholder="Input contents"></td>
			</tr>
			<tr>
				<td><a href="/">main</a></td>
				<td align=center>
					<button type="reset">취소</button>
					<button id="btn_inp">작성</button>
				</td>
			</tr>
		</table>
		<input type="hidden" name="ori_title" id="ori_title">
	</form>
	<script>
		$(function(){
			$(".btn_modify").on("click", function(){
				let title = $(this).parents(".btns").siblings(".title").text();
				let contents = $(this).parents(".btns").siblings(".contents").text();
				$("#btn_inp").text("수정");

				$("#title").val(title);
				$("#contents").val(contents);
				$("#ori_title").val(title);

				$("#inputForm").attr("action", "update");
			})
		});
	</script>
</body>
</html>