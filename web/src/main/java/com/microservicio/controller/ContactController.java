package com.microservicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.microservicio.ContactService;
import com.microservicio.model.Contact;

@RestController
@RequestMapping("api/contact")
public class ContactController {

	@Autowired
	private ContactService contactService;
	@GetMapping
	public List<Contact> getContact()
	{
		return contactService.getContact();
	}
}
