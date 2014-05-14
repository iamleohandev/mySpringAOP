package com.leo.han.aspect;

import org.springframework.stereotype.Component;


@Component
public class MyLogger {

	public void logBeforeMethod(){
		
		System.out.println("log before method");
	}
	
	
	public void logAfterMethod(){
		
		System.out.println("log after method");
	}
	
	
	
}
