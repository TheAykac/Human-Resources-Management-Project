package com.example.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrms.business.abstracts.ExperienceService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.ExperienceDao;
import com.example.hrms.entities.concretes.Experience;


@Service
public class ExperienceManager implements ExperienceService {

	private ExperienceDao experienceDao;
	
	@Autowired
	public ExperienceManager(ExperienceDao experienceDao) {
		super();
		this.experienceDao = experienceDao;
	}

	@Override
	public DataResult<List<Experience>> getAll() {
		
		return new SuccessDataResult<List<Experience>>(this.experienceDao.findAll(),"veriler listelendi");
	}

	@Override
	public DataResult<List<Experience>> findAllByIsWorkTrueOrderByExperienceEndYear() {
		
		return new SuccessDataResult<List<Experience>>(this.experienceDao.findAllByIsWorkTrueOrderByExperienceEndYear(),"veriler listelendi");
	}

	@Override
	public Result add(Experience experience) {
		this.experienceDao.save(experience);
		return new SuccessResult("veriler eklendi");
	}

	

	

	
	

}
