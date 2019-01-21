package com.springboot.hibernate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.hibernate.model.EmplDetails;

@Repository
public class EmplDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
@Transactional	
public String insertEmplDtls(EmplDetails details) {
	hibernateTemplate.save(details);
		return "Object Inserted";
		
	}
}
