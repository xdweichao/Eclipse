package edu.citytech.cst.webresource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.citytech.cst.service.GradeCalculator;


@RestController
@RequestMapping("/gradesystem")
public class GradeResource {

	@RequestMapping("/midterm")
	public String getMidSemesterStatus(@RequestParam(value="score")float score) {
		
		
		String status= GradeCalculator.midtermStatus(score);
		
		return status;
	}
	
	@RequestMapping("/lettergrade")
	public String getLetterGrade(@RequestParam(value="score")float score){
		
		String lettergrade= GradeCalculator.getLetterGrade(score);
		
		return lettergrade;
	}
	
	@RequestMapping("/gpa")
	public float getGPA(@RequestParam(value="score")float score){
		
		float gpa= GradeCalculator.getGPA(score);
		
		return gpa;
	}
	
}
