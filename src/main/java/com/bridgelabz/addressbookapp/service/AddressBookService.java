package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.model.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookDetails;
@Service
public class AddressBookService implements IAddressBookService{

	public List<AddressBookDetails> getAllAddress() {
		@SuppressWarnings("unchecked")
		List<AddressBookDetails> addressList = new ArrayList();
		addressList.add(new AddressBookDetails(1,
				new AddressBookDTO("Karan Mehta", "11th Street", "7410852963", "karan@gmail.com")));
		return addressList;
	}

	public AddressBookDetails getDataById(int id) {
		AddressBookDetails addressDetails = new AddressBookDetails(id,
				new AddressBookDTO("Karan Mehta", "11th Street", "7410852963", "karan@gmail.com"));
		return addressDetails;
	}

	public AddressBookDetails createData(AddressBookDTO addressDetails) {
		AddressBookDetails newAddressDetails = new AddressBookDetails(1, addressDetails);
		return newAddressDetails;
	}

	public AddressBookDetails updateData(int id, AddressBookDTO addressDetails) {
		AddressBookDetails newAddressDetails = new AddressBookDetails(id, addressDetails);
		return newAddressDetails;
	}
}
