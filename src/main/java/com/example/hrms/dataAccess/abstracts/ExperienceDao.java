package com.example.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.Experience;

public interface ExperienceDao  extends JpaRepository<Experience, Integer>{
	
	List<Experience> findAllByIsWorkTrueOrderByExperienceEndYear();

}
