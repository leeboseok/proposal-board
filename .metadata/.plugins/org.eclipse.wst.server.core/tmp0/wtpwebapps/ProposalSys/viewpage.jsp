<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="css/viewPage.css">
	</head>
	<body>
		<%
			int num = Integer.parseInt(request.getParameter("num"));
			Connection conn=null;
			Statement stmt=null;
			ResultSet rs=null;
			
			String url="jdbc:mysql://127.0.0.1:3306/fm_global";
			String db_id="root";
			String db_pw="iotiot";
			try{
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn=DriverManager.getConnection(url, db_id, db_pw);
				String sql="select p.title, p.summary, p.background, p.solution, p.financial, p.conclusion, p.documents,";
				sql+="m.email, m.fn, m.ln, m.photo, m.phone, m.job, m.location from proposals p join member m on p.author=m.num where p.num="+num+";";
				System.out.println(sql);
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
				
				if(rs.next()){
					String title=rs.getString("title");
					String sum=rs.getString("summary");
					String bg=rs.getString("background");
					String sol=rs.getString("solution");
					String fin=rs.getString("financial");
					String con=rs.getString("conclusion");
					String doc=rs.getString("documents");
					String email=rs.getString("email");
					String fn=rs.getString("fn");
					String ln=rs.getString("ln");
					String ph=rs.getString("photo");
					String phn=rs.getString("phone");
					String j=rs.getString("job");
					String lo=rs.getString("location");
		%>
					<div id="container">
						<div>
							<h1><%=title%></h1>
						</div>
						<div class="div_info">
							<p><%=fn+" "+ln%></p>
							<p>Position : <%=j%></p>
							<p>Location : <%=lo %>
							<p>Email : <%=email+" | Phone : "+phn%></p>
						</div>
						<div>
							<p><%=sum %></p>
							<p><%=bg %></p>
							<p><%=sol%></p>
							<p><%=fin %></p>
							<p><%=con %></p>
							<p><%=doc %></p>
						</div>
					</div>
					<%
				}else{
					%>
						<h1>해당 글을 찾을 수 없습니다.</h1>
					<%
				}
			}catch(Exception e){
				System.out.println("접속 중 로류 발생");
			}finally{
				try{
					if(rs!=null)rs.close();
					if(stmt!=null)stmt.close();
					if(conn!=null)conn.close();
				}catch(Exception ex){
					System.out.println("접속 해제 중 오류 발생: "+ ex);
				}
			}
		%>
	</body>
</html>