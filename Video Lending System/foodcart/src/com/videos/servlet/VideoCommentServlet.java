package com.videos.servlet;

import java.io.IOException; 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.videos.service.UserCommentService;


@WebServlet("/VideoCommentServlet")
public class VideoCommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public VideoCommentServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String cmt = request.getParameter("cmt");
		String vId = request.getParameter("vId");
		String cId = request.getParameter("cId");
		String reply = request.getParameter("reply");
		String cmt0 = request.getParameter("delete");
		String uId = "1";
		String cId0 = "Tharindu";

		UserCommentService.deleteUserComments(cmt0);
		UserCommentService.sendUserReplys(cId, reply);
		UserCommentService.sendUserComments(vId, cmt, uId, cId0);

		// redirect to a different page (view) //using request dispatcher

		RequestDispatcher dispatcher1 = request.getRequestDispatcher("/VideoDescriptionServlet");
		dispatcher1.forward(request, response);

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String cmt = request.getParameter("cmt");
		String vId = request.getParameter("vId");
		String cId = request.getParameter("cId");
		String reply = request.getParameter("reply");
		String cmt0 = request.getParameter("delete");
		String uId = "1";
		String cId0 = "Tharindu";

		UserCommentService.deleteUserComments(cmt0);
		UserCommentService.sendUserReplys(cId, reply);
		UserCommentService.sendUserComments(vId, cmt, uId, cId0);

		// redirect to a different page (view) //using request dispatcher

		RequestDispatcher dispatcher1 = request.getRequestDispatcher("/VideoDescriptionServlet");
		dispatcher1.forward(request, response);
		
	}
	
}
