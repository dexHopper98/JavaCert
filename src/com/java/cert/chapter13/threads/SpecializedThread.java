package com.java.cert.chapter13.threads;

//log4j
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/****************************************************************************
 * Title: SpecializedThread.java <p/>
 * Project: JavaCert <p/>
 * Description: A thread class that directly extends Thread to perform
 * more specialized thread operations<p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jul 13, 2017
 ****************************************************************************/

public class SpecializedThread extends Thread {
	//member variables
	private static final Logger log = Logger.getLogger(SpecializedThread.class.getName());
	private Thread referrencedThread;

	public SpecializedThread(){
		//initialize the logger
		PropertyConfigurator.configure("properties/log4j.properties");
		log.debug("Logger initialized");
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run(){
		//attempt to join the thread to the referrenced thread
		joinReferrencedThread();
		
		//perform work
		for (int i = 0; i < 10; i++) {
			log.info("Current value: "+ i);
			
			//wait the thread for 30 seconds, allow another thread to take a turn(possibly)
			if(i == 5){
				try {
					sleep(3000);
				} catch (InterruptedException e) {
					log.error("Thread was interrupted", e);
					Thread.currentThread().interrupt();
				}
			}
		}
		
		//print status when complete
		log.info("Completed running thread: Id|" + getId() + " |name| " + getName());
	}
	
	/**
	 * Attempts to join this currently executing thread behind another thread
	 */
	protected void joinReferrencedThread(){
		if(referrencedThread == null) {
			return; //return if no referrence thread set
		} 
		
		//attempt to this currently executing thread behind the referrenced thread
		try {
			referrencedThread.join();
		} catch (InterruptedException e) {
			log.error("The thread was interrupted: " + e);
		}
	}

	/**
	 * @return the referrencedThread
	 */
	public Thread getReferrencedThread() {
		return referrencedThread;
	}

	/**
	 * @param referrencedThread the referrencedThread to set
	 */
	public void setReferrencedThread(Thread referrencedThread) {
		this.referrencedThread = referrencedThread;
	}
}
