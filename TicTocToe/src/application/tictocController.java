package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class tictocController {

    @FXML
    private Button btn_01;

    @FXML
    private Button btn_02;

    @FXML
    private Button btn_03;

    @FXML
    private Button btn_04;

    @FXML
    private Button btn_05;

    @FXML
    private Button btn_06;

    @FXML
    private Button btn_07;

    @FXML
    private Button btn_08;

    @FXML
    private Button btn_09;
    
    @FXML
    private Label lbl_turn;

    @FXML
    private Button btn_giveup;

    @FXML
    private Button btn_undo;

    @FXML
    private Button btn_restart;
    
    int count = 0;
    @FXML
    void onClick(ActionEvent event) {
    	Button button =(Button)event.getSource();
    	
    	//Alter between X and O
    	button.getId();
    	
    	if (count%2 != 1) {
    	button.setText("X");
    	
    	//Set Color of X to Red
    	button.setTextFill(Color.RED);
    	
    	//Let player know whose turn it is
    	lbl_turn.setText("[ O ] Player 2's Turn");
    	lbl_turn.setTextFill(Color.BLUE);
    	count = count + 1;
    	} else {
    	button.setText("O");
    	button.setTextFill(Color.BLUE);
    	
    	
    	lbl_turn.setText("[ X ] Player 1's Turn");
    	lbl_turn.setTextFill(Color.RED);
    	count = count + 1;
    }
    
    // Player 1 [X] Winning
    if(btn_01.getText() == "X" && btn_02.getText() == "X" && btn_03.getText() == "X"){
    	//set background color
    	//btn_01.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
    		
    	//change text color to green when win
    	btn_01.setTextFill(Color.LIGHTGREEN);
    	btn_02.setTextFill(Color.LIGHTGREEN);
    	btn_03.setTextFill(Color.LIGHTGREEN);
    	lbl_turn.setTextFill(Color.LIGHTGREEN);
		lbl_turn.setText("[ X ] Player 1 Wins!");
    	};
    	
    if(btn_04.getText() == "X" && btn_05.getText() == "X" && btn_06.getText() == "X"){
    	btn_04.setTextFill(Color.LIGHTGREEN);
    	btn_05.setTextFill(Color.LIGHTGREEN);
    	btn_06.setTextFill(Color.LIGHTGREEN);
    	lbl_turn.setTextFill(Color.LIGHTGREEN);
    	lbl_turn.setText("[ X ] Player 1 Wins!");
        };    
    if(btn_07.getText() == "X" && btn_08.getText() == "X" && btn_09.getText() == "X"){
    	btn_07.setTextFill(Color.LIGHTGREEN);
    	btn_08.setTextFill(Color.LIGHTGREEN);
    	btn_09.setTextFill(Color.LIGHTGREEN);
    	lbl_turn.setTextFill(Color.LIGHTGREEN);
		lbl_turn.setText("[ X ] Player 1 Wins!");
    	};
    if(btn_01.getText() == "X" && btn_04.getText() == "X" && btn_07.getText() == "X"){
    	btn_01.setTextFill(Color.LIGHTGREEN);
    	btn_04.setTextFill(Color.LIGHTGREEN);
    	btn_07.setTextFill(Color.LIGHTGREEN);
    	lbl_turn.setTextFill(Color.LIGHTGREEN);
    	lbl_turn.setText("[ X ] Player 1 Wins!");
        };     
    if(btn_02.getText() == "X" && btn_05.getText() == "X" && btn_08.getText() == "X"){
    	btn_02.setTextFill(Color.LIGHTGREEN);
    	btn_05.setTextFill(Color.LIGHTGREEN);
    	btn_08.setTextFill(Color.LIGHTGREEN);
    	lbl_turn.setTextFill(Color.LIGHTGREEN);
		lbl_turn.setText("[ X ] Player 1 Wins!");
    	};
    if(btn_03.getText() == "X" && btn_06.getText() == "X" && btn_09.getText() == "X"){
    	btn_03.setTextFill(Color.LIGHTGREEN);
    	btn_06.setTextFill(Color.LIGHTGREEN);
    	btn_09.setTextFill(Color.LIGHTGREEN);
    	lbl_turn.setTextFill(Color.LIGHTGREEN);
    	lbl_turn.setText("[ X ] Player 1 Wins!");
        };     
    if(btn_01.getText() == "X" && btn_05.getText() == "X" && btn_09.getText() == "X"){
    	btn_01.setTextFill(Color.LIGHTGREEN);
    	btn_05.setTextFill(Color.LIGHTGREEN);
    	btn_09.setTextFill(Color.LIGHTGREEN);
    	lbl_turn.setTextFill(Color.LIGHTGREEN);
		lbl_turn.setText("[ X ] Player 1 Wins!");
    	};
    if(btn_03.getText() == "X" && btn_05.getText() == "X" && btn_07.getText() == "X"){
    	btn_03.setTextFill(Color.LIGHTGREEN);
    	btn_05.setTextFill(Color.LIGHTGREEN);
    	btn_07.setTextFill(Color.LIGHTGREEN);
    	lbl_turn.setTextFill(Color.LIGHTGREEN);
    	lbl_turn.setText("[ X ] Player 1 Wins!");
        };        
        
    
        // Player 2 [O] Winning
        if(btn_01.getText() == "O" && btn_02.getText() == "O" && btn_03.getText() == "O"){
        	//set background color
        	//btn_01.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
        		
        	//change text color to green when win
        	btn_01.setTextFill(Color.LIGHTGREEN);
        	btn_02.setTextFill(Color.LIGHTGREEN);
        	btn_03.setTextFill(Color.LIGHTGREEN);
        	lbl_turn.setTextFill(Color.LIGHTGREEN);
    		lbl_turn.setText("[ O ] Player 2 Wins!");
        	};
        	
        if(btn_04.getText() == "O" && btn_05.getText() == "O" && btn_06.getText() == "O"){
        	btn_04.setTextFill(Color.LIGHTGREEN);
        	btn_05.setTextFill(Color.LIGHTGREEN);
        	btn_06.setTextFill(Color.LIGHTGREEN);
        	lbl_turn.setTextFill(Color.LIGHTGREEN);
        	lbl_turn.setText("[ O ] Player 2 Wins!");
            };    
        if(btn_07.getText() == "O" && btn_08.getText() == "O" && btn_09.getText() == "O"){
        	btn_07.setTextFill(Color.LIGHTGREEN);
        	btn_08.setTextFill(Color.LIGHTGREEN);
        	btn_09.setTextFill(Color.LIGHTGREEN);
        	lbl_turn.setTextFill(Color.LIGHTGREEN);
    		lbl_turn.setText("[ O ] Player 2 Wins!");
        	};
        if(btn_01.getText() == "O" && btn_04.getText() == "O" && btn_07.getText() == "O"){
        	btn_01.setTextFill(Color.LIGHTGREEN);
        	btn_04.setTextFill(Color.LIGHTGREEN);
        	btn_07.setTextFill(Color.LIGHTGREEN);
        	lbl_turn.setTextFill(Color.LIGHTGREEN);
        	lbl_turn.setText("[ O ] Player 2 Wins!");
            };     
        if(btn_02.getText() == "O" && btn_05.getText() == "O" && btn_08.getText() == "O"){
        	btn_02.setTextFill(Color.LIGHTGREEN);
        	btn_05.setTextFill(Color.LIGHTGREEN);
        	btn_08.setTextFill(Color.LIGHTGREEN);
        	lbl_turn.setTextFill(Color.LIGHTGREEN);
    		lbl_turn.setText("[ O ] Player 2 Wins!");
        	};
        if(btn_03.getText() == "O" && btn_06.getText() == "O" && btn_09.getText() == "O"){
        	btn_03.setTextFill(Color.LIGHTGREEN);
        	btn_06.setTextFill(Color.LIGHTGREEN);
        	btn_09.setTextFill(Color.LIGHTGREEN);
        	lbl_turn.setTextFill(Color.LIGHTGREEN);
        	lbl_turn.setText("[ O ] Player 2 Wins!");
            };     
        if(btn_01.getText() == "O" && btn_05.getText() == "O" && btn_09.getText() == "O"){
        	btn_01.setTextFill(Color.LIGHTGREEN);
        	btn_05.setTextFill(Color.LIGHTGREEN);
        	btn_09.setTextFill(Color.LIGHTGREEN);
        	lbl_turn.setTextFill(Color.LIGHTGREEN);
    		lbl_turn.setText("[ O ] Player 2 Wins!");
        	};
        if(btn_03.getText() == "O" && btn_05.getText() == "O" && btn_07.getText() == "O"){
        	btn_03.setTextFill(Color.LIGHTGREEN);
        	btn_05.setTextFill(Color.LIGHTGREEN);
        	btn_07.setTextFill(Color.LIGHTGREEN);
        	lbl_turn.setTextFill(Color.LIGHTGREEN);
        	lbl_turn.setText("[ O ] Player 2 Wins!");
            };
            
     
    	if(count >= 9 && lbl_turn.getText().toString() == "[ X ] Player 1's Turn")
    		lbl_turn.setText("DRAW!");
    
    	if(count >= 9 && lbl_turn.getText().toString() == "[ O ] Player 2's Turn")
    		lbl_turn.setText("DRAW!");
    	
    }
    	

    @FXML
    void giveup(ActionEvent event) {
    	if (lbl_turn.getText().toString()== "[ X ] Player 1's Turn") {
    		lbl_turn.setText("[ O ] Player 2 Wins!");
        	lbl_turn.setTextFill(Color.LIGHTGREEN);
    	} 
    	if (lbl_turn.getText().toString()== "[ O ] Player 2's Turn") {
    		lbl_turn.setText("[ X ] Player 1 Wins!");
    		lbl_turn.setTextFill(Color.LIGHTGREEN);
    	} 
    	
    }
    
    @FXML
    void restart(ActionEvent event) {
    	count = 0;
    	btn_01.setText("?");
    	btn_01.setTextFill(Color.BLACK);
    	btn_02.setText("?");
    	btn_02.setTextFill(Color.BLACK);
    	btn_03.setText("?");
    	btn_03.setTextFill(Color.BLACK);
    	btn_04.setText("?");
    	btn_04.setTextFill(Color.BLACK);
    	btn_05.setText("?");
    	btn_05.setTextFill(Color.BLACK);
    	btn_06.setText("?");
    	btn_06.setTextFill(Color.BLACK);
    	btn_07.setText("?");
    	btn_07.setTextFill(Color.BLACK);
    	btn_08.setText("?");
    	btn_08.setTextFill(Color.BLACK);
    	btn_09.setText("?");
    	btn_09.setTextFill(Color.BLACK);
    	
    	lbl_turn.setText("[ X ] Player 1's Turn");
    	lbl_turn.setTextFill(Color.RED);


    }
    
};
