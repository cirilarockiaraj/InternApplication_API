package com.app.InternAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.InternAPI.model.Interns;
import com.app.InternAPI.repository.InternRepository;

@Service
public class InternService {
	@Autowired()
	InternRepository internRepo;
	
	public Interns addInternService(Interns intern) {
		return this.internRepo.save(intern);
	}

	public List<Interns> getAllInternService() {
		// TODO Auto-generated method stub
		return this.internRepo.findAll();
	}
}
