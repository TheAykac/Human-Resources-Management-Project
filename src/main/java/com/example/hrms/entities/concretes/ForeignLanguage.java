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
@Table(name="foreign_languange")
public class ForeignLanguage {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="languange")
	private String languange;
	
	@Column(name="languange_level")
	private int languangeLevel;
	
	
}
