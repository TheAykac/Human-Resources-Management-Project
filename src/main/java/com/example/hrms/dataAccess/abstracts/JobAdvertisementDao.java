package com.example.hrms.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.example.hrms.entities.concretes.JobAdvertisement;


public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {

	List<JobAdvertisement> findAllByIsActiveTrue();
	
	List<JobAdvertisement> findAllByEmployer_CompanyNameAndIsActiveTrue(@Param("companyName") String companyName);
	
	List<JobAdvertisement> findAllByIsActiveTrueOrderByApplicationDeadlineAsc();
		
	
	
	
	
}
