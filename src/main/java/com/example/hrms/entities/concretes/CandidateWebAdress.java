package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="candidate_web_adress")
public class CandidateWebAdress {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="github_adress")	
	private String githubAdress;
	
	@Column(name="linkedin_adress")
	private String linkedinAdress;
	
	
}
