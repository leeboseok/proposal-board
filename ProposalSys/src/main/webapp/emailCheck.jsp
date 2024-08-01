<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>이메일 중복 체크</title>
	</head>
	<body>
		<h1>이메일 중복 확인</h1>
		<form method="get" action="emailCheck.do" name="frm">
			Email : <input type="text" name="email" value="${email }">
			<input type="submit" value="중복확인!">
			<br>
			<c:if test="${result==1 }">
				${email }은 이미 사용중인 이메일입니다.
			</c:if>
			<c:if test="${result==-1 }">
				${email }은 사용가능합니다.
				<input type="button" value="사용하기" onclick="emailOk()">
			</c:if>
		</form>
		<script>
			function emailOk(){
				opener.document.frm.email.value=document.frm.email.value;
				opener.document.frm.reEmail.value=document.frm.email.value;
				window.close();
			}
		</script>
	</body>
</html>