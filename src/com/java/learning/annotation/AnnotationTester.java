package com.java.learning.annotation;

import java.lang.reflect.Method;

/****************************************************************************
 * Title: AnnotationTester.java <p/>
 * Project: JavaCert <p/>
 * Description: Test Annotation Runner, to help demonstrate the use of 
 * annotations through reflection <p/>
 * Copyright: Copyright (c) 2017<p/>
 * Company: Silicon Mountain Technologies<p/>
 * @author Devon Franklin
 * @version 1.0
 * @since Feb 1, 2017
 ****************************************************************************/

public class AnnotationTester {

	public static void main(String[] args) {
        AnnonationRunner runner = new AnnonationRunner();
        Method[] methods = runner.getClass().getMethods();

        for (Method method : methods) {
            CanRun annos = method.getAnnotation(CanRun.class);
            if (annos != null) {
                try {
                    method.invoke(runner);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
	}
}
