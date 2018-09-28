package edu.citytech.cst.service;

public class GradeCalculator {

	public static String midtermStatus(float grade){
		String status = "";
		if (grade >= 65){
			status = "passing";
		} else {
			status = "failing";
		};
		return status;
	} 
	public static String getLetterGrade(float grade) {
		String status= "";
		
		if (93 <= grade && grade <= 100) {
			status = "A";
		} else if(90 <= grade && grade < 93) {
			 status = "A-";
		} else if(87 <= grade && grade < 90) {
			 status = "B+";
		} else if(83 <= grade && grade < 87) {
			 status = "B";
		} else if(80 <= grade && grade < 83) {
			 status = "B-";
		} else if(77 <= grade && grade < 80) {
			 status = "C+";
		} else if(70 <= grade && grade < 77) {
			 status = "C";
		} else if(60 <= grade && grade < 70) {
			 status = "C-";
		} else if(60 > grade) {
			 status = "F";
		}
		
		return status;
	}
	
	public static float getGPA(float grade) {
		float GPA= 0;
		
		if (93 <= grade && grade <= 100) {
			GPA = (float) 4.00;
		} else if(90 <= grade && grade < 93) {
			GPA= (float) 3.70;
		} else if(87 <= grade && grade < 90) {
			GPA= (float) 3.30;
		} else if(83 <= grade && grade < 87) {
			GPA= (float) 3.00;
		} else if(80 <= grade && grade < 83) {
			GPA= (float) 2.70;
		} else if(77 <= grade && grade < 80) {
			GPA= (float) 2.30;
		} else if(70 <= grade && grade < 77) {
			GPA= (float) 2.00;
		} else if(60 <= grade && grade < 70) {
			GPA= (float) 1.00;
		} else if(60 > grade) {
			GPA= 0;
		}
		
		return GPA;
	}

}
