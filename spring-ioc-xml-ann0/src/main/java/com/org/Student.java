package com.org;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("std")
public class Student {
	private int roll;
	private String name;
	private int age;
	public Student(@Value("1")int roll, @Value("chota bheem")String name, @Value("14")int age) {
//		super();
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	
//	public Student() {
//		
//	}
	
	void display(){
		System.out.println(roll);
		System.out.println(name);
		System.out.println(age);
	}
}
