package com.java.explore;
/****************************************************************************
 * Title: EnumTest.java <p/>
 * Project: JavaSandBox <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Mar 4, 2016
 ****************************************************************************/

public class EnumTest {
	
	//declare enum
	public enum Sizes{
		BIG, MEDIUM, SMALL
	}
	
	public static void main(String[] args){
		System.out.println(Sizes.BIG instanceof Enum);
		System.out.println(Sizes.MEDIUM);
		System.out.println(Sizes.SMALL);
	}

}