<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Insert title here</title>
	</head>
	<style>
		.input-size {
            width: 100%;
            height: 150px;
            display: block;
            margin-bottom: 20px;
            font-size:20px;
        }
        .small-input {
            width:250px;
            height:30px;
            display:block;
            margin-bottom:20px;
            font-size:20px;
        }
	</style>
	<body>
	    <%
	        int num=(int)session.getAttribute("selectedNum");
	
	        Connection conn=null;
	        PreparedStatement pstmt=null;
	        ResultSet rs=null;
	
	        String url="jdbc:mysql://127.0.0.1:3306/fm_global";
	        String db_id="root";
	        String db_pw="iotiot";
	
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            conn=DriverManager.getConnection(url, db_id, db_pw);
	
	            String sql="SELECT * FROM proposals WHERE num = ?";
	            pstmt=conn.prepareStatement(sql);
	            pstmt.setInt(1, num);
	
	            rs=pstmt.executeQuery();
	            if(rs.next()){
	                String title=rs.getString("title");
	                String ex=rs.getString("summary");
	                String pro=rs.getString("background");
	                String sol=rs.getString("solution");
	                String fin=rs.getString("financial");
	                String con=rs.getString("conclusion");
	    %>
	                <div>
	                    <form method="post" action="editproposalprogress.jsp">
	                        <div>Title</div>
	                        <textarea name="title" class="small-input"><%=title %></textarea>
	                        <div>Executive summary</div>
	                        <textarea class="input-size" name="ExecutiveSummary"><%=ex %></textarea>
	                        <div>Project background</div>
	                        <textarea class="input-size" name="ProjectBackground"><%=pro %></textarea>
	                        <div>Solutions and approach</div>
	                        <textarea class="input-size" name="SolutionsAndApproach"><%=sol %></textarea>
	                        <div>Financial</div>
	                        <textarea class="input-size" name="Financials"><%=fin %></textarea>
	                        <div>Conclusion</div>
	                        <textarea class="input-size" name="Conclusion"><%=con %></textarea>
	                        <div>Additional documents</div>
	                        <input type="file" name="AdditionalDocuments" class="attachmentButton">
	                        <input type="submit" value="저장">
	                    </form>
	                </div>
	    <%
	            }
	        }catch(Exception e){
	            out.println("접속 중 오류 발생 : "+e);
	        }finally{
	            try{
	                if(rs!=null)rs.close();
	                if(pstmt!=null)pstmt.close();
	                if(conn!=null)conn.close();
	            }catch(Exception ex){
	                out.println("접속 해제 중 오류 발생 : "+ex);
	            }
	        }
	    %>
</body>
</html>