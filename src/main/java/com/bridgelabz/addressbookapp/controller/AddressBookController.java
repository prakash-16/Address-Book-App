package com.bridgelabz.addressbookapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address/book")
public class AddressBookController {
	@RequestMapping(value = { "/", "/get" })
	public ResponseEntity<String> getAddressBook() {
		return new ResponseEntity<String>("Get all data success", HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<String> getData(@PathVariable int id) {
		return new ResponseEntity<String>("Get contact number success", HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<String> createContact() {
		return new ResponseEntity<String>("Address Book created successfully", HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateContact(@PathVariable int id) {
		return new ResponseEntity<String>("Get contact number success", HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteContact(@PathVariable int id) {
		return new ResponseEntity<String>("Get contact number success", HttpStatus.OK);
	}
}
