package com.java.cert.chapter13.bank;

import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 * Title: CustomerGenerator.java <p/>
 * Project: JavaCert <p/>
 * Description: Utility type class that generates a set number of Customer Objects <p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Aug 23, 2017
 ****************************************************************************/

public class CustomerGenerator {
	private List<Customer> customers;
	private List<CreditHistoryVO> creditHistories;
	
	public CustomerGenerator(){
		populateCustomerList();
	}
	
	/**
	 * Returns a generated list of customers
	 * @param numberToGenerate - number of customers to add to listing
	 * @return
	 */
	public  List<Customer> generateCustomers(int numberToGenerate){
		
		for (int i = 0; i < numberToGenerate; i++) {
			//randomly choose a customer from our list until we hit our quota
			//some customers may be chosen multiple times
		}
		
		return customers;
	}
	
	/**
	 * Fills the list of customer with a defined number of customers
	 */
	protected void populateCustomerList(){
		//give each customer a random credit history 
		
		//generate some customers for our available customer base
		Customer c1 = new Customer("Sam", true);
		Customer c2 = new Customer("Rachael", false);
		Customer c3 = new Customer("Rachael", false); 
		Customer c4 = new Customer("Rachael", false);
		
		//populate
	}
	
	
	protected void generateCreditHistory(Customer customer){
		//generate sample credit history information
		
		//set it to the passed customer
	}
}
