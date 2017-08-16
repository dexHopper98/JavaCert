package com.java.cert.chapter8;

//jdk 1.7
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/****************************************************************************
 * Title: DateNumberCert.java <p/>
 * Project: JavaCert <p/>
 * Description: Class that will help demonstrate working with Dates in Java. 
 * Including manipulation, converting and formatting.<p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Oct 15, 2016
 ****************************************************************************/

public class DateNumberCert  {
	
	public static final long trilli = 1_000_000_000L;
	
	public void test(){
		testDateAndFormat();
		testNumberFormat(123456789);
	}
	
	/**
	 * Test knowledge of dates and formatting dates
	 */
	public void testDateAndFormat(){
		//Create date, manipulate it
		Date d1 = new Date(); //get current date
		Date d2 = new Date(trilli);
		System.out.println("The current date: " + d1);
		System.out.println("A trillion milliseconds since January 1, 1970: " + d2);
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		c1.setTime(d1);
		c2.setTime(d2);
		//add a month and a year to our dates
		c1.add(Calendar.MONTH, 1);
		c1.add(Calendar.YEAR, 1);
		c2.add(Calendar.MONTH, 1);
		c2.add(Calendar.YEAR, 1);

		System.out.println("The current date after being manipulated: " + c1.getTime());
		System.out.println("The date after being manipulated for January 1, 1970: " + c2.getTime());
		
		//Format the date as normal, as well with some locales		
		Locale locUS = new Locale("en", "US");
		Locale locJP = new Locale("ja", "JP");
		Locale locIT = new Locale("it", "IT");
		Locale locDK = new Locale("da", "DK"); //Denmark
		
		List<DateFormat> formats = new ArrayList<>();
		formats.add(DateFormat.getDateInstance(DateFormat.FULL, locUS));
		formats.add(DateFormat.getDateInstance(DateFormat.MEDIUM, locJP));
		formats.add(DateFormat.getDateInstance(DateFormat.SHORT, locIT));
		
		
		System.out.println("Starting to format our dates....");
		for (DateFormat dtFormat : formats) {
			System.out.println("The current date format: " + dtFormat.format(d1));
			System.out.println("The date since January 1, 1970 format: " + dtFormat.format(d2));
		}
		
		System.out.println("Determing the locales info...");
		List<Locale> locales = new ArrayList<>();
		locales.add(locIT);
		locales.add(locJP);
		locales.add(locUS);
		
		for (Locale locale : locales) {
			System.out.println("The language for my locale: " + locale.getDisplayLanguage());
			System.out.println("The language for a different locale: " + locale.getDisplayLanguage(locDK));
			System.out.println("The country for my locale: " + locale.getDisplayCountry());
			System.out.println("The country for a different locale: " + locale.getDisplayCountry(locDK));
		}	
		
		//create a date/time using Calendar with specific locale
		Locale locSpain = new Locale("es", "ES");
		Calendar cl = Calendar.getInstance(locSpain);
		cl.add(Calendar.YEAR, 2007);
		cl.add(Calendar.MONTH, 4);
		cl.add(Calendar.DATE, 28);
		//get a normal Date object and print out the date
		Date dt = cl.getTime();
		System.out.println("The starting date: " + dt.toString());
		
		//get string representation of a date object
		DateFormat dfLong = DateFormat.getDateInstance(DateFormat.LONG);
		String stringDate = dfLong.format(dt);
		
		System.out.println("Attempting to parse a date string into date object....");
		try {//transform the string back into a date object
			Date dfResult = dfLong.parse(stringDate);
			System.out.println("The date after being parsed: " + dfResult.toString());
		} catch (ParseException e) {
			System.err.println("Error attempting to parse string back into data: " + e);
		}
	}
	
	/**
	 * Helps demonstrate understanding of number format objective
	 * @param formatNo - the number to format
	 */
	public void testNumberFormat(double formatNo){
		//create locales
		Locale locDK = new Locale("da", "DK");
		Locale locJP = new Locale("ja", "JP");
		
		//format the passed number
		System.out.println("Starting to format the given number: " + formatNo);
		NumberFormat []  formats = new NumberFormat[4];
		formats[0] = NumberFormat.getInstance();
		formats[1] = NumberFormat.getInstance(locDK);
		formats[2] = NumberFormat.getCurrencyInstance();
		formats[3] = NumberFormat.getCurrencyInstance(locJP);
		
		for (int i=0; i<formats.length; i++) {
			System.out.println(i + ": " + formats[i].format(formatNo));
		}
		
		//use other methods of format and attempt to parse
		NumberFormat nf1 = NumberFormat.getInstance(locDK);
		float fltOne = 123456.789f;
		nf1.format(fltOne);
		System.out.println("Maximum frac digits:  " + nf1.getMaximumFractionDigits());
		System.out.println("Maximum int digits:  " + nf1.getMaximumIntegerDigits());
		nf1.setMaximumFractionDigits(3);
		
		System.out.println("Attempting to parse... ");
		String intValue = "123.456.789";
		
		try {
			System.out.println(nf1.parse(intValue));
		} catch (ParseException e) {
			System.err.println("Error parsing the string into a number: " + e);
		}
	}
}
