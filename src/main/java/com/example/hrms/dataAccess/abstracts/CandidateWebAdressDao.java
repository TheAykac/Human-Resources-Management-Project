package com.example.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.hrms.entities.concretes.CandidateWebAdress;

public interface CandidateWebAdressDao extends JpaRepository<CandidateWebAdress, Integer> {


}
