/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.91
 * Generated at: 2024-07-31 14:52:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class progressmycreations_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(6);
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<meta charset=\"utf-8\">\r\n");
      out.write("		<title>MYCEREATIONS</title>\r\n");
      out.write("		<style>\r\n");
      out.write("			#wrap{\r\n");
      out.write("				width:800px;\r\n");
      out.write("				margin:0 auto;\r\n");
      out.write("				border:5px solid #450095;\r\n");
      out.write("				text-align:center;\r\n");
      out.write("			}\r\n");
      out.write("			#wrap:after{\r\n");
      out.write("				content: \"\";\r\n");
      out.write("				display:block;\r\n");
      out.write("				clear:both;\r\n");
      out.write("			}\r\n");
      out.write("			#btn1{\r\n");
      out.write("				width:120px;\r\n");
      out.write("				height:30px;\r\n");
      out.write("				font-size:20px;\r\n");
      out.write("				font-weight:600;\r\n");
      out.write("				text-align:center;\r\n");
      out.write("				line-height:30px;\r\n");
      out.write("				border:2px solid #450095;\r\n");
      out.write("				float:right;\r\n");
      out.write("				color:#450095;\r\n");
      out.write("				cursor:pointer;\r\n");
      out.write("			}\r\n");
      out.write("			#btn2{\r\n");
      out.write("				width:120px;\r\n");
      out.write("				height:30px;\r\n");
      out.write("				font-size:20px;\r\n");
      out.write("				font-weight:600;\r\n");
      out.write("				text-align:center;\r\n");
      out.write("				line-height:30px;\r\n");
      out.write("				border:2px solid #450095;\r\n");
      out.write("				float:right;\r\n");
      out.write("				color:navy;\r\n");
      out.write("				cursor:pointer;\r\n");
      out.write("			}\r\n");
      out.write("			#btn3{\r\n");
      out.write("				width:120px;\r\n");
      out.write("				height:30px;\r\n");
      out.write("				font-size:20px;\r\n");
      out.write("				font-weight:600;\r\n");
      out.write("				text-align:center;\r\n");
      out.write("				line-height:30px;\r\n");
      out.write("				border:2px solid #450095;\r\n");
      out.write("				float:right;\r\n");
      out.write("				color:navy;\r\n");
      out.write("				cursor:pointer;\r\n");
      out.write("			}\r\n");
      out.write("			#btn4{\r\n");
      out.write("				width:120px;\r\n");
      out.write("				height:30px;\r\n");
      out.write("				font-size:20px;\r\n");
      out.write("				font-weight:600;\r\n");
      out.write("				text-align:center;\r\n");
      out.write("				line-height:30px;\r\n");
      out.write("				border:2px solid #450095;\r\n");
      out.write("				float:right;\r\n");
      out.write("				color:navy;\r\n");
      out.write("				cursor:pointer;\r\n");
      out.write("			}\r\n");
      out.write("			#btn1:hover{\r\n");
      out.write("				background-color:#64c4DD; /*하늘색*/\r\n");
      out.write("				color:white;\r\n");
      out.write("			}\r\n");
      out.write("			#btn2:hover{\r\n");
      out.write("				background-color:#ffbf3f; /*노란색*/\r\n");
      out.write("				color:white;\r\n");
      out.write("			}\r\n");
      out.write("			#btn3:hover{\r\n");
      out.write("				background-color:#450095; /*남색*/\r\n");
      out.write("				color:white;\r\n");
      out.write("			}\r\n");
      out.write("			#btn4:hover{\r\n");
      out.write("				background-color:#7B2B63;\r\n");
      out.write("				color:white;\r\n");
      out.write("			}\r\n");
      out.write("			#logo{\r\n");
      out.write("            	margin: 20px auto;\r\n");
      out.write("                width: 150px;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("            }\r\n");
      out.write("            .list{\r\n");
      out.write("            	width: 480px;\r\n");
      out.write("            	height:60px;\r\n");
      out.write("            	font-size:20px;\r\n");
      out.write("            	fond-weight:bold;\r\n");
      out.write("            	color:navy;\r\n");
      out.write("            	padding:40px;\r\n");
      out.write("            	cursor:pointer;\r\n");
      out.write("            	float:left;\r\n");
      out.write("            	clear:both;\r\n");
      out.write("            }\r\n");
      out.write("            .list:hover{\r\n");
      out.write("            	background-color:#7B2B63;\r\n");
      out.write("            	color:white;\r\n");
      out.write("            }\r\n");
      out.write("            ul{\r\n");
      out.write("            	list-style:none;\r\n");
      out.write("            }\r\n");
      out.write("            a{\r\n");
      out.write("            	color: inherit;\r\n");
      out.write("            	cursor:pointer;\r\n");
      out.write("            	text-decoration:none;\r\n");
      out.write("            }\r\n");
      out.write("            #menu{\r\n");
      out.write("            	margin-top:20px;\r\n");
      out.write("            	display:inline-block;\r\n");
      out.write("            }\r\n");
      out.write("            #menu div{\r\n");
      out.write("            	display:inline-block;\r\n");
      out.write("            }\r\n");
      out.write("		</style>\r\n");
      out.write("	</head>\r\n");
      out.write("	<body>\r\n");
      out.write("		<div id=\"wrap\">\r\n");
      out.write("			<div>\r\n");
      out.write("				<form id=\"menu\" method=\"post\" action=\"\">\r\n");
      out.write("					<div data-action=\"create.jsp\" id=\"btn1\">create</div>\r\n");
      out.write("					<div data-action=\"editproposal.jsp\" id=\"btn2\">edit</div>\r\n");
      out.write("					<div data-action=\"progressmycreationsdelete.jsp\" id=\"btn3\">delete</div>\r\n");
      out.write("					<div data-action=\"main.jsp\" id=\"btn4\">main</div>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("				");

				int num = Integer.parseInt(request.getParameter("num"));
				session.setAttribute("selectedNum", num);
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
					sql+="m.email, m.fn, m.ln, m.photo, m.phone, m.job, m.location from proposals p join member m on p.author=m.num where p.num="+num;
					System.out.println(sql);
					stmt=conn.createStatement();
					rs=stmt.executeQuery(sql);
					if(rs.next()){
						String title=rs.getString("title");
						String ex=rs.getString("summary");
						String pro=rs.getString("background");
						String sol=rs.getString("solution");
						String fin=rs.getString("financial");
						String con=rs.getString("conclusion");
						String doc=rs.getString("documents");
						String email=rs.getString("email");
						String fnm=rs.getString("fn");
						String lnm=rs.getString("ln");
						String ph=rs.getString("photo");
						String phn=rs.getString("phone");
						String j=rs.getString("job");
						String lo=rs.getString("location");
			
      out.write("\r\n");
      out.write("						<div id=\"container\">\r\n");
      out.write("							<div>\r\n");
      out.write("								<h1>");
      out.print(title);
      out.write("</h1>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"div_info\">\r\n");
      out.write("								<p>");
      out.print(fnm+" "+lnm);
      out.write("</p>\r\n");
      out.write("								<p>");
      out.print(j+" "+lo);
      out.write("</p>\r\n");
      out.write("								<p>");
      out.print(email+" "+phn);
      out.write("</p>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div>\r\n");
      out.write("								<p>");
      out.print(ex );
      out.write("</p>\r\n");
      out.write("								<p>");
      out.print(pro );
      out.write("</p>\r\n");
      out.write("								<p>");
      out.print(sol);
      out.write("</p>\r\n");
      out.write("								<p>");
      out.print(fin );
      out.write("</p>\r\n");
      out.write("								<p>");
      out.print(con );
      out.write("</p>\r\n");
      out.write("								<p>");
      out.print(doc );
      out.write("</p>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						");

					}else{
						
      out.write("\r\n");
      out.write("							<h1>해당 글을 찾을 수 없습니다.</h1>\r\n");
      out.write("						");

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
			
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<script>\r\n");
      out.write("			let menu = document.getElementById(\"menu\");\r\n");
      out.write("			let btn = menu.getElementsByTagName(\"div\");\r\n");
      out.write("	\r\n");
      out.write("			for(let i = 0; i < btn.length; i++){\r\n");
      out.write("			    btn[i].addEventListener(\"click\", function(){\r\n");
      out.write("			        let action = btn[i].getAttribute(\"data-action\");\r\n");
      out.write("			        if(action){\r\n");
      out.write("			        	menu.action = action;\r\n");
      out.write("			            menu.submit();\r\n");
      out.write("			        }\r\n");
      out.write("			    });\r\n");
      out.write("			};\r\n");
      out.write("		</script>\r\n");
      out.write("	</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
