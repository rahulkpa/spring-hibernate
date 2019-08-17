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
		/* This peace of code through error as there is no default constructor available for "InjectionThroughConstructor"
		InjectionThroughConstructor injectionThroughConstructor1 = context.getBean("injection1", InjectionThroughConstructor.class);
		injectionThroughConstructor1.display();
		*/
	}
}
