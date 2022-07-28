package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.CandidateService;
import com.example.hrms.dataAccess.abstracts.CandidateDao;
import com.example.hrms.entities.concretes.Candidate;
@Service
public class CandidateManager implements CandidateService {

	private CandidateDao candidateDao;
@Autowired
	public CandidateManager(CandidateDao candidateDao) {
		super();
		this.candidateDao = candidateDao;
	}
@Override
public List<Candidate> getAll(){
	return candidateDao.findAll();
}
	
	
}
