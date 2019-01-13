/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2019-01-13 10:19:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import com.kh.member.model.vo.*;
import com.kh.schedule.model.vo.*;
import com.kh.member.model.vo.*;
import com.kh.member.model.vo.Member;

public final class monthlySchedule_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1547372656020L));
    _jspx_dependants.put("/WEB-INF/views/common/side.jsp", Long.valueOf(1547372656024L));
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
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.member.model.vo.Member");
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
      out.write("\r\n");

	//전달받은 데이터에서 현재일자를 꺼냄.
	List<Schedule> list = (List<Schedule>)request.getAttribute("list");
	int year = (int)request.getAttribute("year");
	int month = (int)request.getAttribute("month");
	int day = (int)request.getAttribute("day");
	int start = (int)request.getAttribute("start");
	int last = (int)request.getAttribute("last");
	Map<Integer,List<Schedule>> map = (HashMap<Integer,List<Schedule>>)request.getAttribute("map");
	
	Member m = (Member)request.getAttribute("memberLoggedIn");
	
	//schedule data 를 date별로 나누기


      out.write("\r\n");
      out.write("\r\n");
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
      out.write(" <link href=\"https://fonts.googleapis.com/css?family=Black+Han+Sans\" rel=\"stylesheet\">\r\n");
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
      out.write("<body oncontextmenu=\"return false;\">\r\n");
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
      out.write("\t\t\t<input type=\"button\" value=\"내정보\" onclick='location.href=\"");
      out.print(request.getContextPath());
      out.write("/member/MemberView?memberId=");
      out.print(memberLoggedIn.getMemberId());
      out.write("\";'/>\r\n");
      out.write("\t\t\t&nbsp;\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"로그아웃\" onclick=\"logout();\"/>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\t</table>\t\r\n");
      out.write("\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t");
} 
      out.write("\r\n");
      out.write("    \r\n");
      out.write("  </nav>\r\n");
      out.write("</body>\r\n");
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
      out.write("\r\n");

