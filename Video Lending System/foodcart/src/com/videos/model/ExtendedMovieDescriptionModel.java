package com.videos.model;

/**
 * This is the Extended Movie model class
 * 
 * @author Tharindu
 *
 */

public class ExtendedMovieDescriptionModel {

	private int vId;
	private String vExtended_Emberded;
	private String vImdb ;
	private String vUpDate;
	
	public ExtendedMovieDescriptionModel(int vId, String vExtended_Emberded, String vImdb, String vUpDate) {
		super();
		this.vId = vId;
		this.vExtended_Emberded = vExtended_Emberded;
		this.vImdb = vImdb;
		this.vUpDate = vUpDate;
	}

	/**
	 * 
	 * @return vId
	 */

	public int getvId() {
		return vId;
	}
	
	/**
	 * @param vId the vId to set
	 */

	public void setvId(int vId) {
		this.vId = vId;
	}

	/**
	 * 
	 * @return vExtended_Emberded
	 */

	public String getvExtended_Emberded() {
		return vExtended_Emberded;
	}

	/**
	 * @param vExtended_Emberded the vExtended_Emberded to set
	 */
	public void setvExtended_Emberded(String vExtended_Emberded) {
		this.vExtended_Emberded = vExtended_Emberded;
	}

	/**
	 * 
	 * @return vImdb
	 */
	public String getvImdb() {
		return vImdb;
	}

	/**
	 * @param vImdb the vImdb to set
	 */
	public void setvImdb(String vImdb) {
		this.vImdb = vImdb;
	}


	/**
	 * 
	 * @return vUpDate
	 */
	public String getvUpDate() {
		return vUpDate;
	}

	/**
	 * @param vUpDate the vUpDate to set
	 */
	public void setvUpDate(String vUpDate) {
		this.vUpDate = vUpDate;
	}
	
	
	
}
