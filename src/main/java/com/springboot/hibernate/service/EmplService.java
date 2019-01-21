package com.springboot.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.hibernate.dao.EmplDao;
import com.springboot.hibernate.model.EmplDetails;

@Service
public class EmplService {

	@Autowired
	private EmplDao emplDao;
	
	public String insertEmplDtls(EmplDetails details) {
		return emplDao.insertEmplDtls(details);
		
	}
	
}
