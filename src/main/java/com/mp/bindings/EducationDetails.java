package com.mp.bindings;

import java.time.LocalDate;

import lombok.Data;

@Data
public class EducationDetails {
	private int caseNo;
	private String highestDegree;
	private String universityName;
	private LocalDate yearOfPassing;
}
