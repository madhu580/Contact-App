package com.madhu.service;

import java.util.List;

import com.madhu.entity.Contact;

public interface ContactService {
	// Save contact
	public boolean saveContact(Contact contact);

	// Get all saved contacts
	public List<Contact> getAllContacts();

	// Edit contact
	public Contact getContactById(Integer contactId);

	// Delete contact
	public boolean deleteContact(Integer contactId);

}
