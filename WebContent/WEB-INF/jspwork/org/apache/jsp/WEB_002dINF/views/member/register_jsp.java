/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.35
 * Generated at: 2019-01-08 10:02:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.member.model.vo.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1546939057847L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
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

      out.write('\r');
      out.write('\n');
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
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write(" <meta charset=\"utf-8\">\r\n");
      out.write(" <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write(" <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write(" <!-- 폰트추가(폼상단) -->\r\n");
      out.write(" <link href=\"https://fonts.googleapis.com/css?family=Fredericka+the+Great%7C Rochester| Alfa+Slab+One| Staatliches| Noto+Sans+KR| Abril+Fatface\" rel=\"stylesheet\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"");
      out.print(request.getContextPath() );
      out.write("/css/register.css\">\r\n");
      out.write("\r\n");
      out.write(" <!-- 파비콘 적용링크 -->\r\n");
      out.write(" <link rel=\"shortcut icon\" href=\"");
      out.print(request.getContextPath() );
      out.write("/images/logo(favicon).png\" type=\"image/png\" sizes=\"128x128\">\r\n");
      out.write(" <script src=\"");
      out.print(request.getContextPath() );
      out.write("/js/jquery-3.3.1.js\"></script>\r\n");
      out.write(" \r\n");
      out.write(" <title>7 Scheduler(signup)</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write(" \r\n");
      out.write(" <div class=\"content\">\r\n");
      out.write("   <section>\r\n");
      out.write("   <form action=\"");
      out.print(request.getContextPath());
      out.write("/member/checkIdDuplicate\"\r\n");
      out.write("\t  method=\"post\"\r\n");
      out.write("\t  name=\"checkIdDuplicateFrm\">\r\n");
      out.write("\t<input type=\"hidden\" name=\"memberId\" />\r\n");
      out.write("       </form>\r\n");
      out.write("     <form class=\"singupFrm\" name=\"signupform\" action=\"");
      out.print(request.getContextPath() );
      out.write("/member/memberEnroll\" method=\"post\" onsubmit=\"return saveMember();\" >\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("       <div class=\"signup_box\">\r\n");
      out.write("           <span>7's Scheduler</span>\r\n");
      out.write("         <div class=\"input_login\">\r\n");
      out.write("           <input type=\"text\" name=\"memberId\" id=\"memberId_\" placeholder=\"ID 입력(영대소문자, 4~12자 입력)\">\r\n");
      out.write("           &nbsp;&nbsp;\r\n");
      out.write("           <input type=\"button\" id=\"idCheck\" value=\"중복검사\" onclick=\"checkIdDuplicate();\"/>\r\n");
      out.write("           <input type=\"hidden\" name=\"idValid\" id=\"idValid\"  value=\"0\" />\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"input_login\">\r\n");
      out.write("           <input type=\"password\" name=\"memberPwd\" id=\"memberPwd\" placeholder=\"비밀번호를 입력하세요.(숫자/문자/특수포함 8~15자리)\">\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"input_login\">\r\n");
      out.write("           <input type=\"password\" name=\"memberpwdcheck\" id=\"memberpwdcheck\" onkeyup=\"checkPwd()\" placeholder=\"비밀번호를 다시 입력하세요\">\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<br />\r\n");
      out.write("\t\t\t<div id=\"checkPwd\">동일한 암호를 입력하세요</div>          \r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"input_login\">\r\n");
      out.write("             <input type=\"text\" name=\"memberName\" id=\"memberName\" placeholder=\"이름을 입력하세요(두글자 이상)\">\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"input_login\">\r\n");
      out.write("           <input type=\"email\" name=\"memberEmail\" id=\"memberEmail\" placeholder=\"이메일을 입력하세요\">\r\n");
      out.write("           &nbsp;&nbsp;\r\n");
      out.write("           <input type=\"button\" id=\"emailclear\" value=\"인증하기\">\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"input_login\">\r\n");
      out.write("           <input type=\"date\" name=\"memberDate\" id=\"memberDate\" data-placeholder=\"생년월일을 입력하세요\" required aria-required=\"true\" >\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"input_login\">\r\n");
      out.write("            <label for=\"male\" id=\"man\">남자</label>\r\n");
      out.write("            <input type=\"radio\" name=\"gender\" id=\"gender\"\r\n");
      out.write("                   value=\"M\" checked>\r\n");
      out.write("            &nbsp;&nbsp;\r\n");
      out.write("            <label for=\"female\">여자</label>\r\n");
      out.write("            <input type=\"radio\" name=\"gender\" id=\"gender\"\r\n");
      out.write("                   value=\"F\">\r\n");
      out.write("         </div>\r\n");
      out.write("         <br>\r\n");
      out.write("         <div class=\"login\">\r\n");
      out.write("           <input type=\"submit\" value=\"회원가입\" >\r\n");
      out.write("         </div>\r\n");
      out.write("       </div>\r\n");
      out.write("      \r\n");
      out.write("       <div class=\"login_box\">\r\n");
      out.write("         <span>계정이 있으신가요?<a href=\"");
      out.print(request.getContextPath() );
      out.write("/index.jsp\">로그인</a></span>\r\n");
      out.write("       </div>\r\n");
      out.write("     </form>\r\n");
      out.write("   </section>\r\n");
      out.write(" </div>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write("  function checkIdDuplicate(){\r\n");
      out.write("\t\t//아이디중복검사폼을 전송.\r\n");
      out.write("\t\tvar memberId = $(\"#memberId_\").val().trim();\r\n");
      out.write("\r\n");
      out.write("\t\tif(memberId.length == 0 ){\r\n");
      out.write("\t\t\t alert(\"공백은 아이디로 만들수 없습니다\");\r\n");
      out.write("\t\t\t return false;\r\n");
      out.write("\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t \r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//팝업창을 target으로 폼전송\r\n");
      out.write("\t\tvar target = \"checkIdDuplicate\";\r\n");
      out.write("\t\t//첫번째 인자 url은 생략, form의 action값이 이를 대신한다.\r\n");
      out.write("\t\tvar popup = open(\"\", target, \"left=300px, top=100px, height=50px, width=300px\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tcheckIdDuplicateFrm.memberId.value = memberId;\r\n");
      out.write("\t\t//폼의 대상을 작성한 popup을 가리키게 한다. \r\n");
      out.write("\t\tcheckIdDuplicateFrm.target = target;\r\n");
      out.write("\t\tcheckIdDuplicateFrm.submit();\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("  function saveMember(){\r\n");
      out.write("      //아이디 유효성 검사\r\n");
      out.write("     var memberId = document.getElementById('memberId_');\r\n");
      out.write("     var password = document.getElementById('memberPwd');\r\n");
      out.write("     var password1 = document.getElementById('memberpwdcheck');\r\n");
      out.write("     var memberName = document.getElementById('memberName');\r\n");
      out.write("     var email = document.getElementById('memberEmail');\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     if(!chk(/^[a-z][a-z\\d]{4,12}$/, memberId, \"아이디는  숫자 포함 영대소문자, 4~12자 입력할것!\"))\r\n");
      out.write("         return false;\r\n");
      out.write("\r\n");
      out.write("      if(!chk(/[0-9]/, memberId, \"아이디는 꼭 숫자 하나이상포함해주세요.\"))\r\n");
      out.write("         return false;\r\n");
      out.write("      \r\n");
      out.write("      if(!chk(/^(?=.*[a-zA-Z])((?=.*\\d)|(?=.*\\W)).{8,15}$/,password,\"패스워드는 숫자/문자/특수포함8~15자리\"))\r\n");
      out.write("          \r\n");
      out.write("          return false;\r\n");
      out.write("      if(password.value!=password1.value){\r\n");
      out.write("\r\n");
      out.write("         alert(\"비밀번호가 일치하지 않습니다.\");\r\n");
      out.write("         return false;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      if(!chk( /^[가-힣]{2,4}$/,memberName,\"한글 2글자 이상\"))\r\n");
      out.write("          return false;\r\n");
      out.write("      \r\n");
      out.write("      if(!chk(/^[0-9a-zA-Z]([\\-.\\w]*[0-9a-zA-Z\\-_+])*@([0-9a-zA-Z][\\-\\w]*[0-9a-zA-Z]\\.)+[a-zA-Z]{2,9}$/i,email,\"이메일형식을 입력하세요.\" ))\r\n");
      out.write("          return false;\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("         function chk(re, e, msg) {\r\n");
      out.write("         if (re.test(e.value)) {\r\n");
      out.write("         return true;\r\n");
      out.write("         }\r\n");
      out.write("         alert(msg);\r\n");
      out.write("         e.value = \"\";\r\n");
      out.write("         e.focus();\r\n");
      out.write("         return false;\r\n");
      out.write("\r\n");
      out.write("  }\r\n");
      out.write("    return true;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write(" function checkPwd(){\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\tvar pw1 = document.getElementById('memberPwd').value;\r\n");
      out.write("\tvar pw2 = document.getElementById('memberpwdcheck').value;\r\n");
      out.write("\t\r\n");
      out.write("\tif(pw1 !='' && pw2 != ''){\r\n");
      out.write("\tif(pw1 == pw2){\r\n");
      out.write("\t\tresult ='<div id=\"result_true\">비밀번호가 일치합니다.:)</div>';\r\n");
      out.write("\t\tdocument.getElementById('checkPwd').innerHTML = result;\r\n");
      out.write("\t\tdocument.getElementById('checkPwd').style.color = \"blue\";\r\n");
      out.write("\t}else{\r\n");
      out.write("\t\tresult ='<div id=\"result_false\">비밀번호가 일치하지 않습니다.:(</div>';\r\n");
      out.write("\t\t document.getElementById('checkPwd').innerHTML = result;\r\n");
      out.write("\t\t document.getElementById('checkPwd').style.color = \"red\";\r\n");
      out.write("\t\t\r\n");
      out.write("\t  }\r\n");
      out.write("\t} \r\n");
      out.write("\t \r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
