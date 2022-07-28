package com.example.hrms.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.business.abstracts.CvService;
import com.example.hrms.core.utilities.results.DataResult;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Cv;
@RestController
@RequestMapping("/api/cv")
public class CvControllers {
	private CvService cvService;
	
	public CvControllers(CvService cvService) {
		super();
		this.cvService = cvService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Cv>> getAll(){
		return this.cvService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(Cv cv) {
		return this.cvService.add(cv);
	}

	

}
