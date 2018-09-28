package edu.citytech.cst.games;

import java.util.ArrayList;
import java.util.List;

public class PossibleWinner {

	public int p1, p2, p3;
	public PossibleWinner(int p1,int p2, int p3) {
		super();
		this.p1= p1;
		this.p2= p2;
		this.p3= p3;
		
	}
	
	@Override
	public String toString() {
		return "PossibleWinner [p1=" + p1 +", p2" + p2 + ", p3" + p3 + "]";
	}

	public void fill() {
		List<PossibleWinner> pw = new ArrayList<>();
		@SuppressWarnings("unused")
		int p1=0, p2=0, p3=0;
		
		pw.add(new PossibleWinner(p1=0, p2= 1, p3= 2));
		pw.add(new PossibleWinner(p1=3, p2= 4, p3= 5));
		pw.add(new PossibleWinner(p1=6, p2= 7, p3= 8));
		pw.add(new PossibleWinner(p1=0, p2= 3, p3= 6));
		pw.add(new PossibleWinner(p1=1, p2= 4, p3= 7));
		pw.add(new PossibleWinner(p1=2, p2= 5, p3= 8));
		pw.add(new PossibleWinner(p1=0, p2= 4, p3= 8));
		pw.add(new PossibleWinner(p1=2, p2= 4, p3= 6));
		for (PossibleWinner x: pw) {
			System.out.println(x.p1 + " " + x.p2 + " "  + x.p3 );
		}
	}
	
};


