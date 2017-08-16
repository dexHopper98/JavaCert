package com.java.enums;
/****************************************************************************
 * Title: EnumTest.java <p/>
 * Project: JavaSandBox <p/>
 * Description: Test out enums and how they work<p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since May 19, 2016
 ****************************************************************************/

public class EnumTest {
	
    public enum Section{
    	TYPE, HEADER, TOPICS, SEMINAR;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("The first enum :" + Section.TYPE);
		System.out.println("The second enum :" + Section.HEADER);
	}

}
