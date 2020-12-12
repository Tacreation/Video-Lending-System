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

import com.videos.model.NewArrivelsModel;
import com.videos.service.LatestMovieService;
import com.videos.service.NewArrivalsService;
import com.videos.service.VideoDescriptionService;

/**
 * Servlet implementation class NewArrivalServlet
 */
@WebServlet("/NewArrivalServlet")
public class NewArrivalServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {

			List<NewArrivelsModel> latest = NewArrivalsService.getMovieList();
			request.setAttribute("latest", latest);

			List<NewArrivelsModel> dp = LatestMovieService.getMovieList();
			request.setAttribute("deadpool", dp);

			List<NewArrivelsModel> Action = VideoDescriptionService.getActionMovieList();
			request.setAttribute("Action", Action);

			List<NewArrivelsModel> Horror = VideoDescriptionService.getHorrorMovieList();
			request.setAttribute("Horror", Horror);

			List<NewArrivelsModel> Thriller = VideoDescriptionService.getThrillerMovieList();
			request.setAttribute("Thriller", Thriller);

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		// redirect to a different page (view) //using request dispatcher
		RequestDispatcher dispatcher1 = request.getRequestDispatcher("home.jsp");
		dispatcher1.forward(request, response);

	}

}
