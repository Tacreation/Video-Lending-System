package com.videos.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.videos.model.ExtendedMovieDescriptionModel;
import com.videos.model.NewArrivelsModel;
import com.videos.model.UserCommentModel;
import com.videos.model.UserReplyModel;
import com.videos.service.ExtendedMovieDescriptionService;
import com.videos.service.UserCommentService;
import com.videos.service.VideoDescriptionService;

/**
 * Servlet implementation class VideoDescriptionServlet
 */
@WebServlet("/VideoDescriptionServlet")
public class VideoDescriptionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String vId = request.getParameter("vId");
		String uId = "1";
		// String reply = request.getParameter("reply");
		String cId = request.getParameter("cId");

		try {

			List<NewArrivelsModel> description = VideoDescriptionService.getMovieList(vId);
			request.setAttribute("description", description);

			List<ExtendedMovieDescriptionModel> extended = ExtendedMovieDescriptionService.getExtendedDetails(vId);
			request.setAttribute("extended", extended);

			List<UserCommentModel> comments = UserCommentService.getUserComments(vId);
			request.setAttribute("comments", comments);

			List<UserCommentModel> ucomments = UserCommentService.getCurrentUserComments(vId, uId);
			request.setAttribute("ucomments", ucomments);

			List<UserReplyModel> replys = UserCommentService.getUserReply(cId);
			request.setAttribute("replys", replys);

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		// redirect to a different page (view) //using request dispatcher
		RequestDispatcher dispatcher2 = request.getRequestDispatcher("video.jsp");
		dispatcher2.forward(request, response);
		

	}
	
}
