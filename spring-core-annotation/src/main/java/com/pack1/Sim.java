package com.pack1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Sim {
	
	@Value(value = "34")
	int id;
	@Value(value = "jio")
	String network;
	public Sim(int id, String network) {
		super();
		this.id = id;
		this.network = network;
	}
	Sim() {
		
	}
	public void sim1()
	{
		System.out.println("Sim Card Id is "+id);
		System.out.println("Sim Card Network is "+network);
	}

}
