package com.java.cert.chapter12;
/****************************************************************************
 * Title: MyOuter.java <p/>
 * Project: JavaCert <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since May 28, 2017
 ****************************************************************************/

public class MyOuter {
	//member variables
	private MyInner inner;
	public static final int maxArrSize = 15;
	private int[] vals = new int[maxArrSize];
	
	/**
	 * No arg-constructor
	 */
	public MyOuter(){
		//initialize member vars
		int arrRange = 100;
		initVals(arrRange);
	}
	
	public static void main(String[] args){
		//call the outer and test the inner
		MyOuter outer = new MyOuter();
		outer.doOuterStuff();
	}
	
	/**
	 * Populates the internal array with int values
	 */
	private void initVals(int range){
		//random populate the vals array based on max size
		for (int i = 0; i < maxArrSize; i++) {
			int random = (int) Math.floor(Math.random() * range);
			//see what we got
			System.out.println("Current val: " + random);
			vals[i] = random;
		}
		System.out.println("Size of array: " + vals.length);
	}
	
	/**
	 * 
	 */
	public void doOuterStuff(){
		//make instance of the inner and call 
		inner = new MyInner("InnerTest");
		inner.doInnerStuff();
	}
	
	/**
	 * The inner class instance 
	 * @author dfranklin
	 *
	 */
	 class MyInner {
		 private String name;
		 
		 public MyInner(String name){
			 this.setName(name);
			 //access member variable of the outer
		 }
			public void doInnerStuff(){
				System.out.println("From within the inner");
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
			
			/*define yet another inner class. Hide implication for the outside world*/
			private class OtherInner{
				public void performSubInner(){
					//This too can see the Outer's member variables
					for (int i : vals) {
						System.out.println("Count: " + i);
					}
				}
			}
	}
}
