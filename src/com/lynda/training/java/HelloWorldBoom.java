package com.lynda.training.java;
/****************************************************************************
 * <b>Title</b>: HelloWorldBoom.javaIncomingDataWebService.java <p/>
 * <b>Project</b>: New_StartRAMDataFeed <p/>
 * <b>Description: </b>
 * <b>Copyright:</b> Copyright (c) 2015<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since 10:36:11 PM<p/>
 * <b>Changes: </b>
 ****************************************************************************/
/*
 *The simple example of how to write a hello world application 
 */

public class HelloWorldBoom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloWorldBoom helloWB = new HelloWorldBoom();

		helloWB.helloWorldBoom();
		
	}
	
	/**
	 * Outputs hello world as a string to the console
	 */
	public void helloWorldBoom(){
		String boom = "Hello World, I am about to go boom!";
		System.out.println(boom);
		
	}

}
