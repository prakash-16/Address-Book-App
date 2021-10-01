package com.bridgelabz.addressbookapp.model;

import javax.validation.constraints.Pattern;

import lombok.Data;

public @Data class AddressBookDTO {

	@Pattern(regexp = "^[A-Z]{1}[a-zA-Z]{2,}$", message = "Person name Invalid")
	private String name;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5,}$", message = "Address Invalid")
	private String address;
	
	@Pattern(regexp = "^(91)( )([7-9]{1})([0-9]{9})$", message = "Contact number is Invalid")
	private String contactNumber;
	
	@Pattern(regexp = "^([A-Z]{1,12})([a-z]{1,12})([0-9]{1,12})([!@#$%^&*]{1})$", message = "Email is  Invalid")
	private String emailId;

	public AddressBookDTO(String name, String address, String contactNumber, String emailId) {
		super();
		this.name = name;
		this.address = address;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
	}

	

}
