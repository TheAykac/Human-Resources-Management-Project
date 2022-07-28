package com.example.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.CandidateService;
import com.example.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/candidate")
public class CandidateControllers {

	private CandidateService candidateService;
@Autowired
	public CandidateControllers(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}

@GetMapping("/getall")
public List<Candidate> getAll(){
	return candidateService.getAll();
}
}
