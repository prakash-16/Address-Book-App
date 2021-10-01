package com.bridgelabz.addressbookapp.model;

import lombok.Data;

public @Data class AddressBookDetails {
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

	
}
