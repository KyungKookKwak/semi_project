/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2019-01-16 12:19:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;

public final class checkFriend_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
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

	// String[] popupArr = (String[])request.getAttribute("popupArr");
	String memberId = (String)request.getAttribute("memberId");
	List<String> popup = (List<String>)session.getAttribute("popup"); 
	System.out.println("checkFriend.jsp@popup/memberId : "+popup+", "+memberId);

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>친구 받을꺼야 말꺼야</title>\r\n");
      out.write("<script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery-3.3.1.js\"></script>\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Sunflower:300\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/checkidDuplicate.css\" />\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"");
      out.print(request.getContextPath() );
      out.write("/images/logo(favicon).png\" type=\"image/png\" sizes=\"128x128\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"checkid-container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<br /><br />\r\n");
      out.write("\t\t당신에게 온 친구요청입니다.\r\n");
      out.write("\r\n");
      out.write("\t\t<br />\r\n");
      out.write("\t\t<select name=\"selectFriend\" id=\"selectFriend\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("\t\t</select>\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"memberId\" name=\"memberId\" value=\"");
      out.print(memberId );
      out.write("\" />\r\n");
      out.write("\t\t\t\r\n");
      out.write(" \t\t<button id=\"ok\">수락</button>\r\n");
      out.write("\t\t<button id=\"no\">거절</button>\r\n");
      out.write("\t\t<br /><br />\r\n");
      out.write("\t\t<button onclick=\"self.close();\">닫기</button>\t   \r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t</div>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("$(function(){\r\n");
      out.write("\tconsole.log(\"rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr\");\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\turl: \"");
      out.print(request.getContextPath());
      out.write("/friend/selectFriendQueue.do\" ,\r\n");
      out.write("\t\ttype: \"get\" ,\r\n");
      out.write("\t\tsuccess: function(data) {\r\n");
      out.write("\t\t\tconsole.log(\"dddddddddddddddddddddddddddddddd\");\r\n");
      out.write("\t\t\tconsole.log(data);\r\n");
      out.write("\t\t\t// var form = \"<form action='' method='post' name='checkFriendFrm' id='checkFriendFrm'>\";\r\n");
      out.write("\t\t\t// var title = \"당신에게 온 친구요청입니다. <br />\";\r\n");
      out.write("\t\t\t// var form = $(\"#checkFriendFrm\");\r\n");
      out.write("\t\t\tvar select = $(\"#selectFriend\");\r\n");
      out.write("\t\t\t// var select = \"<select name='selectFriend' id='selectFriend'>\";\r\n");
      out.write("\t\t\t// var button = \"<button id='ok'>수락</button><button id='no'>거절</button>\";\r\n");
      out.write("\t\t\tvar html;\r\n");
      out.write("\t\t\tfor(var i in data) {\r\n");
      out.write("\t\t\t\tvar option = data[i];\r\n");
      out.write("\t\t\t\thtml += \"<option value='\"+option+\"'>\"+option+\"</option>\";\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// var result = form + title + select + html + \"</select>\" + button + \"</form>\";\r\n");
      out.write("\t\t\t// var result = select + html + \"</select>\" + button;\r\n");
      out.write("\t\t\t// var reuslt = select.append;\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tselect.html(html);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t/* 수락버튼을 누를시에 Friend table에 insert된다. */\r\n");
      out.write("\t$(\"#no\").on(\"click\" , function(){\r\n");
      out.write("\t\tconsole.log(\"수락 test중입니다ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ\");\r\n");
      out.write("\t\tvar con = confirm(\"정말 친구요청을 수락하시겠습니까?\");\r\n");
      out.write("\t\tvar selectFriend = $(\"#selectFriend option:selected\").val();\r\n");
      out.write("\t\tconsole.log(selectFriend);\r\n");
      out.write("\t\tif(con) {\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl: \"");
      out.print(request.getContextPath());
      out.write("/member/deleteFriendQueue\" ,\r\n");
      out.write("\t\t\t\tdata : {selectFriend:selectFriend} ,\r\n");
      out.write("\t\t\t\ttype: \"get\" ,\r\n");
      out.write("\t\t\t\tsuccess: function(data) {\r\n");
      out.write("\t\t\t\t\tconsole.log(data);\r\n");
      out.write("\t\t\t\t\tif(data.length == 0) {\r\n");
      out.write("\t\t\t\t\t\tself.close();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\tvar select = $(\"#selectFriend\");\r\n");
      out.write("\t\t\t\t\tvar html = \"\";\r\n");
      out.write("\t\t\t\t\tfor(var i in data) {\r\n");
      out.write("\t\t\t\t\t\tvar option = data[i];\r\n");
      out.write("\t\t\t\t\t\thtml += \"<option value='\"+option+\"'>\"+option+\"</option>\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tselect.html(html);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\talert(\"친구요청 거절 완료!\");\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t/* 거절버튼을 누를시에 FriendQueue table에 delete된다. */\r\n");
      out.write("\t$(\"#ok\").on(\"click\" , function(){\r\n");
      out.write("\t\tconsole.log(\"test중입니다ㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏㅏ\");\r\n");
      out.write("\t\tvar con = confirm(\"정말 친구요청을 수락하시겠습니까?\");\r\n");
      out.write("\t\tvar selectFriend = $(\"#selectFriend option:selected\").val();\r\n");
      out.write("\t\tconsole.log(selectFriend);\r\n");
      out.write("\t\tif(con) {\r\n");
      out.write("\t\t\t$.ajax({\r\n");
      out.write("\t\t\t\turl: \"");
      out.print(request.getContextPath());
      out.write("/member/insertFriend\" ,\r\n");
      out.write("\t\t\t\tdata : {selectFriend:selectFriend} ,\r\n");
      out.write("\t\t\t\ttype: \"get\" ,\r\n");
      out.write("\t\t\t\tsuccess: function(data) {\r\n");
      out.write("\t\t\t\t\tconsole.log(data);\r\n");
      out.write("\t\t\t\t\tif(data.length == 0) {\r\n");
      out.write("\t\t\t\t\t\tself.close();\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tvar select = $(\"#selectFriend\");\r\n");
      out.write("\t\t\t\t\tvar html = \"\";\r\n");
      out.write("\t\t\t\t\tfor(var i in data) {\r\n");
      out.write("\t\t\t\t\t\tvar option = data[i];\r\n");
      out.write("\t\t\t\t\t\thtml += \"<option value='\"+option+\"'>\"+option+\"</option>\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tselect.html(html);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\talert(\"친구요청 수락 완료!\");\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
