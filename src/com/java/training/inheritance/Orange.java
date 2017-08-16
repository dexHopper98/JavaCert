package com.java.training.inheritance;
/****************************************************************************
 * Title: Orange.java <p/>
 * Project: JavaSandBox <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2015<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Mar 18, 2015
 ****************************************************************************/

public class Orange extends FruitInterface {

	/**
	 * @param name
	 * @param size
	 * @param weight
	 * @param region
	 */
	public Orange(String name, String size, double weight, String region) {
		super(name, size, weight, region);
		
	}
	
    
	@Override
	/**
	 * Override munchout method for orange
	 */
	public void munchOut(String name) {
         System.out.println("Oranges taste so yummy!");
	}

}
