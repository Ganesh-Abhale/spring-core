package com.pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MobileDriver {

	public static void main(String[] args) {
		
		ApplicationContext context= new AnnotationConfigApplicationContext(Configration.class);
		
	 Mobile m1=(Mobile)context.getBean("bhai");
	 
	 m1.mobile1();

	}

}
