package com.himanshu.annotation;

import java.security.interfaces.ECPublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Apple {
	
	@Autowired
	@Qualifier("mediaTek")
	public MobileProcessor cpu;
	
	
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void phone() {
		System.out.println("Apple Phone");
		cpu.process();
	}
	
	

}
