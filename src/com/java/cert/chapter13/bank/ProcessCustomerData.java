package com.java.cert.chapter13.bank;
/****************************************************************************
 * Title: ProcessCustomerData.java <p/>
 * Project: JavaCert <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Aug 7, 2017
 ****************************************************************************/

public class ProcessCustomerData implements Runnable {
	private Customer customer;
	private int redFlags; //used to determine eligibility
	
	//enum for background statuses
	public enum ProcessStatus{
		PASSED, PASSED_WITH_WARNINGS, PENDING, FAILED
	}
	
	/**
	 * 
	 * @param customer
	 */
	public ProcessCustomerData(Customer customer){
		this.customer = customer;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		//process the customer data
		processData();
	}
	
	/**
	 * Processes the customers' data and determines if they eligible for a bank account
	 */
	protected void processData(){
		System.out.println("Processing the data for: " + customer.getName());
		
		synchronized (customer) {
			//perform validation checks			
			validateCustomerHistory();
			
			//if more than 3 flags, not eligible
			if(redFlags < 3){
				customer.setProcessStatus(ProcessStatus.PASSED);
			}else if(redFlags == 3){
				customer.setProcessStatus(ProcessStatus.PASSED_WITH_WARNINGS);
			}else{
				customer.setProcessStatus(ProcessStatus.FAILED);
			}
			
			//notify the any waiting threads
			customer.notifyAll();
		}

	}
	
	protected void validateCustomerHistory(){
		
	}
	

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
