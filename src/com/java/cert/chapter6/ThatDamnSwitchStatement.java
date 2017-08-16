package com.java.cert.chapter6;


/****************************************************************************
 * Title: ThatDamnSwitchStatement.java <p/>
 * Project: JavaSandBox <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2015<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Nov 17, 2015
 ****************************************************************************/

public class ThatDamnSwitchStatement {

	static public void main(String[] args){
		ThatDamnSwitchStatement tds = new ThatDamnSwitchStatement();
		
		//switch on a value being returned from a method
		switchOnThat(tds.getAString());
		
		//switch on a value dynamically being calculated
		switchOnThat("Fred".toLowerCase().substring(0, 3));
		
		//switch on integer
		switchOnThat(4 * 50);
	}
	
	/**
	 * Creates a switch statement with use cases
	 * @param val
	 */
	public static void switchOnThat(String val){
		if(val == null || val.length() == 0){
			val = "yes";
		}
		
		//create switch statement
		switch(val){
		case "no": System.out.println("Value is no"); break;
		case "maybe": System.out.println("Value is maybe"); break;
		case "yes": System.out.println("Value is yes"); break;
		default: System.out.println("Make up your mind");
		
		}
	}
	
	/**
	 * Overloaded method of switchOnThat, takes a int value
	 * @param val - The value to switch on
	 */
	public static void switchOnThat(int val){
		//test to see if you can have dynamic  case statements
		//will only accept variable for case if it is final
		final int temp = 1;
		
		//create switch statement
		switch(val){
		case temp: val += val; break;
		case 2: val *= val; break;
		case 3: val -= val * val; break;
		case 4: val /= val * 4; break;
		default: val += val-= val *= val /= val;
		}
		
		System.out.print("Final value is " + val);
	}
		
		/**
		 * Returns a simple string
		 */
		public String getAString(){
			String x = "no";
			return x;
		}
		
}
