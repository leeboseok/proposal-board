<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>메인 게시판 위한 처리</title>
		<link rel="stylesheet" href="css/body.css">
	</head>
	<body>
		<h1>formainprogress.jsp 게시판을 위해 처리하는 곳</h1>
		<%
			Connection conn=null;
			Statement stmt=null;
			ResultSet rs=null;
			
			String url="jdbc:mysql://127.0.0.1:3306/fm_global";
			String db_id="root";
			String db_pw="iotiot";
			
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(url, db_id, db_pw);
				String sql="";
				stmt=conn.createStatement();
				System.out.println(sql);
				response.sendRedirect("main.jsp");
			}catch(Exception e){
				System.out.println("접속 중 오류 발생 : "+ e);
			}finally{
				try{
					if(rs!=null)rs.close();
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				}catch(Exception ex){
					System.out.println("접속 해제중 오류 발생 : "+ex);
				}
			}
		%>
	</body>
</html>