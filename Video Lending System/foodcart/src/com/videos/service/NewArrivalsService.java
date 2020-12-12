package com.videos.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.videos.model.NewArrivelsModel;
import com.videos.util.DBConnection;

/**
 * This is the New Arrivals Service class . Retrieve all data from the video
 * database according to the year
 **/

public class NewArrivalsService {

	public static List<NewArrivelsModel> getMovieList() throws ClassNotFoundException, SQLException {

		// get the connection
		Connection conn = DBConnection.getDBConnection();

		ArrayList<NewArrivelsModel> movie = new ArrayList<>();

		// Create a statement
		Statement stmt = conn.createStatement();

		// Execute the statement and loop over the result set
		ResultSet rs = stmt.executeQuery("select * from videos where vYear=2018");

		// initialize the values for variables
		while (rs.next()) {

			int vId = rs.getInt(1);
			String vName = rs.getString(2);
			String vYear = rs.getString(3);
			String vCatogary = rs.getString(4);
			String vDescription = rs.getString(5);
			int vPrice = rs.getInt(6);
			String vEmberded = rs.getString(7);
			String vPicture = rs.getString(8);
			String vRate = rs.getString(9);

			// call the model class
			NewArrivelsModel f = new NewArrivelsModel(vId, vName, vYear, vCatogary, vDescription, vPrice, vEmberded,
					vPicture,vRate);

			movie.add(f);

		}

		return movie;
	}
}
