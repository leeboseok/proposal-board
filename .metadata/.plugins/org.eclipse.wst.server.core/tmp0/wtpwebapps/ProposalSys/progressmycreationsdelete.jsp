<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>내가 쓴 글 삭제 처리기</title>
	</head>
	<body>
		<%
			int num = (int)session.getAttribute("selectedNum");
			
			Connection conn=null;
			Statement stmt=null;
			
			String url="jdbc:mysql://127.0.0.1:3306/fm_global";
			String db_id="root";
			String db_pw="iotiot";
			
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(url, db_id, db_pw);
				
				String sql="delete from proposals where num="+num+";";
				stmt=conn.createStatement();
				stmt.execute(sql);
				System.out.println(sql);
				response.sendRedirect("mycreations.jsp");
			}catch(Exception e){
				System.out.println("접속 중 오류 발생"+e);
			}finally{
				try{
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				}catch(Exception ex){
					System.out.println("접속 해제 중 오류 발생"+ex);
				}
			}
		%>
	</body>
</html>