package com.java.cert.tester;

//log4j
import org.apache.log4j.Logger;

/****************************************************************************
 * Title: AbstractCertBase.java <p/>
 * Project: JavaCert <p/>
 * Description: The base class for common behavior for all extending certification
 * chapter classes. <p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Oct 15, 2016
 *  Updates:  Refactored to be base class implementing interface - D.F- 02/17/17
 ****************************************************************************/

public abstract class AbstractCertBase implements CertInterface{
	
	/*Our logger for output*/
	protected Logger logger = Logger.getLogger( AbstractCertBase.class.getName() );
	//TODO configure logger for use 
	
	/**
	 * Gives brief description of each chapter found in book. Subclasses should
	 * override to give a more detailed description
	 */
	protected void chapterSynopsis(){
		System.out.println("The chapters covered through out the OCA/OCP "
				+ "exam book are:");
		//TODO - Create listing(hashMap?) of each chapter and very short description
	}
}
