/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2019-01-14 10:42:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class searchIdPwd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Alfa+Slab+One|Staatliches|Noto+Sans+KR|Abril+Fatface\" rel=\"stylesheet\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/header.css\">\r\n");
      out.write("  <title>아이디/비밀번호 찾기</title>\r\n");
      out.write("  <script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery-3.3.1.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("#table1 {\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("\twidth: 50%;\r\n");
      out.write("\theight: 200px;\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#table2{\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("\twidth: 50%;\r\n");
      out.write("\theight: 200px;\r\n");
      out.write("\t\r\n");
      out.write("\t/* position: right; */\r\n");
      out.write("}\r\n");
      out.write("#table3{\r\n");
      out.write("\tborder: 1px solid black;\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\theight:52px;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("#button1{\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("#button2{\r\n");
      out.write("\tpadding-left: 170px;\r\n");
      out.write("}\r\n");
      out.write("#searchid{\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("#searchId2{\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("}\r\n");
      out.write("#searchPwd2{\r\n");
      out.write("\t\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("function searchid(){\r\n");
      out.write("\t var memberName = document.getElementById('userName_');\r\n");
      out.write("\t var memberEmail = document.getElementById('email_');\r\n");
      out.write("\t \r\n");
      out.write("\t if(memberName.value ==\"\" ){\r\n");
      out.write("\t\t alert(\"이름을 입력해주세요 :(\");\r\n");
      out.write("\t\t memberName.focus();\r\n");
      out.write("\t\t return false;\r\n");
      out.write("\t }\r\n");
      out.write("\t if(memberEmail.value ==\"\" ){\r\n");
      out.write("\t\t alert(\"이메일을 입력해주세요 :(\");\r\n");
      out.write("\t\t memberEmail.focus();\r\n");
      out.write("\t\t return false;\r\n");
      out.write("\t }\t \r\n");
      out.write("\t \r\n");
      out.write("\tvar param = {\r\n");
      out.write("\t\t\t\"pname\":$(\"#userName_\").val(),\r\n");
      out.write("\t\t\t\"pemail\":$(\"#email_\").val()\r\n");
      out.write("\t}\r\n");
      out.write("\t$.ajax({\r\n");
      out.write("\t\ttype: \"post\",\r\n");
      out.write("\t\turl:\"");
      out.print(request.getContextPath());
      out.write("/member/searchId\",\r\n");
      out.write("\t\tdata: param,\r\n");
      out.write("\tsuccess: function(data){\r\n");
      out.write("\t\tconsole.log(data);\r\n");
      out.write("\t\tvar html=\"<table>\";\r\n");
      out.write("\t\tif(data != null){\r\n");
      out.write("\t\t\thtml +=\"<tr><td id='searchId2'>\"+\"당신의 아이디는 \"+data.memberId+\" 입니다.\"+\"</td></tr>\";\r\n");
      out.write("\t\t\t/* html +=\"<td>\"+param.pemail+\"</td></tr>\"; */\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\thtml+=\"</table>\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$(\"#table1\").html(html);\r\n");
      out.write("\t},\r\n");
      out.write("\terror:function(){\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t});\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function searchpwd(){\r\n");
      out.write("\tvar memberEmail = $(\"#email__\").val();\r\n");
      out.write("    if(memberEmail.trim().length == 0){\r\n");
      out.write("        alert(\"이메일을 입력하세요.\");\r\n");
      out.write("        return false;\r\n");
      out.write("    }\r\n");
      out.write("    //팝업창을 target으로 폼전송\r\n");
      out.write("      var target = \"checkEmailCertifiedPassword\";\r\n");
      out.write("      //첫번째 인자 url은 생략, form의 action값이 이를 대신한다.\r\n");
      out.write("      var popup = open(\"\", target, \"left=700px, top=300px, height=135px, width=470px\");\r\n");
      out.write("      //폼의 대상을 작성한 popup을 가리키게 한다.\r\n");
      out.write("      checkEmailCertifiedPasswordFrm.target = target;\r\n");
      out.write("      \r\n");
      out.write("      console.log(memberEmail);\r\n");
      out.write("      \r\n");
      out.write("      checkEmailCertifiedPasswordFrm.memberEmail.value = memberEmail;\r\n");
      out.write("      checkEmailCertifiedPasswordFrm.submit();\r\n");
      out.write("}\r\n");
      out.write("function chk(re, e, msg) {\r\n");
      out.write("    if (re.test(e.value)) {\r\n");
      out.write("    return true;\r\n");
      out.write("    }\r\n");
      out.write("    alert(msg);\r\n");
      out.write("    e.value = \"\";\r\n");
      out.write("    e.focus();\r\n");
      out.write("    return false;\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<nav class=\"header\">\r\n");
      out.write("    <div class=\"logo\">\r\n");
      out.write("      <img src=\"");
      out.print(request.getContextPath() );
      out.write("/images/logo.png\" width=\"50px\" height=\"50px\" >\r\n");
      out.write("      <span class=\"logofont\">7' Scheduler\r\n");
      out.write("      </span>\r\n");
      out.write("    </div>  \r\n");
      out.write("</nav>\r\n");
      out.write("\t<div id=\"userIdPwd\">\r\n");
      out.write("\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/member/searchIdPwd\"\r\n");
      out.write("\t\t\tname=\"searchIdPwd_\" method=\"post\">\r\n");
      out.write("\t\t\t<table id=\"table1\" style=\"float: left\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th class=\"searchid\">아이디 찾기</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>이름</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"userName\" id=\"userName_\" placeholder=\"찾아야한다..\" required /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>이메일</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"email\" name=\"email\" id=\"email_\" placeholder=\"찾아야한다..\" required /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t <tr>\r\n");
      out.write("                  \t<td colspan=\"2\" id=\"button1\">\r\n");
      out.write("                  \t\t<input type=\"button\" value=\"아이디 찾기\" onclick=\"searchid()\" />\r\n");
      out.write("                  \t\t\r\n");
      out.write("                  \t</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/member/checkEmailCertifiedPassword\"\r\n");
      out.write("\t\t\tname=\"checkEmailCertifiedPasswordFrm\" method=\"post\">\r\n");
      out.write("\t\t\t<table id=\"table2\" style=\"float: right\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th id=\"searchid\">비밀번호 찾기</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>아이디</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"userId\" id=\"userId_\" placeholder=\"찾아야한다..\" required /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>이메일</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"email\" name=\"email\" id=\"email__\" placeholder=\"찾아야한다..\" required /></td>\r\n");
      out.write("\t\t\t\t <tr>\r\n");
      out.write("                  \t<td colspan=\"2\" id=\"button2\">\r\n");
      out.write("                  \t\t<input type=\"button\" onclick=\"searchpwd();\" value=\"비밀번호 찾기\" />\r\n");
      out.write("                  \t\t\r\n");
      out.write("                  \t</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<table id=\"table3\">\r\n");
      out.write("\t\t\t\t <tr>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("                  \t\t<input type=\"button\" onclick=\"self.close();\" value=\"취소\"  />\r\n");
      out.write("                  \t</td>\r\n");
      out.write("                  </tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
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
