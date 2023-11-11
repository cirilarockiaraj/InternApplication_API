package com.app.InternAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
public class InternController {
	
	@GetMapping("/allinterns")
	public String getInterns() {
		return "Hello Interns";
	}
	
	@GetMapping("/getinterns")
	public String Interns() {
		return "Hi Interns";
	}
	
	@GetMapping("/intern/{name}/{id}")
	public String getOneInterns(@PathVariable(value = "name") String name, @PathVariable(value = "id") String id) {
		return "Hi "+name+" your ID : "+id;
	}
}
