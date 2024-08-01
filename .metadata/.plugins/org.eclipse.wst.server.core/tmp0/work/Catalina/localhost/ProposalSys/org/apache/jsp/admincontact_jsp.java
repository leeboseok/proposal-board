/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.91
 * Generated at: 2024-07-28 02:50:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admincontact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<meta charset=\"UTF-8\">\r\n");
      out.write("		<title>관리자 컨택</title>\r\n");
      out.write("		<style>\r\n");
      out.write("		</style>\r\n");
      out.write("	</head>\r\n");
      out.write("	<body>\r\n");
      out.write("		<div id=\"wrap\">\r\n");
      out.write("			<form class=\"form\" method=\"get\" action=\"admincontactprogress.jsp\">\r\n");
      out.write("				<div>\r\n");
      out.write("					<span>Name:</span>\r\n");
      out.write("					<input type=\"text\" name=\"name\" placeholder=\"이름을 입력하세요\" required>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div>\r\n");
      out.write("					<span>Email:</span>\r\n");
      out.write("					<input type=\"email\" name=\"email\" placeholder=\"이메일을 입력하세요\" required>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div>\r\n");
      out.write("					<span>Phone:</span>\r\n");
      out.write("					<input type=\"text\" name=\"phone\" placeholder=\"전화번호를 입력하세요\">\r\n");
      out.write("				</div>\r\n");
      out.write("				<div>\r\n");
      out.write("					<span>Location:</span>\r\n");
      out.write("					<select name=\"location\">\r\n");
      out.write("                        <option value=\"United States - San Juan\">United States - San Juan</option>\r\n");
      out.write("                        <option value=\"United States - California-Walnut Creek\">United States - California-Walnut Creek</option>\r\n");
      out.write("                        <option value=\"United States - California-Woodlang Hills\">United States - California-Woodlang Hills</option>\r\n");
      out.write("                        <option value=\"United States - Colorado-Denver\">United States - Colorado-Denver</option>\r\n");
      out.write("                        <option value=\"United States - Connecticut-Burlington\">United States - Connecticut-Burlington</option>\r\n");
      out.write("                        <option value=\"United States - Connecticut-Coventry\">United States - Connecticut-Coventry</option>\r\n");
      out.write("                        <option value=\"United States - Connecticut-Newington\">United States - Connecticut-Newington</option>\r\n");
      out.write("                        <option value=\"United States - Connecticut-Norwalk\">United States - Connecticut-Norwalk</option>\r\n");
      out.write("                        <option value=\"United States - Georgia-Alpharetta\">United States - Georgia-Alpharetta</option>\r\n");
      out.write("                        <option value=\"United States - Georgia-Rome\">United States - Georgia-Rome</option>\r\n");
      out.write("                        <option value=\"United States - Illinois-Park Ridge\">United States - Illinois-Park Ridge</option>\r\n");
      out.write("                        <option value=\"United States - Illinois-Peoria\">United States - Illinois-Peoria</option>\r\n");
      out.write("                        <option value=\"United States - Indiana-Indianapolis\">United States - Indiana-Indianapolis</option>\r\n");
      out.write("                        <option value=\"United States - Indiana-Merrillville\">United States - Indiana-Merrillville</option>\r\n");
      out.write("                        <option value=\"United States - Indiana-South Bend\">United States - Indiana-South Bend</option>\r\n");
      out.write("                        <option value=\"United States - lowa-Cedar Rapids\">United States - lowa-Cedar Rapids</option>\r\n");
      out.write("                        <option value=\"United States - lowa-Davenport\">United States - lowa-Davenport</option>\r\n");
      out.write("                        <option value=\"United States - lowa-Des Moines\">United States - lowa-Des Moines</option>\r\n");
      out.write("                        <option value=\"United States - lowa-Sioux City\">United States - lowa-Sioux City</option>\r\n");
      out.write("                        <option value=\"United states - Kansas-Topeka\">United states - Kansas-Topeka</option>\r\n");
      out.write("                        <option value=\"United States - Kansas-Wichita\">United States - Kansas-Wichita</option>\r\n");
      out.write("                        <option value=\"United States - Kentucky-Louisville\">United States - Kentucky-Louisville</option>\r\n");
      out.write("                        <option value=\"United States - Maryland-Frederick\">United States - Maryland-Frederick</option>\r\n");
      out.write("                        <option value=\"United States - Maryland-Gaithersburg\">United States - Maryland-Gaithersburg</option>\r\n");
      out.write("                        <option value=\"United States - Massachusetts-Boston\">United States - Massachusetts-Boston</option>\r\n");
      out.write("                        <option value=\"United States - Massachusetts-Norwood\">United States - Massachusetts-Norwood</option>\r\n");
      out.write("                        <option value=\"United States - Massachusetts-Wakefield\">United States - Massachusetts-Wakefield</option>\r\n");
      out.write("                        <option value=\"United States - Massachusetts-Waltham\">United States - Massachusetts-Waltham</option>\r\n");
      out.write("                        <option value=\"United States - Michigan-Detroit\">United States - Michigan-Detroit</option>\r\n");
      out.write("                        <option value=\"United States - Michigan-Grand Rapids\">United States - Michigan-Grand Rapids</option>\r\n");
      out.write("                        <option value=\"United States - Michigan-Lansing\">United States - Michigan-Lansing</option>\r\n");
      out.write("                        <option value=\"United States - Minnesota-Plymouth\">United States - Minnesota-Plymouth</option>\r\n");
      out.write("                        <option value=\"United States - Missouri-Creve Coeur\">United States - Missouri-Creve Coeur</option>\r\n");
      out.write("                        <option value=\"United States - Missouri-Kansas City\">United States - Missouri-Kansas City</option>\r\n");
      out.write("                        <option value=\"United States - Missouri-St.Louis\">United States - Missouri-St.Louis</option>\r\n");
      out.write("                        <option value=\"United States - Nebraska-Omaha\">United States - Nebraska-Omaha</option>\r\n");
      out.write("                        <option value=\"United States - New Hampshire-Portsmouth\">United States - New Hampshire-Portsmouth</option>\r\n");
      out.write("                        <option value=\"United States - New Jersey-Parsippany\">United States - New Jersey-Parsippany</option>\r\n");
      out.write("                        <option value=\"United States - New York-Albany\">United States - New York-Albany</option>\r\n");
      out.write("                        <option value=\"United States - New York-Rochester\">United States - New York-Rochester</option>\r\n");
      out.write("                        <option value=\"United States - Ohio-Cincinnati\">United States - Ohio-Cincinnati</option>\r\n");
      out.write("                        <option value=\"United States - Ohio-Cleveland\">United States - Ohio-Cleveland</option>\r\n");
      out.write("                        <option value=\"United States - Ohio-North Olmsted\">United States - Ohio-North Olmsted</option>\r\n");
      out.write("                        <option value=\"United States - Ohio-Toledo\">United States - Ohio-Toledo</option>\r\n");
      out.write("                        <option value=\"United States - Oregon-Portland\">United States - Oregon-Portland</option>\r\n");
      out.write("                        <option value=\"United States - Pennsylvania-Harrisburg\">United States - Pennsylvania-Harrisburg</option>\r\n");
      out.write("                        <option value=\"United States - Pennsylvania-Malvern\">United States - Pennsylvania-Malvern</option>\r\n");
      out.write("                        <option value=\"United States - Pennsylvania-York\">United States - Pennsylvania-York</option>\r\n");
      out.write("                        <option value=\"United States - Rhode Island-Providence\">United States - Rhode Island-Providence</option>\r\n");
      out.write("                        <option value=\"United States - Rhode Island-West Glocester\">United States - Rhode Island-West Glocester</option>\r\n");
      out.write("                        <option value=\"United States - South Dakota-Sioux Falls\">United States - South Dakota-Sioux Falls</option>\r\n");
      out.write("                        <option value=\"United States - Texas-Frisco\">United States - Texas-Frisco</option>\r\n");
      out.write("                        <option value=\"United States - Houston\">United States - Houston</option>\r\n");
      out.write("                        <option value=\"United States - Virginia-Reston\">United States - Virginia-Reston</option>\r\n");
      out.write("                        <option value=\"United States - Virginia-Roanoke\">United States - Virginia-Roanoke</option>\r\n");
      out.write("                        <option value=\"United States - Washington-Bellevue\">United States - Washington-Bellevue</option>\r\n");
      out.write("                        <option value=\"United States - Wisconsin-Green Bay\">United States - Wisconsin-Green Bay</option>\r\n");
      out.write("                        <option value=\"United States - Wisconsin-Madison\">United States - Wisconsin-Madison</option>\r\n");
      out.write("                        <option value=\"United States - Wisconsin-Milwaukee\">United States - Wisconsin-Milwaukee</option>\r\n");
      out.write("                        <option value=\"Argentina\">Argentina</option>\r\n");
      out.write("                        <option value=\"Australia-New South Wales-Sydney\">Australia-New South Wales-Sydney</option>\r\n");
      out.write("                        <option value=\"Australia-Queensland-Brisbane\">Australia-Queensland-Brisbane</option>\r\n");
      out.write("                        <option value=\"Australia-Victoria-Melbourne\">Australia-Victoria-Melbourne</option>\r\n");
      out.write("                        <option value=\"Austria\">Austria</option>\r\n");
      out.write("                        <option value=\"Belgium-Brussels\">Belgium-Brussels</option>\r\n");
      out.write("                        <option value=\"Belgium-Debroux\">Belgium-Debroux</option>\r\n");
      out.write("                        <option value=\"Belgium-Brussels-Capital Region-Brussels\">Belgium-Brussels-Capital Region-Brussels</option>\r\n");
      out.write("                        <option value=\"Brazil-Sao Paulo-Sao Paulo\">Brazil-Sao Paulo-Sao Paulo</option>\r\n");
      out.write("                        <option value=\"Brazil-Sao Paulo-Vila Olimpia\">Brazil-Sao Paulo-Vila Olimpia</option>\r\n");
      out.write("                        <option value=\"Canada-Alberta\">Canada-Alberta</option>\r\n");
      out.write("                        <option value=\"Canada-British Columbia-Vancouver\">Canada-British Columbia-Vancouver</option>\r\n");
      out.write("                        <option value=\"Canada-Manitoba-Winnipeg\">Canada-Manitoba-Winnipeg</option>\r\n");
      out.write("                        <option value=\"Canada-Nova Scotia-Halifax\">Canada-Nova Scotia-Halifax</option>\r\n");
      out.write("                        <option value=\"Canada-Ontario-Thornhill\">Canada-Ontario-Thornhill</option>\r\n");
      out.write("                        <option value=\"Canada-Ontario-Vaughan\">Canada-Ontario-Vaughan</option>\r\n");
      out.write("                        <option value=\"Canada-Quebec-Montreal\">Canada-Quebec-Montreal</option>\r\n");
      out.write("                        <option value=\"Chile\">Chile</option>\r\n");
      out.write("                        <option value=\"Chile-Region Metropolitana de Santiago\">Chile-Region Metropolitana de Santiago</option>\r\n");
      out.write("                        <option value=\"China-Beijing\">China-Beijing</option>\r\n");
      out.write("                        <option value=\"China-Shanghai\">China-Shanghai</option>\r\n");
      out.write("                        <option Value=\"Colombia-Bogota\">Colombia-Bogota</option>\r\n");
      out.write("                        <option value=\"Colombia\">Colombia</option>\r\n");
      out.write("                        <option value=\"Czech Republic\">Czech Republic</option>\r\n");
      out.write("                        <option value=\"Denmark\">Denmark</option>\r\n");
      out.write("                        <option value=\"Egypt\">Egypt</option>\r\n");
      out.write("                        <option value=\"Finland\">Finland</option>\r\n");
      out.write("                        <option value=\"France-Metz-Tessy\">France-Metz-Tessy</option>\r\n");
      out.write("                        <option value=\"France-Paris La Defense Cedex\">France-Paris La Defense Cedex</option>\r\n");
      out.write("                        <option value=\"France-Paris\">France-Paris</option>\r\n");
      out.write("                        <option value=\"France-Haute-Savoie-Mety-Tessy\">France-Haute-Savoie-Mety-Tessy</option>\r\n");
      out.write("                        <option value=\"Germany-Frankfurt\">Germany-Frankfurt</option>\r\n");
      out.write("                        <option value=\"Hong Kong-Mongkok\">Hong Kong-Mongkok</option>\r\n");
      out.write("                        <option value=\"Hungary\">Hungary</option>\r\n");
      out.write("                        <option value=\"India-Karnataka-Bangalulu\">India-Karnataka-Bangalulu</option>\r\n");
      out.write("                        <option value=\"Ireland\">Ireland</option>\r\n");
      out.write("                        <option value=\"Ireland-Dublin\">Ireland-Dublin</option>\r\n");
      out.write("                        <option value=\"Italy-Milano\">Italy-Milano</option>\r\n");
      out.write("                        <option value=\"Japan-Kanagawa-Yokohama\">Japan-Kanagawa-Yokohama</option>\r\n");
      out.write("                        <option value=\"South Korea-Seoul\">South Korea-Seoul</option>\r\n");
      out.write("                        <option value=\"Luxembourg\">Luxembourg</option>\r\n");
      out.write("                        <option value=\"Malaysia-Kuala Kumpur\">Malaysia-Kuala Kumpur</option>\r\n");
      out.write("                        <option value=\"Mexico-Nuevo Leon-Monterrey\">Mexico-Nuevo Leon-Monterrey</option>\r\n");
      out.write("                        <option value=\"Mexico-Nuevo Leon-San Pedro\">Mexico-Nuevo Leon-San Pedro</option>\r\n");
      out.write("                        <option value=\"Mexico-Nuevo Leon-San Pedro Garza Garcia\">Mexico-Nuevo Leon-San Pedro Garza Garcia</option>\r\n");
      out.write("                        <option value=\"Netherlands-Amsterdam\">Netherlands-Amsterdam</option>\r\n");
      out.write("                        <option value=\"New Zealand\">New Zealand</option>\r\n");
      out.write("                        <option value=\"Philippines-Quezon City,Metro Manilla\">Philippines-Quezon City,Metro Manilla</option>\r\n");
      out.write("                        <option value=\"Poland\">Poland</option>\r\n");
      out.write("                        <option value=\"Portugal\">Portugal</option>\r\n");
      out.write("                        <option value=\"Romania\">Romania</option>\r\n");
      out.write("                        <option value=\"Russia-Moscow\">Russia-Moscow</option>\r\n");
      out.write("                        <option value=\"Singapore\">Singapore</option>\r\n");
      out.write("                        <option value=\"Slovakia\">Slovakia</option>\r\n");
      out.write("                        <option value=\"South Africa-Johannesburg\">South Africa-Johannesburg</option>\r\n");
      out.write("                        <option value=\"Spain-Madrid\">Spain-Madrid</option>\r\n");
      out.write("                        <option value=\"Sweden-Stockholm\">Sweden-Stockholm</option>\r\n");
      out.write("                        <option value=\"Switzerland-Bern\">Switzerland-Bern</option>\r\n");
      out.write("                        <option value=\"Switzerland\">Switzerland</option>\r\n");
      out.write("                        <option value=\"Thailand\">Thailand</option>\r\n");
      out.write("                        <option value=\"Turkey-Atasehir\">Turkey-Atasehir</option>\r\n");
      out.write("                        <option value=\"United Arab Emirates-Abu Dhabi\">United Arab Emirates-Abu Dhabi</option>\r\n");
      out.write("                        <option value=\"United Kingdom-London\">United Kingdom-London</option>\r\n");
      out.write("                        <option value=\"United Kingdom-Maidenhead\">United Kingdom-Maidenhead</option>\r\n");
      out.write("                        <option value=\"United Kingdom-Manchester\">United Kingdom-Manchester</option>\r\n");
      out.write("                        <option value=\"United Kingdom-Windsor and maidenhead-Windsor\">United Kingdom-Windsor and maidenhead-Windsor</option>\r\n");
      out.write("                        <option value=\"Vietnam\">Vietnam</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div>\r\n");
      out.write("	                <span>문의 카테고리:</span>\r\n");
      out.write("	                <select name=\"category\" required>\r\n");
      out.write("	                    <option value=\"I couldn't mind my email\">I couldn't mind my email</option>\r\n");
      out.write("	                    <option value=\"I forgot my password\">I forgot my password</option>\r\n");
      out.write("	                    <option value=\"other\">Other</option>\r\n");
      out.write("	                </select>\r\n");
      out.write("           		</div>\r\n");
      out.write("				<div>\r\n");
      out.write("					<span>제목:</span>\r\n");
      out.write("					<input type=\"text\" name=\"title\" placeholder=\"제목을 입력하세요\">\r\n");
      out.write("				</div>\r\n");
      out.write("				<div>\r\n");
      out.write("					<span>문의사항:</span>\r\n");
      out.write("					<textarea name=\"refer\" placeholder=\"자세한 문의사항을 입력하세요\" rows=\"4\"></textarea> \r\n");
      out.write("				</div>\r\n");
      out.write("				<div>\r\n");
      out.write("					<input type=\"submit\" value=\"Send\">\r\n");
      out.write("				</div>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</body>\r\n");
      out.write("</html> ");
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
