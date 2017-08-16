package com.java.app.student;
/****************************************************************************
 * Title: StudentBuilder.java <p/>
 * Project: JavaCert <p/>
 * Description: Example class of a builder class design pattern. This class is
 * responsible for creating a complete Student object to allow calling clients
 * to more easily instantiate a Student. <p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jan 6, 2017
 ****************************************************************************/

public class StudentBuilder {

	/**
	 * Main method for testing and debugging
	 * @param args
	 */
	public static void main(String[] args) {
		//build the student
	}
	
	public Student buildStudent(){
		Student student = new Student();
		return student;
	}

}
