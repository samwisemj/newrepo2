package com.customer.RestCustomer.dao;

import java.util.ArrayList;
import java.util.Collection;

import com.customer.RestCustomer.pojo.Customer;

public class CustomerDAO {

	private static ArrayList<Customer> customers;
	public CustomerDAO()
	{
		customers=new ArrayList<Customer>();
		customers.add(new Customer("Samwise","Behala"));
		customers.add(new Customer("Samwise2","Behala2"));
	}
	
	public void create(String name, String address)
	{
		customers.add(new Customer(name,address));
	}
	
	public ArrayList<Customer> read()
	{
		customers.stream().forEach(System.out::println);
		return customers;
	}
}
