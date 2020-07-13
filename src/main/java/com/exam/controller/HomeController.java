package com.exam.controller;




import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.exam.service.IProductService;


@RestController
@CrossOrigin("*")
public class HomeController {
	@Autowired
	IProductService ProductService;
	
	    @GetMapping ("/")
		public String wecome() {
			System.out.println("hi");
			return"welcome from root";
		}
	    
	    @GetMapping ("/product")
	  		public Map<String, Object> getAllProduct() {
	    	Map<String, Object> map=ProductService.getAllProductAndCustomer();
	    	return map;
	  			
	  		}
	}


