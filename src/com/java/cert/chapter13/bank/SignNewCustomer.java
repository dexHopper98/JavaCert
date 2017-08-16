package com.java.cert.chapter13.bank;
/****************************************************************************
 * Title: SignNewCustomer.java <p/>
 * Project: JavaCert <p/>
 * Description: Performs the "job" of signing up new customers for a bank account.<p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Aug 3, 2017
 ****************************************************************************/

public class SignNewCustomer implements Runnable {
	private Customer customer;
	
	/**
	 * constructor
	 * @param customer
	 */
	public SignNewCustomer(Customer customer){
		this.customer = customer;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		//sign the customer up for a new account
		signUpCustomer();
	}
	
	/**
	 * Signs up potential customer 
	 */
	protected void signUpCustomer(){
		System.out.println("Attempting to sign up customer: " + customer.getName());
		
		//first process their data 
	
		
		//check if they passed the check, is so assign them an new account 
		//and a starting balance
		
		//else give message of unable to sign customer up
	}

}
