package com.java.training.math;
/****************************************************************************
 * Title: MathTest.java <p/>
 * Project: JavaSandBox <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2015<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jul 30, 2015
 ****************************************************************************/

public class MathTest {

	public static void main(String[] args){
		MathTest mt = new MathTest();
		mt.modulusOperand();
	}
	
	public void doMathStuff(){
		
		int myInt = 100_000_4545;
	  //Find what a legal unicode is   char myChar = \u880011;
		char mySecondChar = 145;
		
		System.out.println(myInt);
		System.out.println(mySecondChar);
	}
	
    /**
     * Will perform modulus and division operation for testing purposes
     */
	public void modulusOperand(){
		
		int x = 18;
		int y = 4;
		
		int result = x % y;
		
		System.out.println("The modulus operation is " + result);
		
		result = x / y;
		
		System.out.println("The division operation is " + result);
	}
}
