package com.nirsb.legacy.lifecycle;

public class BeanLifeCycle {
	
	//initializing an init method
	public void initBean() {
		System.out.println("This is initial method of bean BeanLifeCycle");
	}
	//initializing an destroy method
	public void destroyBean() {
		System.out.println("This is destroy method of bean BeanLifeCycle");
	}

}
