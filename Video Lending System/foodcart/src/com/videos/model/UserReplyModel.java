package com.videos.model;

/**
 * this is User Reply Model class
 * 
 * @author Tharindu
 *
 */

public class UserReplyModel {

	private int rId;
	private int cId;
	private String Reply;
	private int vId;
	private String cDate;

	public UserReplyModel(int rId, int cId, String Reply, int vId, String cDate) {
		super();
		this.rId = rId;
		this.cId = cId;
		this.Reply = Reply;
		this.vId = vId;
		this.cDate = cDate;
	}

	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getReply() {
		return Reply;
	}

	public void setReply(String Reply) {
		this.Reply = Reply;
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
