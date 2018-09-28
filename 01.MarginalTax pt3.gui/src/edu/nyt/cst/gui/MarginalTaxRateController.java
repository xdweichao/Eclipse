package edu.nyt.cst.gui;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

public class MarginalTaxRateController implements Initializable {

	@FXML
	private AnchorPane rbM;

	@FXML
	private TextField txtSalaryAmount;

	@FXML
	private TextField txtTaxedIncome;

	@FXML
	private Button btnCalculate;

	@FXML
	private Label lblMode;

	@FXML
	private TextField txtTaxRate;

	@FXML
	private RadioButton rbSingle;

	@FXML
	private ToggleGroup mtr_group;

	@FXML
	private RadioButton rbMarriedFilingJointly;

	@FXML
	private RadioButton rbQualifiedWidow;

	@FXML
	private RadioButton rbHeadOfHouseHold;

	@FXML
	private RadioButton rbNotApplicable;

	@FXML
	private RadioButton rbMarriedFilingSeparately;

	@FXML
	private Label lblMessage;

	@FXML
	void calculate(ActionEvent event) throws IOException {
		Map<String, Object> map = new HashMap<>();
		try {
			int access = 1;

			String text = txtSalaryAmount.getText(); 
			if (Pattern.matches("[a-zA-Z]+", text) == false) {
				lblMessage.setVisible(true);
				lblMessage.setText("Invalid Number");

			}
			
			if (txtSalaryAmount.getText().isEmpty()) {
				lblMessage.setVisible(true);
				lblMessage.setText("Invalid Entry");

			}
			
			if (access == 1) {
			Float salary = Float.parseFloat(txtSalaryAmount.getText());
			String web = "http://localhost:8080/marginaltaxrate?code=" + lblMode.getUserData() + "&salary=" + salary;

			
			URL url = new URL(web);
			InputStreamReader reader = new InputStreamReader(url.openStream());
			@SuppressWarnings("unchecked")
			Map<String, Object> results = new Gson().fromJson(reader, map.getClass());
			
			txtTaxedIncome.setText(results.get("taxPaid: ").toString());
			txtTaxRate.setText(results.get("percentage: ").toString());

			// checker
			System.out.println("Webservice: " + web);
			System.out.println("Tax Paid: $" + results.get("taxPaid: ").toString());
			System.out.println("Tax Rate: " + results.get("percentage: ").toString());
			lblMessage.setVisible(false);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ConnectException e) {
			lblMessage.setVisible(true);
			lblMessage.setText("Web Service Down");
		}

	}

	@FXML
	void whichMode(ActionEvent event) {
		RadioButton currentRadio = (RadioButton) event.getSource();
		lblMode.setText(currentRadio.getText());
		lblMode.setUserData(currentRadio.getUserData());
		txtTaxedIncome.setText("");
		System.out.println("URL CODE: " + lblMode.getUserData());
	}

	// initialize in class with implements Initializable
	public void initialize(URL url, ResourceBundle res) {
		this.rbHeadOfHouseHold.setUserData("HH");
		this.rbQualifiedWidow.setUserData("QW");
		this.rbMarriedFilingJointly.setUserData("MFJ");
		this.rbMarriedFilingSeparately.setUserData("MFS");
		this.rbSingle.setUserData("SI");
		this.rbNotApplicable.setUserData("NA");
		lblMode.setUserData("NA");
	}

}
