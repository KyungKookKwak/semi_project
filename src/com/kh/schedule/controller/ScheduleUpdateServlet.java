package com.kh.schedule.controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.josephoconnell.html.HTMLInputFilter;
import com.kh.common.MyFileRenamePolicy;
import com.kh.schedule.model.service.ScheduleService;
import com.kh.schedule.model.vo.Schedule;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.FileRenamePolicy;

/**
 * Servlet implementation class ScheduleUpdateServlet
 */
@WebServlet("/schedule/updateScheduleEnd")
public class ScheduleUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ScheduleUpdateServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (!ServletFileUpload.isMultipartContent(request)) {
			request.setAttribute("msg", "일정수정 오류!");
			request.setAttribute("loc", "/");
			request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp").forward(request, response);
			return;
		}
		
		String saveDirectory = "/upload/schedule/update";
		System.out.printf("[saveDirectory = %s]\n", saveDirectory);

		int maxPostSize = 1024 * 1024 * 10;

		MultipartRequest multiReq = new MultipartRequest(request, saveDirectory, maxPostSize, "UTF-8",
				new MyFileRenamePolicy());

		String scheduleTitle = multiReq.getParameter("title");
		String scheduleContent = multiReq.getParameter("content");
		String scheduleDdayCheck = multiReq.getParameter("dday");

		// System.out.println("값 체크 : "+scheduleTitle +"," +scheduleContent+ ","+scheduleDdayCheck );
		// 체크했을 경우 on으로 넘어오고 체크되지 않았을 경우에는 null이라고 넘어온다.
		// 위의 값을 가지고 분기하면 될 듯하다.

		if(scheduleDdayCheck == null) {
			scheduleDdayCheck = "N";
		} else {
			scheduleDdayCheck = "Y";
		}
		System.out.println("scheduleRepeatCheck 값 출력 테스트 : "+scheduleDdayCheck);
		java.sql.Date dateDday = null;
		
		if (scheduleDdayCheck == "Y") {
			String scheduleDday = multiReq.getParameter("ddaySelect");
			dateDday = java.sql.Date.valueOf(scheduleDday);
			System.out.println("날짜출력 dateDday 테스트"+dateDday);
		}		

		// scheduleContent에 대한 html_filter라이브러리 사용
		scheduleContent = new HTMLInputFilter().filter(scheduleContent);
		System.out.println("scheduleContent 값 출력 확인 " + scheduleContent);
		
		String scheduleStartDay = multiReq.getParameter("scheduleStartDay");
		java.sql.Date dateSday = java.sql.Date.valueOf(scheduleStartDay);
		System.out.println("날짜출력 dateSday 테스트"+dateSday);
		
		
		String scheduleEndDay = multiReq.getParameter("scheduleEndDay");
		java.sql.Date dateEday = java.sql.Date.valueOf(scheduleEndDay);
		System.out.println("날짜출력 dateEday 테스트"+dateEday);
		
		String writeDay = multiReq.getParameter("writeDay");
		java.sql.Date dateWriteDay = java.sql.Date.valueOf(writeDay);
		System.out.println("날짜출력 dateWriteDay 테스트"+dateWriteDay);
	
		
		
		// 마찬가지로 on / null 로 분기시켜 저장
		String scheduleRepeatCheck = multiReq.getParameter("scheduleRepeatCheck");
		
		if(scheduleRepeatCheck == null) {
			scheduleRepeatCheck = "N";
		} else {
			scheduleRepeatCheck = "Y";
		}
		System.out.println("scheduleRepeatCheck 값 출력 테스트 : "+scheduleRepeatCheck);
		
		String scheduleOriginalfilename = multiReq.getOriginalFileName("up_file");
		String scheduleRenamefilename = multiReq.getFilesystemName("up_file");
		// System.out.println("파일이름 확인 : "+originalFileName + " , "+ renamedFileName);

		String memberId = multiReq.getParameter("memberId");
		System.out.println("MemberId 값 확인 : "+memberId);
		
		String iconAlt = multiReq.getParameter("iconAlt");
		System.out.println("iconAlt 값 확인 : "+iconAlt);
		
		int theDay = Integer.parseInt(multiReq.getParameter("theDay"));
		
		Schedule s = new Schedule(); 
		s.setMemberId(memberId);
		s.setScheduleTitle(scheduleTitle); 
		s.setScheduleContent(scheduleContent);
		s.setScheduleDdaycheck(scheduleDdayCheck);
		// scheduleDate는 default로 넣을거기때문에 패스
		s.setScheduleDdaycheck(scheduleDdayCheck);
		s.setScheduleRepeatcheck(scheduleRepeatCheck);
		s.setScheduleStartday(dateSday);
		s.setScheduleEndday(dateEday);
		s.setScheduleDday(dateDday);
		s.setScheduleOriginalfilename(scheduleOriginalfilename);
		s.setScheduleRenamefilename(scheduleRenamefilename);
		s.setScheduleDate(dateWriteDay);
		s.setScheduleIcon(iconAlt);
		s.setTheDay(theDay);
		
		
//		System.out.printf("[%s]\n", s);
		// 업무로직
		int result = new ScheduleService().insertSchedule(s);
		
		//4.view단 처리 
		String view = "/WEB-INF/views/common/msg.jsp"; 
		String msg = "";
		String loc = "";
		
		if(result > 0) { 
			msg = "일정 등록 성공!"; 
		} 
		else{ 
			msg = "게시판 등록 실패!"; 
		}
		
		request.setAttribute("msg", msg); 
		request.setAttribute("loc", loc);
		request.getRequestDispatcher(view) .forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}