package com.java.testStuffOut;

import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.regex.Pattern;


/****************************************************************************
 * Title: TestItOut.java <p/>
 * Project: JavaCert <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Mar 3, 2017
 ****************************************************************************/

public class TestItOut {
	
	enum MessageType{/*supported message types*/
		TEXT, HTML
	}
	private static String test = "a simple test string";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Starting to test stuff out!!");
		smtSplitToken();
		
		Dog dog = null;
		passByValue(dog);
		System.out.println(dog);
	}
	
	/**
	 * Helper method to test the String split method with a delimiter
	 */
	protected static void smtSplitToken(){
		String SMTToken = "%SMT%";
		String value = "MASTER_332%SMT%MASTER_889%SMT%MASTER_547";
		
		String[] values = value.split(SMTToken);
		System.out.println("Size of the array " + values.length);
		for (String string : values) {
			System.out.println("Value in array: " + string);
		}
	}
	
	public void canStringBePassedByRef(){
		//modify the String
		test = "another string";
	}
	
	public static boolean updateBoolean(Boolean updateFlag){
		System.out.println("The flag value is " + updateFlag);
		return updateFlag = new Boolean(Boolean.TRUE);
	}

	public static void passByValue(Dog dog){
		if(dog == null){
			dog = new Dog("Fido", 1);
		}
	}

}
