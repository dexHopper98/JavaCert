package com.java.cert.chapter9;

//java i/o
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

import com.java.cert.chapter9.NIO2.DeleteDirectoryContents;
import com.java.cert.chapter9.NIO2.NIOAdvancedObjective;
import com.java.cert.tester.CertInterface;

/****************************************************************************
 * Title: Chapter9CertTest.java <p/>
 * Project: JavaCert <p/>
 * Description: Implementing class to test all various aspects of Chapter 9
 * certification knowledge<p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Nov 29, 2016
 ****************************************************************************/

public class Chapter9CertTest implements CertInterface {

	private static final String WRITE_DIRECTORY_PATH = "/home/dfranklin/Documents/JavaFiles/fileWriteRead/";
	
	/* (non-Javadoc)
	 * @see com.java.cert.testItOut.TIOInterface#testItOut()
	 */
	@Override
	public void testChapterKnowledge() {
		/*test IO. In a real app will want to allow the file path/name and text
		to write to be passed to this "controller" class*/
		StringBuffer textToWrite = new StringBuffer(50);
		textToWrite.append("Hello there user.\nYour information has been stored.\n");
		textToWrite.append("This information is secure and will be used later. Thanks!\n ");
		testIO("fileWriteTest.txt", textToWrite); 
		
	}
	
	/**
	 * Test general knowledge concerning simple IO operations
	 * @param fileName - The name of the file to either create or manipulate
	 */
	private void testIO(String fileName, StringBuffer textToWrite){
		//test knowledge of low-level IO
		File file = new File(WRITE_DIRECTORY_PATH + fileName);
		SimpleReadWrite frw = new SimpleReadWrite(file);
		frw.writeToFile(textToWrite.toString());
		
		System.out.println("Attempting to read from file....");
		frw.readFromFile(textToWrite.length());
		
		//test knowledge of high-level IO
		
		//test knowledge of PrintWriter
		
		//test knowledget of Console
	}
	
	private void testNIO(){	
		HashMap<String, Object> attr = new HashMap<>();
		//store the directory to write to in it's attributes map
		//attr.put(NIOAdvancedObjective.WRITE_DIRECTORY, "/home/dfranklin/Documents/JavaFiles/NIO2");
		attr.put(NIOAdvancedObjective.WRITE_DIRECTORY, "/home/dfranklin/Documents/JavaFiles/NIO2Read");
		
		NIOAdvancedObjective nio = new NIOAdvancedObjective(attr);
		
		//call it's run method
		try {
			nio.run();
		} catch (IOException e) {
			System.out.println("Error attempting to manipulate file on disk: " + e);
		}
	}
	
	/**
	 * Demonstrates ability to use the FileVisitor and the WatchService classes
	 * @param dir - The directory to recursively search through
	 * @throws IOException 
	 */
	private void testFileVisitor(Path dir) throws IOException{
		DeleteDirectoryContents ddc = new DeleteDirectoryContents();
		Files.walkFileTree(dir, ddc);
	}
	
	/**
	 * Main method useful for debugging and independent testing
	 * @param args
	 */
	public static void main(String[] args){		
		Chapter9CertTest chp9 = new Chapter9CertTest();
		chp9.testNIO();
		//visit a directory
//		try {
//			chp9.testFileVisitor(Paths.get("/home/dfranklin/Documents/JavaFiles/NIO2Read"));
//		} catch (IOException e) {
//			System.err.println("Failed to visiting given Path location: " + e);
//		}
	}
}
