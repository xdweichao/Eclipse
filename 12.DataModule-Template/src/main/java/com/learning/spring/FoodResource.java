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
@RequestMapping("/food")
public class FoodResource{
	@Autowired
	RestauantsRepository dao;
	
	@GetMapping("/")
	@ResponseBody
	public List<Restaurants> getMyFood(){
		//page data.domain
		Pageable p = PageRequest.of(0, 10);
		List<Restaurants> list = dao.findAll(p).getContent();
		return list;
	}
	
//http://localhost:9416/food/cuisine/?cuisine=Chinese
	@GetMapping("/cuisine")
	@ResponseBody
	public List<Restaurants> getMyFoodByCuisine(
			@RequestParam(value = "cuisine", defaultValue = "American") String cuisine){
		//page data.domain
		Pageable p = PageRequest.of(0, 10);
		List<Restaurants> list = dao.findByCuisine(cuisine,p);
		return list;
	}
	
	//http://localhost:9416/food/cuisine/?borough=Brooklyn
		@GetMapping("/borough")
		@ResponseBody
		public List<Restaurants> getMyFoodByBorough(
				@RequestParam(value = "borough", defaultValue = "Brooklyn") String borough){
			//page data.domain
			Pageable p = PageRequest.of(0, 10);
			List<Restaurants> list = dao.findByBorough(borough,p);
			return list;
		}
		@GetMapping("/name")
		@ResponseBody
		public List<Restaurants> getMyFoodByName(
				@RequestParam(value = "name", defaultValue = "Wendy's") String name){
			//page data.domain
			Pageable p = PageRequest.of(0, 10);
			List<Restaurants> list = dao.findByName(name,p);
			return list;
		}
		
		//http://localhost:9416/food/zipcode/?zipcode=11214
		@GetMapping("/zipcode")
		@ResponseBody
		public List<Restaurants> getMyZipcode(
				@RequestParam(value = "zipcode", defaultValue = "11214") String zipcode){
			//page data.domain
			Pageable p = PageRequest.of(0, 10);
			List<Restaurants> list = dao.findByAddressZipcode(zipcode,p);
			return list;
		}
		
		@GetMapping("/id")
		@ResponseBody
		public List<Restaurants> getMyId(
				@RequestParam(value = "simpleId", defaultValue = "100001") int simpleId){
			//page data.domain
			Pageable p = PageRequest.of(0, 10);
			List<Restaurants> list = dao.findBySimpleId(simpleId,p);
			return list;
		}
		
		
}
