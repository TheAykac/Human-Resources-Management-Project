package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entities.concretes.Cv;

public interface CvDao extends JpaRepository<Cv,Integer>{

}
