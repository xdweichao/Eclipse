package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class GradeServiceController {

    @FXML
    private TextField txtGradeEntered;

    @FXML
    private TextField txtGradeStatus;

    @FXML
    private Button btnCalculate;

    @FXML
    private Text actiontarget;

    @FXML
    void click(ActionEvent event) {
    	actiontarget.setText("" + Math.random() *2);
    }

    @FXML
    void txtErrorMessage(MouseEvent event) {
    	
    }

}
