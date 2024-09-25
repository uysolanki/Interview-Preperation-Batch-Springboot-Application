package com.excelr.cms.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excelr.cms.entity.Customer;

@RestController
public class CustomerController {
	
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "Welcome to Excler Edtech Pvt ltd";
	}
	
	@RequestMapping("/getCustomer")  //RESTful endpoints , return a response JSON object
	public Customer getCustomer()
	{
		Customer c1=new Customer();
		c1.setCno(18);
		c1.setUsername("Virat");
		c1.setPassword("Virat123");
		c1.setAge(35);
		return c1;
	}
	
	
	@RequestMapping("/getListCustomers")  //RESTful endpoints , return a response JSON object
	public ArrayList<Customer> getListCustomers()
	{
		Customer c1=new Customer();
		c1.setCno(18);
		c1.setUsername("Virat");
		c1.setPassword("Virat123");
		c1.setAge(35);
		
		Customer c2=new Customer();
		c2.setCno(45);
		c2.setUsername("Rohit");
		c2.setPassword("Rohit123");
		c2.setAge(37);
		
		
		Customer c3=new Customer();
		c3.setCno(1);
		c3.setUsername("Rahul");
		c3.setPassword("Rahul123");
		c3.setAge(32);
		
		ArrayList<Customer> customers=new ArrayList();
		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		return customers;
	}
}
