package edu.citytech.cst.service;

public class ClassName {
	public static float taxPaid(String code, float yearlySalary) {
		float taxRate= .40f;
		
	if(code.equalsIgnoreCase("SI")) {
		if (yearlySalary >= 0 && yearlySalary < 9326) {
			taxRate=.10f;
		}else if(yearlySalary >= 9326 && yearlySalary < 37951) {
			taxRate=.15f;
		}else if(yearlySalary >= 37951 && yearlySalary < 91901) {
			taxRate=.25f;
		}else if(yearlySalary >= 91901 && yearlySalary < 191651) {
			taxRate=.28f;
		}else if(yearlySalary >= 191651 && yearlySalary < 416701) {
			taxRate=.33f;
		}else if(yearlySalary >= 416701 && yearlySalary < 418401) {
			taxRate=.35f;
		}else if(yearlySalary >= 418401) {
			taxRate=.396f;
		}
	}
	
	if(code.equalsIgnoreCase("MFJ") || code.equalsIgnoreCase("QW")) {
		if (yearlySalary >= 0 && yearlySalary < 18651) {
			taxRate=.10f;
		}else if(yearlySalary >= 18651 && yearlySalary < 75901) {
			taxRate=.15f;
		}else if(yearlySalary >= 75901 && yearlySalary < 153101) {
			taxRate=.25f;
		}else if(yearlySalary >= 153101 && yearlySalary < 233351) {
			taxRate=.28f;
		}else if(yearlySalary >= 233351 && yearlySalary < 416701) {
			taxRate=.33f;
		}else if(yearlySalary >= 416701 && yearlySalary < 470701) {
			taxRate=.35f;
		}else if(yearlySalary >= 470701) {
			taxRate=.396f;
		}
	}
	
	if(code.equalsIgnoreCase("MFS")) {
		if (yearlySalary >= 0 && yearlySalary < 9326) {
			taxRate=.10f;
		}else if(yearlySalary >= 9326 && yearlySalary < 37951) {
			taxRate=.15f;
		}else if(yearlySalary >= 37951 && yearlySalary < 76551) {
			taxRate=.25f;
		}else if(yearlySalary >= 76551 && yearlySalary < 116676) {
			taxRate=.28f;
		}else if(yearlySalary >= 116676 && yearlySalary < 208351) {
			taxRate=.33f;
		}else if(yearlySalary >= 208351 && yearlySalary < 235351) {
			taxRate=.35f;
		}else if(yearlySalary >= 235351) {
			taxRate=.396f;
		}
	}
	
	if(code.equalsIgnoreCase("HH")) {
		if (yearlySalary >= 0 && yearlySalary < 13351) {
			taxRate=.10f;
		}else if(yearlySalary >= 13351 && yearlySalary < 50801) {
			taxRate=.15f;
		}else if(yearlySalary >= 50801 && yearlySalary < 131201) {
			taxRate=.25f;
		}else if(yearlySalary >= 131201 && yearlySalary < 212501) {
			taxRate=.28f;
		}else if(yearlySalary >= 212501 && yearlySalary < 416701) {
			taxRate=.33f;
		}else if(yearlySalary >= 416701 && yearlySalary < 444551) {
			taxRate=.35f;
		}else if(yearlySalary >= 444501) {
			taxRate=.396f;
		}

	}
	float taxPaid = taxRate*yearlySalary;

	return taxPaid;
}

}

