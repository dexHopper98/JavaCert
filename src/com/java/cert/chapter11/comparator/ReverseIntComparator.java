package com.java.cert.chapter11.comparator;

import java.util.Comparator;

/****************************************************************************
 * Title: ReverseIntComparator.java <p/>
 * Project: JavaCert <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since May 3, 2017
 ****************************************************************************/

public class ReverseIntComparator implements Comparator<Integer>{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Integer valOne, Integer valTwo) {
		/*Key things to remember:
		 * 1) To do comparision, it whatever code is performing looping(Arrays.sort()), 
		 * it must compare each current index to whats ever came before it 
		 * 2) The rules for comparison: negative = this object is less than other,
		 *    0 = this object is equal, positive = this object is greater than other.
		 *3) Determines where to place numbers based on number returned */		
		return valTwo - valOne;
	}

}
