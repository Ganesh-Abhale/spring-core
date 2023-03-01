package com.pack2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LaptopDriver {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Configration1.class);
		
		Laptop lp1=context.getBean(Laptop.class);
		lp1.myuse();
		
	

	}

}
