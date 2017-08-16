package com.java.cert.chapter9.NIO2;

//nio libs
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

//ocp cert libs
import com.java.cert.chapter.OCP.OCPObjectiveInterface;

/****************************************************************************
 * Title: PathMatcherObjective.java <p/>
 * Project: JavaCert <p/>
 * Description: Demonstrates certification knowledge of PathMatcher<p/>
 * Copyright: Copyright (c) 2013<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Feb 3, 2013
 ****************************************************************************/

public class PathMatcherObjective implements OCPObjectiveInterface{

	/* (non-Javadoc)
	 * @see com.java.cert.chapter.OCP.OCPObjectiveInterface#run()
	 */
	@Override
	public void run() throws Exception {
		
	}
	
	/**
	 * Main method, useful for testing and debugging
	 * @param args
	 */
	public static void main(String[] args){
		PathMatcherObjective pmo = new PathMatcherObjective();
		pmo.testMatching();
	}

	/**
	 * Test different matching scenarios using the PathMatch with globs
	 */
	private void testMatching(){
		Path p1 = Paths.get("/temp/java/file.java");
		Path p2 = Paths.get("file.java");
		System.out.println("Does path match: " + matches(p1, "glob:**/*.java"));
		System.out.println("Does path match: " + matches(p2, "glob:*.java"));

		//Match files with 3-4 letter extension(? is a wildcard but for a single character)
		Path p3 = Paths.get("/temp/users/other/profile.txt");
		Path p4 = Paths.get("/temp/users/other/profile.j#%a");
		Path p5 = Paths.get("/temp/users/other/profile.html");
		System.out.println("Does path 3 match: " + matches(p3, "glob:**/*.???"));
		System.out.println("Does path 3 match: " + matches(p3, "glob:**/*.????"));
		
		System.out.println("Does path 4 match: " + matches(p4, "glob:**/*.????"));
		System.out.println("Does path 5 match: " + matches(p5, "glob:**.????"));
		
		//match multiple patterns
		Path p6 = Paths.get("NemoBook");
		Path p7 = Paths.get("Aladdin-Book");
		System.out.println("Does path 6 match: " + matches(p6, "glob:{Nemo*, Aladdin-Book}"));
		System.out.println("Does path 6 match: " + matches(p6, "glob:{Nemo, Aladdin}*"));

		System.out.println("Does path 7 match: " + matches(p7, "glob:{NemoBook, AladdinBook}"));
		System.out.println("Does path 7 match: " + matches(p7, "glob:{Aladdin*, Nemo*}"));
		//Returns false. Seems the "or" is short circuit(does not jump to other side)
		System.out.println("Does path 7 match: " + matches(p7, "glob:{Nemo*, Aladdin*}"));
		System.out.println("Does path 7 match: " + matches(p7, "glob:{Nemo, Aladdin}*"));
		System.out.println("Does path 7 match: " + matches(p7, "glob:{NemoBook, Aladdin-Book}"));
	} 
	
	/**
	 * Helper method, determines if a given path matches glob expression
	 * @param path
	 * @param glob
	 * @return
	 */
	private boolean matches(Path path, String glob){
		PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
		return matcher.matches(path);
	}
}
