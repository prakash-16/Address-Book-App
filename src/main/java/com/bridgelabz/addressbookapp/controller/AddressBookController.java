package com.bridgelabz.addressbookapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbookapp.model.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.Response;
import com.bridgelabz.addressbookapp.service.IAddressBookService;

@RestController
@RequestMapping("/address/book")
public class AddressBookController {
	@Autowired
	IAddressBookService addressDetails;

	@RequestMapping(value = { "/", "/get" })
	public ResponseEntity<Response> getAddressBook() {
		Response res = new Response("Get all data success", addressDetails.getAllAddress());
		return new ResponseEntity<Response>(res, HttpStatus.OK);
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Response> getData(@PathVariable int id) {
		Response res = new Response("Get contact number success", addressDetails.getDataById(id));
		return new ResponseEntity<Response>(res, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<Response> createContact(@RequestBody AddressBookDTO addressData) {
		Response res = new Response("Address Book created successfully", addressDetails.createData(addressData));
		return new ResponseEntity<Response>(res, HttpStatus.CREATED);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Response> updateContact(@PathVariable int id, @RequestBody AddressBookDTO addressData) {
		Response res = new Response("Contact updated success", addressDetails.updateData(id, addressData));
		return new ResponseEntity<Response>(res, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteContact(@PathVariable int id) {
		return new ResponseEntity<String>("Contact deleted", HttpStatus.OK);
	}
}
