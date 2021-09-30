package com.bridgelabz.addressbookapp.model;

public class AddressBookDTO {

	private String name;
	private String address;
	private String contactNumber;
	private String emailId;

	public AddressBookDTO(String name, String address, String contactNumber, String emailId) {
		super();
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
