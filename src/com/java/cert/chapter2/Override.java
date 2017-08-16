package com.java.cert.chapter2;
/****************************************************************************
 * Title: Override.java <p/>
 * Project: JavaSandBox <p/>
 * Description: Class to help demonstrate some of the key concepts regarding
 * java method overloading(overriding) and object polymorphism<p/>
 * Copyright: Copyright (c) 2015<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Nov 15, 2015
 ****************************************************************************/

public class Override {

	//member variables(make these protected to keep class simple)
	protected Override overridy;
	/**
	 * A variable member of type Object, can be used for looking at and examinng
	 * the various exposed API's of Java classes.
	 */
	protected Object theObject;
	
	/**
	 * Constructor that takes a override object
	 * @param override
	 */
	public Override(Override override){
		this.overridy = override;
	}
	
	/**
	 * Constructor that takes an override object and general object
	 * @param override
	 * @param object
	 */
	public Override(Override override, Object object){
		/*This is interesting. This would be better served if using a single 
		 * pattern, attempting to control the specific instance being used/returned*/ 
		//ov = this; 
		
		this.overridy = override;
		this.theObject = object;
	}
	
	/**
	 * The normal entry point for an application defined by the Java spec.
	 * @param args
	 */
	public static void main(String[] args){
		System.out.println("Starting the override class....");
		
		//next call our overloaded method based on signature type
		Override.main("Hello world, overloading example.");
	}
	
	/**
	 * An example method that demonstrates overloading(same name, return type, 
	 * but not the same argument types )
	 * @param args
	 */
	public static void main(String args){
		System.out.println("Calling the overloaded method....");
		System.out.println(args);
	}
}
