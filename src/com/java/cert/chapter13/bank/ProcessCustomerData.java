package com.java.cert.chapter13.bank;

/****************************************************************************
 * Title: ProcessCustomerData.java <p/>
 * Project: JavaCert <p/>
 * Description: Handles processing of customer data to determine bank account eligibility<p/>
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
			
			//notify any waiting threads
			customer.notifyAll();
		}

	}
	
	/**
	 * validates different criteria from a customers credit history and reports "red flags"
	 */
	protected void validateCustomerHistory(){
		CreditHistoryVO credHistory = customer.getCreditHistoryVO();
		
		if(credHistory == null){//cannot process without credit history
			String errorMssg = "Credit history data not set for customer: " +  customer.getCustomerId();
			throw new NullPointerException(errorMssg);
		}
		
		//check credit score
		if(credHistory.getCreditScore() <= 550)
			redFlags++;
		
		//check any outstanding debts
		if(credHistory.getDebtAmount() > 5000)
			redFlags++;
		
		//check number of open accounts
		if(credHistory.getOpenAccountsTotal() > 4)
			redFlags++;
		
		//check years at previous address
		if(credHistory.getYearsAtCurrentAddress() < 2)
			redFlags++;
		
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
