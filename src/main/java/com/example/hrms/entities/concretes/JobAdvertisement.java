package com.example.hrms.entities.concretes;

import java.util.Date;

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
@Table(name="job_advertisement")
public class JobAdvertisement {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="job_description")
	private String jobDescription;
	
	@Column(name="open_position")
	private int openPosition;	
	
	@Column(name="application_deadline")
	private Date applicationDeadline;
	
	@Column(name="is_active")
	private boolean isActive;
	
	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@ManyToOne(cascade = {CascadeType.ALL})
	private Employer employer;
	
	
//	@JsonIgnore
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "city_id")
//	private City city;
	
//	@JsonIgnore
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name="job_title_id_fk")
//	private JobTitle jobTitle;
	
	
	
	
	
	
	

	

}
