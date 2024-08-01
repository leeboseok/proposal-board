<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>로그인 다음 페이지</title>
		<link rel="stylesheet" href="css/body.css">
	</head>
	<body>
		<%
			Connection conn=null;
			Statement stmt=null;
			ResultSet rs=null;
			
			String inputEmail=request.getParameter("userEmail");
			String inputPW=request.getParameter("userPassword");
			String inputFirstName=request.getParameter("FirstName");
			
			String url="jdbc:mysql://127.0.0.1:3306/fm_global";
			String db_id="root";
			String db_pw="iotiot";
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(url, db_id, db_pw);
				String sql="select * from member where email='"+inputEmail+"';";
				System.out.println(sql);
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				System.out.println(rs.next());
				String num=rs.getString("num");
				String email=rs.getString("email");
				String pw=rs.getString("pw");
				String FirstName=rs.getString("fn");
				String LastName=rs.getString("ln");
				String photo=rs.getString("photo");
				String phone=rs.getString("phone");
				String job=rs.getString("job");
				String location=rs.getString("location");
				System.out.println("num= "+num+",pw= "+pw+",FirstName= "+FirstName+",LastName= "+LastName+",photo= "+photo+",phone= "+phone+",job= "+job+",location= "+location); 
				if(inputPW.equals(pw)){
					System.out.println(inputPW.equals(pw));
					session.setAttribute("ln", LastName);
					session.setAttribute("fn", FirstName);
					session.setAttribute("grade", "member");
					session.setAttribute("author", num);
					session.setAttribute("Email", email);
					response.sendRedirect("main.jsp?page=1");
					if(job.equals("admin")){
						session.setAttribute("admin", job);
					}
				}else if(inputPW.equals(pw)==false){
					%>
						<script>
							alert("회원 확인, 비밀번호를 확인해주세요.");
							location.href="signin.jsp";
						</script>
					<%
				}
			}catch(Exception e){
				System.out.println("접속중 오류 발생"+e);
				%>
					<script>
						alert("회원확인 불가. 다시 로그인 해주세요.")
						location.href="signin.jsp";
					</script>
				<%
			}finally{
				try{
					if(rs!=null)rs.close();
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				}catch(Exception ex){
					System.out.println("접속 해제 중 오류 발생 : "+ex);
				}
			}
		%>
	</body>
</html>