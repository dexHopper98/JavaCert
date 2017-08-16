package com.java.cert.chapter12;

import java.util.ArrayList;
import java.util.List;

import com.java.cert.chapter12.AbstractInstrumentAdapter.Range;

/****************************************************************************
 * Title: MusicRunner.java <p/>
 * Project: JavaCert <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jul 9, 2017
 ****************************************************************************/

public class MusicRunner {

	//member variables
	private String showName;
	private int ticketCount;
	private int[] tickets;
	private MusicHelper helper;
	
	/**
	 * Setups the class for use
	 * @param showName
	 * @param ticketsAvailable
	 */
	protected void setUp(String showName, int ticketsAvailable){
		//initialize the class
		this.showName = showName;
		this.tickets = new int[ticketsAvailable];
		
		//perform the helper activities 
		helper = new MusicHelper();
		helper.countTickets();
	}
	
	//internal inner class 
	protected class MusicHelper{
		public void countTickets(){
			for (int i : tickets) {
				//increase the ticket count
				ticketCount++;
			}
		}
		
		public void displayShowName(){
			System.out.println("Welcome to the show: " + showName);
		}
	}
	
	/**
	 * Controls the logic processing of the class
	 * @param showName
	 * @param ticketsAvailable
	 */
	public void run(String showName, int ticketsAvailable){
		//initialize
		setUp(showName, ticketsAvailable);
		helper.displayShowName();
		
		//make an anonymous music instrument inner class
		AbstractInstrumentAdapter instrument = makeAnonymousInstrument();
		instrument.playSound();
	}
	
	/**
	 * helper method that constructs an anonymous, just-in-time, subclass of 
	 * a musical instrument object instance
	 * @return
	 */
	protected AbstractInstrumentAdapter makeAnonymousInstrument(){
		//construct list of ranges
		List<Range> ranges = new ArrayList<>();
		ranges.add(Range.ALTO);
		ranges.add(Range.BARITON);
		ranges.add(Range.BASS);
		ranges.add(Range.TENOR);
		
		AbstractInstrumentAdapter instrument = new AbstractInstrumentAdapter("Trombone", ranges) {
			@Override
			public void playSound() {
				System.out.println("Playing the sound of a: " + getName());
			}
		};
		
		return instrument;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MusicRunner mr = new MusicRunner();
		mr.run("Greatest Music Show Around", 20);
	}

}
