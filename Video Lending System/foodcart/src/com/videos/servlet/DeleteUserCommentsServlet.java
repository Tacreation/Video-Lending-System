package com.videos.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.videos.service.UserCommentService;

@WebServlet("/DeleteUserCommentsServlet")
public class DeleteUserCommentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String cmt0 = request.getParameter("delete");

		UserCommentService.deleteUserComments(cmt0);
		
		
		RequestDispatcher dis = request.getRequestDispatcher("NewArrivalServlet");
		dis.forward(request, response);		

	}

}
