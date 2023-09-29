package com.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class pilot {

	public static void main(String[] args) {
	  ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
	  Aeroplane al = (Aeroplane) ac.getBean("aero");
	  System.out.println(al);
	  Aeroplane a2 = (Aeroplane) ac.getBean("aero");
	  
	  System.out.println(a2);

	}

}
