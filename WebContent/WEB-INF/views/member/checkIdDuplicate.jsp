<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	boolean isUsable = (boolean)request.getAttribute("isUsable"); 
	String memberId = (String)request.getAttribute("memberId");
	

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>아이디 중복검사</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/checkidDuplicate.css" />
<script src="<%=request.getContextPath()%>/js/jquery-3.3.1.js"></script>
<link href="https://fonts.googleapis.com/css?family=Sunflower:300" rel="stylesheet">
<script>
function checkIdDuplicate(){
	//아이디중복검사폼을 전송.
	var memberId = $("#memberId").val().trim();
	
	
	if( memberId.length < 4 && memberId.length<13){
		alert("아이디는 4글자 이상 12글자 이하 가능 합니다.");
		return;
	}
	
	checkIdDuplicateFrm.memberId.value = memberId;
	checkIdDuplicateFrm.submit();
	
}

function setMemberId(memberId){
	opener.signupform.idValid.value = 1;
	opener.signupform.memberId.value = memberId;
	opener.signupform.memberPwd.focus();
	self.close();
	
	
}
</script>

</head>
<body>
	<div id="checkid-container">
	<%if(isUsable){ %>
		[<%=memberId %>]는 사용가능합니다.
		<br /><br />
		<button onclick="setMemberId('<%=memberId %>');">닫기</button>
	<%} 
	else {%>
		[<span id="duplicated"><%=memberId %></span>]는
		이미 사용중입니다.
		<form action="<%=request.getContextPath()%>/member/checkIdDuplicate"
			  method="post"
			  name="checkIdDuplicateFrm">
		<input type="text" 
			   name="memberId" 
			   id="memberId" 
			   placeholder="아이디를 입력하세요."/>
		<button type="button" onclick="checkIdDuplicate();">중복검사</button>	   
	</form>
		
	<%} %>
	</div>
</body>
</html>