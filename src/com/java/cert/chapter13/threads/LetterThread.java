package com.java.cert.chapter13.threads;
/****************************************************************************
 * Title: LetterThread.java <p/>
 * Project: JavaCert <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jul 23, 2017
 ****************************************************************************/

public class LetterThread extends Thread {
	//member variables
	private StringBuffer sb;
	
	/**
	 * Constructor for initialization
	 * @param sb
	 */
	public LetterThread(StringBuffer sb){
		this.sb = sb;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run(){
		if(sb == null || sb.length() == 0){
			return;
		}
		
		//synchronize block of code. Acquire the lock for the StringBuffer
		synchronized(sb){
			System.out.println("Being executed by thread: "  + Thread.currentThread().getName());
			char endLetter = sb.charAt(sb.length() - 1);
			
			//output the buffer 100 times and append the current letter to the buffer
			System.out.println(sb); //print our first value
			for (int i = 0; i < 99; i++) {
				sb.append(endLetter);
				System.out.println(sb);
			}
			System.out.println("Size of our buffer: " + sb.length());
		
			//increment our letter for the next thread call
			endLetter++;
			System.out.println("The last letter of our buffer; " + endLetter);
			
			//append it to the end
			sb.append(endLetter);
			System.out.println(sb);
		}
	}
}
