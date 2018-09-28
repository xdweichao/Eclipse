package edu.citytech.cst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import edu.citytech.cst.service.BusinessLogic;

/**
 * Calculate Taxes : Web Service + Business Logic
 */

@SpringBootApplication
public class _StartApplication {
	public static void main(String[] args) {
		// Webservice
		SpringApplication.run(_StartApplication.class, args);

		// Business Logic Hardcode
		// Snippet 1
/*		float taxes[] = BusinessLogic.taxPaid("NA", 100_000f);
		System.out.println("Tax Rate: " + taxes[0] + "\n" + "Tax Paid: " + taxes[1]);
		// Snippet 2
		float taxes2[] = BusinessLogic.taxPaid("SI", 100_000f);
		System.out.println("Tax Rate: " + taxes2[0] + "\n" + "Tax Paid: " + taxes2[1]);
		// Snippet 3
		float taxes3[] = BusinessLogic.taxPaid("MFJ", 100_000f);
		System.out.println("Tax Rate: " + taxes3[0] + "\n" + "Tax Paid: " + taxes3[1]);
		// Snippet 4
		float taxes4[] = BusinessLogic.taxPaid("HH", 100_000f);
		System.out.println("Tax Rate: " + taxes4[0] + "\n" + "Tax Paid: " + taxes4[1]);
		// Snippet 5
		float taxes5[] = BusinessLogic.taxPaid("QW", 100_000f);
		System.out.println("Tax Rate: " + taxes5[0] + "\n" + "Tax Paid: " + taxes5[1]);
*/
	}

}
