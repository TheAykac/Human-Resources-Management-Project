package com.example.hrms.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cv")
public class Cv {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	private Experience experience;
	
	
	@ManyToOne(cascade = {CascadeType.ALL})
	private CandidateWebAdress candidateWebAdress;	
	
	
	@ManyToOne(cascade = {CascadeType.ALL})
	private CoverLetter coverLetter;
	
	
	@ManyToOne(cascade = {CascadeType.ALL})
	private ForeignLanguage foreignLanguage;
	
	
	@ManyToOne(cascade = {CascadeType.ALL})
	private ProgramingLanguange programingLanguange;
	
	
	@ManyToOne(cascade = {CascadeType.ALL})
	private School school;
	
	
	
	
	
	

}
