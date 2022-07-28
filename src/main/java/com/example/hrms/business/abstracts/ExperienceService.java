package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Experience;

public interface ExperienceService {

	DataResult<List<Experience>> getAll();
	DataResult<List<Experience>> findAllByIsWorkTrueOrderByExperienceEndYear();
	Result add(Experience experience);

}
