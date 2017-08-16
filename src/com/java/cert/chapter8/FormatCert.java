package com.java.cert.chapter8;
//cert libs
import com.java.cert.chapter.OCP.OCPObjectiveInterface;

/****************************************************************************
 * Title: FormatCert.java <p/>
 * Project: JavaCert <p/>
 * Description: Test certification knowledge of formatting and tokenizing<p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Nov 8, 2016
 ****************************************************************************/

public class FormatCert implements OCPObjectiveInterface {
	
	//Member variables that represent the parts of the format string
	private String formatArgNo;
	private String formatOptions;
	private ConversionChar formatConverChar;
	private StringBuilder completeFormatString;
	
	/**
	 * The variable type enum for later formatting operations
	 */
	private enum ConversionChar{
		CHARACTER("c"), //Make uppercase to apply uppercasing 
		STRING("s"), //Make uppercase to apply uppercasing 
		DIGIT("d"), //applies for byte, short, integer and long
		FLOAT("f"); //applies for both floats and doubles 
		
		private String conversionChar;
		private ConversionChar(String conversionChar){
			this.conversionChar = conversionChar;
		}
		
		//getters
		public String getConversionChar(){
			return this.conversionChar;
		}
	}
	
	/**
	 * Initializes class with parts needed for a complete format string
	 * @param formatArgNo
	 * @param formatOptions
	 * @param formatConverChar
	 */
	public FormatCert(String formatArgNo, String formatOptions, 
			ConversionChar formatConverChar){
		this.formatArgNo = formatArgNo;
		this.formatOptions = formatOptions;
		this.formatConverChar = formatConverChar;
		//attempt to construct the complete format string based on values
		this.initFormatString();
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.java.cert.chapter.general.CertInterface#run()
	 */
	public void run(){
		//void for now(think about having test format as the interface method)
	}
	
	/**
	 * Assembles a complete format string for later formatting
	 */
	private void initFormatString(){
		completeFormatString = new StringBuilder(100);
		completeFormatString.append(this.formatArgNo).
		append(this.formatOptions).
		append(this.formatConverChar.getConversionChar());
		System.out.println("The completed format string: " + this.completeFormatString.toString());
	}
	
	/**
	 * Takes a string data formatter to help format data in a specific way
	 * @param formatString
	 */
	private void testFormat(Object data){
		System.out.println("Beginning to format data...");
		System.out.format("The formatted data: " + completeFormatString.toString(), data);
		/*Warning: will blow up if conversion char is a mismatch 
		 * Also not all flags can be applied to every conversion char type
		 * i.e. 0 ) , won't work for Strings  
		*/
		
		//perform a look up to determine the formatting type
//		String temp = null;
//		for(ConversionChar val : ConversionChar.values()){
//			if(val == type){
//				temp = this.formatString + val.getConversionChar();
//			}
//		}
/*		System.out.println("The full format value to apply is: " + temp);*/
		
//		//format using both format() and printf() methods
//		System.out.println("Outputting using format() method: ");
//		System.out.format(temp + "\n", data);
//		System.out.println("Outputting using printf() method: ");
//		System.out.printf(temp + "\n", data);
	}
	
	/**
	 * Main method helpful for debugging and testing
	 * @param args
	 */
	public static void main(String[] args){
		FormatCert ftc = new FormatCert("%1$", "0,10", ConversionChar.DIGIT);
		//TODO - Add var args to allow formatting multiple inputs
		//pass data to format in the same way
		//ftc.testFormat(-124.546);
		ftc.testFormat(105548);
		//ftc.testFormat("SimpleTest");
	}

	/**
	 * @return the formatArgNo
	 */
	public String getFormatArgNo() {
		return formatArgNo;
	}

	/**
	 * @param formatArgNo the formatArgNo to set
	 */
	public void setFormatArgNo(String formatArgNo) {
		this.formatArgNo = formatArgNo;
	}

	/**
	 * @return the formatOptions
	 */
	public String getFormatOptions() {
		return formatOptions;
	}

	/**
	 * @param formatOptions the formatOptions to set
	 */
	public void setFormatOptions(String formatOptions) {
		this.formatOptions = formatOptions;
	}

	/**
	 * @return the formatConverChar
	 */
	public ConversionChar getFormatConverChar() {
		return formatConverChar;
	}

	/**
	 * @param formatConverChar the formatConverChar to set
	 */
	public void setFormatConverChar(ConversionChar formatConverChar) {
		this.formatConverChar = formatConverChar;
	}

	/**
	 * @return the completeFormatString
	 */
	public StringBuilder getCompleteFormatString() {
		return completeFormatString;
	}
}
