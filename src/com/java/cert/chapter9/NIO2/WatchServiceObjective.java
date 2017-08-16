package com.java.cert.chapter9.NIO2;

//IO/NIO libs
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

//cert libs
import com.java.cert.chapter.OCP.OCPObjectiveInterface;

/****************************************************************************
 * Title: WatchServiceObjective.java <p/>
 * Project: JavaCert <p/>
 * Description: Demonstrates knowledge of WatchService <p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Feb 4, 2017
 ****************************************************************************/

public class WatchServiceObjective implements OCPObjectiveInterface {

	/* (non-Javadoc)
	 * @see com.java.cert.chapter.OCP.OCPObjectiveInterface#run()
	 */
	@Override
	public void run() throws Exception {
		Path dir = Paths.get("/home/dfranklin/Documents/JavaFiles/DirToWatch");
		testWatchService(dir, StandardWatchEventKinds.ENTRY_DELETE, "DirToDelete");
	}
	
	/**
	 * Main method, useful for testing and debugging
	 * @param args
	 */
	public static void main(String[] args){
		WatchServiceObjective wso = new WatchServiceObjective();
		try {
			wso.run();
		} catch (Exception e) {
			System.err.println("Error attempting to run class: " + e);
		}
	}
	
	/**
	 * Uses the WatchService object to register an event type on a given directory
	 * @param dirToWatch
	 * @param eventType
	 * @param dirToMatch
	 * @throws IOException 
	 */
	private void testWatchService(Path dirToWatch, Kind<?> eventType, 
			String dirToMatch ) throws IOException{
		//ensure we have a vaild directory
		if(!Files.exists(dirToWatch)){
			System.out.println("Not a vaild file/directory given. Ending");
			return;
		}
		System.out.println("Starting the watch service....");
		//get watch service for the file system
		WatchService watcher = FileSystems.getDefault().newWatchService();
		
		//register the event to watch for
		dirToWatch.register(watcher, eventType);
		
		//loop until no longer interested in events
		while(true){
			WatchKey key = null;
			try {
				key = watcher.take();
				System.out.println("Polling for events...");
				//poll for events and do something
				for(WatchEvent<?> event : key.pollEvents()){
					WatchEvent.Kind<?> kind = event.kind();
					System.out.println("The kind of event name: " + kind.name());
					System.out.println("The kind of event type: " + kind.type());
					System.out.println("The kind of event name: " + event.context());
					String pathName = event.context().toString();
					if(pathName.equals(dirToMatch)){
						System.out.println("Path name: " + pathName);
						System.out.println("We our directory has been deleted! We can now begin.");
						return; //end looping
					}
				}
				//reset the watcher
				key.reset();
			} catch (InterruptedException e) {
				System.err.println("WatchService interrupted searching for events: + e");
			}	
		}
	}

}
