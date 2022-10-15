package com.mp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mp.bindings.EducationDetails;
import com.mp.bindings.Income;
import com.mp.bindings.KidsDetials;
import com.mp.entities.EducationDetailsEntity;
import com.mp.entities.IncomeEnitty;
import com.mp.entities.KidsDetailsEntity;
import com.mp.repository.DcIncomeRepository;
import com.mp.repository.EducationDetailsRepository;
import com.mp.repository.KidsDetailsRepository;

@Service
public class DcServiceImpl implements DcService {
	@Autowired
	private DcIncomeRepository incomeRepository;
	@Autowired
	private EducationDetailsRepository eduRepository;
	@Autowired
	private KidsDetailsRepository kidsRepository;
	@Override
	public List<String> getPlanNames() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int createCase(int applicationId) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean selectPlan(int applicationId, String planName) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean saveIncomeDetails(Income income) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean saveEducationDetails(EducationDetails educationDetails) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean saveKidsDetails(KidsDetials detials) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Income getIncome(int caseNo) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public EducationDetails getEducationDetails(int caseNo) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<KidsDetials> getKidsDetials(int caseNo) {
		// TODO Auto-generated method stub
		return null;
	}

	 

}
