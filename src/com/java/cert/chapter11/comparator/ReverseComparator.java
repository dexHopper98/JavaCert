package com.java.cert.chapter11.comparator;

import java.util.Comparator;

/****************************************************************************
 * Title: ReverseComparator.java <p/>
 * Project: JavaSandBox <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2016<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jun 21, 2016
 ****************************************************************************/

public class ReverseComparator implements Comparator<String> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(String strgVal1, String strgVal2) {
		//reverse the order by comparing val 2 to val 1
		return strgVal2.compareTo(strgVal1);
	}

}
