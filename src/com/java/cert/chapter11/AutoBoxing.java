package com.java.cert.chapter11;
//jdk 1.7.x
import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 * Title: AutoBoxing.java <p/>
 * Project: JavaSandBox <p/>
 * Description: Helps demonstrate the use and value of autoboxing with collections <p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jun 20, 2016
 ****************************************************************************/

public class AutoBoxing {

	protected static Integer j; //not initialized!!	
	/**
	 * Useful for debugging and testing
	 * @param args
	 */
	public static void main(String[] args) {
		AutoBoxing ab = new AutoBoxing();
		Integer xVal = 58;
		ab.autoBoxIt(xVal);
	}
	
	/**
	 * Deals with passing primitives into a collection prior to and after Java5
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void autoBoxIt(int z){
		//Prior to Java 5 array list
		List myIntList = new ArrayList();
		
		//Prior to Java 5 dealing with primitives
		Integer xVal = new Integer(23);
		int x = xVal.intValue();  //unwrap it
		x++; x = x * 5; //use it
		myIntList.add(new Integer(x)); //rewrap it
		
		//Java 5++
		Integer yVal = 23;
		yVal++; yVal = yVal * 5; //unwrap it, use it, rewrap it
		myIntList.add(yVal);
		
		//Print out values from arraylist
		for (int i = 0; i < myIntList.size(); i++) {
			System.out.println("The autobox value is " + myIntList.get(i));
		}
		
		//Throws null pointer 
		//System.out.println(xVal * j);
	}
}
