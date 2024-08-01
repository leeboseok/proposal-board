<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>관리자 컨택기</title>
	</head>
	<body>
		<%
			Connection conn=null;
			PreparedStatement pstmt=null;
			
			String url="jdbc:mysql://127.0.0.1:3306/fm_global";
			String db_id="root";
			String db_pw="iotiot";
			
			String nm = request.getParameter("name");
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			String location = request.getParameter("location");
			String title = request.getParameter("title");
			String refer = request.getParameter("refer");
			String category = request.getParameter("category");
			
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(url, db_id, db_pw);
				String sql="insert into admin_contact (name, email, phone, location, title, refer, category) values (?, ?, ?, ?, ?, ?, ?)";
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(url, db_id, db_pw);
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, nm);
				pstmt.setString(2, email);
				pstmt.setString(3, phone);
				pstmt.setString(4, location);
				pstmt.setString(5, title);
				pstmt.setString(6, refer);
				pstmt.setString(7, category);
				pstmt.executeUpdate();
				response.sendRedirect("signin.jsp");
			}catch(Exception e){
				System.out.println("접속 중 오류 발생 : " + e);
			}finally{
				try{
					if(pstmt!=null)pstmt.close();
					if(conn!=null)conn.close();
				}catch(Exception ex){
					System.out.println("접속 해제 중 오류 발생 : " + ex);
				}
			}
		%>
	</body>
</html>