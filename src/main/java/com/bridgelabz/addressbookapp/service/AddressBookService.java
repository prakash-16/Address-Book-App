package com.bridgelabz.addressbookapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbookapp.model.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookDetails;
@Service
public class AddressBookService implements IAddressBookService{
	@SuppressWarnings("unchecked")
	private List<AddressBookDetails> addressList = new ArrayList();
	public List<AddressBookDetails> getAllAddress() {
		return addressList;
	}

	public AddressBookDetails getDataById(int id) {
		return addressList.get(id-1);
	}

	public AddressBookDetails createData(AddressBookDTO addressData) {
		AddressBookDetails newAddressDetails = new AddressBookDetails(addressList.size()+1, addressData);
		addressList.add(newAddressDetails);
		return newAddressDetails;
	}

	public AddressBookDetails updateData(int id, AddressBookDTO addressDetails) {
		AddressBookDetails newAddressDetails = this.getDataById(id);
		newAddressDetails.setName(addressDetails.getName());
		newAddressDetails.setAddress(addressDetails.getAddress());
		newAddressDetails.setContactNumber(addressDetails.getContactNumber());
		newAddressDetails.setEmailId(addressDetails.getEmailId());
		addressList.add(id-1, newAddressDetails);
		return newAddressDetails;
	}
}
