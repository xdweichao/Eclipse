package edu.citytech.business;
import java.util.List;
import java.util.function.Supplier;

import edu.citytech.cst.marginaltax.ITaxRules;
import edu.citytech.cst.marginaltax.MarginalTax;

public class TaxCalculator implements ITaxRules {

	@Override
	public float calculate(int year, String code, float salary, Supplier<List<MarginalTax>> supplier) {
		// TODO Auto-generated method stub
		return 0;
	}

}
