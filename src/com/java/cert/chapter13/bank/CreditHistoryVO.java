package com.java.cert.chapter13.bank;


/****************************************************************************
 * Title: CreditHistoryVO.java <p/>
 * Project: JavaCert <p/>
 * Description: Data container for storing background information related to 
 * credit, accounts opened, etc.<p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Aug 8, 2017
 ****************************************************************************/

public class CreditHistoryVO {
	//member variables
	private int creditScore;
	private long debtAmount;
	private int openAccountsTotal;
	private int yearsAtCurrentAddress;
	
	/**
	 * Constructor to initialize class
	 * @param creditScore
	 * @param debtAmount
	 * @param opentAccountsTotal
	 * @param yearsAtCurrentAddress
	 */
	public CreditHistoryVO(int creditScore, long debtAmount, int opentAccountsTotal, int yearsAtCurrentAddress){
		this.creditScore = creditScore;
		this.debtAmount = debtAmount;
		this.openAccountsTotal = opentAccountsTotal;
		this.yearsAtCurrentAddress = yearsAtCurrentAddress;
	}
	
	/**
	 * @return the creditScore
	 */
	public int getCreditScore() {
		return creditScore;
	}
	/**
	 * @param creditScore the creditScore to set
	 */
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	/**
	 * @return the debtAmount
	 */
	public long getDebtAmount() {
		return debtAmount;
	}
	/**
	 * @param debtAmount the debtAmount to set
	 */
	public void setDebtAmount(long debtAmount) {
		this.debtAmount = debtAmount;
	}
	/**
	 * @return the openAccountsNo
	 */
	public int getOpenAccountsTotal() {
		return openAccountsTotal;
	}
	/**
	 * @param openAccountsTotal the openAccountsNo to set
	 */
	public void setOpenAccountsTotal(int openAccountsTotal) {
		this.openAccountsTotal = openAccountsTotal;
	}
	/**
	 * @return the yearsAtCurrentAddress
	 */
	public int getYearsAtCurrentAddress() {
		return yearsAtCurrentAddress;
	}
	/**
	 * @param yearsAtCurrentAddress the yearsAtCurrentAddress to set
	 */
	public void setYearsAtCurrentAddress(int yearsAtCurrentAddress) {
		this.yearsAtCurrentAddress = yearsAtCurrentAddress;
	}
}
