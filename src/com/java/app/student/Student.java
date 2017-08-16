package com.java.app.student;
/****************************************************************************
 * Title: Student.java <p/>
 * Project: JavaCert <p/>
 * Description: Example<p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jan 6, 2017
 ****************************************************************************/

public class Student {
	private String name;
	private int age;
	private String favoriteSubject;
	
	/**
	 * no arg constructor for initialization
	 */
	public Student(){
		super();
	}
	/**
	 * s
	 * @param name
	 * @param age
	 * @param favoriteSubject
	 */
	public Student(String name, int age, String favoriteSubject){
		this.name = name;
		this.age = age;
		this.favoriteSubject = favoriteSubject;
	}
	
	public Student[] generateStudentArray(){
		Student[] students = new Student[5];
		//fill the array
		students[0] = new Student("Sam", 17, "english");
		
		return students;
	}
	
	/**==================Getters/Setters=========================*/
	/**
	 * 
	 * @param name
	 * @return
	 */
	public Student name(String... options){
		//this.name = name;
		return this;
	}
	public Student favoriteSubject(String favoriteSubject){
		this.favoriteSubject = favoriteSubject;
		return this;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the favoriteSubject
	 */
	public String getFavoriteSubject() {
		return favoriteSubject;
	}

	/**
	 * @param favoriteSubject the favoriteSubject to set
	 */
	public void setFavoriteSubject(String favoriteSubject) {
		this.favoriteSubject = favoriteSubject;
	}
	
}
