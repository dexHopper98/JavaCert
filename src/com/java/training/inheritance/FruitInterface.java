package com.java.training.inheritance;
/****************************************************************************
 * Title: FruitInterface.java <p/>
 * Project: JavaSandBox <p/>
 * Description: Defines common functionality between fruit objects </p>
 * Copyright: Copyright (c) 2015<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Mar 18, 2015
 ****************************************************************************/

public class FruitInterface {
	
	public String name;
	public String size;
	public double weight;
	public String region;

	/**
	 *Constructor, initialize class
	 */
	public FruitInterface(String name, String size, double weight, String region){
		this.name = name;
		this.size = size;
		this.weight = weight;
		this.region = region;
		
	}
	
	/**
	 * Returns region where fruit came from
	 * @return
	 */
	public String getRegion(){
		
		return this.region;
	}
	
	/**
	 * 
	 * @param name
	 */
	public void munchOut(String name){
		System.out.println("(Eating " + name + "). That sure was tasty!"); 
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the size
	 */
	public String getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/**
	 * @return the weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
}
