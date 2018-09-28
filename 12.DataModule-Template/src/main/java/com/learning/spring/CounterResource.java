package com.learning.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/counter")
public class CounterResource{
	@GetMapping("/")
	@ResponseBody
	public List<Numbers> getNumbers(@RequestParam(value = "limit", defaultValue = "25") int limit, 
									@RequestParam(value = "start", defaultValue = "1") int start){
		List<Numbers> list = new ArrayList<>();
		
		for (int i=start; i <limit; i++) {
			list.add(new Numbers(i, i*2, i*3));
		}
		
		return list;
		
	}
	
}
