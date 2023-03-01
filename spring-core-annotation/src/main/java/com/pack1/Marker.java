package com.pack1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Marker {
	
	@Value(value = "354")  //it will take default value
	int id;
	@Value(value = "dhanu")
	String name;
	
	public Marker()//when we not use default constructor then we got exception and we are not give value it will take automatically default value 
	{
		
	}

	public Marker(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void mark1()
	{
		System.out.println("marker id is "+id);
		System.out.println("marker name is "+name);
	}
	
	

}
