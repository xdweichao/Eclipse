package edu.citytech.cst;

import edu.citytech.cst.model.Student;
import edu.citytech.cst.service.GradeCalculator;

public class _Driver3 {

	public static void main(String[] args) {
		// CST3613 Wel Liang
		
		Student s1= new Student("@1000", 100f);
		Student s2= new Student("@1001", 95f);
		Student s3= new Student("@1002", 55f);
		
		Student[] students= {s1,s2,s3};
		
		
		for (Student student : students) {
			
			//String status = GradeCalculator.midtermStatus(student.getGrade());
			//String status = GradeCalculator.getLetterGrade(student.getGrade());
			float status = GradeCalculator.getGPA(student.getGrade());
			System.out.println(student + " " + status);
		}
	}

}
