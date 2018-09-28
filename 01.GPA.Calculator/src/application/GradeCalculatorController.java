package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GradeCalculatorController implements Initializable{

    @FXML
    private Label lbl_score;

    @FXML
    private Button btn_01;

    @FXML
    private Button btn_02;

    @FXML
    private Button btn_03;

    @FXML
    private Button btn_gpa;

    @FXML
    private Button btn_04;

    @FXML
    private Button btn_05;

    @FXML
    private Button btn_06;

    @FXML
    private Button btn_af;

    @FXML
    private Button btn_07;

    @FXML
    private Button btn_08;

    @FXML
    private Button btn_09;

    @FXML
    private Button btn_midterm;

    @FXML
    private Button btn_00;

    @FXML
    private Button btn_period;

    @FXML
    private Button btn_clear;

    @FXML
    private Button btn_calculate;

    @FXML
    private Label lbl_developer;

    @FXML
    private Label lbl_url;

    @FXML
    private Label lbl_mode;

    @FXML
    private Label lbl_errormessage;

    @FXML
    void numberPressed(ActionEvent event) {
	    	Button button =(Button)event.getSource();
	    	
	    	lbl_score.setText(lbl_score.getText() + button.getText());
	    	
    		//System.out.println(button.getText());
    }

    @FXML
    void numberClear(ActionEvent event) {
    	lbl_score.setText("");
    }
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		lbl_score.setText("");
		lbl_errormessage.setText("");
		lbl_mode.setText("");
		
	}
	
    @FXML
    void mode(ActionEvent event) {
    	Button currentButton = (Button)event.getSource();
    	lbl_mode.setText(currentButton.getText());
    }
	//http://central.maven.org/maven2/com/google/code/gson/gson/2.8.2/gson-2.8.2.jar
    @FXML
    void calculate(ActionEvent event) {
    	try {
    		String mode= lbl_mode.getText(); 
    		Float score = Float.parseFloat(lbl_score.getText());
    		String display = GradeResource.get(mode, score, String.class);
    		System.out.println(display);
    		lbl_mode.setText(mode + " Status: " + display);
    		
    		//checks if grade is valid

    		
    		if (score > 100 || score < 0) {
    			lbl_mode.setText("Enter Valid Score");
    		}
    		
    		if (lbl_mode.getText()== "") {
    			lbl_mode.setText("Please Select Mode");
    		}
    		
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
    }
    
}
}
