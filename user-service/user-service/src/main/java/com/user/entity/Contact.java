package com.user.entity;

public class Contact {
	private Long cId;
	private String email;
	private String contactName;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(Long cId, String email, String contactName) {
		super();
		this.cId = cId;
		this.email = email;
		this.contactName = contactName;
	}
	public Long getcId() {
		return cId;
	}
	public void setcId(Long cId) {
		this.cId = cId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	

}
