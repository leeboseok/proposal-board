<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Login</title>
		<link rel="stylesheet" href="css/signin.css">
		<style>
			
		</style>
	</head>
	<body>
		<div id="wrap">
			<div><h1>FM Group</h1></div>
			<form method="post" action="signinprogress.jsp">
				<div class="idpw">
					<input type="email" name="userEmail" required placeholder="email">
				    <input type="password" name="userPassword" required placeholder="password">
					<input type="submit" class="loginButton" id="submit" value="Sign in">
				</div>
			</form>
			<div class="div_a">
				<a href = "admincontact.jsp">Need help? CONTACT US!</a>
			</div>
			<div class="div_a">
				<a href = "signup.jsp">CREATE ACCOUNT</a>
			</div>
		</div>
	</body>
</html>