/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2019-01-15 10:55:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.schedule;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.schedule.model.vo.*;
import java.text.SimpleDateFormat;
import com.kh.member.model.vo.*;
import java.util.List;
import com.kh.member.model.vo.Member;

public final class scheduleInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1547394663640L));
    _jspx_dependants.put("/WEB-INF/views/common/side.jsp", Long.valueOf(1547549522018L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("com.kh.schedule.model.vo");
    _jspx_imports_packages.add("com.kh.member.model.vo");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
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
      out.write("    <div id=\"pic\">\r\n");
      out.write("    \t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/day.png\" width=\"50px\" height=\"50px\" >\r\n");
      out.write("    \t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/month.png\" width=\"50px\" height=\"50px\" \r\n");
      out.write("    \tclass=\"picture\">\r\n");
      out.write("    \t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/year.png\" width=\"50px\" height=\"50px\">\r\n");
      out.write("    </div>\r\n");
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
      out.write("\r\n");

	Member memberLoggedIn1 = (Member)session.getAttribute("memberLoggedIn");  
	List<String> friendList = null;
	
	if(memberLoggedIn1 == null) {
		
	} else {
		try {
			friendList = (List)session.getAttribute("friendList");
		} catch(NullPointerException e) {
			
		}
	}
	
	


      out.write("\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Alfa+Slab+One|Staatliches|Noto+Sans+KR|Abril+Fatface\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Coiny|Do+Hyeon|Gothic+A1|Nanum+Gothic+Coding|Nanum+Pen+Script|Noto+Sans+KR\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery-3.3.1.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/side.css\" />\r\n");
      out.write("<script>\r\n");
      out.write("  function showPopup(temp) {\r\n");
      out.write("\t  var windowW = 500;  // 창의 가로 길이\r\n");
      out.write("      var windowH = 400;  // 창의 세로 길이\r\n");
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
      out.write("  function close(){\r\n");
      out.write("\t$(\"#friends\").css('display','none');\t  \r\n");
      out.write("\t  \r\n");
      out.write("  }\r\n");
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
      out.write("\t\t\thtml = \"<br><br>현재온도 : \"+Math.floor((resp.main.temp- 273.15))+\"도<br>\";\r\n");
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
      out.write("\t\r\n");
      out.write("\t<div class=\"side\">\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<div id=\"searchsch\">\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/member/mainSchedule\" class=\"font\">월간 스케줄</a><hr />\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/schedule/schedulelist\" class=\"font\">스케줄 찾기</a><hr />\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
 if(memberLoggedIn1 != null && "admin".equals(memberLoggedIn1.getMemberId())){
      out.write("\r\n");
      out.write("\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/admin/memberList\" class=\"font\">회원리스트</a><br />\r\n");
      out.write("\t\t");
 } 
      out.write("\r\n");
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
      out.write("\t\t\t\t");
 if(!friendList.isEmpty()) { 
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t");
 for(int i = 0;i < friendList.size();i++) { 
      out.write("\r\n");
      out.write("\t\t\t\t\t<span>");
      out.print(friendList.get(i) );
      out.write("</span>\r\n");
      out.write("\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t");
 } 
				} else {
      out.write("\r\n");
      out.write("\t\t\t\t\t<span>친구가 <br />없으십니다.</span>\r\n");
      out.write("\t\t\t\t");
 } 
      out.write("\r\n");
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
      out.write("\t\t\t\t<label for=\"srchId\" id=\"font2\">아이디 : </label>\r\n");
      out.write("\t\t\t\t<input type=\"text\"  name=\"srchId\" id=\"srchId\" autocomplete=\"off\" />\r\n");
      out.write("\t\t\t\t<button type=\"submit\" id=\"friendadd\" onclick=\"checkId();\">친구 추가</button>\r\n");
      out.write("\t\t\t\t\t<ul id=\"autoComplete\">\r\n");
      out.write("\t\t\t\t\t\t<li>1</li>\r\n");
      out.write("\t\t\t\t\t\t<li>2</li>\r\n");
      out.write("\t\t\t\t\t\t<li>3</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t<hr />\r\n");
      out.write("\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t<input type=\"button\"\r\n");
      out.write("\t\t\t  \t\t   onclick=\"self.close();\"\r\n");
      out.write("\t\t\t  \t\t   value=\"취소\"/>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
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
      out.write("function checkId(){\r\n");
      out.write("\t  var srchId = $(\"#srchId\").val();\r\n");
      out.write("\t  if(srchId.trim().length == 0){\r\n");
      out.write("\t\t  alert(\"검색하실 아이디를 선택하거나 입력해주세요.\");\r\n");
      out.write("\t\t  return false;\r\n");
      out.write("\t  }\r\n");
      out.write("\t  //팝업창을 target으로 폼전송\r\n");
      out.write("\t\tvar target = \"insertFriendFrm\";\r\n");
      out.write("\t\t//첫번째 인자 url은 생략, form의 action값이 이를 대신한다.\r\n");
      out.write("\t\tvar popup = open(\"\", target, \"left=300px, top=100px, height=135px, width=470px\");\r\n");
      out.write("\t\t//폼의 대상을 작성한 popup을 가리키게 한다. \r\n");
      out.write("\t\tinsertFriendFrm.target = target;\r\n");
      out.write("\t\tinsertFriendFrm.submit();\t\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write('\r');
      out.write('\n');

	Schedule s = (Schedule)request.getAttribute("schedule");
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
	String today = sdf.format(s.getScheduleDate());


      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/scheduleinfo.css\" />\r\n");
      out.write("<div id=\"scheduleInfo-container\">\r\n");
      out.write("\t<h3>");
      out.print(today );
      out.write(" Schedule 수정</h3>\r\n");
      out.write("\t<form class=\"updateScheduleFrm\" name=\"updateSchedulefrm\"\r\n");
      out.write("\t\t\taction=\"");
      out.print(request.getContextPath());
      out.write("/schedule/updateScheduleEnd\" \r\n");
      out.write("\t\t\tmethod=\"post\"\r\n");
      out.write("\t\t\tenctype=\"multipart/form-data\" >\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"scheduleNo\" id=\"scheduleNo\" value=\"");
      out.print(s.getScheduleNo());
      out.write("\" />\r\n");
      out.write("\t    <input type=\"hidden\" id=\"scheduleDdaycheck1\" value=\"");
      out.print(s.getScheduleDdaycheck());
      out.write("\" />\r\n");
      out.write("\t    <input type=\"hidden\" id=\"scheduleDday1\" value=\"");
      out.print(s.getScheduleDday());
      out.write("\" />\r\n");
      out.write("\t    <input type=\"hidden\" id=\"repeatcheck\" value=\"");
      out.print(s.getScheduleRepeatcheck());
      out.write("\" />\r\n");
      out.write("\t    <input type=\"hidden\" id=\"scheduleIcon1\" value=\"");
      out.print(s.getScheduleIcon());
      out.write("\" />\r\n");
      out.write("\t    \r\n");
      out.write("\t    <div id=\"updateSchedule_div\" class=\"updateSchedule_div\">\r\n");
      out.write("\t        \r\n");
      out.write("\t        <label for=\"title\">제목:</label>\r\n");
      out.write("\t        <input type=\"text\" id=\"scheduleTitle\" name=\"scheduleTitle\" value=\"");
      out.print(s.getScheduleTitle() );
      out.write("\">\r\n");
      out.write("\t       \r\n");
      out.write("\t        <div id=\"scheduleIcon-container\" class=\"scheduleIcon-container\">\t\t\t\t\r\n");
      out.write("\t\t\t\t<label for=\"icon\" class=\"icon\">아이콘:</label>\r\n");
      out.write("\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"iconAlt\" name=\"iconAlt\" />\r\n");
      out.write("\t\t\t\t<div id=\"selected-icon\" class=\"selected-icon\">\r\n");
      out.write("\t\t\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/");
      out.print(s.getScheduleIcon());
      out.write("\" class=\"selected-icon\" alt=\"");
      out.print(s.getScheduleIcon());
      out.write("\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div id=\"imgcon\" class=\"imgcon\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/test.png\" class=\"img\" alt=\"test.png\" />\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/family.png\" class=\"img\" alt=\"family.png\" />\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/like.png\" class=\"img\" alt=\"like.png\" />\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/soju&beer.png\" class=\"img\" alt=\"soju&beer.png\" />\r\n");
      out.write("\t\t\t\t<a href=\"#\" id=\"iconOpen\">더보기+</a>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"divicon\" class=\"divicon\"><!-- 더보기 div 버튼 클릭시 나타난다. none -->\r\n");
      out.write("\t\t\t\t<table id=\"tableicon\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/none.png\" class=\"img\" alt=\"none.png\" /></td>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/baseball.png\" class=\"img\" alt=\"baseball.png\"  ></td>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/birthday.png\" class=\"img\" alt=\"birthday.png\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/bowling.png\" class=\"img\" alt=\"bowling.png\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/family.png\" class=\"img\" alt=\"family.png\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/hospital.png\" class=\"img\" alt=\"hospital.png\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\t\r\n");
      out.write("\t\t\t\t\t<tr>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/like.png\" class=\"img\" alt=\"like.png\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/marry.png\" class=\"img\" alt=\"marry.png\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/shopping.png\" class=\"img\" alt=\"shopping.png\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/soju&beer.png\" class=\"img\" alt=\"soju&beer.png\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/test.png\" class=\"img\" alt=\"test.png\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td><a href=\"#\" id=\"iconClose\">닫기</a></td>\r\n");
      out.write("\t\t\t\t\t</tr>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</table>\t\t\t\t\t\r\n");
      out.write("\t\t\t</div>\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"scheduleContent\" id=\"scheduleContent\">           \r\n");
      out.write("\t            <label for=\"scheduleContent\">스케줄 내용:</label>\r\n");
      out.write("\t            <br />\r\n");
      out.write("\t            <textarea name=\"scheduleContent\" id=\"scheduleContent\" cols=\"50\" rows=\"15\">");
      out.print(s.getScheduleContent() );
      out.write("</textarea>\r\n");
      out.write("\t        </div>\r\n");
      out.write("\t       \r\n");
      out.write("\t     \t<label for=\"scheduleDdayCheck\" class=\"lcheck\">디데이 설정</label>\r\n");
      out.write("\t\t\t<input type=\"checkbox\" id=\"scheduleDdayCheck\" name=\"scheduleDdayCheck\" />\r\n");
      out.write("\t\t\t<div id=\"scheduleDday-container\">\r\n");
      out.write("\t\t\t\t<input type=\"date\" name=\"scheduleDday\" id=\"scheduleDday\"\r\n");
      out.write("\t\t\t\t\tdata-placeholder=\"설정할 디데이를 체크해주세요.\" required aria-required=\"true\" value=\"");
      out.print(s.getScheduleDday());
      out.write("\">\r\n");
      out.write("\t\t\t\t<br /><br />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t<div id=\"scheduleRepeatCheck\">        \r\n");
      out.write("\t\t\t<label for=\"scheduleRepeatCheck\">스케줄 반복여부 설정</label>\r\n");
      out.write("\t\t\t<input type=\"checkbox\" id=\"repeatCheck\" name=\"scheduleRepeatCheck\"/>\r\n");
      out.write("\t        </div>\t\r\n");
      out.write("\t        \r\n");
      out.write("\t        <label for=\"scheduleTimeline\" class=\"ltline\">타임라인 배치컬럼</label>\r\n");
      out.write("\t\t\t<select name=\"scheduleTimeline\">\r\n");
      out.write("\t\t\t");
 if(s.getScheduleTimeline() == 100){ 
      out.write("\r\n");
      out.write("\t\t\t\t<option value=\"100\" hidden=\"hidden\">시간을 선택해주세요.</option>\r\n");
      out.write("\t\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t<option value=\"");
      out.print(s.getScheduleTimeline() );
      out.write("\" selected>");
      out.print(s.getScheduleTimeline() );
      out.write("시</option>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t<option value=\"00\">00시</option>\r\n");
      out.write("\t\t\t\t<option value=\"01\">01시</option>\r\n");
      out.write("\t\t\t\t<option value=\"02\">02시</option>\r\n");
      out.write("\t\t\t\t<option value=\"03\">03시</option>\r\n");
      out.write("\t\t\t\t<option value=\"04\">04시</option>\r\n");
      out.write("\t\t\t\t<option value=\"05\">05시</option>\r\n");
      out.write("\t\t\t\t<option value=\"06\">06시</option>\r\n");
      out.write("\t\t\t\t<option value=\"07\">07시</option>\r\n");
      out.write("\t\t\t\t<option value=\"08\">08시</option>\r\n");
      out.write("\t\t\t\t<option value=\"09\">09시</option>\r\n");
      out.write("\t\t\t\t<option value=\"10\">10시</option>\r\n");
      out.write("\t\t\t\t<option value=\"11\">11시</option>\r\n");
      out.write("\t\t\t\t<option value=\"12\">12시</option>\r\n");
      out.write("\t\t\t\t<option value=\"13\">13시</option>\r\n");
      out.write("\t\t\t\t<option value=\"14\">14시</option>\r\n");
      out.write("\t\t\t\t<option value=\"15\">15시</option>\r\n");
      out.write("\t\t\t\t<option value=\"16\">16시</option>\r\n");
      out.write("\t\t\t\t<option value=\"17\">17시</option>\r\n");
      out.write("\t\t\t\t<option value=\"18\">18시</option>\r\n");
      out.write("\t\t\t\t<option value=\"19\">19시</option>\r\n");
      out.write("\t\t\t\t<option value=\"20\">20시</option>\r\n");
      out.write("\t\t\t\t<option value=\"21\">21시</option>\r\n");
      out.write("\t\t\t\t<option value=\"22\">22시</option>\r\n");
      out.write("\t\t\t\t<option value=\"23\">23시</option>\r\n");
      out.write("\t\t\t</select>\r\n");
      out.write("\t\t\t<br /><br />          \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t        <div class=\"schedule_renamedFile\">\r\n");
      out.write("\t            <label for=\"up_file\">파일</label>\r\n");
      out.write("\t\t\t\t\t<input type=\"file\" name=\"up_file\" placeholder=\"이미지/파일선택\" id=\"file\">\r\n");
      out.write("\t            <div class=\"filelist\">\r\n");
      out.write("\t            ");
if(s.getScheduleOriginalfilename() != null){ 
      out.write("\r\n");
      out.write("\t            \t<img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/file.png\" width=\"20px\" height=\"20px\"/>\r\n");
      out.write("\t            ");
} 
      out.write("\r\n");
      out.write("\t            \t<span>");
      out.print(s.getScheduleOriginalfilename()!=null?s.getScheduleOriginalfilename():"");
      out.write("</span>\r\n");
      out.write("\t            </div>\r\n");
      out.write("\t        </div>\t\r\n");
      out.write("\t        \r\n");
      out.write("\t        \r\n");
      out.write("\t      </div>\r\n");
      out.write("   \t\t <div class=\"updateSchedule\">\r\n");
      out.write("\t           <input type=\"submit\" value=\"일정수정\" onclick=\"return validate();\" >\r\n");
      out.write("\t           <input type=\"button\" id=\"delete\" value=\"일정 삭제\" onclick=\"deleteSchedule();\">\r\n");
      out.write("\t     </div> \r\n");
      out.write("    </form>\r\n");
      out.write("    <form action=\"");
      out.print(request.getContextPath());
      out.write("/schedule/deleteScheduleEnd\" name=\"deleteScheduleFrm\" method=\"post\">\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"scheduleNo\" id=\"scheduleNo\" value=\"");
      out.print(s.getScheduleNo());
      out.write("\" />\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"scheduleRenamefilename\" id=\"scheduleRenamefilename\" value=\"");
      out.print(s.getScheduleRenamefilename());
      out.write("\" />\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function deleteSchedule(){\r\n");
      out.write("\t  \r\n");
      out.write("\t  var bool = confirm(\"정말로 삭제하시겠습니까?\");\r\n");
      out.write("\t\tif(bool){\r\n");
      out.write("\t\t\tvar frm = document.deleteScheduleFrm;\r\n");
      out.write("\t\t\tfrm.submit();\t\t\t\r\n");
      out.write("\t\t}\t  \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 디데이가 없는 경우 초기값 설정 */\r\n");
      out.write("document.getElementById('scheduleDday').valueAsDate = new Date();\r\n");
      out.write("\r\n");
      out.write("/* 디데이 체크박스 여부 true / false를 리턴한다. */\r\n");
      out.write("$(document).ready(function() { \r\n");
      out.write("\tvar icon  = $(\"#scheduleIcon1\").val();\r\n");
      out.write("\tvar scheduleDdaycheck1 = $(\"#scheduleDdaycheck1\").val();\r\n");
      out.write("\tvar scheduleDday1 = $(\"#scheduleDday1\").val();\r\n");
      out.write("\tvar repeatcheck1 = $(\"#repeatcheck\").val();\r\n");
      out.write("\t\r\n");
      out.write("\tif(scheduleDdaycheck1 == 'Y'){\r\n");
      out.write("\t\t$(\"#scheduleDdayCheck\").prop(\"checked\", true);\r\n");
      out.write("\t\t$(\"#scheduleDday\").val(scheduleDday1);\r\n");
      out.write("\t\t$(\"#scheduleDday-container\").show();\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tif(repeatcheck1 == 'Y'){\r\n");
      out.write("\t\t$(\"#repeatCheck\").attr(\"checked\", true);\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#scheduleDdayCheck\").on('click', function() { \r\n");
      out.write("\t\tif ( $(this).prop('checked') ) { \r\n");
      out.write("\t\t\t$(\"#scheduleDday-container\").show();\t\t\t\r\n");
      out.write("\t\t} else { \r\n");
      out.write("\t\t\t$(\"#scheduleDday-container\").hide();\r\n");
      out.write("\t\t} \r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#iconAlt\").val(icon);\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("/* 일정 등록 유효성 검사 */\r\n");
      out.write("function validate(){\r\n");
      out.write("\tvar content = $(\"[name=scheduleContent]\").val();\r\n");
      out.write("\tif(content.trim().length == 0){\r\n");
      out.write("\t\talert(\"내용을 입력하세요.\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\treturn true;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* 지금할일 이미지를 클릭했을때 그 이미지를 사용자가 선택한 icon에 뿌려주고\r\n");
      out.write("그 icon에대한 값을 attr로 뽑아내서 그 전송할 input에 담아주면 된다. */\r\n");
      out.write("\r\n");
      out.write("$(\".img\").on(\"click\" , function(){\r\n");
      out.write("\tvar selectedSrc = $(this).attr(\"src\");\r\n");
      out.write("\tconsole.log(selectedSrc);\r\n");
      out.write("\t\r\n");
      out.write("\t$(\".selected-icon\").attr(\"src\" , selectedSrc);\r\n");
      out.write("\t\r\n");
      out.write("\t/* 전송할 alt추려내기 */\r\n");
      out.write("\tvar selectedAlt = $(this).attr(\"alt\");\r\n");
      out.write("\t$(\"#iconAlt\").attr(\"value\" , selectedAlt);\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$(\"#iconOpen\").on('click',function(){\r\n");
      out.write("\t$(\"#divicon\").show();\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("$(\"#iconClose\").on('click',function(){\r\n");
      out.write("\t$(\"#divicon\").hide();\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
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
