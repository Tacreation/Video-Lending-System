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
 * This is the Video Description Service class .
 * 
 * @author Tharindu
 *
 */

public class VideoDescriptionService {

	/**
	 * Retrieve all data from the videos database according to the selected video
	 * 
	 * @param vId
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */

	public static List<NewArrivelsModel> getMovieList(String vId) throws ClassNotFoundException, SQLException {

		ArrayList<NewArrivelsModel> movie = new ArrayList<>();

		// get the connection
		Connection conn = DBConnection.getDBConnection();
		// Create a statement
		Statement stmt = conn.createStatement();

		// Execute the statement and loop over the result set
		ResultSet rs = stmt.executeQuery("select * from videos where vId = " + vId);

		// initialize the values for variables
		while (rs.next()) {

			int Id = rs.getInt(1);
			String vName = rs.getString(2);
			String vYear = rs.getString(3);
			String vCatogary = rs.getString(4);
			String vDescription = rs.getString(5);
			int vPrice = rs.getInt(6);
			String vEmberded = rs.getString(7);
			String vPicture = rs.getString(8);
			String vRate = rs.getString(9);

			// call the model class
			NewArrivelsModel f = new NewArrivelsModel(Id, vName, vYear, vCatogary, vDescription, vPrice, vEmberded,
					vPicture,vRate);

			movie.add(f);

		}

		return movie;
	}

	/**
	 * Retrieve all data from the videos database according to the action category
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */

	public static List<NewArrivelsModel> getActionMovieList() throws ClassNotFoundException, SQLException {

		ArrayList<NewArrivelsModel> movie = new ArrayList<>();

		Connection conn = DBConnection.getDBConnection();

		// Create a statement
		Statement stmt = conn.createStatement();

		// Execute the statement and loop over the result set
		ResultSet rs = stmt.executeQuery("select*from videos where vCatogary = 'Action'");

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

	/**
	 * Retrieve all data from the videos database according to the horror category
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */

	public static List<NewArrivelsModel> getHorrorMovieList() throws ClassNotFoundException, SQLException {

		ArrayList<NewArrivelsModel> movie = new ArrayList<>();

		Connection conn = DBConnection.getDBConnection();

		// Create a statement
		Statement stmt = conn.createStatement();

		// Execute the statement and loop over the result set
		ResultSet rs = stmt.executeQuery("select*from videos where vCatogary = 'Horror'");

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

	/**
	 * Retrieve all data from the videos database according to the thriller category
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */

	public static List<NewArrivelsModel> getThrillerMovieList() throws ClassNotFoundException, SQLException {

		ArrayList<NewArrivelsModel> movie = new ArrayList<>();

		Connection conn = DBConnection.getDBConnection();

		// Create a statement
		Statement stmt = conn.createStatement();

		// Execute the statement and loop over the result set
		ResultSet rs = stmt.executeQuery("select*from videos where vCatogary = 'Thriller'");

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
