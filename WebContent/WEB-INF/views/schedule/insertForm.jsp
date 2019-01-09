<%@page import="java.sql.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/header.jsp"%>
<%@ include file="/WEB-INF/views/common/side.jsp"%>
<%
	int year = (int) request.getAttribute("year");
	int month = (int) request.getAttribute("month");
	int day = (int) request.getAttribute("day");
	String user = (String) request.getAttribute("user");
	
%>

<style>
.content {
	padding-left: 140px;
}

#scheduleDday-container {
	display: none;
}

.img{
	width: 50px;
	height: 50px;
}
</style>



<div class="content">
	<h2><%=year%>년
		<%=month%>월
		<%=day%>일
		<%=user%>님의 일정등록
	</h2>
	<section>



		<form class="insertFrm" name="insertform"
			action="<%=request.getContextPath()%>/schedule/insertScheduleEnd" 
			method="post"
			enctype="multipart/form-data">

			<div class="schedule_box">
				<span>Scheduler</span> 
				<br /> 
				<label for="scheduleTitle">제목</label>
				<input type="text" name="scheduleTitle" id="scheduleTitle" required="required">
				<br /><br />
				
				<div id="scheduleIcon-container">
				
					<label for="">아이콘</label>
						<!-- input 여기에 넘겨줄 이모티콘의 이미지 이름을 넣는다. ex) img.PNG -->
						<input type="hidden" id="iconAlt" name="iconAlt" />
						<div id="selected-icon">
							<!-- 사용자가 선택한 icon이 이곳에 들어와야 한다. -->
							<img src="<%=request.getContextPath() %>/images/logo.png" class="selected-icon" alt="logo.png" />
						</div>
						<div>
						<!-- 아무것도 없는 이미지 -->						
						<img src="<%=request.getContextPath() %>/images/logo.png" class="img" alt="logo.png" />
						<img src="<%=request.getContextPath() %>/images/flower1.PNG" class="img" alt="flower1.PNG" />
						<img src="<%=request.getContextPath() %>/images/flower2.PNG" class="img" alt="flower2.PNG" />
						<img src="<%=request.getContextPath() %>/images/flower3.PNG" class="img" alt="flower3.PNG" />
						
						<button>더보기</button>
						</div>
					<div><!-- 더보기 div 버튼 클릭시 나타난다. none -->
						
						
						<button>저장</button>
						<button>취소</button>
					</div>
				</div>
				<label for="">내용</label> 
				<textarea name="scheduleContent" id="scheduleContent" rows="5" cols="50" placeholder="내용을 작성해주세요." style="resize: none;"></textarea>
				<br /><br />
				
				<input type="checkbox" id="scheduleDdayCheck" name="scheduleDdayCheck" />
				<label for="scheduleDdayCheck">디데이 설정 여부</label>
				<br /><br />
				
			<div id="scheduleDday-container">
				<label for="scheduleDday">디데이 설정</label>
				<input type="date" name="scheduleDday" id="scheduleDday"
					data-placeholder="설정할 디데이를 체크해주세요." required aria-required="true">
					<br /><br />
			</div>	
				
				


			<label for="scheduleTimeline">타임라인 배치컬럼</label>
			<select name="scheduleTimeline" required="required">
				<option value="" hidden="hidden">시간을 선택해주세요.</option>
				<option value="00">00시</option>
				<option value="01">01시</option>
				<option value="02">02시</option>
				<option value="03">03시</option>
				<option value="04">04시</option>
				<option value="05">05시</option>
				<option value="06">06시</option>
				<option value="07">07시</option>
				<option value="08">08시</option>
				<option value="09">09시</option>
				<option value="10">10시</option>
				<option value="11">11시</option>
				<option value="12">12시</option>
				<option value="13">13시</option>
				<option value="14">14시</option>
				<option value="15">15시</option>
				<option value="16">16시</option>
				<option value="17">17시</option>
				<option value="18">18시</option>
				<option value="19">19시</option>
				<option value="20">20시</option>
				<option value="21">21시</option>
				<option value="22">22시</option>
				<option value="23">23시</option>
			</select>
			<br /><br />
				<label for="scheduleStartDay">일시</label>
				<input type="date" name="scheduleStartDay" id="scheduleStartDay"
					data-placeholder="스케줄 시작날을 설정하세요." required aria-required="true">
				&nbsp; - &nbsp;
				<input type="date" name="scheduleEndDay" id="scheduleEndDay"
					data-placeholder="스케줄 끝날을 설정하세요." required aria-required="true">
				
				<input type="checkbox" id="scheduleRepeatCheck" name="scheduleRepeatCheck" />
				<label for="scheduleRepeatCheck">스케줄 반복여부 설정</label>
				<br /><br />
			
				<br /><br />
				<label for="up_file">파일</label>
				<input type="file" name="up_file" placeholder="이미지/파일선택">
				
				<input type="hidden" value="<%=memberLoggedIn.getMemberId() %>" name="memberId" />
				
					<br /><br />

					<input type="submit" value="일정 등록" onclick="return validate();">
			</div>


		</form>
	</section>
</div>


</body>
<script>
/* 스케줄 시작일 초기값 설정 */
document.getElementById('scheduleStartDay').valueAsDate = new Date();
/* 스케줄 끝일 */
document.getElementById('scheduleEndDay').valueAsDate = new Date();
/* 디데이가 없는 경우 초기값 설정 */
document.getElementById('scheduleDday').valueAsDate = new Date();

/* 디데이 체크박스 여부 true / false를 리턴한다. */
$(document).ready(function() { 
	
	$("#scheduleDdayCheck").on('click', function() { 
		if ( $(this).prop('checked') ) { 
			$("#scheduleDday-container").show();
		} else { 
			$("#scheduleDday-container").hide();
		} 
	}); 
});

/* 일정 등록 유효성 검사 */
function validate(){
	var content = $("[name=scheduleContent]").val();
	if(content.trim().length == 0){
		alert("내용을 입력하세요.");
		return false;
	}
	return true;

}

/* 지금할일 이미지를 클릭했을때 그 이미지를 사용자가 선택한 icon에 뿌려주고
그 icon에대한 값을 attr로 뽑아내서 그 전송할 input에 담아주면 된다. */

$(".img").on("click" , function(){
	var selectedSrc = $(this).attr("src");
	console.log(selectedSrc);
	$(".selected-icon").attr("src" , selectedSrc);
	
	/* 전송할 alt추려내기 */
	var selectedAlt = $(this).attr("alt");
	$("#iconAlt").attr("value" , selectedAlt);
	
});

</script>
</html>