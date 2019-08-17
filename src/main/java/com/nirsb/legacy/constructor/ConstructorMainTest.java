package com.nirsb.legacy.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMainTest {
	public static void main(String[] args) {
		/* Load the configuration from xml file*/
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-dispatcher.xml");

		/*Retrieve the bean using context*/
		InjectionThroughConstructor injectionThroughConstructor = context.getBean("injection", InjectionThroughConstructor.class);
		/* invoking the respective method for above beans*/
		injectionThroughConstructor.display();
	}
}
