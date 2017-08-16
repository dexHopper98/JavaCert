package com.java.cert.chapter6;
/****************************************************************************
 * Title: Gotcha.java <p/>
 * Project: JavaSandBox <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2015<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Nov 17, 2015
 ****************************************************************************/

public class Gotcha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Is the only that will run correctly and catch the error(stackOverflow)
		gotcha2();
		
	}
	
	/**
	 * Gotcha method that will just call go
	 */
	public static void gotcha1(){
		new Gotcha().go();
	}
	
	/**
	 * Gotcha method with catching an Error 
	 */
	public static void gotcha2(){
		try {
			new Gotcha().go();
		} catch (Error e) {
			System.out.print("Ouch" + e);
		}
	}
	
	/**
	 * Gotcha method with catching a normal Exception
	 */
	public static void gotcha3(){
		try {
			new Gotcha().go();
		} catch (Exception e) {
			System.out.print("Ouch" + e);
		}
	}
	
	/**
	 * Recursive method that will call itself forever
	 */
	void go(){
		go();
		System.out.println("Counting");
	}

}
