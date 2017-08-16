package com.lynda.training.java;
/****************************************************************************
 * Title: DelimitArray.java <p/>
 * Project: JavaSandBox <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jan 26, 2016
 ****************************************************************************/

public class DelimitArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// declares an array of strings
        String[] stringArray;
        stringArray = new String[5];
        
        stringArray[0] = "Site1";
        stringArray[1] = "Site2";
        stringArray[2] = "Site3";
        stringArray[3] = "Site4";
        stringArray[4] = "Site5";
        
        for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);
		}
	}

}
