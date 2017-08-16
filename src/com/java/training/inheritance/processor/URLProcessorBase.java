package com.java.training.inheritance.processor;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/****************************************************************************
 * Title: URLProcessorBase.java <p/>
 * Project: JavaSandBox <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2015<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Apr 16, 2015
 ****************************************************************************/

public abstract class URLProcessorBase implements URLProcessor {

	/* (non-Javadoc)
	 * @see com.java.training.inheritance.processor.URLProcessor#process(java.net.URL)
	 */
	@Override
	  public void process(URL url) throws IOException {
        URLConnection urlConnection = url.openConnection();
        InputStream input = urlConnection.getInputStream();

        try{
            processURLData(input);
        } finally {
            input.close();
        }
    }
	
	/**
	 * Defines how data from a url request should be processed
	 * @param input	
	 */
	protected abstract void processURLData(InputStream input) throws IOException;

}