Member memberLoggedIn1 = (Member)session.getAttribute("memberLoggedIn");  


      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html >\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Alfa+Slab+One|Staatliches|Noto+Sans+KR|Abril+Fatface\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Coiny|Do+Hyeon|Gothic+A1|Nanum+Gothic+Coding|Nanum+Pen+Script|Noto+Sans+KR\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery-3.3.1.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/side.css\" />\r\n");
      out.write("<style>\r\n");
      out.write(".side{\r\n");
      out.write(" width:174px;\r\n");
      out.write("}\r\n");
      out.write("#friends{\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\tbackground:gray;\r\n");
      out.write("\ttop:-80px;\r\n");
      out.write("\tleft:200px;\r\n");
      out.write("\twidth: 350px;\r\n");
      out.write("\theight:300px;\r\n");
      out.write("\tborder: 1px solid red;\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("\tz-index: 2;\r\n");
      out.write("\toverflow: scroll;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("ul#autoComplete{\r\n");
      out.write("\tmin-width: 159px;\r\n");
      out.write("\tborder: 1px solid gray;\r\n");
      out.write("\tdisplay: none;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul#autoComplete li{\r\n");
      out.write("\tpadding: 0 10px;\r\n");
      out.write("\tlist-style: none;\r\n");
      out.write("\tcursor: pointer;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul#autoComplete li.selected{\r\n");
      out.write("\tbackground: lightseagreen;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("span.srchVal{\r\n");
      out.write("\tcolor: red;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("  function showPopup(temp) {\r\n");
      out.write("\t  var windowW = 800;  // 창의 가로 길이\r\n");
      out.write("      var windowH = 500;  // 창의 세로 길이\r\n");
      out.write("      var left = Math.ceil((window.screen.width - windowW)/2);\r\n");
      out.write("      var top = Math.ceil((window.screen.height - windowH)/2);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t  window.open(\"");
      out.print(request.getContextPath() );
      out.write("/member/recommendation?temp=\"+temp, \"a\",\"l top=\"+top+\", left=\"+left+\", height=\"+windowH+\", width=\"+windowW); \r\n");
      out.write("\t  \r\n");
      out.write("\t  \r\n");
      out.write("  }\r\n");
      out.write("  function addfriend(){\r\n");
      out.write("\t$(\"#friends\").css('display','inline-block');\t  \r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("  </script>\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <script>\r\n");
      out.write("  \r\n");
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
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\thtml = \"<br><br>현재온도 : \"+(resp.main.temp- 273.15)+\"<br>\";\r\n");
      out.write("\t\t\thtml += \"상세날씨 설명 : \"+resp.main.humidity+\"<br>\";\r\n");
      out.write("\t\t\thtml += \"날씨 : \"+resp.weather[0].description+\"<br>\";\r\n");
      out.write("\t\t\thtml += \"나라 : \"+resp.sys.country+\"<br>\";\r\n");
      out.write("\t\t\thtml +=\t\"도시 이름 : \"+resp.name+\"<br>\";\r\n");
      out.write("\t\t\thtml += \"구름 : \"+(resp.clouds.all)+\"%<br>\";\r\n");
      out.write("\t\t\thtml += \"<input type='button' id='weatherbtn' value='추천 여행,의상 보기' onclick= 'showPopup(\"+(resp.main.temp- 273.15)+\");'/>\";\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tmyDiv.innerHTML = html;\r\n");
      out.write("\t\t\t\r\n");
      out.write("            //console.log(resp);\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            /* console.log(\"현재온도 : \"+ (resp.main.temp- 273.15) );\r\n");
      out.write("            console.log(\"현재습도 : \"+ resp.main.humidity);\r\n");
      out.write("            console.log(\"날씨 : \"+ resp.weather[0].main );\r\n");
      out.write("            console.log(\"상세날씨설명 : \"+ resp.weather[0].description );\r\n");
      out.write("            console.log(\"날씨 이미지 : \"+ resp.weather[0].icon );\r\n");
      out.write("            console.log(\"바람   : \"+ resp.wind.speed );\r\n");
      out.write("            console.log(\"나라   : \"+ resp.sys.country );\r\n");
      out.write("            console.log(\"도시이름  : \"+ resp.name );\r\n");
      out.write("            console.log(\"구름  : \"+ (resp.clouds.all) +\"%\" );   */              \r\n");
      out.write("        \t}\r\n");
      out.write("    \t})\r\n");
      out.write("\t};\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"side\">\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<div id=\"searchsch\">\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/schedule/schedulelist\" id=\"font\">스케줄 찾기</a><br />\r\n");
      out.write("\t\t<!-- <a href=\"##\">년간 달력5</a><br />\r\n");
      out.write("\t\t<a href=\"##\">년간 달력6</a><br />\r\n");
      out.write("\t\t<a href=\"##\">년간 달력7</a><br /> -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"myDiv\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"friend\">\r\n");
      out.write("\t\t\t<p>친구들\r\n");
      out.write("\t\t\t<button id=\"addfriend\" onclick=\"addfriend();\">+</button></p>\r\n");
      out.write("\t\t\t<div id=\"friendspace\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"friends\">\r\n");
      out.write("\t\t<form class=\"insertFriendFrm\" name=\"insertFriendFrm\"\r\n");
      out.write("\t\t\taction=\"");
      out.print(request.getContextPath());
      out.write("/friend/insertFriend\" \r\n");
      out.write("\t\t\tmethod=\"post\">\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" name=\"myId\" id=\"myId\" value=\"");
      out.print(memberLoggedIn1.getMemberId() );
      out.write("\" />\r\n");
      out.write("\t\t\t\t<label for=\"srchId\">아이디 : </label>\r\n");
      out.write("\t\t\t\t<input type=\"text\"  name=\"srchId\" id=\"srchId\" autocomplete=\"off\" />\r\n");
      out.write("\t\t\t\t<button type=\"submit\">친구 추가</button>\r\n");
      out.write("\t\t\t\t\t<ul id=\"autoComplete\">\r\n");
      out.write("\t\t\t\t\t\t<li>1</li>\r\n");
      out.write("\t\t\t\t\t\t<li>2</li>\r\n");
      out.write("\t\t\t\t\t\t<li>3</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<hr />\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("$(\"#srchId\").on(\"keyup\" , function(e){\r\n");
      out.write("\tconsole.log(e.key);\r\n");
      out.write("\tvar selected = $(\".selected\");\r\n");
      out.write("\tvar li = $(\"#autoComplete li\");\r\n");
      out.write("\t\r\n");
      out.write("\tif(e.key == \"ArrowDown\") {\r\n");
      out.write("\t\tif(selected.length == 0) {\r\n");
      out.write("\t\t\t$(\"#autoComplete li:first\").addClass(\"selected\");\r\n");
      out.write("\t\t} else if(selected.is(li.last())) {\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tselected.removeClass(\"selected\").next().addClass(\"selected\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t} else if(e.key == \"ArrowUp\") {\r\n");
      out.write("\t\tif(selected.length == 0) {\r\n");
      out.write("\t\t} else if(selected.is(li.first())) {\r\n");
      out.write("\t\t\tselected.removeClass(\"selected\");\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tselected.removeClass(\"selected\").prev().addClass(\"selected\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t} else if(e.key == \"Enter\") {\r\n");
      out.write("\t\t$(this).val(selected.text());\r\n");
      out.write("\t\t$(\"#autoComplete\").hide().children().remove();\r\n");
      out.write("\t} else {\r\n");
      out.write("\t\tvar srchId = $(this).val().trim();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tif(srchId.length == 0) {\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl: \"");
      out.print(request.getContextPath());
      out.write("/friend/autoComplete.do\" ,\r\n");
      out.write("\t\t\ttype: \"post\" ,\r\n");
      out.write("\t\t\tdata: {srchId:srchId} ,\r\n");
      out.write("\t\t\tsuccess: function(data) {\r\n");
      out.write("\t\t\t\tconsole.log(data);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tvar idArr = data.split(\",\");\r\n");
      out.write("\t\t\t\tvar html = \"\";\r\n");
      out.write("\t\t\t\tfor(var i = 0;i < idArr.length;i++) {\r\n");
      out.write("\t\t\t\t\thtml += \"<li>\"+idArr[i].replace(srchId,\"<span class='srchVal'>\"+srchId+\"</span>\");\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tif(data.length != 0) {\r\n");
      out.write("\t\t\t\t\t$(\"#autoComplete\").html(html).css(\"display\" , \"inline-block\");\t\t\t\t\r\n");
      out.write("\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t$(\"#autoComplete\").hide();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$(\"#autoComplete\").on(\"click\" , \"li\" , function(){\r\n");
      out.write("\t$(\"#srchId\").val($(this).text());\r\n");
      out.write("\t$(\"#autoComplete\").hide().children().remove();\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("$(\"#autoComplete\").on(\"mouseenter\" , \"li\" , function() {\r\n");
      out.write("\t$(this).siblings().removeClass(\"selected\");\r\n");
      out.write("\t$(this).addClass(\"selected\");\r\n");
      out.write("});\r\n");
      out.write("$(\"#autoComplete\").on(\"mouseleave\" , \"li\" , function() {\r\n");
      out.write("\t$(this).removeClass(\"selected\");\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("</script>\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/month.css\" />\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Do+Hyeon\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("/* 일일 칸에 클릭 이벤트 */\r\n");
      out.write("function addClickEvent(){\r\n");
      out.write("\tvar tag = $(\"#add\").find(\"td\");\r\n");
      out.write("\ttag.each(function(idx, item){\r\n");
      out.write("\t\t$(item).click(function(){\r\n");
      out.write("\t\t\tvar year = $(\"#cYear\").text();\r\n");
      out.write("\t\t\tvar month = $(\"#cMonth\").text();\r\n");
      out.write("\t\t\tvar day = $(this).children().attr(\"id\");\r\n");
      out.write("\t\t\tif(day != null){\r\n");
      out.write("\t\t\tlocation.href = \"");
      out.print(request.getContextPath() );
      out.write("/schedule/oneday?year=\"+year+\"&month=\"+month+\"&day=\"+day;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("\ttable#add tr td:first-of-type{\r\n");
      out.write("       color:red;\r\n");
      out.write("   }\r\n");
      out.write("   /* table#add tr td:last-of-type{\r\n");
      out.write("       color:blue;\r\n");
      out.write("   } */\r\n");
      out.write("   span.sat{\r\n");
      out.write("       color:blue;\r\n");
      out.write("   }\r\n");
      out.write("   #yearTest{\r\n");
      out.write("   \tborder: 1px solid red;\r\n");
      out.write("   \twidth: 100px;\r\n");
      out.write("   \theight: 100px;\r\n");
      out.write("   \tposition: absolute;\r\n");
      out.write("   \tleft: 150px;\r\n");
      out.write("   }\r\n");
      out.write("</style>\r\n");
      out.write("<!-- 년간 달력 테스트 -->\r\n");
      out.write("<div id=\"yearTest\">\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\t<!-- 스케줄영역 -->\r\n");
      out.write("\t<div id=\"schedule\">\r\n");
      out.write("\t\t<div id=\"main\">\r\n");
      out.write("            <span id=\"prevMonth\">&lt;</span>\r\n");
      out.write("            <span id=\"cYear\">");
      out.print(year );
      out.write("</span>년\r\n");
      out.write("            <span id=\"cMonth\">");
      out.print(month+1 );
      out.write("</span>월\r\n");
      out.write("            <span id=\"nextMonth\">&gt;</span>\r\n");
      out.write("        </div>\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t<table id=\"month\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th style=\"color:red;\">일</th>\r\n");
      out.write("\t\t\t\t<th>월</th>\r\n");
      out.write("\t\t\t\t<th>화</th>\r\n");
      out.write("\t\t\t\t<th>수</th>\r\n");
      out.write("\t\t\t\t<th>목</th>\r\n");
      out.write("\t\t\t\t<th>금</th>\r\n");
      out.write("\t\t\t\t<th style=\"color:blue;\">토</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<table id=\"add\">\r\n");
      out.write("\t\t\t<script>\r\n");
      out.write("\t\t\tvar html = \"\";\r\n");
      out.write("\t\t\tvar start = ");
      out.print(start );
      out.write(";\r\n");
      out.write("\t\t\tfor(var i=0; i<=");
      out.print(last );
      out.write("+1; i++){\r\n");
      out.write("                html = \"<td><span></span></td>\";\r\n");
      out.write("                if(i>=start && i<=");
      out.print(last );
      out.write("+1){\r\n");
      out.write("                if(i%7 == 6)html = \"<td><span id='\"+(i-start+1)+\"' class='sat'>\"+(i-start+1)+\"</span></td>\";\r\n");
      out.write("                else html = \"<td><span id='\"+(i-start+1)+\"'>\"+(i-start+1)+\"</span></td>\";\r\n");
      out.write("                if(i%7 == 0) html = \"<tr><td><span id='\"+(i-start+1)+\"'>\"+(i-start+1)+\"</span></td>\";\r\n");
      out.write("                }\r\n");
      out.write("                document.write(html);\r\n");
      out.write("            }\r\n");
      out.write("\t\t\tvar span = $(\"#add\").find(\"span\");\r\n");
      out.write("\t\t\tfor(var i=0; i< span.length; i++){\r\n");
      out.write("\t\t\t\t");
 for(int i=1; i<=31; i++){
					if(!map.get(i).isEmpty()){ 
      out.write("\r\n");
      out.write("\t\t\t\tif(span[i].id == ");
      out.print(i );
      out.write(") span[i].innerText = span[i].id+\"");
      out.print(map.get(i).get(0).getScheduleTitle() );
      out.write("\";\r\n");
      out.write("\t\t\t\t\t");
}
				} 
      out.write("\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\taddClickEvent();\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- \r\n");
      out.write("\t<div id=\"chat-body\">\t\t\r\n");
      out.write("\t\t<div id=\"chat-before\">\r\n");
      out.write("\t\t앞에 초록색 동그라미 이모티콘 추가\r\n");
      out.write("\t\t\t<strong>채팅</strong>\r\n");
      out.write("\t\t\t뒤에 버튼 2~3가지 추가 친구 찾기 및 추가 / 새로운 그룹 추가 / 생각중\r\n");
      out.write("\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div id=\"chat-find-friend\">\r\n");
      out.write("\t\t\t돋보기 모양 이모티콘\r\n");
      out.write("\t\t\tinput:text Ajax사용해서 회원이름 검색시 주르륵 나오게\r\n");
      out.write("\t\t\t친구 찾기\r\n");
      out.write("\t\t\t오른쪽에는 +버튼 이미지? 버튼하나만들어서 추가 하게끔\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t</div> -->\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t/* 다음달로 넘어가는 기능 */\r\n");
      out.write("        $(\"#nextMonth\").click(function(){\r\n");
      out.write("        \t$.ajax({\r\n");
      out.write("        \t\turl: \"");
      out.print(request.getContextPath() );
      out.write("/schedule/nextMonth.do\",\r\n");
      out.write("        \t\ttype: \"get\",\r\n");
      out.write("        \t\tdataType: \"json\",\r\n");
      out.write("        \t\tdata: {\"cYear\":$(\"#cYear\").text(), \"cMonth\":($(\"#cMonth\").text()), \"memberId\":\"");
      out.print(m.getMemberId() );
      out.write("\"},\r\n");
      out.write("        \t\tsuccess: function(data){\r\n");
      out.write("        \t\t\tconsole.log(data);\r\n");
      out.write("        \t\t\tvar nextYear = data[1];\r\n");
      out.write("        \t\t\tvar nextMonth = data[2];\r\n");
      out.write("        \t\t\tvar start = data[3];\r\n");
      out.write("        \t\t\tvar last = data[4]+start;\r\n");
      out.write("        \t\t\tvar dataList = data[5];\r\n");
      out.write("        \t\t\t$(\"#cYear\").text(nextYear);\r\n");
      out.write("        \t\t\t$(\"#cMonth\").text(nextMonth+1);\r\n");
      out.write("        \t\t\tconsole.log(data[5][0] == null);\r\n");
      out.write("        \t\t\t\r\n");
      out.write("        \t\t\tvar table = $(\"#add\");\r\n");
      out.write("        \t\t\ttable.html(\"\");\r\n");
      out.write("        \t\t\tvar html = \"\";\r\n");
      out.write("        \t\t\tfor(var i=0; i<last-1; i++){\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("        \t\t\t\t\r\n");
      out.write("        \t\t\t\t\r\n");
      out.write("        \t\t\t\tif(i%7 != 0){\r\n");
      out.write("        \t\t\t\t\tif(i >= start-1){\r\n");
      out.write("        \t\t\t\t\t\tif(i%7 == 6){\r\n");
      out.write("        \t\t\t\t\t\t\thtml += \"<td><span id='\"+(i-start+2)+\"' class='sat'>\"+(i-start+2)+\"</span></td>\";\r\n");
      out.write("        \t\t\t\t\t\t}\r\n");
      out.write("        \t\t\t\t\t\telse{\r\n");
      out.write("        \t\t\t\t\t\t\thtml += \"<td><span id='\"+(i-start+2)+\"'>\"+(i-start+2)+\"</span></td>\";\r\n");
      out.write("        \t\t\t\t\t\t}\r\n");
      out.write("\t\t        \t\t\t\r\n");
      out.write("        \t\t\t\t\t}else{\r\n");
      out.write("        \t\t\t\t\thtml += \"<td><span></span></td>\";\r\n");
      out.write("        \t\t\t\t\t}\r\n");
      out.write("        \t\t\t\t}else{\r\n");
      out.write("        \t\t\t\t\t\r\n");
      out.write("        \t\t\t\t\tif(i >= start-1){\r\n");
      out.write("        \t\t\t\t\thtml += \"<tr><td><span id='\"+(i-start+2)+\"'>\"+(i-start+2)+\"</span></td>\";\r\n");
      out.write("        \t\t\t\t\t}else{\r\n");
      out.write("        \t\t\t\t\thtml += \"<tr><td><span></span></td>\";\r\n");
      out.write("        \t\t\t\t\t}\r\n");
      out.write("        \t\t\t\t}\r\n");
      out.write("        \t\t\t}\r\n");
      out.write("        \t\t\ttable.append(html);\r\n");
      out.write("        \t\t\t$(\"#month\").after(table);\r\n");
      out.write("        \t\t\t\r\n");
      out.write("        \t\t\tvar span = $(\"#add\").find(\"span\");\r\n");
      out.write("        \t\t\tif(dataList != null){\r\n");
      out.write("        \t\t\tfor(var i=0; i< span.length; i++){\r\n");
      out.write("        \t\t\t\tfor(var j=0; j<dataList.length; j++){\r\n");
      out.write("        \t\t\t\t\tconsole.log(i,j,dataList[j].scheduleTitle);\r\n");
      out.write("        \t\t\t\tif(span[i].id == dataList[j].theDay) span[i].innerText = span[i].id+dataList[j].scheduleTitle;\r\n");
      out.write("        \t\t\t\t}\r\n");
      out.write("        \t\t\t}\r\n");
      out.write("        \t\t\t}\r\n");
      out.write("        \t\t\t\r\n");
      out.write("        \t\t\taddClickEvent();\r\n");
      out.write("        \t\t}\r\n");
      out.write("        \t});\r\n");
      out.write("        });\r\n");
      out.write("        /* 이전달로 넘어가는 기능 */\r\n");
      out.write("        $(\"#prevMonth\").click(function(){\r\n");
      out.write("        \t$.ajax({\r\n");
      out.write("        \t\turl: \"");
      out.print(request.getContextPath() );
      out.write("/schedule/prevMonth.do\",\r\n");
      out.write("        \t\tdataType: \"json\",\r\n");
      out.write("        \t\ttype: \"get\",\r\n");
      out.write("        \t\tdata: {\"cYear\":$(\"#cYear\").text(), \"cMonth\":($(\"#cMonth\").text()), \"memberId\":\"");
      out.print(m.getMemberId() );
      out.write("\"},\r\n");
      out.write("        \t\tsuccess: function(data){\r\n");
      out.write("        \t\t\tconsole.log(data);\r\n");
      out.write("        \t\t\tvar prevYear = data[1];\r\n");
      out.write("        \t\t\tvar prevMonth = data[2];\r\n");
      out.write("        \t\t\tvar start = data[3];\r\n");
      out.write("        \t\t\tvar last = data[4]+start;\r\n");
      out.write("        \t\t\tvar dataList = data[5];\r\n");
      out.write("        \t\t\t$(\"#cYear\").text(prevYear);\r\n");
      out.write("        \t\t\t$(\"#cMonth\").text(prevMonth+1);\r\n");
      out.write("        \t\t\tconsole.log(data[5][0] == null);\r\n");
      out.write("        \t\t\t\r\n");
      out.write("        \t\t\tvar table = $(\"#add\");\r\n");
      out.write("        \t\t\ttable.html(\"\");\r\n");
      out.write("        \t\t\tvar html = \"\";\r\n");
      out.write("        \t\t\tfor(var i=0; i<last-1; i++){\r\n");
      out.write("\r\n");
      out.write("        \t\t\t\tif(i%7 != 0){\r\n");
      out.write("        \t\t\t\t\tif(i >= start-1){\r\n");
      out.write("        \t\t\t\t\t\tif(i%7 == 6){\r\n");
      out.write("        \t\t\t\t\t\t\thtml += \"<td><span id='\"+(i-start+2)+\"' class='sat'>\"+(i-start+2)+\"</span></td>\";\r\n");
      out.write("        \t\t\t\t\t\t}\r\n");
      out.write("        \t\t\t\t\t\telse{\r\n");
      out.write("\t\t        \t\t\t\t\thtml += \"<td><span id='\"+(i-start+2)+\"'>\"+(i-start+2)+\"</span></td>\";\r\n");
      out.write("        \t\t\t\t\t\t\t\r\n");
      out.write("        \t\t\t\t\t\t}\r\n");
      out.write("        \t\t\t\t\t}else{\r\n");
      out.write("        \t\t\t\t\thtml += \"<td><span></span></td>\";\r\n");
      out.write("        \t\t\t\t\t}\r\n");
      out.write("        \t\t\t\t}else{\r\n");
      out.write("        \t\t\t\t\tif(i >= start-1){\r\n");
      out.write("        \t\t\t\t\thtml += \"<tr><td><span id='\"+(i-start+2)+\"'>\"+(i-start+2)+\"</span></td>\";\r\n");
      out.write("        \t\t\t\t\t}else{\r\n");
      out.write("        \t\t\t\t\thtml += \"<tr><td><span></span></td>\";\r\n");
      out.write("        \t\t\t\t\t}\r\n");
      out.write("        \t\t\t\t}\r\n");
      out.write("        \t\t\t}\r\n");
      out.write("        \t\t\ttable.append(html);\r\n");
      out.write("        \t\t\t$(\"#month\").after(table);\r\n");
      out.write("        \t\t\tvar span = $(\"#add\").find(\"span\");\r\n");
      out.write("        \t\t\tif(dataList != null){\r\n");
      out.write("        \t\t\tfor(var i=0; i< span.length; i++){\r\n");
      out.write("        \t\t\t\tfor(var j=0; j<dataList.length; j++){\r\n");
      out.write("        \t\t\t\t\tconsole.log(i,j,dataList[j].scheduleTitle);\r\n");
      out.write("        \t\t\t\tif(span[i].id == dataList[j].theDay) span[i].innerText = span[i].id+dataList[j].scheduleTitle;\r\n");
      out.write("        \t\t\t\t}\r\n");
      out.write("        \t\t\t}\r\n");
      out.write("        \t\t\t}\r\n");
      out.write("        \t\t\taddClickEvent();\r\n");
      out.write("        \t\t}\r\n");
      out.write("        \t});\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        \r\n");
      out.write("        /* 공휴일 뿌리기 */\r\n");
      out.write("        \r\n");
      out.write("        /* 스크롤 이벤트 */\r\n");
      out.write("        $(\"#add\").on('mousemove',function(e){\r\n");
      out.write("        });\r\n");
      out.write("        \r\n");
      out.write("        </script>\r\n");
      out.write("         ");
if("admin".equals(m.getMemberId())){
      out.write("\r\n");
      out.write("\t\t<div id=\"adminSide\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/memberList\">회원리스트 조회</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("</body>\r\n");
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
