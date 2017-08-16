package com.java.training.inheritance.processor;

import java.io.IOException;
import java.io.InputStream;

/****************************************************************************
 * Title: MyProcessor.java <p/>
 * Project: JavaSandBox <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2015<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Apr 16, 2015
 ****************************************************************************/

public class MyProcessor extends URLProcessorBase {

	/* (non-Javadoc)
	 * @see com.java.training.inheritance.processor.URLProcessorBase#processURLData(java.io.InputStream)
	 */
	@Override
    protected void processURLData(InputStream input) throws IOException {
        int data = input.read();
        while(data != -1){
            System.out.println((char) data);
            data = input.read();
        }
    }

}
