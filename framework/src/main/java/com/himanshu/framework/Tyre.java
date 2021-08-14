package com.himanshu.framework;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	private String brand;
	
	//It is called the Constructor injection.
//	public Tyre(String brand) {
//		this.brand = brand;
//	}

	public String getBrand() {
		return brand;
	}
//It is the setter injection.
	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Ceat tyre";
	}
	
	

}
