package application;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class GradeResource {
	//Creating dictionary
	static Map<String,String> mapUrl = new HashMap<>();
	static {
		mapUrl.put("GPA", "http://localhost:8080/gradesystem/gpa?score=");
		mapUrl.put("Midterm", "http://localhost:8080/gradesystem/midterm?score=");
		mapUrl.put("A - F", "http://localhost:8080/gradesystem/lettergrade?score=");
	}
	
	
	//public static, static means 1 version to class
	// use static to get function
	
	//import static application.GradeResource.get;
	//public static Float get(String mode, Float score, Class<Float> class1) 
	// Add <T>, T is standard for Type
	public static <T> T get(String mode, Float score, Class<T> class1) {
		T t= null;
		
		try {
			URL url = new URL(mapUrl.get(mode) + score);
			InputStreamReader reader = new InputStreamReader(url.openStream());
			t = new Gson().fromJson(reader, class1);
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

}
