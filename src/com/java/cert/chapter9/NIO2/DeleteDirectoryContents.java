package com.java.cert.chapter9.NIO2;

//NIO libs
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/****************************************************************************
 * Title: DeleteDirectoryContents.java <p/>
 * Project: JavaCert <p/>
 * Description: Extends the SimpleFileVistor to recursively delete all the contents
 * from a given directory.<p/>
 * Copyright: Copyright (c) 2013<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Feb 3, 2013
 ****************************************************************************/

public class DeleteDirectoryContents extends SimpleFileVisitor<Path> {
	
	/*
	 * (non-Javadoc)
	 * @see java.nio.file.SimpleFileVisitor#visitFile(java.lang.Object, java.nio.file.attribute.BasicFileAttributes)
	 */
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException{
		System.out.println("Visiting file: " + file.getFileName());
		//log the basic attributes of each file
		System.out.println("File creation date: " + attrs.creationTime());
		System.out.println("File last updated date: " + attrs.lastModifiedTime());
		System.out.println("File last viewed: " + attrs.lastAccessTime());
		
		//delete if the file extension is a .txt
		if(file.getFileName().toString().contains(".txt")){
			System.out.println("Removing file: ");
			Files.delete(file);
		}
		return FileVisitResult.CONTINUE;
	}
	
	/*
	 * (non-Javadoc)
	 * @see java.nio.file.SimpleFileVisitor#preVisitDirectory(java.lang.Object, java.nio.file.attribute.BasicFileAttributes)
	 */
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException{
		System.out.println("Visiting directory: " + dir.getFileName());
		return FileVisitResult.CONTINUE;
	}
}
