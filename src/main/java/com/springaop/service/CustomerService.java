package com.springaop.service;

public interface CustomerService {

	public void addCustomer();
	public String addCustomerReturn(String name);
	public void addCustomerAround(String name);
	public void addCustomerThrowException() throws Exception;
	
	
}
