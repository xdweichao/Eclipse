package edu.citytech.cst.gui;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ResourceBundle;

import com.google.gson.Gson;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class RestaurantController implements Initializable {
	// first params is the model are looking for > create class
	@FXML
	private TableView<Food> tbl_restaurants;

	@FXML
	private TableColumn<Food, String> col_cuisine;

	@FXML
	private TableColumn<Food, String> col_name;

	@FXML
	private TableColumn<Food, String> col_borough;

	@FXML
	private TableColumn<Food, Float> col_simpleid;

	@FXML
	private TableColumn<Food, String> col_zipcode;

	@FXML
	private TextField txt_cuisineSearch;

	@FXML
	private Button btn_search;

	@FXML
	void clickSearchByCuisine(ActionEvent event) {

		ObservableList<Food> list = getUserList();
		tbl_restaurants.setItems(list);

	}

	private ObservableList<Food> getUserList() {

		URL url;
		Food[] dto = null;

		try {
			url = new URL("http://localhost:9416/food/cuisine/?cuisine=" + txt_cuisineSearch.getText());
			InputStreamReader reader = new InputStreamReader(url.openStream());
			dto = new Gson().fromJson(reader, Food[].class);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Food user1= new Food(100018f, "Name", "Cuisine", "Borough", null);
		// List<Food> list = new ArrayList<>();
		ObservableList<Food> olist = FXCollections.observableArrayList(dto);
		return olist;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		// https://o7planning.org/en/11079/javafx-tableview-tutorial
		col_cuisine.setCellValueFactory(new PropertyValueFactory<>("cuisine"));
		col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
		col_borough.setCellValueFactory(new PropertyValueFactory<>("borough"));
		col_simpleid.setCellValueFactory(new PropertyValueFactory<>("simpleId"));
		col_zipcode.setCellValueFactory(new PropertyValueFactory<>("zipcode"));

	}

}
