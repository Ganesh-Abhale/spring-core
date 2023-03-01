package com.pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Markerdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Configration.class);
		
		Marker marker1=(Marker)context.getBean("marker");
		//marker1.mark1();
		System.out.println(marker1);
		
		Marker marker2=context.getBean("marker",Marker.class);
		//marker2.mark1();
		System.out.println(marker2);
		
		Marker marker3=context.getBean("marker",Marker.class);
		//marker3.mark1();
		System.out.println(marker3);
		
		
		//Marker marker=context.getBean("marker",Marker.class);
	}

}
