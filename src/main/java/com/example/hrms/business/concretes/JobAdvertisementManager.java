package com.example.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.hrms.business.abstracts.JobAdvertisementService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.JobAdvertisementDao;
import com.example.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService{

	private JobAdvertisementDao jobAdvertisementDao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Veriler kaydedildi.");
				
	}

	@Override
	public DataResult<List<JobAdvertisement>> findAllByIsActiveTrue() {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAllByIsActiveTrue(),"veriler Başarıyla Listelendi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> findAllByIsActiveTrueOrderByApplicationDeadlineAsc() {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAllByIsActiveTrueOrderByApplicationDeadlineAsc(),"Veriler Başarıyla Listelendi");
	}

	

	

	
	
	
	
	

	

}
