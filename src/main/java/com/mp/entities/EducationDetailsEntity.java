package com.mp.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "dc_education")
public class EducationDetailsEntity {
	private Integer educationId;
	private int caseNo;
	private String highestDegree;
	private String universityName;
	private LocalDate yearOfPassing;
}
