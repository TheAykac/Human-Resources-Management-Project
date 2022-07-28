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
@Table(name="experiences")
public class Experience {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="workplace_name")
	private String workplaceName;
	
	@Column(name="position")
	private String position;
	
	@Column(name="experience_start_year")
	private int experienceStartYear;
	
	@Column(name="experience_end_year")
	private int experienceEndYear;
	
	@Column(name="is_work")
	private boolean isWork;
	
	

}
