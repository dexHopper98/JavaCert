package com.java.cert.tester;

//cert libs
import com.java.cert.chapter8.DateNumberCert;

/****************************************************************************
 * Title: Chapter8Tester.java <p/>
 * Project: JavaCert <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Oct 15, 2016
 ****************************************************************************/

public class Chapter8Tester extends AbstractCertBase {

	/* (non-Javadoc)
	 * @see com.java.cert.testItOut.TIOInterface#testItOut()
	 */
	@Override
	public void testChapterKnowledge() {
		System.out.println("Starting the certification tester for: " + this.getClass());
		
		//Test knowledge of dates and numbers with formatting

		//Test knowledge of regex, parsing and tokenzing
		
		//Test knowledge of locales
	}
	
	/**
	 * Main method useful for testing and debugging
	 * @param args
	 */
	public static void main(String...args){
		DateNumberCert dnc = new DateNumberCert();
		dnc.testDateAndFormat();		
	}

}
