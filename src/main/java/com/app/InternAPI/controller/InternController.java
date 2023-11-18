package com.app.InternAPI.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.InternAPI.model.Interns;
import com.app.InternAPI.service.InternService;

@RestController
@RequestMapping("/dashboard")
public class InternController {
	
	@Autowired()
	InternService internService;
	
	@PostMapping("/addinterns")
	public Interns addInternController(@RequestBody Interns intern) {
		return this.internService.addInternService(intern);
	}
	
	@GetMapping("/getallinterns")
	public List<Interns> getAllInterns() {
		return this.internService.getAllInternService();
	}
	
	@GetMapping("/getintern/{id}")
	public Optional<Interns> getIntern(@PathVariable(value="id") Integer id) {
		return this.internService.getInternService(id);
	}
	
	@PutMapping("/updateintern/{id}")
	public Interns updateIntern(@PathVariable(value="id") Integer id, @RequestBody Interns intern) {
		return this.internService.updateIntern(id, intern);
	}
	@DeleteMapping("/deleteintern/{id}")
	public String deleteIntern(@PathVariable(value="id") Integer id) {
		return this.internService.deleteInternService(id);
	}
}
