package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GradeController {

    @FXML
    private TextField txt_grade;

    @FXML
    private Label lbl_results;

    @FXML
    private Button btn_calculate;

    @FXML
    void onClick(ActionEvent event) {
    	System.out.println("Stop clickig on me!!");
    	lbl_results.setText(Math.random() * 10 + "");
    }

}
