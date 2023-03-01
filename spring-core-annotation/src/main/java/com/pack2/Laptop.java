package com.pack2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	@Autowired
	
	
	@Qualifier(value = "intel")
	
	Laptopprocessor laptopprocessor;
	@Value(value = "HP")
	String name;
	@Value(value = "23")
	int id;
	@Value(value = "12.2432")
	double cost;
	
	public void myuse()
	{
		System.out.println("MyuseMethod!");
		
		laptopprocessor.use();
	}
	
}
