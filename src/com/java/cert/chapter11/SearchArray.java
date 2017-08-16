package com.java.cert.chapter11;

import java.util.Arrays;

import com.java.cert.chapter11.comparator.ReverseComparator;

/****************************************************************************
 * Title: SearchArray.java <p/>
 * Project: JavaSandBox <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jun 21, 2016
 ****************************************************************************/

public class SearchArray {
	
	/**
	 * No arg constructor for initialization
	 */
	public SearchArray(){
		super();
	}
	
	
	public void searchLogic(){
		//create a dynamic list of Objects(dogs, cats, zebras, whatever)
		
		//sort the animals based on either their name or age
		
		//get back a reverse order of animals
		
		//write the animals out to a file or db for later comparison
	}
	
	/**
	 * Returns back a String array in reverse order
	 * @param argArray
	 * @return
	 */
	public String[] reverseArray(String[] argArray){
		 //Sort array
		Arrays.sort(argArray);
		
		/*Search it second. Note: that there are several rules involved when searching
		 * a) searches are done using the binarySearch() 
		 * b) results returned from binarySearch are 0 and positive numbers indicate
		 *    a found match with corresponding index. Negative numbers indicate 
		 *    no matches found, and index to insert to maintain order. (-(index) -1) 
		 * c) a collection/array must first be sorted before it's searched.
		 * d) if using a comparator during sorting, you MUST use a comparator 
		 *    when searching.
		 * e) attempting to search before sorting may lead to unpredicatable results
		 * */
		System.out.println("Searched index: " + Arrays.binarySearch(argArray, "six") );
		
		ReverseComparator rs = new ReverseComparator();
		Arrays.sort(argArray, rs); //Sort it first
		//Show what we got
		for(String item : argArray){
			System.out.println("item : " + item);
		}
		
		System.out.println("Searched index: " + Arrays.binarySearch(argArray, "six", rs) );
		System.out.println("Searched index: " + Arrays.binarySearch(argArray, "nine", rs) );
		
		return null;
	}
	
	/**
	 * Main method useful for debugging and testing
	 * @param args
	 */
	public static void main(String[] args) {
		SearchArray sa = new SearchArray();
		sa.searchLogic();
	}
}
