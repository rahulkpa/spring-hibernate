package com.nirsb.legacy.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoadValueFromPropertyFile {
public static void main(String[] args) {
	/* Load the configuration from xml file*/
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-dispatcher.xml");
	
	/*Retrieve the bean using context*/
	LoadPojo loadPojo = context.getBean("loadPojo", LoadPojo.class);
	/* invoking the respective method for above beans*/
	loadPojo.printDetails();
}
}
