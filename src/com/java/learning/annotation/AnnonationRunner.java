package com.java.learning.annotation;
/****************************************************************************
 * Title: AnnonationRunner.java <p/>
 * Project: JavaCert <p/>
 * Description: Demonstrates the use of annotations through reflection.
 * This class should be properlly annotated to allow reflection to occur.s <p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Feb 1, 2017
 ****************************************************************************/

public class AnnonationRunner {

	@CanRun(id = 1, name = "firstMethod")
	public void methodOne(){
		System.out.println("Calling method one");
	}
	
	public void methodTwo(){
		System.out.println("Calling method two");
	}
	
	@CanRun(id = 3, name = "thirdMethod")
	public void methodThree(){
		System.out.println("Calling method three");
	}
}
