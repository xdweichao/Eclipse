package edu.citytech.cst;


import com.jbbwebsolution.service.CalculateStudentGrade;
import edu.citytech.cst.service.GradeCalculator;

public class _Driver1GradeExam {
	public static void main(String[] args) {
		CalculateStudentGrade.instanceOf()
							 .letterGrade(GradeCalculator::getLetterGrade, 
							 "Liang.Wei","Wei.Liang@mail.citytech.cuny.edu");
	}
}