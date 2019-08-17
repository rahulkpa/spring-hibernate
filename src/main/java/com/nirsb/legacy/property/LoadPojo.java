package com.nirsb.legacy.property;

public class LoadPojo {
	private String emailId;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	private String fname;
	public void printDetails() {
		System.out.println("name: "+fname+" "+"emailId : "+emailId);
	}

}
