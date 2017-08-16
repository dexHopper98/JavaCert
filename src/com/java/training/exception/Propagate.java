package com.java.training.exception;
/****************************************************************************
 * Title: Propagate.java <p/>
 * Project: JavaSandBox <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2015<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Sep 17, 2015
 ****************************************************************************/

public class Propagate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Propagate myProp = new Propagate();
		try {
			myProp.reverseItUp("");
		} catch (Exception e) {
			System.out.println("Wooo your string has no length to it!");
			e.printStackTrace();
		}finally{
			System.out.println("This program has ended.");
		}
	}
	
	/**
	 * Attempts to print a string to console, if not throws an error
	 * @param arg
	 * @return
	 */
	public String reverseItUp(String arg) throws Exception {
		if(arg.length() == 0){
			throw new Exception();
		}
		System.out.println("Your string sire " + arg );
		
		return arg;
	}
	
	/**
	 * Catches a throw exception then rethrows the same exception it just caught
	 * @throws Exception
	 */
	public void rethrowException() throws Exception{
		try{
			throw new Exception();
		}catch(Exception e){
			throw e;
		}
	}

}
