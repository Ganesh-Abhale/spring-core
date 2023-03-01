package com.pack2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Intel implements Laptopprocessor{


	public void use() {
		
		System.out.println("This Laptop is using Intel Proccesor!");
	}
}
