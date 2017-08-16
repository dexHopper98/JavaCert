package com.java.cert.chapter9;

//java i/o
import java.io.Console;

/****************************************************************************
 * Title: ConsoleCert.java <p/>
 * Project: JavaCert <p/>
 * Description: Demonstrates chapter knowledge of the Console class. Console
 * class is used directly interact with the command line. Unit testing or application
 * specific class testing are good use cases.<p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Dec 12, 2016
 ****************************************************************************/

public class ConsoleCert {
	public static void main(String[] args){
		String name = "";
		char[] psw;
		Console con = System.console();
		if(con == null) {//safety check for if app doesn't have access to Console
			System.out.println("Application does not have access to console. Ending.");
			System.exit(0);
		}
		
		//attempt to read the password(simply calling this method causes the 
		//input, from the console, to be non-echoed)
		psw = con.readPassword("%s", "Password: ");
		
		//log the type password back to user
		for (char c : psw) {
			con.format("%c", c);
		}
		con.format("\n");
		
		//create a simple utility class to do some quick testing
		
		//attempt to read line from command line
		
		//log whatever the user typed back out, along with the utility class
		String myVal;
	}
}
