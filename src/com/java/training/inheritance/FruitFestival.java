package com.java.training.inheritance;

import java.util.ArrayList;

/****************************************************************************
 * Title: FruitFestival.java <p/>
 * Project: JavaSandBox <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2015<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Mar 18, 2015
 ****************************************************************************/

public class FruitFestival {
	
	//class variables
	private ArrayList<FruitInterface> fruits;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
         FruitFestival festival = new FruitFestival();
         
         //check out foo method
         System.out.println(festival.foo());
         //run festival
         festival.setUpFestival();
         festival.startFestival();
	}
	
	public Object foo(){
		Orange myOrange = new Orange("orange", "big", 5, "Africa");
		return myOrange;
	}

	
	public void setUpFestival(){
		//get fruits for festival
        fruits = new ArrayList<FruitInterface>();
		System.out.println("Running the set up method");
		//even without actual interface you can still create 
		//new fruitbase from instance of a new orange
        
        //visit :http://java67.blogspot.com/2014/02/what-is-actual-use-of-interface-in-java.html
        //for GOOD reasons why to use interfaces
		FruitInterface fruitBase = new Orange("orange", "medium", 4.0, "south jamaica");
		Orange myOrange = new Orange(null, null, 0, null);
		myOrange.getRegion();
		
		fruits.add(fruitBase);
		
	}
	
	public void startFestival(){
		//eat fruits and judge flavor
		
	}

}
