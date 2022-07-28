package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.entities.concretes.Candidate;

public interface CandidateService {

	List<Candidate> getAll();
}
