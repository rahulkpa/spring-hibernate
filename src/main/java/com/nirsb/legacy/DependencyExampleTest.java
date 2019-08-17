package com.nirsb.legacy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyExampleTest {
    public static void main(String[] args) {
		/* Load the configuration from xml file*/
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring-dispatcher.xml");
		
    	/*Retrieve the bean using context*/
		Coach coach1 = context.getBean("coach1", Coach.class);
		Coach coach2 = context.getBean("coach2", Coach.class);
		
		/* invoking the respective method for above beans*/
		coach1.display();
		coach2.display();
	}
}
