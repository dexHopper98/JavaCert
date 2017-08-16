package com.java.learning.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/****************************************************************************
 * Title: LegacyAPI.java <p/>
 * Project: JavaCert <p/>
 * Description: <p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Jan 30, 2017
 ****************************************************************************/

@Documented
@Target(ElementType.PACKAGE)
@Retention(RetentionPolicy.CLASS)
public @interface LegacyAPI {
	int javaVersionNo();
	String history() default "N/A";
	String creationDate();
}
