package com.example.hrms.entities.dtos;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisementDto {
	private String companyName;
    private String positionName;
    private int requiredPositionCount;
    private Date applicationDeadline;
}
