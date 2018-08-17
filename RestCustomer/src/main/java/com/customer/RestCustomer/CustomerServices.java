package com.customer.RestCustomer;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.customer.RestCustomer.dao.CustomerDAO;
import com.customer.RestCustomer.pojo.Customer;

@RestController
public class CustomerServices {

	private static CustomerDAO dao;
	
	static 
	{
		dao=new CustomerDAO();
	}
	
	//create as in c of crud (post)
	@RequestMapping(value="/customer",method=RequestMethod.POST)
	public String createCustomer(String name, String address)
	{
		dao.create(name, address);
		return "Customer Created";
	}
	
	//read as in r of crud (get)
	@RequestMapping(value="/customers",method=RequestMethod.GET)
	public ArrayList<Customer> getCustomer()
	{
		return dao.read();
	}
	
}
