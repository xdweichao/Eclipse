package edu.citytech.dao;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import edu.citytech.cst.marginaltax.MarginalTax;

//https://www.mkyong.com/java8/java-8-stream-read-a-file-line-by-line/
//Crtl Shift O to import all imports
public class CSVTaxRepository {
 

	public static List<MarginalTax> retrieve() {

			String fileName = "/data/rules.csv";
			
			List<MarginalTax> list = new ArrayList<>();
			// x takes in 1 params
			// {} is the body
			
			
			Consumer<String> x=e -> {
				String columns[]= e.split(",");
				int year = Integer.parseInt(columns[0]);
				String code = columns[1];
				float taxPercentage = Float.parseFloat(columns[4]);
				float start = Float.parseFloat(columns[2]);
				float end = Float.parseFloat(columns[3]);
				
				MarginalTax tax = new MarginalTax(year, code, taxPercentage, start, end);

				list.add(tax);
			};
			
			//read file into stream, try-with-resources
			try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
				//forEach Consumer = Take in params, return nothing
				//forEach Supplier = Take in params, return something

				
				// x takes in 1 params
				// {} is the body
				stream.forEach(x);

			} catch (IOException e) {
				e.printStackTrace();
			}
			return list;
		}

}