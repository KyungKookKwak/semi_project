/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2019-01-08 17:03:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.schedule;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.kh.schedule.model.vo.*;
import com.kh.member.model.vo.*;

public final class scheduleSearch_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1546950061174L));
    _jspx_dependants.put("/WEB-INF/views/common/side.jsp", Long.valueOf(1546966739567L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("com.kh.schedule.model.vo");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("com.kh.member.model.vo");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");

	Member memberLoggedIn = (Member)session.getAttribute("memberLoggedIn");    

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Alfa+Slab+One|Staatliches|Noto+Sans+KR|Abril+Fatface\" rel=\"stylesheet\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/header.css\">\r\n");
      out.write("  <link rel=\"shortcut icon\" href=\"");
      out.print(request.getContextPath() );
      out.write("/images/logo(favicon).png\" type=\"image/png\" sizes=\"128x128\">\r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery-3.3.1.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("#logged-in{\r\n");
      out.write("\twidth: 250px;\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\tright: 0px;\r\n");
      out.write("\ttop: 5px;\t\t\t\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("  <nav class=\"header\">\r\n");
      out.write("    <div class=\"logo\">\r\n");
      out.write("      <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/logo.png\" width=\"50px\" height=\"50px\" >\r\n");
      out.write("      <span class=\"logofont\">7' Scheduler\r\n");
      out.write("      </span>\r\n");
      out.write("    </div>  \r\n");
      out.write("   ");
if(memberLoggedIn != null){ 
      out.write("\r\n");
      out.write("  <table id=\"logged-in\" >\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t ");
      out.print(memberLoggedIn.getMemberName() );
      out.write("님,\t안녕하세요 :)\t\t \r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"정보수정\" onclick=/>\r\n");
      out.write("\t\t\t&nbsp;\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"로그아웃\" onclick=\"logout();\"/>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\t\r\n");
      out.write("\t");
}else{ 
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("    \r\n");
      out.write("  </nav>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("$(\".logo\").click(function(){\r\n");
      out.write("\tlocation.href = \"");
      out.print(request.getContextPath() );
      out.write("\";\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("function logout(){\r\n");
      out.write("\tlocation.href = \"");
      out.print(request.getContextPath() );
      out.write("/member/logout\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html >\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Alfa+Slab+One|Staatliches|Noto+Sans+KR|Abril+Fatface\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery-3.3.1.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/side.css\" />\r\n");
      out.write("  <script>\r\n");
      out.write("  window.onload =function(){\r\n");
      out.write("\tvar apiURI = \"http://api.openweathermap.org/data/2.5/weather?q=Seoul&appid=c95231fca9f07b22a6540efdcce37587\";\r\n");
      out.write("    $.ajax({\r\n");
      out.write("        url: apiURI,\r\n");
      out.write("        dataType: \"json\",\r\n");
      out.write("        type: \"GET\",\r\n");
      out.write("        async: \"false\",\r\n");
      out.write("        success: function(resp) {\r\n");
      out.write("        \tvar myDiv = document.getElementById(\"myDiv\"); \r\n");
      out.write("        \tvar table = $(\"<table></table>\");\r\n");
      out.write("\t\t\tvar imgURL = \"http://openweathermap.org/img/w/\" + resp.weather[0].icon + \".png \";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tvar html = \"<br><br>현재온도 : \"+(resp.main.temp- 273.15)+\"<br>\";\r\n");
      out.write("\t\t\thtml += \"상세날씨 설명 : \"+resp.main.humidity+\"<br>\";\r\n");
      out.write("\t\t\thtml += \"날씨 : \"+resp.weather[0].description+\"<br>\";\r\n");
      out.write("\t\t\thtml += \"나라 : \"+resp.sys.country+\"<br>\";\r\n");
      out.write("\t\t\thtml += \"도시 이름 : \"+resp.name+\"<br>\";\r\n");
      out.write("\t\t\thtml += \"구름 : \"+(resp.clouds.all)+\"%<br>\";\r\n");
      out.write("\t\t\thtml += \"<button>추천 여행지 보기</button>\";\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tmyDiv.innerHTML = html;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("            console.log(resp);\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            console.log(\"현재온도 : \"+ (resp.main.temp- 273.15) );\r\n");
      out.write("            console.log(\"현재습도 : \"+ resp.main.humidity);\r\n");
      out.write("            console.log(\"날씨 : \"+ resp.weather[0].main );\r\n");
      out.write("            console.log(\"상세날씨설명 : \"+ resp.weather[0].description );\r\n");
      out.write("            console.log(\"날씨 이미지 : \"+ resp.weather[0].icon );\r\n");
      out.write("            console.log(\"바람   : \"+ resp.wind.speed );\r\n");
      out.write("            console.log(\"나라   : \"+ resp.sys.country );\r\n");
      out.write("            console.log(\"도시이름  : \"+ resp.name );\r\n");
      out.write("            console.log(\"구름  : \"+ (resp.clouds.all) +\"%\" );                \r\n");
      out.write("        }\r\n");
      out.write("    })\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"side\">\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/schedule/schedulelist\">스케줄 찾기</a><br />\r\n");
      out.write("\t\t<a href=\"##\">년간 달력5</a><br />\r\n");
      out.write("\t\t<a href=\"##\">년간 달력6</a><br />\r\n");
      out.write("\t\t<a href=\"##\">년간 달력7</a><br />\r\n");
      out.write("\t\t\r\n");
      out.write("\t<div id=\"myDiv\">\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');
	
	List<Schedule> list = (List<Schedule>)request.getAttribute("list");
	int cPage = (int)request.getAttribute("cPage");
	int numPerPage = (int)request.getAttribute("numPerPage");
	String pageBar = (String)request.getAttribute("pageBar");
	String searchType = request.getParameter("searchType");
	String searchKeyword = request.getParameter("searchKeyword");
	

      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath());
      out.write("/css/scheduleList.css\" />\r\n");
      out.write("<style>\r\n");
      out.write("div#search-scheduleTitle{\r\n");
      out.write("\tdisplay: ");
      out.print("scheduleTitle".equals(searchType)?"inline-block":"none");
      out.write(";\r\n");
      out.write("}\r\n");
      out.write("div#search-scheduleContent{\r\n");
      out.write("\tdisplay: ");
      out.print("scheduleContent".equals(searchType)?"inline-block":"none");
      out.write(";\r\n");
      out.write("}\r\n");
      out.write("div#search-scheduleIcon{\r\n");
      out.write("\tdisplay: ");
      out.print("scheduleIcon".equals(searchType)?"inline-block":"none");
      out.write(";\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("$(function(){\r\n");
      out.write("\tvar scheduleTitle = $(\"#search-scheduleTitle\");\t\r\n");
      out.write("\tvar scheduleContent = $(\"#search-scheduleContent\");\r\n");
      out.write("\tvar scheduleIcon = $(\"#search-scheduleIcon\");\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"select#searchType\").change(function(){\r\n");
      out.write("\t\tscheduleTitle.hide();\r\n");
      out.write("\t\tscheduleContent.hide();\r\n");
      out.write("\t\tscheduleIcon.hide();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#search-\"+$(this).val()).css(\"display\",\"inline-block\");\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#divicon img\").on('click',function(){\r\n");
      out.write("\t\tvar clickedIcon = $(this).attr(\"alt\");\t\t\r\n");
      out.write("\t\t$(\"#text\").text($(this).attr(\"alt\"));\r\n");
      out.write("\t\t$(\"#search-scheduleIcon#searchKeyword\").val($(this).attr(\"alt\"));\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.3.1.js\"></script>\r\n");
      out.write("<section id=\"schedulesearch-container\">\t\r\n");
      out.write("<h2>스케줄 찾기</h2>\t\r\n");
      out.write("\t\t검색 &nbsp;&nbsp;\r\n");
      out.write("\t\t<select id=\"searchType\">\r\n");
      out.write("\t\t\t<option value=\"scheduleTitle\" ");
      out.print("scheduleTitle".equals(searchType)?"selected":"" );
      out.write(">제목</option>\r\n");
      out.write("\t\t\t<option value=\"scheduleContent\" ");
      out.print("scheduleContent".equals(searchType)?"selected":"" );
      out.write(">내용</option>\r\n");
      out.write("\t\t\t<option value=\"scheduleIcon\" ");
      out.print("scheduleIcon".equals(searchType)?"selected":"" );
      out.write(">아이콘</option>\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t&nbsp;\r\n");
      out.write("\t\t<div id=\"search-scheduleTitle\">\t\t\t\r\n");
      out.write("\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/schedule/scheduleSearch\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" \r\n");
      out.write("\t\t\t\t\t   name=\"numPerPage\" \r\n");
      out.write("\t\t\t\t\t   value=\"");
      out.print(numPerPage);
      out.write("\"/>\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" \r\n");
      out.write("\t\t\t\t\t   name=\"searchType\"\r\n");
      out.write("\t\t\t\t\t   value=\"scheduleTitle\" />\r\n");
      out.write("\t\t\t\t<input type=\"search\" \r\n");
      out.write("\t\t\t\t\t   name=\"searchKeyword\"\r\n");
      out.write("\t\t\t\t\t   size=\"25\"\r\n");
      out.write("\t\t\t\t\t   placeholder=\"검색할 제목을 입력하세요.\"\r\n");
      out.write("\t\t\t\t\t   value=\"");
      out.print("scheduleTitle".equals(searchType)?searchKeyword:"");
      out.write("\"/>&nbsp;\r\n");
      out.write("\t\t\t\t<button type=\"submit\">검색</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"search-scheduleContent\">\t\t\t\r\n");
      out.write("\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/schedule/scheduleSearch\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" \r\n");
      out.write("\t\t\t\t\t   name=\"numPerPage\" \r\n");
      out.write("\t\t\t\t\t   value=\"");
      out.print(numPerPage);
      out.write("\"/>\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" \r\n");
      out.write("\t\t\t\t\t   name=\"searchType\"\r\n");
      out.write("\t\t\t\t\t   value=\"scheduleContent\" />\r\n");
      out.write("\t\t\t\t<input type=\"search\" \r\n");
      out.write("\t\t\t\t\t   name=\"searchKeyword\"\r\n");
      out.write("\t\t\t\t\t   size=\"25\"\r\n");
      out.write("\t\t\t\t\t   placeholder=\"검색할 내용을 입력하세요.\"\r\n");
      out.write("\t\t\t\t\t   value=\"");
      out.print("scheduleContent".equals(searchType)?searchKeyword:"");
      out.write("\"/>&nbsp;\r\n");
      out.write("\t\t\t\t<button type=\"submit\">검색</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"search-scheduleIcon\">\t\t\t\r\n");
      out.write("\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/schedule/scheduleSearch\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" \r\n");
      out.write("\t\t\t\t\t   name=\"numPerPage\" \r\n");
      out.write("\t\t\t\t\t   value=\"");
      out.print(numPerPage);
      out.write("\"/>\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" \r\n");
      out.write("\t\t\t\t\t   name=\"searchType\"\r\n");
      out.write("\t\t\t\t\t   value=\"scheduleIcon\" />\t\t\t\t\r\n");
      out.write("\t\t\t\t<input type=\"search\" \r\n");
      out.write("\t\t\t\t\t   name=\"searchKeyword\"\r\n");
      out.write("\t\t\t\t\t   size=\"25\"\r\n");
      out.write("\t\t\t\t\t   placeholder=\"검색할 아이콘을 선택하세요.\"\r\n");
      out.write("\t\t\t\t\t   readonly\r\n");
      out.write("\t\t\t\t\t   value=\"");
      out.print("scheduleIcon".equals(searchType)?searchKeyword:"");
      out.write("\"/>\r\n");
      out.write("\t\t\t\t<div id=\"divicon\">\r\n");
      out.write("\t\t\t\t<table id=\"tableicon\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/flower1.PNG\" id=\"icon\" alt=\"christmas\"  ></td>\r\n");
      out.write("\t\t\t\t\t<td><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/flower2.PNG\" id=\"icon\" alt=\"birthday\"></td>\r\n");
      out.write("\t\t\t\t\t<td><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/flower3.PNG\" id=\"icon\" alt=\"exhibition\"></td>\r\n");
      out.write("\t\t\t\t\t<td><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/logo.PNG\" id=\"icon\" alt=\"family\"></td>\r\n");
      out.write("\t\t\t\t\t<td><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/birthday.PNG\" id=\"icon\" alt=\"hospital\"></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<div id=\"text\"></div>\r\n");
      out.write("\t\t\t\t</table>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\t\t\t\t\r\n");
      out.write("\t\t\t\t<button type=\"submit\" id=\"btn\">검색</button>\t\t\t\t\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</section>\r\n");
      out.write("<section id=\"schedulelist-container\">\t\t\r\n");
      out.write("\t<table id=\"tbl-schedulelist\">\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th>번호</th>\r\n");
      out.write("\t\t<th>스케줄 시작일</th>\r\n");
      out.write("\t\t<th>스케줄 종료일</th>\r\n");
      out.write("\t\t<th>제목</th>\r\n");
      out.write("\t\t<th>작성일</th>\t\t\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t<!-- 스크립틀릿 처리요망 -->\r\n");
      out.write("\t");
 if(list == null || list.isEmpty()){ 
      out.write("\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=\"6\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t검색결과가 없습니다.\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t");
} 
	else {
		int index=0;
		for(Schedule s : list){
			index++;			
	
      out.write("\t\t\t\r\n");
      out.write("\t\t<tr>\t\t\t\t\t\r\n");
      out.write("\t\t\t<td>");
      out.print((cPage-1)*7+index);
      out.write("</td>\t\t\t\t\r\n");
      out.write("\t\t\t<td>");
      out.print(s.getScheduleStartday() );
      out.write("</td>\r\n");
      out.write("\t\t\t<td>");
      out.print(s.getScheduleEndday() );
      out.write("</td>\t\t\t\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/schedule/scheduleView?ScheduleNo=");
      out.print(s.getScheduleNo());
      out.write("\">\r\n");
      out.write("\t\t\t");
      out.print(s.getScheduleTitle() );
      out.write("</a></td>\r\n");
      out.write("\t\t\t<td>");
      out.print(s.getScheduleDate() );
      out.write("</td>\t\t\t\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t");
 }
	} 
      out.write("\t\t\r\n");
      out.write("\t</table>\r\n");
      out.write("\t<div id=\"pageBar\">\r\n");
      out.write("\t");
      out.print(pageBar );
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("</section>\r\n");
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
