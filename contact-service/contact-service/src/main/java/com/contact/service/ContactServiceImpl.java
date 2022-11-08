package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl{

	
		
	    //fake list of contacts

	    List<Contact> list = List.of(
	            new Contact(1L, "Lee@gmail.com", "Lee", 101L),
	            new Contact(2L, "John@gmail.com", "John", 102L),
	            new Contact(3L, "Johnson@gmail.com", "Johnson", 103L),
	            new Contact(4L, "sameer@gmail.com", "Sameer", 104L)
	    );


		public List<Contact> getContactsOfUser(Long userId) {
			// TODO Auto-generated method stub
			return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
		}
	    
	    
//	    @Override
//		public List<Contact> getContactsOfUser(Long userId) {
//			
//			return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
//
//			
//		}
	    
	    
	}
	
	
	


