package com.java.cert.chapter9.NIO2;

//jdk 1.7
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

//java cert libs
import com.java.cert.chapter.OCP.OCPObjectiveInterface;

/****************************************************************************
 * Title: NIOAdvancedObjective.java <p/>
 * Project: JavaCert <p/>
 * Description: Demonstrates knowledge of NIO.2 objectives, inlcuding Path, Paths
 * and Files usage.<p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jan 8, 2017
 ****************************************************************************/

public class NIOAdvancedObjective implements OCPObjectiveInterface {
	
	/*
	 * Used for transportation of data between this class and other objects
	 */
	private Map<String, Object> attributes;
	public final static String WRITE_DIRECTORY = "write directory"; 
	
	/**
	 * Constructor to initialize class with attributes
	 * @param attributes
	 */
	public NIOAdvancedObjective(Map<String, Object> attributes) {
		if(attributes == null){//ensure map is set
			this.attributes = new HashMap<>();
			return;
		}
		this.attributes = attributes;
	}
	
	
	/* (non-Javadoc)
	 * @see com.java.cert.chapter.OCP.OCPObjectiveInterface#run()
	 */
	@Override
	public void run() throws IOException {
		pathBasics();
		testFileAttributes();
	}
	
	/**
	 * Demonstrates the basics of dealing with Paths. Includes creating files and
	 * directories, copying/modify/delete, and looping through a directory.
	 * @throws IOException
	 */
	private void pathBasics() throws IOException{
		//grab the directory on file disk to create/write to
		String dirLocation = (String) this.attributes.get(WRITE_DIRECTORY);
		if(dirLocation == null) dirLocation = "writeDirectory/";
		
		System.out.println("The directory to write to: " + dirLocation);
		Path outDir = Paths.get(dirLocation);
		
		if(Files.exists(outDir)){//list time last modified and the owner
			System.out.println("Time last modified: " + Files.getLastModifiedTime(outDir));
			System.out.println("Owner: " + Files.getOwner(outDir));
		}else{//simply create the file and assign an owner
			Files.createDirectory(outDir);
			UserPrincipalLookupService lookupService = FileSystems.getDefault().getUserPrincipalLookupService();
		    UserPrincipal devon = lookupService.lookupPrincipalByName("dfranklin");
		    Files.setOwner(outDir, devon);
		}		
		//create two new files within that directory
		Path p1 = Paths.get(outDir + "/fileOne.txt");
		Path p2 = Paths.get(outDir + "/fileTwo.txt");
		createIfNotExist(p1); 
		createIfNotExist(p2);
		
		//write different data out to each file
		List<String> lines = new ArrayList<>();
		lines.add("Test line of text");
		lines.add("More test line of text");
        //copy out file before attempting to write 
		Path copyDir = Paths.get(outDir + "/temp/");
		if(!Files.exists(copyDir)){
			Files.createDirectory(copyDir);	
		}
		Path copy = Paths.get(copyDir + "/tempFile.txt");
		Files.copy(p1, copy, StandardCopyOption.REPLACE_EXISTING);
		
		//write to files
		Files.write(copy, lines, Charset.forName("UTF-8"), StandardOpenOption.APPEND);
		Files.write(p2, lines, Charset.forName("UTF-8"), StandardOpenOption.APPEND);
		
		//Read from a file
		List<String> input = Files.readAllLines(p1, Charset.defaultCharset());
		System.out.println("Reading from file: " + p1.getFileName());
		for (String in : input) {
			System.out.println(in);
		}
		System.out.println();
		
		//loop through directory
		Path dir = Paths.get(outDir.toString());
		DirectoryStream<Path> dirList = Files.newDirectoryStream(dir, "*Two.txt");
		for (Path path : dirList) {
			System.out.println(path);
		}
	}
	/**
	 * Test knowledge of reading and setting file attributes using BasicFileAttributes,
	 * Files, and PosixFileAttributes
	 * @throws IOException
	 */
	private void testFileAttributes() throws IOException{
		//create some paths
		Path pathOne = Paths.get("/home/dfranklin/Documents/JavaFiles/DirToWatch/dataOne.html");
		createIfNotExist(pathOne);
		//update the simplest attributes using Files
		FileTime now = FileTime.fromMillis(new Date().getTime());
		Files.setLastModifiedTime(pathOne, now);
		System.out.println("Last modified time of path one: " + Files.getLastModifiedTime(pathOne));
		System.out.println("Is the file readable: " + Files.isReadable(pathOne));
		System.out.println("Is the file writeable: " + Files.isWritable(pathOne));
		System.out.println("Is the file executeable: " + Files.isExecutable(pathOne));
		
		//read the basics using BasicFileAttributes
		BasicFileAttributes basic = Files.readAttributes(pathOne, BasicFileAttributes.class);
		System.out.println("File's creation time: " + basic.creationTime());
		System.out.println("File's last access time: " + basic.lastAccessTime());
		System.out.println("File's last modified time: " + basic.lastModifiedTime());

		//update the basics using BasicFileAttributeView
		BasicFileAttributeView bshit = Files.getFileAttributeView(pathOne, BasicFileAttributeView.class);
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.YEAR, -10);
		cal.add(Calendar.MONTH, 3);
		FileTime fileTime = FileTime.fromMillis(cal.getTimeInMillis());
 		bshit.setTimes(fileTime, null, fileTime);
 		System.out.println("The creation time after modifying: " + Files.getLastModifiedTime(pathOne));
		
 		//set file permission attributes for Unix/Linux/Mac
 		Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rwxrw-r--");
 		Files.setPosixFilePermissions(pathOne, perms);
 		PosixFileAttributes posix = Files.readAttributes(pathOne, PosixFileAttributes.class);
 		System.out.println("Permissions: " + posix.permissions());
 		System.out.println("Group name: " + posix.group());
 		Files.deleteIfExists(pathOne);
	}

	/**
	 * Attempts to create a file if it does not already exist. Returns true if
	 * successfully created the file.
	 * @param file
	 * @return
	 */
	public boolean createIfNotExist(Path file){
		boolean created = false;
		if(!Files.exists(file)){//create the file
			try {
				Files.createFile(file);
				created = true;
			} catch (IOException e) {
				System.err.println("Error attempting to create file: " + e);
			}
		}
		return created;
	}

	/**
	 * @return the attributes
	 */
	public Map<String, Object> getAttributes() {
		return attributes;
	}
	
	/**
	 * 
	 * @param name
	 * @param value
	 */
	public void setAttribute(String name, Object value){
		this.attributes.put(name, value);
	}
	/**
	 * 
	 * @param name
	 * @return
	 */
	public Object getAttribute(String name){
		return this.attributes.get(name);
	}
	/**
	 * 
	 * @param name
	 */
	public void removeAttribute(String name){
		this.attributes.remove(name);
	}
	
}
