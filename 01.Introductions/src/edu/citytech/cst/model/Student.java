package edu.citytech.cst.model;

public class Student {
	
	private String id;
	private float grade;
	
	
	
	
	
	
	public Student(String id, float grade) {
		super();
		this.id = id;
		this.grade = grade;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public float getGrade() {
		return grade;
	}
	public void setGrade(float grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", grade=" + grade + "]";
	}
	
	
	
}
