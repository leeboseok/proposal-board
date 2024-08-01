<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>나의 글 보기</title>
		<link rel="stylesheet" href="css/mycreations.css"> 
	</head>
	<body>
		<div id="wrap">
			<%
				String author=(String)session.getAttribute("author");	
				System.out.println(author);
				
				String pg=request.getParameter("page");
				int currentPage=(pg!=null)?Integer.parseInt(pg):1;
				int recordsPerPage=5;
				int start=(currentPage-1)*recordsPerPage;
				
				Connection conn=null;
				Statement stmt=null;
				ResultSet rs=null;
			
				String url="jdbc:mysql://127.0.0.1:3306/fm_global";
				String db_id="root";
				String db_pw="iotiot";
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn=DriverManager.getConnection(url, db_id, db_pw);
					
					String countSql="select count(*) from proposals where author = "+author;
					stmt=conn.createStatement();
					rs=stmt.executeQuery(countSql);
					int totalRecords=0;
					if(rs.next()){
						totalRecords=rs.getInt(1);
					}
					rs.close();
					stmt.close();
					int totalPages=(int)Math.ceil((double)totalRecords/recordsPerPage);
					
					String sql = "SELECT p.num, p.title, m.fn, m.ln, m.location, p.created_at FROM proposals p JOIN member m ON p.author = m.num WHERE p.author = " + author + " ORDER BY p.created_at DESC LIMIT " + start + ", " + recordsPerPage;
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					System.out.println(sql);
					while(rs.next()){
						int num=rs.getInt("num");
						String title=rs.getString("title");
						String firstName=rs.getString("fn");
						String lastName=rs.getString("ln");
						String location=rs.getString("location");
						String createdAt=rs.getString("created_at");
						%>
							<div class="list">
								<a href="progressmycreations.jsp?num=<%=num %>">
									<%=title %><br>
									<%=firstName+" "+lastName %><br>
									<%=location %><br>
									<%=createdAt %>
								</a>
								<!-- <form method="post" action="deleteprogress.jsp">
										<input type="hidden" value="<%=num %>" name="del">
										<input type="submit" value="삭제">
								</form> -->
							</div>
						<%
					}
					%>
						<div class="pagination">
							<%
								if(currentPage>1){
									out.println("<a href='?page=" + (currentPage-1)+"'>Previous</a>");
								}
								for(int i=1; i<=totalPages; i++){
									if(i==currentPage){
										out.println("<strong>"+i+"</strong>");
									}else{
										out.println("<a href='?page="+i+"'>"+i+"</a>");
									}
								}
								if(currentPage<totalPages){
									out.println("<a href='?page="+(currentPage+1)+"'>Next</a>");
								}
							 %>
						</div>
					<%
				}catch(Exception e){
					System.out.println("접속 중 오류 발생" + e);
				}finally{
					try{
						if(rs!=null)rs.close();
						if(stmt!=null)stmt.close();
						if(conn!=null)conn.close();
					}catch(Exception ex){
						System.out.println("접속 해제 중 오류 발생"+ex);
					}
				}
			%>
		</div>
	</body>
</html>