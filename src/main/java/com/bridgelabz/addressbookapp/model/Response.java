package com.bridgelabz.addressbookapp.model;

public class Response {
	private String message;
	private Object addressBook;

	public Response(String message, Object addressBook) {
		super();
		this.message = message;
		this.addressBook = addressBook;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getAddressBook() {
		return addressBook;
	}

	public void setAddressBook(Object addressBook) {
		this.addressBook = addressBook;
	}

	@Override
	public String toString() {
		return "Response [message=" + message + ", addressBook=" + addressBook + "]";
	}

}
