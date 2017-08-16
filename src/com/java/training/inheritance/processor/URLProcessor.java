package com.java.training.inheritance.processor;

//JDK 1.7
import java.io.IOException;
import java.net.URL;

/****************************************************************************
 * Title: URLProcessor.java <p/>
 * Project: JavaSandBox <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2015<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Apr 16, 2015
 ****************************************************************************/

public interface URLProcessor {
	
	/**
	 * Defines how a request should be processed
	 * @param url
	 * @throws IOException
	 */
	public void process(URL url) throws IOException;
}
