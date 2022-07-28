package com.example.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="cities")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
public class City {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="city_name")
	private String cityName;
	
	@Column(name="country_name")
	private String countryName;

//	@JsonIgnore(value = true)
//	@OneToMany(mappedBy = "city", orphanRemoval = true, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private List<JobAdvertisement> jobAdvertisements;
}
