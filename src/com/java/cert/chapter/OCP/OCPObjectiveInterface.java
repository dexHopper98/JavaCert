package com.java.cert.chapter.OCP;
/****************************************************************************
 * Title: OCPObjectiveInterface.java <p/>
 * Project: JavaCert <p/>
 * Description: Defines the base definition of what a certification tester class
 * should be<p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Nov 8, 2016
 ****************************************************************************/

public interface OCPObjectiveInterface {
	
	/**
	 * The central control point for all certification testing
	 */
	public abstract void run() throws Exception;
}
