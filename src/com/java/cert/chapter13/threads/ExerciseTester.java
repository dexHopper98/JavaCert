package com.java.cert.chapter13.threads;
/****************************************************************************
 * Title: ExerciseTester.java <p/>
 * Project: JavaCert <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jul 23, 2017
 ****************************************************************************/

public class ExerciseTester {

	private ExerciseTester(){
		//private constructor to prevent instantiation
	} 
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		incrementLetterCount();
	}
	
	/**
	 * Demonstrates locking of an Object to prevent multiple threads from executing
	 * against the same object at once/concurrently. Creates 3 threads with one StringBuffer
	 * Should have the final output be 100 A's, B's, and C's consecutively, in a none broken line.
	 */
	public static void incrementLetterCount(){
		//create a single StringBuffer starting with value of a	
		StringBuffer sb = new StringBuffer("a");
		
		//create 3 new threads
		LetterThread thread1 = new LetterThread(sb);
		LetterThread thread2 = new LetterThread(sb);
		LetterThread thread3 = new LetterThread(sb);
		
		//give our threads names
		thread1.setName("LetterThreadOne");
		thread2.setName("LetterThreadTwo");
		thread3.setName("LetterThreadThread");
		
		//start our threads
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
