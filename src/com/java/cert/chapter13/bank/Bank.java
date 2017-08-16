package com.java.cert.chapter13.bank;
/****************************************************************************
 * Title: Bank.java <p/>
 * Project: JavaCert <p/>
 * Description: class used to represent two threads that initialize work based on the 
 * work of the other threads(wait and notify)<p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Aug 1, 2017
 ****************************************************************************/

public class Bank {
	
	///enum for different possible account types
	public enum AccountType{
		CHECKING, SAVINGS, PERSONAL, LOAN;
	}
	
	public void run(){
		//generate the background information for each customer
		
		//gather our customers to process
//		Customer c1 = new Customer("Samuel", 720, true);
//		Customer c2 = new Customer("Alicia", 560, false);
		
		//create our two task instances
		
		//create two threads to execute our two tasks
		
		//start our threads
		
		//tell the thread running the signNewCustomer task, to wait for the other
		
	}

	
	//TODO move this method to it's own runnable class(bank will call that class)
	public void createCustomerAccount(Customer customer){
		//must wait for a customer to be signed up
		
		//create a associated account
		
		//set a default balance of $50
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
