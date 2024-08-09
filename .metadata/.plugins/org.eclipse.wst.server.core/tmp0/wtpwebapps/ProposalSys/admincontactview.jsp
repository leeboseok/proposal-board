<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>문의사항 리스트</title>
		<link rel="stylesheet" href="css/admincontactview.css">
	</head>
	<body>
		<div id="wrap">
			<h1>문의사항</h1>
			<%
				request.setCharacterEncoding("utf-8");
					
				String pg=request.getParameter("page");
				int currentPage=(pg!=null)?Integer.parseInt(pg):1;
				int recordsPerPage=10;
				int start=(currentPage-1)*recordsPerPage;
				
				Connection conn=null;
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				
				String url="jdbc:mysql://127.0.0.1:3306/fm_global";
				String db_id="root";
				String db_pw="iotiot";
				
				try{
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn=DriverManager.getConnection(url, db_id, db_pw);
					
				//bs 페이지네이션 쿼리 입니다.
					String countSql="select count(*) from admin_contact";
					System.out.println(countSql);
					pstmt=conn.prepareStatement(countSql);
					rs=pstmt.executeQuery();
					int totalRecords=0;
					if(rs.next()){
						totalRecords=rs.getInt(1);
					}
					rs.close();
					pstmt.close();
					int totalPages=(int)Math.ceil((double)totalRecords/recordsPerPage);
					
				//bs 회원가입 문의사항 리스트 불러오는 쿼리 입니다.
					String sql="select * from admin_contact order by created_at limit ?, ?";
					System.out.println(sql);
					pstmt=conn.prepareStatement(sql);
					pstmt.setInt(1, start);
					pstmt.setInt(2, recordsPerPage);
					rs=pstmt.executeQuery();
					
				//bs 문의사항 불러오는 부분 입니다.
					while(rs.next()){
						String num=rs.getString("num");
						String name=rs.getString("name");
						String email=rs.getString("email");
						String phone=rs.getString("phone");
						String location=rs.getString("location");
						String category=rs.getString("category");
						String created_at=rs.getString("created_at");
						%>
							<div class="list">
								<span class="num"><%=num %></span>
								<span class="name"><%=name %></span>
								<span class="email"><%=email %></span>
								<span class="phone"><%=phone %></span>
								<span class="location"><%=location %></span>
								<span class="category"><%=category %></span>
								<span class="created_at"><%=created_at %></span>
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
					System.out.println("admincontact.jsp 접속 중 오류 발생 : " + e);
				}finally{
					try{
						if(rs!=null)rs.close();
						if(pstmt!=null)pstmt.close();
						if(conn!=null)conn.close();
					}catch(Exception ex){
						System.out.println("admincontact.jsp 접속 해제 중 오류 발생 : " + ex);
					}
				}
				
			%>
		</div>
	</body>
</html>