package com.example.hrms.business.abstracts;

import java.util.List;

import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Cv;

public interface CvService {

	DataResult<List<Cv>> getAll();
	Result add(Cv cv);
}
