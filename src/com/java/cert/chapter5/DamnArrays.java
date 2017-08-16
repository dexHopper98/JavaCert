package com.java.cert.chapter5;
/****************************************************************************
 * Title: DamnArrays.java <p/>
 * Project: JavaSandBox <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2015<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Nov 16, 2015
 ****************************************************************************/

public class DamnArrays {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		//normalArray();
		
		//_2DArray();
		
		assignment();
		
		//Call out to DamnArrayList
		DamnArrayList dal = new DamnArrayList();
	    dal.createList();
	    dal.simpleStringTest();
	}
	
	/**
	 * Priints out a normal array
	 */
	public static void normalArray(){
		//Create array and initialize in one line
		int[] myFirstArray = {1, 2, 3, 4};
		
		for (int x : myFirstArray) {
			System.out.print("Value is " + x);
			System.out.println();
		}
		
		//Create an array and assign each value individually
		int[] mySecondArray = new int[5];
		
		mySecondArray[0] = 5;
		mySecondArray[1] = 10;
		mySecondArray[2] = 15;
		mySecondArray[3] = 20;
		mySecondArray[4] = 25;
		
		for (int i = 0; i < mySecondArray.length; i++) {
			System.out.print("Second array value is " + mySecondArray[i]);
		}
		
	}
	
	/**
	 * Prints out a 2 dimensional array
	 */
	public static void _2DArray(){
		//Create 2d array and assign each value individually
		int[] [] _2d = new int[3][4];
		
	   _2d[0][0] = 10;
	   _2d[1][0] = 20;
	   _2d[2][0] = 30;
	   
	   System.out.println("Length of 2D array is " + _2d.length);
	   
	   for (int i = 0; i < _2d.length; i++) {
			   System.out.println("Temp value is " + _2d[i][0]);
	   }
	   
	   //Create 2D array and initialize in one line
	   //Here we are assigning a slot in the first array with it's values as 2 and 4
	   int [][]  str2D = {{2, 4}};
	   
	   System.out.println(str2D[0][0]);
	   System.out.println(str2D[0][1]);
	}
	/**
	 * Will assign arrays to objects and vice versa
	 */
	public static void assignment(){
		Object j;
	    String[] sa = {"devon", "nick"};
	   
	    //assign the array to object
	    j = sa;
		
	    System.out.println(j.toString());
	    
	    Object p;
	    int[][] ia = new int[2][4];
	    //assign two d array to object    
	    p = ia;
	    
	    int[][] ia2 = (int[][]) p;
	    
	    System.out.println(ia2.length);
	}
}
