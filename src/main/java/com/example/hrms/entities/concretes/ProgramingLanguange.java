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
@Table(name="programin_languange")
public class ProgramingLanguange {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="programing_languange")
	private String programinLanguange;
	
	

}
