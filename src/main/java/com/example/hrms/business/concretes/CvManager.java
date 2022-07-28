package com.example.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.CvService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.CvDao;
import com.example.hrms.entities.concretes.Cv;
@Service
public class CvManager implements CvService{

	private CvDao cvDao;
	@Autowired
	public CvManager(CvDao cvDao) {
		super();
		this.cvDao = cvDao;
	}

	@Override
	public DataResult<List<Cv>> getAll() {
		
		return new SuccessDataResult<List<Cv>>(this.cvDao.findAll(),"veriler başarıyla listelendi");
	}

	@Override
	public Result add(Cv cv) {
		
		this.cvDao.save(cv);
		return new SuccessResult("verile Başarıyla kaydedil");
	}

}
