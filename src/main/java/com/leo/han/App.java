package com.leo.han;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.leo.han.component.Camera;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("mycontext.xml");
		
		Camera c = (Camera)context.getBean("camera");
		
		c.takeShot();
		
		context.close();
	}

}
