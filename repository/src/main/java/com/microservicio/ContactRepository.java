package com.microservicio;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;
import com.microservicio.model.Contact;
@Repository
public class ContactRepository {
 
	public List<Contact> getContact()
	{
		List<Contact> contacts = new ArrayList<Contact>();
		contacts.add(new Contact("aaa", "prueba", "masculino", 134233421));
		contacts.add(new Contact("bbb", "prueba", "masculino", 134233421));
		contacts.add(new Contact("ccc", "prueba", "masculino", 134233421));
	
		return contacts;
	}
}
