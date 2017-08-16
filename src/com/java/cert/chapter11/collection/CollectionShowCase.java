package com.java.cert.chapter11.collection;
/****************************************************************************
 * Title: CollectionShowCase.java <p/>
 * Project: JavaSandBox <p/>
 * Description: The test class to show case the main 9 collection interfaces
 * required for the exam and for life!<p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jun 12, 2016
 ****************************************************************************/

public class CollectionShowCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("STARTING THE GRAND COLLECTION SHOWCASE SHOW!!!!");
		showCaseNavigableCollection();
	}
	
	/**
	 * Show cases the navigable collection 
	 */
	private static void showCaseNavigableCollection(){
		NavigableCollection nvgCol = new NavigableCollection();
		nvgCol.showCaseCollection();
	}

}
