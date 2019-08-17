package com.nirsb.legacy.constructor;

public class InjectionThroughConstructor {
        private FortuneService ortuneService;
        
        InjectionThroughConstructor(FortuneService ortuneService){
        	this.ortuneService = ortuneService;
        }
        
        public void display() {
        	ortuneService.fortune();
        }      
}
