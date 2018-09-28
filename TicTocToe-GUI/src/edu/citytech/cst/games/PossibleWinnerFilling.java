package edu.citytech.cst.games;

import java.util.ArrayList;
import java.util.List;

public class PossibleWinnerFilling {

	public static void main(String[] args) {
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

}
