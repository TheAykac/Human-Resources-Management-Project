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
@Table(name="school")
public class School {
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="school_name")	
	private String schoolName;
	
	@Column(name="department_name")
	private String departmentName;
	
	@Column(name="school_start_year")
	private int schoolStartYear;
	
	@Column(name="School_end_year")
	private int schoolEndYear;
	
	@Column(name="is_graduate")
	private boolean isGraduate;
}
