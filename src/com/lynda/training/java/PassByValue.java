package com.lynda.training.java;

import static java.lang.System.out;
/****************************************************************************
 * <b>Title</b>: PassByValue.javaIncomingDataWebService.java <p/>
 * <b>Project</b>: New_StartRAMDataFeed <p/>
 * <b>Description: A crazy place to test things out!</b>
 * <b>Copyright:</b> Copyright (c) 2015<p/>
 * <b>Company:</b> Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since 3:16:53 AM<p/>
 * <b>Changes: </b>
 ****************************************************************************/

public class PassByValue {

		String myAwesomeString, mySecondString;
		
		/**
		 * The main method
		 * @param args
		 */
		public static void main(String[] args){
			go();
			//call class methods
			PassByValue myPass = new PassByValue();
			Boolean myBoolean = myPass.checkInstanceOf();
			out.println(myBoolean);
			
			PassByValue pbv = new PassByValue();
			Object obj = new PassByValue();
			
			//test if variable reference is instanceof Object
			if(pbv instanceof Object && obj instanceof Object){
				out.println("Truly an instance of Object.");
			}
		}
		
		/**
		 * GO, GO, GO
		 */
		public static void go(){
			int x = 3;
			int y = 2;
			System.out.println("In method go. x: " + x + " y: " + y);
			falseSwap(x,y);
			System.out.println("in method go. x: " + x + " y: " + y);
			moreParameters(x,y);
			System.out.println("in method go. x: " + x + " y: " + y);
		}
		
		/**
		 * 
		 * @param x
		 * @param y
		 */
		public static void falseSwap(int x, int y){	
			System.out.println("in method falseSwap. x: " + x + " y: " + y);
			// create variable called temp and assign it to value of x
			int temp = x;
			x = y;
			y = temp;
			System.out.println("in method falseSwap. x: " + x + " y: " + y);
		}
		
		/**
		 * 
		 * @param a
		 * @param b
		 */
		public static void moreParameters(int a, int b){	
			System.out.println("in method moreParameters. a: " + a + " b: " + b);
			a = a * b;
			b = 12;
			System.out.println("in method moreParameters. a: " + a + " b: " + b);
			falseSwap(b,a);
			System.out.println("in method moreParameters. a: " + a + " b: " + b);	
		}
		
		/**
		 * Deteremine reference variable is a type of another
		 * @return
		 */
		public Boolean checkInstanceOf(){
			return this instanceof Object;
		}
}
