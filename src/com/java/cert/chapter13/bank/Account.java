package com.java.cert.chapter13.bank;
/****************************************************************************
 * Title: Account.java <p/>
 * Project: JavaCert <p/>
 * Description: Represents the bank account for a given user<p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Aug 1, 2017
 ****************************************************************************/

public class Account {
	private int balance;
	
	public Account(){
		//no-arg constructor
	}
	
	public Account(boolean isReferral){
		if(isReferral){
			balance = 100;
		}
	}
	
	/**
	 * Returns the account balance
	 * @return
	 */
	public int getBalance(){
		return balance;
	}
	
	/**
	 * Adds to the account balance
	 * @param amount
	 */
	public void deposit(int amount){
		balance += amount;
	}
	
	/**
	 * Attempts to withdraw the given amount from the account. May throw an 
	 * exception if the balance is 
	 * @param amount
	 * @return
	 * @throws Exception 
	 */
	public int withdraw(int amount) throws Exception{
		if(balance >= amount){
			return balance - amount;
		}else{
			throw new Exception("Not enough money to withdraw amount");
		}
	}
}
