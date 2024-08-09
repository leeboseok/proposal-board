<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>회원가입 처리기</title>
		<style>
			#box{
				border: 5px solid navy;
                width: 400px;
                margin: 0 auto;
                padding: 30px;
			}
			#logo{
            	margin: 0 auto;
                width: 150px;
                cursor: pointer;
            }
			h1{
				margin:0 auto;
				text-align:center;
				color: navy;
				font-weight: bold;
			}
			h3{
				margin:0 auto;
				text-align:center;
				font-weight:bold;
				font-size:100px;
				color:purple;
			}
			.div_btn{
				margin:0 auto;
				width:120px;
				padding: 40px;
			}
			button{
				background-color: navy;
				text-align:center;
				height:40px;
				fond-weight:400;
				cursor:pointer;
			}
			button:hover{
				background-color:purple;
			}
			a{
				text-decoration-line: none;
				color: white;
			}
		</style>
	</head>
	<body>
		<div id="box">
			<div id="logo">
				<a href="https://www.fmglobal.com/"><img src="images/fmLogo.svg" alt="logo"></a>
			</div>
			<%
				Connection conn=null;
				Statement stmt=null;
				
				String email=request.getParameter("email");
				String pw=request.getParameter("pw");
				String fn=request.getParameter("fn");
				String ln=request.getParameter("ln");
				String photo=request.getParameter("photo");
				String phone=request.getParameter("phone");
				String job=request.getParameter("job");
				String lo=request.getParameter("location");
				
				String url="jdbc:mysql://127.0.0.1:3306/fm_global";
				String db_id="root";
				String db_pw="iotiot";
				
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn=DriverManager.getConnection(url, db_id, db_pw);
					String sql="insert into member (email, pw, fn, ln, photo, phone, job, location) values(";
					sql+="'"+email+"','"+pw+"','"+fn+"','"+ln+"','"+photo+"','"+phone+"','"+job+"','"+lo+"');";
					stmt=conn.createStatement();
					stmt.execute(sql);
					System.out.println(sql);
	                out.println("<h1>"+"Welcome, "+fn+"</h1><br>");
	                out.println("<h3>All GOOD!</h3>");
	                out.println("<div class='div_btn'>");
	                out.println("<button><a href='signin.jsp'>로그인 하러 가기</a></button>");
	                out.println("</div>");
				}catch(Exception e){
					System.out.println("회원가입 실패 : "+e.getMessage());
					out.println("<h3>Sorry, couldn't success</h3>");
				}finally{
					try{
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					}catch(Exception ex){
						System.out.println("접속 해제 중 오류발생 : "+ex.getMessage());
					}
				}
			%>
		</div>
	</body>
</html>