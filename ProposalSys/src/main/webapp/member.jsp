<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>회원 조회 페이지</title>
		<link rel="stylesheet" href="css/body.css">
		<style>
		
			/*#wrap{
				margin:0 auto;
				width: 1700px;
				border: 1px solid #450095;
			}*/
			table{
				display: flex; justify-content:center;
			}
            th, td{
                border:1px solid gray;
                }
            h1{
            	text-align:center;
            }
            #atag{
            	width: 100%; 
            	display: flex; 
            	justify-content:center;
            }
            a{
            	text-decoration:none;
            	font-size:600;
            	color:#450095;
            	padding:20px;
            }
            a:hover{
            	color:#ffbf3f;
            }
		</style>
	</head>
	<body>
		<div id="wrap">
			<h1>User List</h1>
			<%
				Connection conn=null;
				Statement stmt=null;
				ResultSet rs=null;
				
				String url="jdbc:mysql://127.0.0.1:3306/fm_global";
				String db_id="root";
				String db_pw="iotiot";
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn=DriverManager.getConnection(url,db_id,db_pw);
					String sql="select * from member;";
					stmt=conn.createStatement();
					System.out.println(sql);
					rs=stmt.executeQuery(sql);
					%>
						<table>
							<tr>
								<th>Num</th>
					            <th>Email</th>
					            <th>Password</th>
					            <th>FirstName</th>
					            <th>LastName</th>
					            <th>Photo</th>
					            <th>Phone</th>
					            <th>Job</th>
					            <th>Location</th>
							</tr>
					<%
					while(rs.next()){
						String num=rs.getString("num");
						String email=rs.getString("email");
						String pass=rs.getString("pw");
						String fn=rs.getString("fn");
						String ln=rs.getString("ln");
						String photo=rs.getString("photo");
						String phone=rs.getString("phone");
						String job=rs.getString("job");
						String lo=rs.getString("location");
						%>
							<tr>
								<td><%=num %></td>
					            <td><%=email %></td>
					            <td><%=pass %></td>
					            <td><%=fn %></td>
					            <td><%=ln %></td>
					            <td><%=photo %></td>
					            <td><%=phone %></td>
					            <td><%=job %></td>
					            <td><%=lo %></td>
					            <td>
									<form method="post" action="deleteprogress.jsp">
										<input type="hidden" value="<%=num %>" name="del">
										<input type="submit" value="삭제">
									</form>
								</td>
							</tr>
						<%
					}
					%>
						</table>
						<div id="atag"><a href="main.jsp">Go to the Main page</a></div>
					<%
				}catch(Exception e){
					System.out.println("접속 중 오류 발생"+e);
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
		</div>		
	</body>
</html>