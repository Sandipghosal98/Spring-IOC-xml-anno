package com.org;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("kit")
@Primary
public class KitKat implements Chocolate{
	public void eat() {
		System.out.println("eating kitkat");
	}
}
