package com.example.hrms.business.concretes;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hrms.business.abstracts.EmployerService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.core.utilities.results.SuccessDataResult;
import com.example.hrms.core.utilities.results.SuccessResult;
import com.example.hrms.dataAccess.abstracts.EmployerDao;
import com.example.hrms.entities.concretes.Employer;

@Service
public class EmployerManager  implements EmployerService{

	private EmployerDao employerDao;
@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}
@Override
public DataResult<List<Employer>> getAll() {
	
	return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Employers listelendi");
	


}
@Override
public Result add(Employer employer) {
	this.employerDao.save(employer);
	return new SuccessResult("Veri Başarıyla Eklendi");
}

	
	
}
