package edu.citytech.cst;

import edu.citytech.cst.service.GradeCalculator;

public class _Driver2Grades2 {

	public static void main(String[] args) {
		// CST 3613 Wei Liang
		Object [][] grades= {
				{"@1000",99f},
				{"@1001",89f},
				{"@1002",78f},
				{"@1003",56f},
	            {"@1004",50f},
	            {"@1005",45f},
	            {"@1006",37f} };
		
		for (Object[] studentGrades : grades) {
			float score = (float)studentGrades[1];
			
			String id= studentGrades[0].toString();
			
			//String status = GradeCalculator.midtermStatus(score);
			
			String status = GradeCalculator.getLetterGrade(score);
			
			//float status = GradeCalculator.getGPA(score);
			
			System.out.println(id + " " + score + " Status: " + status);
			
		}
	
	}
}	
