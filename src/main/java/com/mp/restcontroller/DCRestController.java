package com.mp.restcontroller;

import java.util.List;

import javax.persistence.Entity;
import javax.websocket.server.PathParam;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mp.bindings.EducationDetails;
import com.mp.bindings.Income;
import com.mp.bindings.KidsDetials;
import com.mp.entities.IncomeEnitty;
import com.mp.services.DcService;

@RestController
public class DCRestController {
	@Autowired
	private DcService service;
	@GetMapping("/{applicationId}/create-case")
	public ResponseEntity<String> createCase(@PathParam("applicationId") Integer applicationId){
		return new ResponseEntity<String> ("created",HttpStatus.OK);
	}
	@GetMapping("/plans")
	public ResponseEntity<List<String>> getPlans(){
		return new ResponseEntity<List<String>>(service.getPlanNames(),HttpStatus.OK);
	}
	
	@PostMapping("/income-details")
	public ResponseEntity<String> saveIncomeDetails(@RequestBody Income income){
		  
		 boolean result = service.saveIncomeDetails(income);
		 if(result==false) {
			 return new ResponseEntity<String>("income details saving fail",HttpStatus.BAD_REQUEST);
		 }else {
			return new ResponseEntity<String>("save sucess",HttpStatus.OK);
		}
	}
	@PostMapping("/edu-details")
	public ResponseEntity<String> saveEducationDetails(@RequestBody EducationDetails educationDetails){
		boolean result = service.saveEducationDetails(educationDetails);
		 if(result==false) {
			 return new ResponseEntity<String>("education details saving fail",HttpStatus.BAD_REQUEST);
		 }else {
			return new ResponseEntity<String>("save sucess",HttpStatus.OK);
		}
		
	}
	@PostMapping("/kids-details")
	public ResponseEntity<String> saveKidsDetials(@RequestBody KidsDetials detials){
		boolean result = service.saveKidsDetails(detials);
		 if(result==false) {
			 return new ResponseEntity<String>("Kids details saving fail",HttpStatus.BAD_REQUEST);
		 }else {
			return new ResponseEntity<String>("save sucess",HttpStatus.OK);
		}
	}
	
}
