package com.example.hrms.business.abstracts;

import java.util.List;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {
	
	DataResult<List<JobAdvertisement>> getAll();
	
	Result add(JobAdvertisement jobAdvertisement);
	
	DataResult<List<JobAdvertisement>>findAllByIsActiveTrue();
	
	DataResult<List<JobAdvertisement>> findAllByIsActiveTrueOrderByApplicationDeadlineAsc();
	

	 
	
	
	 
}
