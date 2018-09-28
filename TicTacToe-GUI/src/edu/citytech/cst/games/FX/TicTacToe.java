package edu.citytech.cst.games.FX;

import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import java.util.ResourceBundle;

import edu.citytech.cst.games.TicTacToeLogic;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class TicTacToe implements Initializable {

	@FXML
	private Label lbl_1;

	@FXML
	private Label lbl_2;

	@FXML
	private Label lbl_3;

	@FXML
	private Label lbl_4;

	@FXML
	private Label lbl_5;

	@FXML
	private Label lbl_6;

	@FXML
	private Label lbl_7;

	@FXML
	private Label lbl_8;

	@FXML
	private Label lbl_9;

	@FXML
	private Button cb_reset;

	@FXML
	private Label lbl_message;

	String WhoseTurn = "O";
	ArrayList<Label> Labels = new ArrayList<>();
	int size = 9;

	@FXML
	void onButtonClick(MouseEvent event) {
		// reset game
		for (int i = 0; i < size; i++) {
			Labels.get(i).setText("N");
			Labels.get(i).setTextFill(Color.BLACK);
		}
		System.out.println("Game Resetted");
		lbl_message.setText("Game Resetted");
		WhoseTurn = "O";
		winner = "false";
		counter = 0;
	}
	int counter= 0;
String winner = "false";
	@FXML
	void onClick(MouseEvent event) {

		if (winner=="false") {
			Label clicked = (Label) event.getSource();
			// check if field is already taken
			if (clicked.getText() == "X" || clicked.getText() == "O") {
				lbl_message.setText("Quit cheating, Player " + clicked.getText() + " already filled that in");
			} else {

				// change turns
				if (WhoseTurn == "X") {
					WhoseTurn = "O";
				} else
					WhoseTurn = "X";

				// mark label
				clicked.setText(WhoseTurn);
				lbl_message.setText("");

				// create moves string
				String moves = "";
				for (int i = 0; i < size; i++) {
					String moveMade = Labels.get(i).getText();
					moves = moves + moveMade;
				}

				// input moves to logic for webservice
				Map<String, Object> results = TicTacToeLogic.moves(moves);
				System.out.println(results);

				try {
					counter++;
					String[] ret = TicTacToeLogic.whoWonPlusWinningCombo(moves);
					if (ret[2].equals("true")) {
						winner="true";
						String[] positions = ret[1].split("");
						lbl_message.setText("Congratz, winner is " + ret[0]);
						int result1 = Integer.parseInt(positions[0]);
						int result2 = Integer.parseInt(positions[3]);
						int result3 = Integer.parseInt(positions[6]);
						Label Label1 = Labels.get(result1);
						Label1.setTextFill(Color.LIGHTPINK);
						Label Label2 = Labels.get(result2);
						Label2.setTextFill(Color.LIGHTPINK);
						Label Label3 = Labels.get(result3);
						Label3.setTextFill(Color.LIGHTPINK);

					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			} 
		} else {
			lbl_message.setText("Sorry, the game has already ended, Press Reset to play again");
			System.out.println("Sorry, the game has already ended, Press Reset to play again");

		}
		
		 if (counter == 9 && winner == "false") {
			 
			 System.out.println("Sorry, it's a draw");
			 System.out.println("{isWinner="+ winner +", Winning Combination: = none" + ", whoWon: = N}" );
			 
			 lbl_message.setText("Sorry, it's a draw");
		 }
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		lbl_message.setText("");
		Labels.add(lbl_1);
		Labels.add(lbl_2);
		Labels.add(lbl_3);
		Labels.add(lbl_4);
		Labels.add(lbl_5);
		Labels.add(lbl_6);
		Labels.add(lbl_7);
		Labels.add(lbl_8);
		Labels.add(lbl_9);

	}

}
