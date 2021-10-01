package com.bridgelabz.addressbookapp.model;

import lombok.Data;

public @Data class Response {
	private String message;
	private Object addressBook;

	public Response(String message, Object addressBook) {
		super();
		this.message = message;
		this.addressBook = addressBook;
	}

}
