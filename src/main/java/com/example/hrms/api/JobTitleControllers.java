package com.example.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.JobTitleService;
import com.example.hrms.entities.concretes.JobTitle;
@RestController
@RequestMapping("/api/jobtitle")
public class JobTitleControllers {

	private JobTitleService jobTitleService;
@Autowired
	public JobTitleControllers(JobTitleService jobTitleService) {
		super();
		this.jobTitleService = jobTitleService;
	}
@GetMapping("/getall")
public List<JobTitle> getAll(){
	return jobTitleService.getAll();
}
	
}
