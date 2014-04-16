package com.springaop.service;

public class CustomerServiceImpl implements CustomerService{

	public void addCustomer() {
		System.out.println("Add customer method is running");
		
	}

	public String addCustomerReturn(String value) {
		System.out.println("Add customer Return method is running ......");
		
		return value;
	}

	public void addCustomerAround(String name) {
		System.out.println("Add customer Around is running ......With name as  "+name);
		
	}

	public void addCustomerThrowException() throws Exception {
		System.out.println("Add customer method throws Exception  ......");
		throw new Exception("Exception thrown from here");
	}

}
