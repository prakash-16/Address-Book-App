package com.bridgelabz.addressbookapp.model;

public class AddressBookDetails {
	private int id;
	private String name;
	private String address;
	private String contactNumber;
	private String emailId;

	public AddressBookDetails(int id, AddressBookDTO addressDetails) {
		super();
		this.id = id;
		this.name = addressDetails.getName();
		this.address = addressDetails.getAddress();
		this.contactNumber = addressDetails.getContactNumber();
		this.emailId = addressDetails.getEmailId();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "AddressBookDetails [id=" + id + ", name=" + name + ", address=" + address + ", contactNumber="
				+ contactNumber + ", emailId=" + emailId + "]";
	}
	
}
