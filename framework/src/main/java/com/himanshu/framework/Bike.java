package com.himanshu.framework;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vechile {
	public void drive() {
		System.out.println(" Hey we are riding the bike.");
		
	}
}
