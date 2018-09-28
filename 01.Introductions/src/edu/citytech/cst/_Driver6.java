package edu.citytech.cst;

import java.util.HashMap;

import edu.citytech.cst.model.Student;

public class _Driver6 {
public static void main(String[] args) {
	HashMap<String, Integer> states =  new HashMap<>();
	
	states.put("NY", 15_000_000);
	states.put("CT", 8_000_000);
	states.put("NJ", 11_000_000);
	System.out.println(states.get("NY"));
	
	HashMap<String,Student> students= new HashMap<>();
	students.put("001", new Student("001", 100));
	students.put("002", new Student("002", 75));
	students.put("003", new Student("003", 90));
	
	float total= 0;
	float avg= 0;
	
	for (String key : students.keySet()) {
		System.out.println(key + " " + students.get(key));
		total = total + students.get(key).getGrade();
	}
	avg= total/students.size();
	System.out.println(avg);
}
}
