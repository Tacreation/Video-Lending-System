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
 * This is the Latest Movie Service class . Retrieve all data from the video
 * database according to selected video
 **/

public class LatestMovieService {

	public static List<NewArrivelsModel> getMovieList() throws ClassNotFoundException, SQLException {

		// get the connection
		Connection conn = DBConnection.getDBConnection();

		ArrayList<NewArrivelsModel> movie = new ArrayList<>();

		// Create a statement
		Statement stmt = conn.createStatement();

		// Execute the statement and loop over the result set
		ResultSet rs1 = stmt.executeQuery("SELECT *FROM videos where vId = (select max(vId) from videos) ");

		// initialize the values for variables
		while (rs1.next()) {
			int vId1 = rs1.getInt(1);
			String vName1 = rs1.getString(2);
			String vYear1 = rs1.getString(3);
			String vCatogary1 = rs1.getString(4);
			String vDescription1 = rs1.getString(5);
			int vPrice1 = rs1.getInt(6);
			String vEmberded1 = rs1.getString(7);
			String vPicture = rs1.getString(8);
			String vRate = rs1.getString(9);


			// call the model class
			NewArrivelsModel f1 = new NewArrivelsModel(vId1, vName1, vYear1, vCatogary1, vDescription1, vPrice1,
					vEmberded1, vPicture,vRate);

			movie.add(f1);

		}

		return movie;
	}

}
