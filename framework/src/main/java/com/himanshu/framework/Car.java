package com.himanshu.framework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vechile {
	@Autowired
	private Tyre t;
	
	public Tyre getTyre() {
		return t;
	}

	public void setTyre(Tyre tyre) {
		this.t = t;
	}

	public void drive() {
	System.out.println("Hey I am driving the car having "+ t);
	}
}
