package com.videos.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.videos.model.UserCommentModel;
import com.videos.model.UserReplyModel;
import com.videos.util.DBConnection;

/**
 * This is the User Comment Service class .
 **/


public class UserCommentService implements UserRating {
	

	/**
	 * Retrieve all data from the comment database according to the selected video
	 * 
	 * @param vId
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */

	public static List<UserCommentModel> getUserComments(String vId) throws ClassNotFoundException, SQLException {

		ArrayList<UserCommentModel> movie = new ArrayList<>();

		// get the connection
		Connection conn = DBConnection.getDBConnection();

		// Create a statement
		Statement stmt = conn.createStatement();

		// Execute the statement and loop over the result set
		ResultSet rs = stmt.executeQuery("select * from vComment where vId = " + vId);

		// initialize the values for variables
		while (rs.next()) {
			int pId = rs.getInt(1);
			String cId = rs.getString(2);
			String cComment = rs.getString(3);
			int uId = rs.getInt(4);
			int Id = rs.getInt(5);
			String cDate = rs.getString(6);

			// call the model class
			UserCommentModel f = new UserCommentModel(pId, cId, cComment, uId, Id, cDate);

			movie.add(f);

		}

		return movie;
	}

	/**
	 * Retrieve all data from the comment database according to the selected video
	 * and the user Id
	 * 
	 * @param vId
	 * @param uId
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */

	public static List<UserCommentModel> getCurrentUserComments(String vId, String uId)
			throws ClassNotFoundException, SQLException {

		ArrayList<UserCommentModel> movie = new ArrayList<>();

		// get the connection
		Connection conn = DBConnection.getDBConnection();
		// Create a statement
		Statement stmt = conn.createStatement();

		// Execute the statement and loop over the result set
		ResultSet rs = stmt.executeQuery("select * from vComment WHERE vId = '" + vId + "'AND uId = '" + uId + "'");

		// initialize the values for variables
		while (rs.next()) {
			int pId = rs.getInt(1);
			String cId = rs.getString(2);
			String cComment = rs.getString(3);
			int uuId = rs.getInt(4);
			int Id = rs.getInt(5);
			String cDate = rs.getString(6);

			UserCommentModel f = new UserCommentModel(pId, cId, cComment, uuId, Id, cDate);

			movie.add(f);

		}

		return movie;
	}

	/**
	 * insert data to the comment database
	 * 
	 * @param vId
	 * @param cmt
	 * @param uId
	 * @param cId
	 */

	public static void sendUserComments(String vId, String cmt, String uId, String cId) {

		try {
			// get the connection
			Connection conn = DBConnection.getDBConnection();

			String sql = "insert into vComment (cComment,vId,uId,cId) values(?,?,?,?)";

			PreparedStatement ps = conn.prepareStatement(sql);

			// insert the variables values for db
			ps.setString(1, cmt);
			ps.setString(2, vId);
			ps.setString(3, uId);
			ps.setString(4, cId);
			ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	/**
	 * insert data to the vReply database
	 * 
	 * @param cId
	 * @param reply
	 */

	public static void sendUserReplys(String cId, String reply) {

		try {

			// get the connection
			Connection conn = DBConnection.getDBConnection();

			String sql = "insert into vReply(cId,Reply) values(?,?)";

			PreparedStatement ps = conn.prepareStatement(sql);

			// insert the variables values for db
			ps.setString(1, cId);
			ps.setString(2, reply);
			ps.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	/**
	 * Retrieve all data from the reply database according to the user Id
	 * 
	 * @param cId
	 * @param reply
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */

	public static List<UserReplyModel> getCurrentUserReply(String cId, String reply)
			throws ClassNotFoundException, SQLException {

		// get the connection
		Connection conn = DBConnection.getDBConnection();

		ArrayList<UserReplyModel> movie3 = new ArrayList<>();

		// Create a statement
		Statement stmt = conn.createStatement();

		// Execute the statement and loop over the result set
		ResultSet rs = stmt.executeQuery("select * from vReply WHERE cId = '" + cId);

		// initialize the values for variables
		while (rs.next()) {

			int rId = rs.getInt(1);
			int Id = rs.getInt(2);
			String re = rs.getString(3);
			int vId = rs.getInt(4);
			String cDate = rs.getString(5);

			UserReplyModel f = new UserReplyModel(rId, Id, re, vId, cDate);

			movie3.add(f);

		}

		return movie3;
	}

	/**
	 * Retrieve all data from the reply database
	 * 
	 * @param cId
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */

	public static List<UserReplyModel> getUserReply(String cId) throws SQLException, ClassNotFoundException {

		ArrayList<UserReplyModel> movie3 = new ArrayList<>();

		// get the connection
		Connection conn = DBConnection.getDBConnection();

		// Create a statement
		Statement stmt = conn.createStatement();

		// Execute the statement and loop over the result set
		ResultSet rs = stmt.executeQuery("select * from vReply");

		// initialize the values for variables
		while (rs.next()) {

			int rId = rs.getInt(1);
			int Id = rs.getInt(2);
			String re = rs.getString(3);
			int vId = rs.getInt(4);
			String cDate = rs.getString(5);

			UserReplyModel f = new UserReplyModel(rId, Id, re, vId, cDate);

			movie3.add(f);

		}

		return movie3;
	}

	/**
	 * delete comment from the comment database
	 * 
	 * @param cmt
	 */

	public static void deleteUserComments(String cmt) {

		try {

			// get the connection
			Connection conn = DBConnection.getDBConnection();

			String sql = "delete from vComment where cComment = ? ";

			PreparedStatement pst = conn.prepareStatement(sql);

			// insert the variables values for db
			pst.setString(1, cmt);
			pst.executeUpdate();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	/**
	 * update data for the review database according to the selected video and the
	 * user Id
	 */

	public void updateUserLikes(String vId, String cId) {
		
	

		try {
			// get the connection
			Connection conn = DBConnection.getDBConnection();

			String sql = "update review set liked = 'liked' where vId = '" + vId + "' and cId = '" + cId + "'";
			String sql2 = "update videos set vRating = (vRating + 1) where vId = '" + vId + "'" ; 

			Statement statement = conn.createStatement();
			statement.execute(sql);
			statement.execute(sql2);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	/**
	 * update likes for the review database according to the selected video and the
	 * user Id
	 */

	public void updateUserdisLikes(String vId, String cId) {
		

		try {
			// get the connection
			Connection conn = DBConnection.getDBConnection();

			String sql1 = "update review set liked = 'disliked' where vId = '" + vId + "' and cId = '" + cId + "'";
			String sql2 = "update videos set vRating = (vRating - 1) where vId = '" + vId + "'" ;  

			Statement statement = conn.createStatement();
			statement.execute(sql1);
			statement.execute(sql2);
			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("in");
	}
		
	
}
