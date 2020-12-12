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
 * Servlet implementation class UserDislikesServlet
 */
@WebServlet("/UserDislikesServlet")
public class UserDislikesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String uId = "1";
		String disliked = request.getParameter("dislike");
		String x = "VideoDescriptionServlet?vId="+disliked;

		UserRating u = new UserCommentService();
		System.out.println(disliked + "|"+uId);

		if(disliked.equals(null)) {
			System.out.println("error");
			disliked = null;
		}
		else {
			System.out.println("liked");
			u.updateUserdisLikes(disliked, uId);
			disliked = null;
		}		
		
		RequestDispatcher dis = request.getRequestDispatcher(x);
		dis.forward(request, response);		

	}
}
