package com.videos.service;

import java.sql.Connection; 
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.videos.model.ExtendedMovieDescriptionModel;
import com.videos.util.DBConnection;


/**
 * This is the Movie Description Service class .
 *	Retrieve all data from the video description database
 **/

public class ExtendedMovieDescriptionService {

	

public static List<ExtendedMovieDescriptionModel>getExtendedDetails(String vId) throws ClassNotFoundException, SQLException{
		
		// get the connection
		Connection conn = DBConnection.getDBConnection();
		
		ArrayList<ExtendedMovieDescriptionModel> movie = new ArrayList<>();
		
		// Create a statement
		Statement stmt = conn.createStatement();
		
		// Execute the statement and loop over the result set
		ResultSet rs = stmt.executeQuery("select * from vDescription where vId = "+vId);
		
		// initialize the values for variables
		while(rs.next()) {
			 
			int Id = rs.getInt(1);
			String vExtended_Emberded = rs.getString(2);
			String vImdb = rs.getString(3);
			String vUpDate = rs.getString(4);
			
		// call the model class
			ExtendedMovieDescriptionModel f = new ExtendedMovieDescriptionModel(Id, vExtended_Emberded, vImdb, vUpDate);

			movie.add(f);
			
		}
		
		return movie;		
	}
	
	
	
}
