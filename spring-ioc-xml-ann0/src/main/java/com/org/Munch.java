package com.org;

import org.springframework.stereotype.Component;

@Component("m")
public class Munch implements Chocolate{
	public void eat() {
		System.out.println("eating munch");
	}

}
