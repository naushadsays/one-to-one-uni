package com.jsp.controller;

import com.jsp.dto.Aadhar;
import com.jsp.dto.Pan;
import com.jsp.dto.Person;
import com.jsp.service.Service;

public class Controller {
	public static void main(String[] args) {
		Pan pan = new Pan();
		pan.setName("Saheb");

		Aadhar aadhar = new Aadhar();
		aadhar.setName("Saheb");

		Person person = new Person();
		person.setName("Saheb");
		person.setEmail("Saheb@gmail.com");
		person.setPan(pan);
		person.setAadhar(aadhar);

		Service service = new Service();

//		save person pan aadhar
//		service.create(person, aadhar, pan);

//		update person pan aadhar 
//		int id=3;
//		service.update(person,id);

//		DELETE person pan aadhar
//		int id=3;
//		service.delete(person,id);

//		read person
//		int id=2;
//		Person p =service.readPersonById(id);
//		System.out.println(p.getId());
//		System.out.println(p.getName());
//		System.out.println(p.getEmail());
		

//		read pan
//		int id = 2;
//		Pan p =service.readPanById(id);
//		System.out.println(p.getId());
//		System.out.println(p.getName());
		
		
//		read Aadhar
//		int id =2;
//		Aadhar a= service.readAadharById(id);
//		System.out.println(a.getId());
//		System.out.println(a.getName());
		

	}

}
