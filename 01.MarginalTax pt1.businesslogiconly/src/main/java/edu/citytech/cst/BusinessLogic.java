package edu.citytech.cst;


import com.jbbwebsolutions.secured.function.GradeMarginalTaxRate;

import edu.citytech.cst.service.ClassName;

/**
 * Calculate Taxes : Business Logic
 */

public class BusinessLogic {
	public static void main(String[] args) {

		// Business Logic Hardcode
		// Snippet 1
		
		float taxes = ClassName.taxPaid("NA", 100_000f);
		System.out.println("Tax Rate: " + taxes/100_000f  + "\n" + "Tax Paid: " + taxes);
		
		GradeMarginalTaxRate.checkTaxPaid(ClassName::taxPaid, "Wei.Liang", "Wheresthepros@gmail.com");
	}


}
