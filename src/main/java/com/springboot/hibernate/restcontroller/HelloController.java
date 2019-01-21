package com.springboot.hibernate.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.hibernate.model.EmplDetails;
import com.springboot.hibernate.service.EmplService;

@RestController
public class HelloController {
	
	@Autowired
	private EmplService emplService;

	@RequestMapping("/sayHi")
	public String sayHi() {
		return "Hi Spring Boot!!!";
	}
	
	@PostMapping("/insertEmplDtls")
	public String insertEmplDtls(@RequestBody EmplDetails details) {
		return emplService.insertEmplDtls(details);
		
	}
	
}
