package edu.citytech.cst.games;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class TicTacToeLogic {

	public static String URL = "http://localhost:8080/tictactoe?moves=";

	public static Map<String, Object> moves(String move) {
		Reader reader = null;
		String tictactoeURL = URL + move;

		try {
			URL url = new URL(tictactoeURL);
			InputStream input = url.openStream();
			reader = new InputStreamReader(input, "UTF-8");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// System.out.println(move);

		Map<String, Object> map = new HashMap<>();

		@SuppressWarnings("unchecked")
		Map<String, Object> mapResults = new Gson().fromJson(reader, map.getClass());
		return mapResults;

	}

	public static String[] whoWonPlusWinningCombo(String move) {

		// split moves into positions
		String[] position = move.split("");
		List<PossibleWinner> pw = new ArrayList<>();
		@SuppressWarnings("unused")
		int p1 = 0, p2 = 0, p3 = 0;

		pw.add(new PossibleWinner(p1 = 0, p2 = 1, p3 = 2));
		pw.add(new PossibleWinner(p1 = 3, p2 = 4, p3 = 5));
		pw.add(new PossibleWinner(p1 = 6, p2 = 7, p3 = 8));
		pw.add(new PossibleWinner(p1 = 0, p2 = 3, p3 = 6));
		pw.add(new PossibleWinner(p1 = 1, p2 = 4, p3 = 7));
		pw.add(new PossibleWinner(p1 = 2, p2 = 5, p3 = 8));
		pw.add(new PossibleWinner(p1 = 0, p2 = 4, p3 = 8));
		pw.add(new PossibleWinner(p1 = 2, p2 = 4, p3 = 6));

		String isWinner = "false";
		String whoWon = "?";
		String winningCombo = "none";
		for (PossibleWinner x : pw) {
			if (position[x.p1].equals(position[x.p2]) && position[x.p2].equals(position[x.p3])
					&& (position[x.p1].equals("N") == false)) {
				whoWon = position[x.p1];

				winningCombo = x.p1 + ", " + x.p2 + ", " + x.p3;
				if(whoWon.equals("X") || whoWon.equals("O")) {
					isWinner = "true";
				}else whoWon="N";
				System.out.println("------------------------------");
				System.out.println("isWinner: " + isWinner);
				System.out.println("whoWon: " + whoWon);
				System.out.println("Winning Combination: " + winningCombo);
			}
		}
		return new String[] {whoWon, winningCombo, isWinner};
	}
}
