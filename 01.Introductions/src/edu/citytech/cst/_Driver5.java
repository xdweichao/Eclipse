package edu.citytech.cst;

import java.util.ArrayList;

public class _Driver5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//diamond operator, the only thing in this list can only be _Float_
		ArrayList<Float> list = new ArrayList<>();
		list.add(45f);
		list.add(50f);
		list.add(32f);
		
		float averageAge= 0;
		float total = 0;
			
		for (Float age : list) {
			total = total + age;
		}
		averageAge= total/list.size();
		System.out.println(averageAge);
	}

}
