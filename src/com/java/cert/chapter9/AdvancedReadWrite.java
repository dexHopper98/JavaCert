package com.java.cert.chapter9;

//java I/O
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

/****************************************************************************
 * Title: AdvancedReadWrite.java <p/>
 * Project: JavaCert <p/>
 * Description: Demonstrates higher-level wrapper classes that manage reading
 * and writing for files.<p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Dec 21, 2016
 ****************************************************************************/

/*this class shall use the correctly returned instance of a high level writer
*based on the user criteria. Then shall read/write to the file/stream appropriately
*with the desired data
*/		
public class AdvancedReadWrite extends SimpleReadWrite{
	
	/*
	 * Enum specifying the appropriate Java class types that can be written to
	 */
	private enum writeOutTypes {
		String("java.lang.String"), File("java.io.File"), OutputStream("java.io.OutputStream");
		private String className;
		private writeOutTypes(String className){
			this.className = className;
		}
	}	
	
	//should be able to write to file, stream, or string
	/**
	 * 
	 * @param out
	 * @param writeData
	 */
	public void write(Object out, StringBuffer writeData){
		this.write(out, null);
	}
	
	public void write(Object out, StringBuffer writeData, String formatString){
		//ensure out is of type String, File, or Stream
		boolean validType;
		try {
			validType = this.validateOutput(out, formatString);
			if(!validType){
				System.out.println("Cannot write to out to given class: ");
				return;
			}	
			
			//write the data out to the medium
		} catch (IOException e) {
			System.err.println("Error attempting to create writer object");
		}	
	
	}
	
	//should be able to read from file
	public void read(File file){
		//create file reader to hold th file
		
		//wrap the file reader with a buffer
		
		//read out the data
	}
	
	/**
	 *Determines if the object passed in is of the correct 'out' type 
	 * @param out
	 * @return
	 * @throws IOException 
	 */
	private boolean validateOutput(Object out, String formatString) throws IOException{
		boolean isValid = true;
		//check types and create the appropriate writer type
		if(out instanceof File){
			File file = (File) out;
			if(formatString == null){
				BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			}else{
				PrintWriter pw = new PrintWriter(file);
			}		
		}else if(out instanceof String){
			PrintWriter pw = new PrintWriter((String) out);
		}else if(out instanceof OutputStream ){
			PrintWriter pw = new PrintWriter( (OutputStream) out);
		}else{
			isValid = false;
			System.err.print("The passed object is not of appropriate types of: ");
			for (writeOutTypes type : writeOutTypes.values()) {
				System.err.print(type + " ");
			} 					
		}		
		return isValid;
	}
	
	/**
	 * Main method for quick testing and debugging
	 * @param args
	 */
	public static void main(String[] args){
		//TODO remove this method
		File myFile = new File("/home/dfranklin/Documents/JavaFiles/fileWriteRead/advancedWriteTest.txt");
		//Create the data to write out
		StringBuffer sb = new StringBuffer(100);
		AdvancedReadWrite adw = new AdvancedReadWrite();
		adw.write(myFile, sb);
	}	
}
