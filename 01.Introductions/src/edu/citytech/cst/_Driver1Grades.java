package edu.citytech.cst;

import edu.citytech.cst.service.GradeCalculator;

public class _Driver1Grades {
//CST_N905_25
	public static void main(String[] args) {
		// CST 3613 Wei Liang
		float[] grades = {100, 90, 44, 66, 80};
		
		//String status = "";
		
		for (float f : grades) {
			
			//String status = GradeCalculator.midtermStatus(f);

			String status = GradeCalculator.getLetterGrade(f);
			
			// float status = GradeCalculator.getGPA(f);
			
			System.out.println(f + " " + status);
		}
		
	}

}