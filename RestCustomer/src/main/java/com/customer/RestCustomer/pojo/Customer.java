package com.customer.RestCustomer.pojo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Customer implements Serializable{

	private static final long serialVersionUID = 1L;
	private String name;
	private String address;
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + "]";
	}
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}

}
