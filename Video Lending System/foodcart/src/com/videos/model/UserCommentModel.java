package com.videos.model;

/**
 * This is the User Comment Model class
 * 
 * @author Tharindu
 *
 */
public class UserCommentModel {

	private int pId;
	private String cId;
	private String cComment;
	private int uId;
	private int vId;
	private String cDate;

	public UserCommentModel(int pId, String cId, String cComment, int uId, int vId, String cDate) {
		super();
		this.cId = cId;
		this.cComment = cComment;
		this.uId = uId;
		this.vId = vId;
		this.cDate = cDate;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcComment() {
		return cComment;
	}

	public void setcComment(String cComment) {
		this.cComment = cComment;
	}

	public int getuId() {
		return uId;
	}

	public void setuId(int uId) {
		this.uId = uId;
	}

	public int getvId() {
		return vId;
	}

	public void setvId(int vId) {
		this.vId = vId;
	}

	public String getcDate() {
		return cDate;
	}

	public void setcDate(String cDate) {
		this.cDate = cDate;
	}

}
