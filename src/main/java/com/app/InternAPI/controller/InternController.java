package com.app.InternAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.InternAPI.model.Interns;
import com.app.InternAPI.service.InternService;

@RestController
@RequestMapping("/dashboard")
public class InternController {
	
	@Autowired(required = false)
	InternService internService;
	@PostMapping("/addinterns")
	public Interns addInternController(@RequestBody Interns intern) {
		return this.internService.addInternService(intern);
	}
}
