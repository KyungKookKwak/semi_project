<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	int certifiedNum = (int)request.getAttribute("certified");
    	System.out.println(certifiedNum);
         
    %>
<!DOCTYPE html>

<html>
<head>
<meta charset="UTF-8">
<title>이메일 인증</title>
<link rel="stylesheet" href="<%=request.getContextPath() %>/css/sendMailPwd.css" />
<script src="<%=request.getContextPath()%>/js/jquery-3.3.1.js"></script>
<link rel="shortcut icon" href="<%=request.getContextPath() %>/images/logo(favicon).png" type="image/png" sizes="128x128">
<script>
function check(){
	var certified = $("#certified").val().trim();
	console.log(certified);
	var certifiedNum = <%=certifiedNum%>;
	console.log(certifiedNum);

	
	
	if(certified.length == 0){
		alert("인증번호를 입력하세요");
		return false;
	}else if(certified != certifiedNum){
		alert("인증번호가 틀렸습니다. 인증번호를 다시입력해주세요.");
		return false;
	}else{
		alert("인증 완료2");
		opener.$('#table2').css('display', 'none');
		opener.$('#hidetable').css('display', 'inline-block');
		
		
		

		self.close();
	}
} 
</script>
</head>
<body>
	<div id="emailcertified-container">
		<label for="certified">인증번호 : </label>
		<input type="textname="certified" id="certified"/>
		<input type="button" value="확인" id="check" onclick="check();"/>
	</div>
</body>
</html>