package com.app.InternAPI.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.InternAPI.Exception.ResourceNotFoundException;
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

	public Optional<Interns> getInternService(Integer id) {
		// TODO Auto-generated method stub
		return this.internRepo.findById(id);
	}

	public Interns updateIntern(Integer id, Interns intern) {
		// TODO Auto-generated method stub
		Interns oldData=this.internRepo.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("User data not found"));
		oldData.setStudentName(intern.getStudentName());
		oldData.setProjectName(intern.getProjectName());
		oldData.setLanguages(intern.getLanguages());
		oldData.setDepartment(intern.getDepartment());
		oldData.setEmailId(intern.getEmailId());
		oldData.setContactNumber(intern.getContactNumber());
		return this.internRepo.save(oldData);
	}

	public String deleteInternService(Integer id) {
		// TODO Auto-generated method stub
		this.internRepo.deleteById(id);
		return "successfully deleted";
	}
}
