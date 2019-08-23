package com.nirsb.legacy.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-dispatcher.xml");

		System.out.println("This is begining of Bean get");
		//get the bean 

		BeanLifeCycle lifeCycleTest = applicationContext.getBean("beanTest", BeanLifeCycle.class);

		System.out.println("This is end of Bean get");

		applicationContext.close();

	}
}
