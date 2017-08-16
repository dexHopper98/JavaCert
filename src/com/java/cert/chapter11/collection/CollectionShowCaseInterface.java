package com.java.cert.chapter11.collection;
/****************************************************************************
 * Title: CollectionShowCaseInterface.java <p/>
 * Project: JavaSandBox <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jun 12, 2016
 ****************************************************************************/

public interface CollectionShowCaseInterface {

	/**
	 * The method that helps best show case some of the features of the specified 
	 * collection 
	 */
	public abstract void showCaseCollection();
	
	/**
	 * Returns the specified collections name for display
	 * @return
	 */
	public abstract String getCollectionName();
	
	/**
	 * Returns the general, informative text about the specified collection
	 * @return - The StringBuilder holding the general information related to the 
	 * specified collection type
	 */
	public abstract StringBuilder getCollectionTypeInfo();
}
