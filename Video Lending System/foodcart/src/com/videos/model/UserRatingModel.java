package com.videos.model;

/**
 * User Rating Model
 * 
 * @author Tharindu
 *
 */
public class UserRatingModel {

	private int rId;
	private int new_vId;
	private int rating;
	private int count;

	public UserRatingModel(int rId, int new_vId, int rating, int count) {

		super();
		this.rId = rId;
		this.new_vId = new_vId;
		this.rating = rating;
		this.count = count;

	}

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public int getNew_vId() {
		return new_vId;
	}

	public void setNew_vId(int new_vId) {
		this.new_vId = new_vId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}
