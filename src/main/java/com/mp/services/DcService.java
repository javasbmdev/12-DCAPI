package com.mp.services;

import java.util.List;

import com.mp.bindings.EducationDetails;
import com.mp.bindings.Income;
import com.mp.bindings.KidsDetials;
import com.mp.entities.EducationDetailsEntity;
import com.mp.entities.IncomeEnitty;
import com.mp.entities.KidsDetailsEntity;

public interface DcService {
	public List<String> getPlanNames();
	public int createCase(int applicationId);
	public boolean selectPlan(int applicationId,String planName);
	public boolean saveIncomeDetails(Income income);
	public boolean saveEducationDetails(EducationDetails educationDetails);
	public boolean saveKidsDetails(KidsDetials detials);
	public Income getIncome(int caseNo);
	public EducationDetails getEducationDetails(int caseNo);
	public List<KidsDetials> getKidsDetials(int caseNo);
	
}
