package com.jsp.service;

import com.jsp.dao.PersonPanAadharDao;
import com.jsp.dto.Aadhar;
import com.jsp.dto.Pan;
import com.jsp.dto.Person;

public class Service {
	PersonPanAadharDao ppaDao = new PersonPanAadharDao();

	public void create(Person p, Aadhar a, Pan pan) {
		ppaDao.create(p, pan, a);
	}

	public void update(Person p, int id) {
		ppaDao.update(p, id);

	}

	public void delete(Person p, int id) {
		ppaDao.delete(p, id);

	}

	public Person readPersonById(int id) {
		return ppaDao.readPersonById(id);
	}

	public Pan readPanById(int id) {
		return ppaDao.readPanById(id);
	}

	public Aadhar readAadharById(int id) {
		return ppaDao.readAadharById(id);
	}
}
