package edu.nyt.cst.gui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class websitelogic {

/*	static Map<String,String> mapUrl = new HashMap<>();
	static {
		mapUrl.put("Not Applicable", "http://localhost:8080/marginaltaxrate?code=NA&salary=" );
		mapUrl.put("Head of Household", "http://localhost:8080/marginaltaxrate?code=HH&salary=" );
		//typo on fxml text, contains "space" at the end
		mapUrl.put("Head of Household ", "http://localhost:8080/marginaltaxrate?code=HH&salary=" );
		mapUrl.put("Qualified Widow(er)", "http://localhost:8080/marginaltaxrate?code=QW&salary=" );
		mapUrl.put("Married Filing Separately", "http://localhost:8080/marginaltaxrate?code=MFS&salary=" );
		mapUrl.put("Married Filing Jointly", "http://localhost:8080/marginaltaxrate?code=MFJ&salary=" );
		//typo on fxml text, contains "space" at the end
		mapUrl.put("Married Filing Jointly ", "http://localhost:8080/marginaltaxrate?code=MFJ&salary=" );
		mapUrl.put("Single Taxable Income", "http://localhost:8080/marginaltaxrate?code=SI&salary=" );
	}*/
	
/*	public static <T> T get(String mode, Float salary, Class<T> class1) {
		T t= null;
		
		try {
			URL url = new URL(mapUrl.get(mode) + salary);


			//change parameter 2 with class coming in
			
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return t;
	}
*/
}
