package com.bridgelabz.addressbookapp.service;

import java.util.List;

import com.bridgelabz.addressbookapp.model.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookDetails;

public interface IAddressBookService {
	List<AddressBookDetails> getAllAddress();
	AddressBookDetails getDataById(int id);
	AddressBookDetails createData(AddressBookDTO addressDetails);
	AddressBookDetails updateData(int id, AddressBookDTO addressDetails);
}
