package com.lynda.training.java;
/****************************************************************************
 * Title: Array.java <p/>
 * Project: JavaSandBox <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2015<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Apr 6, 2015
 ****************************************************************************/

public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Array mySimpleArray = new Array();
        mySimpleArray.run();
	}
	/**
	 * Runs a simple array example
	 */
	public void run(){
		String [] responses = {"Boss", "Employee"};
		
	    
		for(int x = 0; x < responses.length; x++){
			System.out.println("The value is " + responses[x]);
		}
	}

}
