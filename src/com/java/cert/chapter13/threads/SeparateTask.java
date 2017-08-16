package com.java.cert.chapter13.threads;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/****************************************************************************
 * Title: SeparateTask.java <p/>
 * Project: JavaCert <p/>
 * Description: Performs a separate(in real world, probably time consuming) that 
 * deserves to be ran in a multi-thread environment<p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jul 14, 2017
 ****************************************************************************/

public class SeparateTask implements Runnable {
	//member variables
	private static final Logger log = Logger.getLogger(SeparateTask.class.getName());
	
	public SeparateTask(){
		//initialize the logger
		PropertyConfigurator.configure("properties/log4j.properties");
		log.debug("Logger initialized");
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		String[] haikus = {"summer", "river", "logical", "aspirations"};
		for (int i = 0; i < haikus.length; i++) {
			log.debug(haikus[i]);
		}
		
		//print the info for the thread that run this task
		long id = Thread.currentThread().getId();
		String name = Thread.currentThread().getName();
		log.debug("Task completed by thread: " + id + ", name: " + name);
	}
	
}
