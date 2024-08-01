<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>내가 쓴 글 업데이트 처리기</title>
	</head>
	<body>
	    <%
	        int num=(int)session.getAttribute("selectedNum");
	
	        String title=request.getParameter("title");
	        String es=request.getParameter("ExecutiveSummary");
	        String pb=request.getParameter("ProjectBackground");
	        String sna=request.getParameter("SolutionsAndApproach");
	        String f=request.getParameter("Financials");
	        String c=request.getParameter("Conclusion");
	        String ad=request.getParameter("AdditionalDocuments");
	
	        Connection conn=null;
	        PreparedStatement pstmt=null;
	
	        String url="jdbc:mysql://127.0.0.1:3306/fm_global";
	        String db_id="root";
	        String db_pw="iotiot";
	
	        try{
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            conn=DriverManager.getConnection(url, db_id, db_pw);
	
	            String sql="UPDATE proposals SET title=?, ExecutiveSummary=?, ProjectBackground=?, SolutionsAndApproach=?, Financials=?, Conclusion=?, Documents=? WHERE num=?";
	            pstmt=conn.prepareStatement(sql);
	            pstmt.setString(1, title);
	            pstmt.setString(2, es);
	            pstmt.setString(3, pb);
	            pstmt.setString(4, sna);
	            pstmt.setString(5, f);
	            pstmt.setString(6, c);
	            pstmt.setString(7, ad);
	            pstmt.setInt(8, num);
	
	            pstmt.executeUpdate();
	
	            response.sendRedirect("mycreations.jsp");
	
	        }catch(Exception e){
	            out.println("접속 중 오류 발생 : " + e);
	        }finally{
	            try{
	                if(pstmt != null)pstmt.close();
	                if(conn != null)conn.close();
	            }catch(Exception ex){
	                out.println("접속 해제 중 오류 발생 : " + ex);
	            }
	        }
	    %>
</body>	
</html>