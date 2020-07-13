package com.exam.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.exam.model.CustomerModel;
import com.exam.model.ProductModel;

@Service
public class ProductService implements IProductService {
   @Override
   
	public Map<String, Object>  getAllProductAndCustomer(){
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
