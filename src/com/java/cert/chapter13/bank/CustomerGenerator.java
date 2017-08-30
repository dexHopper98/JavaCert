package com.java.cert.chapter13.bank;

//java IO 
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//jdk 1.8
import java.util.ArrayList;
import java.util.List;

/****************************************************************************
 * Title: CustomerGenerator.java <p/>
 * Project: JavaCert <p/>
 * Description: Utility type class that generates a set number of Customer Objects <p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Aug 23, 2017
 ****************************************************************************/

public class CustomerGenerator {
	private List<Customer> customers;
	private String fileLoc;
	
	/**
	 * Constructor initializes with a file location
	 * @param fileLoc
	 */
	public CustomerGenerator(String fileLoc){
		customers = new ArrayList<>();
		this.fileLoc = fileLoc;
	}
	
	/**
	 * Returns a generated list of customers
	 * @param numberToGenerate - number of customers to add to listing
	 * @return
	 */
	public  List<Customer> generateCustomers(){		
		//read through each line
		readFile();
		
		//generate a new customer object based on each line
		
		//add to a corresponding credit history object
		
		//add to collection
		
		return customers;
	}
	
	protected void readFile(){
		try(BufferedReader br = new BufferedReader(new FileReader(fileLoc))) {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator());
		        line = br.readLine();
		    }
		    String everything = sb.toString();
		    System.out.println(everything);
		}catch(IOException e){
			System.err.println("Error attempting to read file: " + fileLoc);
		}
	}
	
	public static void main(String...args){
		String file = "input/bankApp/bankCustomers.txt";
		CustomerGenerator cg = new CustomerGenerator(file);
		cg.generateCustomers();
	}
	
}
