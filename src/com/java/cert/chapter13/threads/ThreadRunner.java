package com.java.cert.chapter13.threads;
/****************************************************************************
 * Title: ThreadRunner.java <p/>
 * Project: JavaCert <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jul 14, 2017
 ****************************************************************************/

public class ThreadRunner {
	
	private ThreadRunner(){
		//make constructor private to prevent initialization 
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String specialThreadNm = "specializedThread";
		
		//create our task/job to be ran
		SeparateTask task = new SeparateTask();
		
		//create our threads
		Thread t = new Thread(task);
		Thread t2 = new Thread(task);
		SpecializedThread specialThread = new SpecializedThread();
		specialThread.setReferrencedThread(t2);
		
		//give our threads some names
		t.setName("threadOne");
		t2.setName("threadTwo");
		specialThread.setName(specialThreadNm);

		//configure the threads
		specialThread.setPriority(Thread.MAX_PRIORITY);
		t.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		//start the threads
		t.start();
		t2.start();
		specialThread.start();
	}

}
