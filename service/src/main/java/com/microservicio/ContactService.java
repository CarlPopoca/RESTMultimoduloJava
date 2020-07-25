package com.microservicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicio.model.Contact;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;
 	public List<Contact> getContact()
	{
		return contactRepository.getContact();
	}
}
