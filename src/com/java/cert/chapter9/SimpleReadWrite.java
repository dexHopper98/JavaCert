package com.java.cert.chapter9;
//jdk 1.7
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/****************************************************************************
 * Title: SimpleReadWrite.java <p/>
 * Project: JavaCert <p/>
 * Description: Class demonstrates the low-level use of I/O<p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Nov 29, 2016
 ****************************************************************************/

public class SimpleReadWrite {
	
	/*
	 * The file object that represents the file on physical disk
	 */
	private File file;
	
	/**
	 * No arg-constructor
	 */
	public SimpleReadWrite(){
		//here so class can be instantiated without any arguments
	}
	public SimpleReadWrite(File file){
		this.file = file;
	}
	
	/**
	 * Writes to the file in a low-level approach
	 */
	public void writeToFile(String textToWrite){
		//ensure this file is not null, if so throw an error
		validateFile();
		//write to the file with the string value passed
		try(FileWriter fw = new FileWriter(this.file)){
			if(this.file.exists()) System.out.println("File already exist, simply writing to file");
			fw.write(textToWrite);			
			//give a confirmation message onced written
			System.out.println("File written to successfully.");
			fw.flush(); //flush to ensure everything is written out
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	/**
	 * Reads from a file in a low-level approach
	 * @param arrayIntSize - The correct int value to initialize the char array
	 * that will hold read characters from file from disk. 
	 */
	public void readFromFile(int arrayIntSize){
		//ensure this file is not null, if so throw an error
		validateFile();
		try(FileReader fRead = new FileReader(this.file)){
			//create char array from int value passed to initialize
			char[] in = new char[arrayIntSize];
			//Populate our array, and get back the size of characters read
			int size = fRead.read(in);
			System.out.println("The size of file being read: " + size);
			for (char c : in) {
				System.out.print(c);
			}
		} catch (IOException e) {
			System.err.println("Error occured while attempting to read file: " + e);
		}
	}
	
	/**
	 * Runs validation against the file attempting to be used is a valid file on disk
	 */
	private void validateFile(){
		//check if this File is null
		if(this.file == null){
			System.err.print("File object is not initialized. ");
			System.err.println("Please ensure you pass, or set, a valid file object. ");
			throw new IllegalArgumentException();
		}
		//check if this File object represents a directory
		if(this.file.isDirectory()){
			System.err.print("Current file points to a directory. Please ensure file ");
			System.err.println("object actually points to either a new file or to an existing file. ");
			throw new IllegalArgumentException();
		}
	}
	/**
	 * @return the file
	 */
	public File getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(File file) {
		this.file = file;
	}
}
