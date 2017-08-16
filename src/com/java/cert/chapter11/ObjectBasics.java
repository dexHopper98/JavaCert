package com.java.cert.chapter11;

//jdk 1.8
import java.util.Date;

/****************************************************************************
 * Title: ObjectBasics.java <p/>
 * Project: JavaSandBox <p/>
 * Description: Helps display the most common methods associated with the 
 * object class<p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jun 12, 2016
 * Updates: 
 * 	Refactored code and implemented overrides to equals and hashcode - 02/20/17
 ****************************************************************************/

public class ObjectBasics {
	//member variables
	private String objectName;
	private int objectId; //the unique id for each object instance
	private Date createDate;
	
	/**
	 * No arg constructor to initialize class
	 */
	public ObjectBasics(){
		super();
	}
	
	/**
	 * Constructor to initialize class with values set
	 * @param objectName
	 * @param objectId
	 * @param createTime
	 */
	public ObjectBasics(String objectName, int objectId, Date createTime){
		this.objectName = objectName;
		this.objectId = objectId;
		this.createDate = createTime;
	}

	/**
	 * Overrides the object class toString method, and spits out a more meaningful
	 * representation of our class for us
	 */
	public String toString(){
		StringBuilder meaningfulState = new StringBuilder(50);
	    meaningfulState.append("Object name: " + objectName + " ");
	    meaningfulState.append("Object id: " + objectId);
	    meaningfulState.append("Object creation date: " + createDate);
		
		return meaningfulState.toString();
	}
	
	/*
	 * Overrides the equal method from class Object. Uses this classes member
	 * variables to determine equivalence 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object o){
		if(o instanceof ObjectBasics && 
				((ObjectBasics) o).getObjectId() == getObjectId() &&
				((ObjectBasics) o).getObjectName() == getObjectName()){
			return true;
		}
		return false;
	}
	
	/*
	 * Overrides the hashCode method from class Object. Uses the same member
	 * variables as the equals method to determine hashcode value. In general
	 * if two objects are considered meaningfully equal, then their hashcodes
	 * must be the equal as well. Intended purpose is to help improve searching
	 * within hash sets via distributing evenly amongst various "buckets"
	 * @see java.lang.Object#hashCode()
	 */
	public int hashCode(){
		int hashVal = getObjectId() * 19; //multiply by prime
		return hashVal;
	}
	
	 /**===================Getters/Setters====================**/
	/**
	 * @return the objectName
	 */
	public String getObjectName() {
		return objectName;
	}

	/**
	 * @param objectName the objectName to set
	 */
	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	/**
	 * @return the objectId
	 */
	public int getObjectId() {
		return objectId;
	}

	/**
	 * @param objectId the objectId to set
	 */
	public void setObjectId(int objectId) {
		this.objectId = objectId;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}
