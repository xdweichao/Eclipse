package com.jbbwebsolutions.test;

import com.jbbwebsolutions.function.MarginalTaxRate;
import com.jbbwebsolutions.secured.function.GradeMarginalTaxRate;

public class _GradeMarginalTaxes {
	public static void main(String[] args) {
		
		GradeMarginalTaxRate.checkTaxPaid(MarginalTaxRate::taxPaid
				, "michael.smith"
				, "michael.smith@gmail.com");
	}
}