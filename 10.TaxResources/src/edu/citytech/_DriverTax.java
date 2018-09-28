package edu.citytech;
import java.util.List;
import java.util.function.Supplier;

import edu.citytech.business.TaxCalculator;
import edu.citytech.cst.marginaltax.MarginalTax;
import edu.citytech.dao.CSVTaxRepository;
import edu.citytech.dao.TaxRepository;

public class _DriverTax {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<List<MarginalTax>> taxes = CSVTaxRepository::retrieve;
	
		float taxPercentage = new TaxCalculator().calculate(2017,"SI",40_000f,taxes);
		System.out.println(taxPercentage);
		
		//or
		
		float taxPercentage1 = new TaxCalculator().calculate(2017,"SI",140_000f,CSVTaxRepository::retrieve);
		System.out.println(taxPercentage1);
		
		float taxPercentage2 = new TaxCalculator().calculate(2017,"HH",140_000f,CSVTaxRepository::retrieve);
		System.out.println(taxPercentage2);
		
		float taxPercentage3 = new TaxCalculator().calculate(2017,"MFJ",140_000f,CSVTaxRepository::retrieve);
		System.out.println(taxPercentage3);
		
		float taxPercentage4 = new TaxCalculator().calculate(2017,"MFS",140_000f,CSVTaxRepository::retrieve);
		System.out.println(taxPercentage4);
		
		float taxPercentage5 = new TaxCalculator().calculate(2017,"QW",140_000f,TaxRepository::getTaxRules);
		System.out.println(taxPercentage5);
		
		float taxPercentage6 = new TaxCalculator().calculate(2017,"NA",140_000f,TaxRepository::getTaxRules);
		System.out.println(taxPercentage6);

//		110 CSV
//		Put data into a file and let java read 
//		120 XML
//		130 JSON
//		150 Mongo
	}

}
