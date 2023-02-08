package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Aadhar;
import com.jsp.dto.Pan;
import com.jsp.dto.Person;

public class PPADao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public void create(Person person, Pan pan, Aadhar aadhar) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityManager.persist(aadhar);
		entityTransaction.commit();
		System.out.println("All Good");
	}

	public void update(Person person, int id) {
		Person p = entityManager.find(Person.class, id);
		Aadhar a = entityManager.find(Aadhar.class, id);
		Pan pan = entityManager.find(Pan.class, id);
		if (p != null) {
			a.setName(person.getName());

			pan.setName(person.getName());

			p.setEmail(person.getEmail());
			p.setName(person.getName());

			p.setPan(pan);
			p.setAadhar(a);

			entityTransaction.begin();
			entityManager.merge(p);
			entityManager.merge(a);
			entityManager.merge(pan);

			entityTransaction.commit();
			System.out.println("All Good");
		} else
			System.out.println("Id not found");
	}

	public void delete(Person person, int id) {
		Person p = entityManager.find(Person.class, id);
		Pan pan = entityManager.find(Pan.class, id);
		Aadhar a = entityManager.find(Aadhar.class,id);
		if (p != null) {
			entityTransaction.begin();
			entityManager.remove(p);
			entityManager.remove(a);
			entityManager.remove(pan);
			entityTransaction.commit();
			System.out.println("Deleted");

		} else {
			System.out.println("Id not found");
		}
	}

	public Person readPersonById(int id) {
		return entityManager.find(Person.class,id);
	}

	public Pan readPanById(int id) {
		return entityManager.find(Pan.class,id);
	}

	public Aadhar readAadharById(int id) {
		return entityManager.find(Aadhar.class,id);
	}

}
