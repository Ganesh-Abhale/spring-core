package com.pack2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Amd implements Laptopprocessor{
	
	public void use() {
		
		System.out.println("this laptop is using AMD processor!");
	}

}
