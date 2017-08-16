package com.java.cert.chapter7;
/****************************************************************************
 * Title: Assertion.java <p/>
 * Project: JavaSandBox <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Apr 9, 2016
 ****************************************************************************/

public class Assertion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x, j, v = 0;
		j=4+5; x=j*2; v=++v*x;
		assert(v <= 15) : "The value of v is " + v;//want to make the assertion to fail
		System.out.println(x);
	}
}
