package com.videos.model;

/**
 * This is the New Arrivels model class
 * 
 * @author Tharindu
 *
 */
public class NewArrivelsModel {

	private int vId;
	private String vName;
	private String vYear;
	private String vCatogary;
	private String vDescription;
	private int vPrice;
	private String vEmberded;
	private String vPicture;
	private String vRate;

	public NewArrivelsModel(int vId, String vName, String vYear, String vCatogary, String vDescription, int vPrice,
			String vEmberded, String vPicture, String vRate) {

		super();
		this.vId = vId;
		this.vName = vName;
		this.vYear = vYear;
		this.vCatogary = vCatogary;
		this.vDescription = vDescription;
		this.vPrice = vPrice;
		this.vEmberded = vEmberded;
		this.vPicture = vPicture;
		this.vRate = vRate;
	}

	public String getvRate() {
		return vRate;
	}

	public void setvRate(String vRate) {
		this.vRate = vRate;
	}

	public String getvPicture() {
		return vPicture;
	}

	public void setvPicture(String vPicture) {
		this.vPicture = vPicture;
	}

	public int getvId() {
		return vId;
	}

	public void setvId(int vId) {
		this.vId = vId;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public String getvYear() {
		return vYear;
	}

	public void setvYear(String vYear) {
		this.vYear = vYear;
	}

	public String getvCatogary() {
		return vCatogary;
	}

	public void setvCatogary(String vCatogary) {
		this.vCatogary = vCatogary;
	}

	public String getvDescription() {
		return vDescription;
	}

	public void setvDescription(String vDescription) {
		this.vDescription = vDescription;
	}

	public int getvPrice() {
		return vPrice;
	}

	public void setvPrice(int vPrice) {
		this.vPrice = vPrice;
	}

	public String getvEmberded() {
		return vEmberded;
	}

	public void setvEmberded(String vEmberded) {
		this.vEmberded = vEmberded;
	}

}
