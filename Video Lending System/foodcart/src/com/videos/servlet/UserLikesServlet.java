package com.videos.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.videos.service.UserCommentService;
import com.videos.service.UserRating;

/**
 * Servlet implementation class UserLikesServlet
 */
@WebServlet("/UserLikesServlet")
public class UserLikesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		String uId = "1";
		String liked = request.getParameter("like");

		UserRating u = new UserCommentService();
		System.out.println(liked + "|"+uId);
		
		String x = "VideoDescriptionServlet?vId="+liked;

				if(liked.equals(null)) {
					System.out.println("error");
					liked = null;
				}
				else {
					System.out.println("liked");
					u.updateUserLikes(liked, uId);
					liked = null;
				}
				
				
				RequestDispatcher dis = request.getRequestDispatcher(x);
				dis.forward(request, response);		
		
		
	}
		

}
