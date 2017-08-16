package com.java.cert.chapter5;

import java.util.ArrayList;

/****************************************************************************
 * Title: DamnArrayList.java <p/>
 * Project: JavaSandBox <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2015<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Nov 16, 2015
 ****************************************************************************/

public class DamnArrayList {

	public void createList(){
		ArrayList<String> sal = new ArrayList<String>();
		
		//add values
		sal.add("nick");
		sal.add("christian");
		sal.add(0, "devon");
		
		for(String val: sal){
			System.out.println(val);
		}
	}
	
	public void simpleStringTest(){
		String first = "abc";
		String second = first;
		
		System.out.println(first + second );
		System.out.println(first == second);
		
		//Change value of first
		first += "d";
		
		System.out.println(first + second );
		System.out.println(first == second);
		
	}
}
