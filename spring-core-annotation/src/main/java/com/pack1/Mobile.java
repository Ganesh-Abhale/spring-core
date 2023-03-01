package com.pack1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration (value = "bhai")
public class Mobile {

	Sim sim;
	
	@Autowired
	public Mobile(Sim sim) {
		super();
		this.sim = sim;
	}
	public void mobile1() {

		System.out.println("Sim is present in Mobile!");
		sim.sim1();
	}
	
}
