package com.java.cert.chapter12;

import java.util.List;

/****************************************************************************
 * Title: AbstractInstrumentAdapter.java <p/>
 * Project: JavaCert <p/>
 * Description: Defines the common characteristics common to all instruments<p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jul 9, 2017
 ****************************************************************************/

public abstract class AbstractInstrumentAdapter implements MusicInstrument {
	
	 /**
	  *List of different musical ranges for musical instruments
	  */
	public enum Range{
		TENOR, ALTO, SOPRANO, BARITON, BASS
	}
	/**	
	 *List of different eras related to when a musical instrument was created
	 */
	public enum Era{
		PRIMITIVE, MIDDLEAGES, BAROQUE, RENAISSANCE, CLASSICAL, TWENTIETHCENTURY
	}
	
	//member variables
	private String name;
	private List<Range> ranges;
	
	public AbstractInstrumentAdapter(){
		//no-arg constructor
	}
	
	/**
	 * Constructor that initializes member variables
	 * @param name
	 * @param ranges
	 */
	public AbstractInstrumentAdapter(String name, List<Range> ranges){
		this.name = name;
		this.ranges = ranges;
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
	 * @return the ranges
	 */
	public List<Range> getRanges() {
		return ranges;
	}
	/**
	 * @param ranges the ranges to set
	 */
	public void setRanges(List<Range> ranges) {
		this.ranges = ranges;
	}
}
