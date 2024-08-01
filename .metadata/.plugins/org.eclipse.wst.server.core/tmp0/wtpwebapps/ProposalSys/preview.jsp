<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Preview</title>
		<style>
			#container{
				margin: 0 auto;
				width: 1000px;
			}
			#logo{
				margin: 0 auto;
				width: 250px;
			}
			.div_input{
				width:300px;
				height:100px;
				float:right;
				border:2px solid black;
			}
			h1{
				margin:0px;
				text-align:center;
				color:navy;
			}
			#container:after{
				content: "";
				display:block;
				clear:both;
			}
			input[type="submit"]{
				width: auto;
				height: auto;
			}
		</style>
	</head>
	<body>
		<div id="container">
            <h1>제안서 미리보기</h1>
        	<div>
        		<jsp:useBean class="data.create" id="d" scope="page"></jsp:useBean>
				<jsp:setProperty name="d" property="*"></jsp:setProperty>
				<%
					request.setCharacterEncoding("utf-8");
					String title=request.getParameter("title");
					request.setCharacterEncoding("utf-8");
					d=(data.create)session.getAttribute("obj");
				%>
				<form method="post" action="formainprogress.jsp">
	        		<div><%=d.getTitle()%></div>
	        		<div><%=d.getSummary() %></div>
	        		<div><%=d.getBackground() %></div>
	        		<div><%=d.getSolution() %></div>
	        		<div><%=d.getFinancial() %></div>
	        		<div><%=d.getConclusion() %></div>
	        		<div><%=d.getDocuments() %></div>
	        		<div>
	        			<input type="button" value="뒤로가기" onclick="history.back()">
	        			<input type="submit" name="action" value="제출하기">
	        		</div>
        		</form>
        	</div>
        </div>
	</body>
</html>