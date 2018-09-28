package edu.citytech.cst.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import edu.citytech.cst.service.BusinessLogic;

@RestController
public class MarginalTaxResource {
	
	@RequestMapping("/marginaltaxrate")
	
	public Map<String, Object> getTaxPaid(@RequestParam(value="code")String code , 
									      @RequestParam(value="salary")float yearlySalary) 
	{
		float taxes= BusinessLogic.taxPaid(code, yearlySalary);
	
			Map<String,Object> Details = new HashMap<>();
			Details.put("code: ", code);
			Details.put("description: ", BusinessLogic.getDescription(code));
			Details.put("taxPaid: ", taxes);
			Details.put("salary: ", yearlySalary);
			Details.put("percentage: ", taxes/yearlySalary);
	
		return (Details);
	}

	
	@RequestMapping("/author")
	public Map<String,Object> getDetailInformation() {
		Map<String,Object> info = new HashMap<>();
		info.put("author","Wei.Liang");
		info.put("email", "wheresthepros@gmail.com");
		return info;
		}


}
	


