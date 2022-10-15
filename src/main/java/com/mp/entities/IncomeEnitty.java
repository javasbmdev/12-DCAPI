package com.mp.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "dc_income")
public class IncomeEnitty {
	private Integer incomeId;
	private Integer caseNo;
	private double monthlySalary;
	private double rentIncome;
	private double propetyIncome;
	
	
}
