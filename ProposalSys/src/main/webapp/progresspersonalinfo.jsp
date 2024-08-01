<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>PERSONALINFO</title>
		<link rel="stylesheet" href="css/body.css"> 
	</head>
	<body>
		<%
			String email=(String)session.getAttribute("Email");	
		
			Connection conn=null;
			Statement stmt=null;
			ResultSet rs=null;
			
			String url="jdbc:mysql://127.0.0.1:3306/fm_global";
			String db_id="root";
			String db_pw="iotiot";
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(url, db_id, db_pw);
				String sql="select * from member where email='"+email+"'";
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				System.out.println(sql);
				response.sendRedirect("personalinfo.jsp");
			}catch(Exception e){
				System.out.println("접속중 오류 발생"+e);
			}
		%>
	</body>	
</html>