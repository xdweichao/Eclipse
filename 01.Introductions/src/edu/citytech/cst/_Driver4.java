package edu.citytech.cst;

import java.util.ArrayList;

public class _Driver4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(45f);
		list.add("Wei.Liang");
		list.add(true);
		
		//bad tech, code any, dont want that, want to put constrain, L> Driver 5
		for (Object object : list) {
			if(object instanceof Float) {
				float age = (float) object;
				age= age + 10;
			}
			if(object instanceof String) {
				String name= (String) object;
			}
			if(object instanceof Boolean) {
				boolean test = (boolean)object;
			}

			
			System.out.println(object);
		}
	}

}
