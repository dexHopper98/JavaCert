package com.java.cert.chapter8;
/****************************************************************************
 * Title: TokenizeCert.java <p/>
 * Project: JavaCert <p/>
 * Description: Demonstrates the certification knowledge of using tokenization<p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Nov 17, 2016
 ****************************************************************************/

public class TokenizeCert {

	public void run(){
		String in = "1 a2 b 3 c4d 5efg 6 iklmno";
		String [] chunks = in.split("\\d");
		
		System.out.println("Count " + chunks.length);
		for (String s : chunks) {
			System.out.println(">" + s + "< ");
		}
	}
	
	/**
	 * Main method useful for testing
	 * @param args
	 */
	public static void main(String[] args){
		TokenizeCert tk = new TokenizeCert();
		tk.run();
	}
}
