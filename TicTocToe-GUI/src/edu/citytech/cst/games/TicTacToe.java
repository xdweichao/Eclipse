package edu.citytech.cst.games;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

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
	
	@FXML
	void onButtonClick(MouseEvent event) {

		// reset game
		ArrayList<Label> Labels = new ArrayList<>();
		Labels.add(lbl_1);
		Labels.add(lbl_2);
		Labels.add(lbl_3);
		Labels.add(lbl_4);
		Labels.add(lbl_5);
		Labels.add(lbl_6);
		Labels.add(lbl_7);
		Labels.add(lbl_8);
		Labels.add(lbl_9);

		int size = Labels.size();
		for (int i = 0; i < size; i++) {
			Labels.get(i).setText("N");
		}
		System.out.println("Game Resetted");
		WhoseTurn = "O";

	}



	@FXML
	void onClick(MouseEvent event) {
		Label clicked = (Label) event.getSource();
		if (clicked.getText() == "X" || clicked.getText() == "O") {
			lbl_message.setText("Quit cheating, Player " + clicked.getText() + " already filled that in");
		} else {
			if (WhoseTurn == "X") {
				WhoseTurn = "O";
			} else
				WhoseTurn = "X";
			clicked.setText(WhoseTurn);
			lbl_message.setText("");
		}
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		lbl_message.setText("");

	}

}
