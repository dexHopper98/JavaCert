package com.java.cert.chapter8;

//jdk 1.7.x
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/****************************************************************************
 * Title: RegexTest.java <p/>
 * Project: JavaSandBox <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since May 1, 2016
 ****************************************************************************/

public class RegexTest {
	
	/**
	 * The Quantifier enum for description, ease of use, and testing
	 * @author dfranklin
	 */
	private enum Quantifiers {
		WILDCARD("*", "Zero to many occurrences"), 
		QUESTION_MARK("?", "Zero or single occurence(non-plural)"), 
		PLUS_SYMBOL("+", "One or more occurrences");
		
		//member variables
		private String value;
		private String descriptionTxt;
		/**
		 * Enum constructor
		 * @param value
		 * @param descriptionTxt
		 */
		Quantifiers(String value, String descriptionTxt){
			this.value = value;
			this.descriptionTxt = descriptionTxt;
		}
		/*===getters===*/
		public String getQuantifierValue() {
			return value;
		}
		public String getDescriptionTxt() {
			return descriptionTxt;
		}
	};
	
	/**
	 * The main method, used for stand-alone testing for certification class
	 * @param args
	 */
	public static void main(String[] args) {
		RegexTest rgTest = new RegexTest();
		rgTest.run();
	}
	
	/**
	 * The common control point for all certification classes. The test methods
	 * defined in the cert. class should be called through here.
	 */
	public void run(){
		RegexTest rgTest = new RegexTest();
		String data = "(303)-456-7845, (720)-147-7846, (789)-132-4545, $456.00, $7fd546, $fd$$$45, (720),156,7845";
		String data2 = "proje1.html, project45, proje1.java, proje2.jsp, proje1.jsp, projeScope, randomText";
		//set up some base patterns
		String searchPhoneNoPattern = "\\(\\d{3}\\)[-,]?\\d{3}[-,]?\\d{4}";
		String searchCurrencyPattern = "\\$\\d"; //$ Apparently has kind of special meaning to the regex engine. Research later.
		String searchFilePattern = "(proje1\\.html)|(proje1.java)|(proje2.jsp)";
		rgTest.searchUseQuantifier(Quantifiers.PLUS_SYMBOL, data, searchPhoneNoPattern);
	} 
	
	/**
	 * Test out the using regex with ranges
	 */
	public void searchUseRanges(){
		String source = "afAbcd$$#F0563";
		String expression = "[0 [^a-f5-9] [A-F]]";//use inner brackets with caret
		/*NOTE: The placement of brackets makes a big difference in terms of 
		searching, if the outer brackets are removed then it treats expression as first
		letter =0, 2nd letter =, 3rd letter = etc. While if the outer brackets are kept in
		place it creates everything as one big single expression and finds any matches
		that pass any of these inner test.
		*/
		
		Pattern p = Pattern.compile(expression);
		Matcher m = p.matcher(source);
		
		while(m.find()){
			System.out.print("Match found using a range : " + m.start());
			System.out.println(" The token chuck is: " + m.group());
		}
	}
	
	/**
	 * Test chapter knowledge on using quantifiers. Sets up some base patterns
	 * for consistent testing, then modifies those patterns based on the quantifier
	 * to demonstrate difference of output between each
	 * @param quantifier
	 * @param sourceData
	 * @param patternChoice
	 */
	public void searchUseQuantifier(Quantifiers quantifier, String sourceData, String pattern){
		
		//append the pattern to the given quantifier
		String patternToTest = pattern + quantifier.getQuantifierValue();
		System.out.println("Beginning to test the with source data of: " + sourceData);
		System.out.print("The pattern to test: " + patternToTest);
		System.out.println(" Info: " + quantifier.getDescriptionTxt());
		
		//show the start location with the group(token) data
		Pattern p1 = Pattern.compile(patternToTest.toString());
        Matcher m1 = p1.matcher(sourceData);
        int counter = 0;
        while(m1.find()){
        	System.out.print("We have a match! : Position is: " + m1.start());
        	System.out.println(" Region data: " + m1.group());
        	counter++;
        }
	}
}
