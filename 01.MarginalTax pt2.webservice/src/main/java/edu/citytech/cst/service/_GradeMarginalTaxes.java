package edu.citytech.cst.service;

import com.jbbwebsolutions.secured.function.GradeMarginalTaxRate;

import edu.citytech.cst.service.BusinessLogic;

public class _GradeMarginalTaxes {
	public static void main(String[] args) {
		
		float taxes = BusinessLogic.taxPaid("NA", 100_000f);
		System.out.println(taxes);
		float taxes2 = BusinessLogic.taxPaid("SI", 100_000f);
		System.out.println(taxes2);
		float taxes3 = BusinessLogic.taxPaid("MFJ", 100_000f);
		System.out.println(taxes3);
		float taxes4 = BusinessLogic.taxPaid("MFS", 100_000f);
		System.out.println(taxes4);
		float taxes5 = BusinessLogic.taxPaid("HH", 100_000f);
		System.out.println(taxes5);
		float taxes6 = BusinessLogic.taxPaid("QW", 100_000f);
		System.out.println(taxes6);
		
		GradeMarginalTaxRate.checkTaxPaid(BusinessLogic::taxPaid, "Wei.Liang"	, "WheresThePros@gmail.com");
	}
}