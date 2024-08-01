<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>수정 처리기</title>
	</head>
	<body>
		<%
			request.setCharacterEncoding("utf-8");
			String num=request.getParameter("num");
			String email=request.getParameter("email");
			String pw=request.getParameter("password");
			String fn=request.getParameter("FirstName");
			String ln=request.getParameter("LastName");
			String photo=request.getParameter("Photo");
			String phone=request.getParameter("Phone");
			String job=request.getParameter("job");
			String lo=request.getParameter("location");
			String sql="update member set email='"+email+"', pw='"+pw+"', fn='"+fn+"', ln='"+ln+"', photo='"+photo+"', ";
			sql+="phone='"+phone+"', job='"+job+"', location='"+lo+"' where num="+num+";";
			
			System.out.println(sql);
			Connection conn=null;
			Statement stmt=null;
			
			String url="jdbc:mysql://127.0.0.1:3306/fm_global";
			String db_id="root";
			String db_pw="iotiot";
			
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(url, db_id, db_pw);
				stmt=conn.createStatement();
				stmt.executeUpdate(sql);
				response.sendRedirect("memberedit.jsp");
			}catch(Exception e){
				System.out.println("memberupdate 접속 중 오류 발생"+e);
			}finally{
				try{
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				}catch(Exception ex){
					System.out.println("접속 해제중 오류 발생"+ex);
				}
			}
		%>
	</body>
</html>