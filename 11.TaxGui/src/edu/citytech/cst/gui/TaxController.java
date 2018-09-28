package edu.citytech.cst.gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import edu.citytech.cst.model.MarginalTax;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

//implements init + crtl Space
//make unimplemented methods
public class TaxController implements Initializable {

	@FXML
	private TableView<MarginalTax> tblTaxView;

	@FXML
	private TableColumn<MarginalTax, Integer> colYear;

	@FXML
	private TableColumn<MarginalTax, String> colCode;

	@FXML
	private TableColumn<MarginalTax, Float> colStart;

	@FXML
	private TableColumn<MarginalTax, Float> colEnd;

	@FXML
	private TableColumn<MarginalTax, Float> colTaxPercentage;

	@FXML
	private Button btnRefresh;

	@FXML
    void loadData(ActionEvent event) {
		
		List<MarginalTax> list = new ArrayList<MarginalTax>();
	for (int i=0; i<10; i++) {
    	list.add( new MarginalTax(2001, "x" + i, i*1000, i*1000, i * 3000));
    }
	ObservableList<MarginalTax> oList = FXCollections.observableArrayList(list);
	tblTaxView.setItems(oList);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

    	colYear.setCellValueFactory(new PropertyValueFactory<>("year"));
    	colCode.setCellValueFactory(new PropertyValueFactory<>("code"));
    	colStart.setCellValueFactory(new PropertyValueFactory<>("start"));
    	colEnd.setCellValueFactory(new PropertyValueFactory<>("end"));
    	colTaxPercentage.setCellValueFactory(new PropertyValueFactory<>("TaxPercentage"));
    	

		
	}
	
	}

