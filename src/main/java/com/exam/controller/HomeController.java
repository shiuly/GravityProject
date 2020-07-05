package com.exam.controller;



import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exam.model.CustomerModel;
import com.exam.model.ProductModel;

@RestController
public class HomeController {
	    @GetMapping ("/")
		public String wecome() {
			System.out.println("hi");
			return"welcome from root";
		}
	    
	    @GetMapping ("/product")
	  		public Map<String, Object> getAllProduct() {
	    	
	  			Map<String, Object> map=new HashMap<>();
	    	
	    	List<ProductModel> list1=new ArrayList<ProductModel>();
	    	List<CustomerModel> list2=new ArrayList<CustomerModel>();
	    	
	    	ProductModel prod1=new ProductModel("watch","titanic watch",2000,
	    			new Date(System.currentTimeMillis()),"woman watch");
	    	
	    	ProductModel prod2=new ProductModel("cycle","titanic cycle",12000,
	    			new Date(System.currentTimeMillis()),"bycycle");
	    	list1.add(prod1);
	    	list1.add(prod2);
	    	
	    	CustomerModel cust1=new CustomerModel("sakib","mofj","jirina",70,new Date(System.currentTimeMillis()));
	    	CustomerModel cust2=new CustomerModel("sakib","mofj","jirina",70,new Date(System.currentTimeMillis()));
	    	
	    	
	    	list2.add(cust1);
	    	list2.add(cust2);
	    	
	    	map.put("product", list1);
	    	map.put("customer", list2);
	  			
	  			return map;
	  		}
	}


