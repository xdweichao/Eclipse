package edu.citytech.cst.webresource;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeveloperResource {
	
	@RequestMapping("/author")
	public String getName() {
		return "Liang.Wei";
	}
	
	@RequestMapping("/authordetail")
	public Map<String,Object> getDetailInformation() {
		Map<String,Object> info = new HashMap<>();
		info.put("author","Wei.Liang");
		info.put("email", "wheresthepros@gmail.com");
		return info;
		}

}
