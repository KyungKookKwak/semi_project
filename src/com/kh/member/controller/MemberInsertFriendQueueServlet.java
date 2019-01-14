package com.kh.member.controller;

import java.io.IOException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.member.model.service.MemberService;
import com.kh.member.model.vo.Friend;
import com.kh.member.model.vo.FriendQueue;

/**
 * Servlet implementation class MemberInsertFriendServlet
 */
@WebServlet("/friend/insertFriendQueue")
public class MemberInsertFriendQueueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberInsertFriendQueueServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String srchId = request.getParameter("srchId");
		String myId = request.getParameter("myId");
		
		FriendQueue fq = new FriendQueue();
		fq.setMemberId(myId);
		fq.setFriendId(srchId);
		
		String msg = "";
		String loc = "/";
		
		int result = 0;
		try {
			result = new MemberService().insertFriendQueue(fq);
		} catch (SQLIntegrityConstraintViolationException e) {
			if(result > 0) {
				msg = fq.getFriendId()+"님께 친구요청에 성공하셨습니다.";
				loc = "/";
			}else {
				msg = "같은 사용자에게 친구요청을 하셨습니다.";
			}
			
			request.setAttribute("msg", msg);
			request.setAttribute("loc", loc);
			request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp").forward(request, response);
		}
		

		
		if(result > 0) {
			msg = fq.getFriendId()+"님께 친구요청에 성공하셨습니다.";
			loc = "/";
		}else {
			msg = "친구요청에 실패하셨습니다.";
		}
		
		request.setAttribute("msg", msg);
		request.setAttribute("loc", loc);
		request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp").forward(request, response);

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}