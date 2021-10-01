package com.bridgelabz.addressbookapp.model;

import lombok.Data;

public @Data class AddressBookDTO {

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

	

}
