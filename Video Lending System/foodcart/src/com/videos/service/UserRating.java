package com.videos.service;

/**
 * this is user rating interface
 * 
 * @author Tharindu
 *
 */

public interface UserRating {

	/**
	 * update review database when user click like button
	 * 
	 * @param vId
	 * @param cId
	 */
	public void updateUserLikes(String vId, String cId);

	/**
	 * update review database when user click dislike button
	 * 
	 * @param vId
	 * @param cId
	 */

	public void updateUserdisLikes(String vId, String cId);

}
