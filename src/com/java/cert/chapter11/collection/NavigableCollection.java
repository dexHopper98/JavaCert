package com.java.cert.chapter11.collection;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

/****************************************************************************
 * Title: NavigableCollection.java <p/>
 * Project: JavaSandBox <p/>
 * Description: Helps showcase two of the main collections of the 9: 
 * Navigable collection - the navigableMap and navigableSet<p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jun 12, 2016
 ****************************************************************************/

public class NavigableCollection implements CollectionShowCaseInterface {

	/**
	 * The navigableSet is an interface that direcetly extends the SortedSet interface
	 */
	private NavigableSet<String> theNavigableSet = null;
	private NavigableMap<Integer, String> theNavigableMap = null;
	
	/**
	 * Constructor 
	 */
	public NavigableCollection() {
	}
	/* (non-Javadoc)
	 * @see com.java.cert.chapter11.collection.CollectionShowCaseInterface#showCaseCollection()
	 */
	@Override
	public void showCaseCollection() {
		System.out.println("Starting to show case the collection...");
		showCaseNavigableSet();
	}
	
	private void showCaseNavigableSet(){

		this.theNavigableSet = new TreeSet<String>();
		System.out.println("Adding shoes to the navigable set...");
		theNavigableSet.add("oneShoe");
		theNavigableSet.add("twoShoe");
		theNavigableSet.add("threeShoe");
		theNavigableSet.add("fourShoe");
		
		System.out.println("Showing the floor of shoes least than oneShoe: " +theNavigableSet.floor("oneShoe"));
		System.out.println("Showing the ceiling of shoes greater than oneShoe: " +theNavigableSet.ceiling("oneShoe"));
		System.out.println("Showing the higher of shoes greater than oneShoe: " +theNavigableSet.higher("oneShoe"));
		System.out.println("Showing the lower of shoes least than oneShoe: " +theNavigableSet.lower("oneShoe"));
		
		Iterator<String> descIter = theNavigableSet.descendingIterator();
		
		System.out.println("Iterating over the elements in the set in reverse...");
		while(descIter.hasNext()){
			System.out.println("Item: " + descIter.next());
		}
	}

	/* (non-Javadoc)
	 * @see com.java.cert.chapter11.collection.CollectionShowCaseInterface#getCollectionName()
	 */
	@Override
	public String getCollectionName() {
		String collectionName = "navigableCollection";
		return collectionName;
	}
	/* (non-Javadoc)
	 * @see com.java.cert.chapter11.collection.CollectionShowCaseInterface#getCollectionTypeInfo()
	 */
	@Override
	public StringBuilder getCollectionTypeInfo() {
		StringBuilder collectionInfo = new StringBuilder(250);
		//add the general information
		collectionInfo.append("A SortedSet extended with navigation methods reporting closest matches ");
		collectionInfo.append("for given search targets. Methods lower, floor, ceiling, and higher return elements respectively less ");
		collectionInfo.append("than, less than or equal, greater than or equal, and greater than a given element, returning null if there ");
		collectionInfo.append("is no such element. A NavigableSet may be accessed and traversed in ");
		collectionInfo.append("either ascending or descending order. ");
		collectionInfo.append("The return values of navigation methods may be ambiguous in implementations that permit null elements. ");
		collectionInfo.append("To avoid such issues, implementations of this interface are encouraged to not permit insertion of null elements. ");
		
		return collectionInfo;
	}
}
