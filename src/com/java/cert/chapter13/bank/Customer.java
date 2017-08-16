package com.java.cert.chapter13.bank;

import java.util.Map;

import com.java.cert.chapter13.bank.ProcessCustomerData.ProcessStatus;

/****************************************************************************
 * Title: Customer.java <p/>
 * Project: JavaCert <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Aug 1, 2017
 ****************************************************************************/

public class Customer {
	//member variables
	private long customerId;
	private String name;
	private boolean isReferred;
	private Map<String, Account> accounts;
	private ProcessStatus processStatus; //used to specify the status of customers' history check
	private BackgroundDataVO backgroundVO;
	
	/**
	 * Constructor for initialization
	 * @param name
	 * @param isReferred
	 * @param backgroundVO
	 */
	public Customer(String name, boolean isReferred, BackgroundDataVO backgroundVO){
		this.name = name;
		this.isReferred = isReferred;
		this.setBackgroundVO(backgroundVO);
	}

	/**
	 * @return the customerId
	 */
	public long getCustomerId() {
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the accounts
	 */
	public Map<String, Account> getAccounts() {
		return accounts;
	}

	/**
	 * @param accounts the accounts to set
	 */
	public void setAccounts(Map<String, Account> accounts) {
		this.accounts = accounts;
	}

	/**
	 * @return the isReferred
	 */
	public boolean isReferred() {
		return isReferred;
	}

	/**
	 * @param isReferred the isReferred to set
	 */
	public void setReferred(boolean isReferred) {
		this.isReferred = isReferred;
	}

	/**
	 * @return the processStatus
	 */
	public ProcessStatus getProcessCheckStatus() {
		return processStatus;
	}

	/**
	 * @param processStatus the processStatus to set
	 */
	public void setProcessStatus(ProcessStatus processStatus) {
		this.processStatus = processStatus;
	}

	/**
	 * @return the backgroundVO
	 */
	public BackgroundDataVO getBackgroundVO() {
		return backgroundVO;
	}

	/**
	 * @param backgroundVO the backgroundVO to set
	 */
	public void setBackgroundVO(BackgroundDataVO backgroundVO) {
		this.backgroundVO = backgroundVO;
	}
	
}
