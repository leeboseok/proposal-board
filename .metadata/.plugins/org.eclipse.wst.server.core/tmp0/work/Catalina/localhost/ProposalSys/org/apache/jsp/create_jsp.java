/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.91
 * Generated at: 2024-07-31 14:57:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("	<head>\r\n");
      out.write("	    <meta charset=\"UTF-8\">\r\n");
      out.write("	    <title>Write Page</title>\r\n");
      out.write("	    <style>\r\n");
      out.write("	    	html, body {\r\n");
      out.write("			    height: 100%;\r\n");
      out.write("			    margin: 0;\r\n");
      out.write("			    font-family: Arial, sans-serif;\r\n");
      out.write("			}\r\n");
      out.write("	\r\n");
      out.write("			html {\r\n");
      out.write("			    background-size: cover;\r\n");
      out.write("			    background-position: center;\r\n");
      out.write("			    background-repeat: no-repeat;\r\n");
      out.write("			}\r\n");
      out.write("	\r\n");
      out.write("			#wrap {\r\n");
      out.write("			    display: flex;\r\n");
      out.write("			    justify-content: space-between;\r\n");
      out.write("			    max-width: 1200px;\r\n");
      out.write("			    margin: 0 auto;\r\n");
      out.write("			    border: 3px solid navy;\r\n");
      out.write("			    padding: 30px;\r\n");
      out.write("			    box-sizing: border-box;\r\n");
      out.write("			    background-color: rgba(255, 255, 255, 0.8); /* 반투명 배경으로 내용이 강조됨 */\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			#logo {\r\n");
      out.write("			    width: 200px;\r\n");
      out.write("			    margin: 0 auto;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			h1 {\r\n");
      out.write("			    margin: 0;\r\n");
      out.write("			    text-align: center;\r\n");
      out.write("			    color: navy;\r\n");
      out.write("			    font-size: 2rem;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			input[type=\"submit\"] {\r\n");
      out.write("			    width: 150px;\r\n");
      out.write("			    display: block;\r\n");
      out.write("			    margin: 15px auto;\r\n");
      out.write("			    background-color: white;\r\n");
      out.write("			    font-weight: 600;\r\n");
      out.write("			    border: 2px solid navy;\r\n");
      out.write("			    border-radius: 5px;\r\n");
      out.write("			    cursor: pointer;\r\n");
      out.write("			    transition: background-color 0.3s, color 0.3s;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			input[type=\"submit\"]:hover {\r\n");
      out.write("			    background-color: navy;\r\n");
      out.write("			    color: white;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			textarea {\r\n");
      out.write("			    width: 100%;\r\n");
      out.write("			    border: 2px solid #ddd;\r\n");
      out.write("			    border-radius: 5px;\r\n");
      out.write("			    padding: 10px;\r\n");
      out.write("			    box-sizing: border-box;\r\n");
      out.write("			    font-size: 16px;\r\n");
      out.write("			    resize: vertical;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.input-size {\r\n");
      out.write("			    height: 150px;\r\n");
      out.write("			    margin-bottom: 20px;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.small-input {\r\n");
      out.write("			    width: calc(100% - 22px); /* 22px는 padding과 border를 고려 */\r\n");
      out.write("			    height: 40px;\r\n");
      out.write("			    margin-bottom: 20px;\r\n");
      out.write("			    font-size: 16px;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.div_input {\r\n");
      out.write("			    flex: 1;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.div_preview {\r\n");
      out.write("			    flex: 1;\r\n");
      out.write("			    padding-left: 20px;\r\n");
      out.write("			    padding-top: 143px;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.div_preview h2 {\r\n");
      out.write("			    color: navy;\r\n");
      out.write("			    margin-top: 0;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.div_preview div {\r\n");
      out.write("			    margin-bottom: 15px;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.attachmentButton {\r\n");
      out.write("			    display: block;\r\n");
      out.write("			    margin-bottom: 20px;\r\n");
      out.write("			}\r\n");
      out.write("	    </style>\r\n");
      out.write("	    <script>\r\n");
      out.write("	        function updatePreview() {\r\n");
      out.write("	            document.getElementById('previewTitle').innerText = document.querySelector('textarea[name=\"title\"]').value;\r\n");
      out.write("	            document.getElementById('previewExecutiveSummary').innerText = document.querySelector('textarea[name=\"summary\"]').value;\r\n");
      out.write("	            document.getElementById('previewProjectBackground').innerText = document.querySelector('textarea[name=\"background\"]').value;\r\n");
      out.write("	            document.getElementById('previewSolutionsAndApproach').innerText = document.querySelector('textarea[name=\"solution\"]').value;\r\n");
      out.write("	            document.getElementById('previewFinancial').innerText = document.querySelector('textarea[name=\"financial\"]').value;\r\n");
      out.write("	            document.getElementById('previewConclusion').innerText = document.querySelector('textarea[name=\"conclusion\"]').value;\r\n");
      out.write("	        }\r\n");
      out.write("	        window.onload = function() {\r\n");
      out.write("	            document.querySelectorAll('.div_input textarea').forEach(input => {\r\n");
      out.write("	                input.addEventListener('input', updatePreview);\r\n");
      out.write("	            });\r\n");
      out.write("	        }\r\n");
      out.write("	    </script>\r\n");
      out.write("	</head>\r\n");
      out.write("	<body>\r\n");
      out.write("	    <div id=\"wrap\">\r\n");
      out.write("	        <div id=\"logo\">\r\n");
      out.write("	        </div>\r\n");
      out.write("	        <div class=\"div_input\"> <!--여기는 유저가 제안서를 작성하는 파트 입니다.-->\r\n");
      out.write("	            <form method=\"post\" action=\"createprogress.jsp\">\r\n");
      out.write("	            	");
 String test=(String)session.getAttribute("fn"); 
      out.write("\r\n");
      out.write("	            	<h1>환영합니다, ");
      out.print( test );
      out.write("님!</h1>\r\n");
      out.write("	                <h1>제안서 작성 페이지 입니다.</h1>\r\n");
      out.write("	                <div>\r\n");
      out.write("	                    <div>Title</div>\r\n");
      out.write("	                    <textarea name=\"title\" class=\"small-input\"></textarea>\r\n");
      out.write("	                    <div>Executive summary</div>\r\n");
      out.write("	                    <textarea class=\"input-size\" name=\"summary\"></textarea>\r\n");
      out.write("	                    <div>Project background</div>\r\n");
      out.write("	                    <textarea class=\"input-size\" name=\"background\"></textarea>\r\n");
      out.write("	                    <div>Solutions and approach</div>\r\n");
      out.write("	                    <textarea class=\"input-size\" name=\"solution\"></textarea>\r\n");
      out.write("	                    <div>Financial</div>\r\n");
      out.write("	                    <textarea class=\"input-size\" name=\"financial\"></textarea>\r\n");
      out.write("	                    <div>Conclusion</div>\r\n");
      out.write("	                    <textarea class=\"input-size\" name=\"conclusion\"></textarea>\r\n");
      out.write("	                    <div>Additional documents</div>\r\n");
      out.write("	                    <input type=\"file\" name=\"documents\" class=\"attachmentButton\">\r\n");
      out.write("	                    <input type=\"submit\" value=\"임시저장\">\r\n");
      out.write("	                </div>\r\n");
      out.write("	            </form>\r\n");
      out.write("	        </div>\r\n");
      out.write("	        <div class=\"div_preview\"><!--여기는 유저가 작성한 실시간 미리보기영역 입니다.-->\r\n");
      out.write("	            <h2>Preview</h2>\r\n");
      out.write("	            <div><span id=\"previewTitle\"></span></div>\r\n");
      out.write("	            <div><span id=\"previewExecutiveSummary\"></span></div>\r\n");
      out.write("	            <div><span id=\"previewProjectBackground\"></span></div>\r\n");
      out.write("	            <div><span id=\"previewSolutionsAndApproach\"></span></div>\r\n");
      out.write("	            <div><span id=\"previewFinancial\"></span></div>\r\n");
      out.write("	            <div><span id=\"previewConclusion\"></span></div>\r\n");
      out.write("	        </div>\r\n");
      out.write("	    </div>\r\n");
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
