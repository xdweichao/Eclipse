package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PaycheckController {

    @FXML
    private Button btn_Calculate;

    @FXML
    private TextField tf_hourlyWage;

    @FXML
    private TextField tf_hoursWorked;

    @FXML
    private TextField tf_weeklyPay;
    

    
     

    @FXML
    void click(ActionEvent event) {
    	try{
        float totalPay = (Float.parseFloat(tf_hoursWorked.getText())) * (Float.parseFloat(tf_hourlyWage.getText()));
        String totalPayString = String.valueOf(totalPay);
        tf_weeklyPay.setText(totalPayString);
        } catch (Exception e)
    	{tf_weeklyPay.setText("Please Enter Values");
    }

}
}
