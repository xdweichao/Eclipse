package edu.citytech.cst.model;

public class MarginalTax {
	private int year;
	private String code;
	private float taxPercentage;
	private float start;
	private float end;
	
	public MarginalTax(int year, String code, float taxPercentage, float start, float end) {
		super();
		this.year = year;
		this.code = code;
		this.taxPercentage = taxPercentage;
		this.start = start;
		this.end = end;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public float getTaxPercentage() {
		return taxPercentage;
	}

	public void setTaxPercentage(float taxPercentage) {
		this.taxPercentage = taxPercentage;
	}

	public float getStart() {
		return start;
	}

	public void setStart(float start) {
		this.start = start;
	}

	public float getEnd() {
		return end;
	}

	public void setEnd(float end) {
		this.end = end;
	}
	
	
}

