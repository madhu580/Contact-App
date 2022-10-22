package in.ashokit.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.constants.AppConstants;
import in.ashokit.entity.Contact;
import in.ashokit.props.AppProperties;
import in.ashokit.service.ContactService;

@RestController
public class ContactRestController {

	@Autowired
	ContactService contactService;

	@Autowired
	AppProperties appProperties;

	@PostMapping("/saveContact")
	public String saveContact(@RequestBody Contact contact) {

		Map<String, String> messages = appProperties.getMessages();
		boolean status = contactService.saveContact(contact);
		if (status) {
			return messages.get(AppConstants.CONTACT_SAVE_SUCC);
		} else {
			return messages.get(AppConstants.CONTACT_SAVE_FAIL);
		}
	}

	@GetMapping("getAllContacts")
	public List<Contact> getContacts() {
		return contactService.getAllContacts();
	}

	@GetMapping("/getContactById/{cid}")
	public Contact getContactById(@PathVariable("cid") Integer contactId) {
		return contactService.getContactById(contactId);
	}

	@DeleteMapping("/deleteContact/{cid}")
	public String deleteContactById(@PathVariable("cid") Integer contactId) {

		Map<String, String> messages = appProperties.getMessages();
		boolean status = contactService.deleteContactById(contactId);
		if (status) {
			return messages.get(AppConstants.CONTACT_DEL_SUCC);
		} else {
			return messages.get(AppConstants.CONTACT_DEL_FAIL);
		}

	}

}
