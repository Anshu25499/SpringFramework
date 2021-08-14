package com.himanshu.annotation;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Snapdragon implements MobileProcessor {

	public void process() {
		System.out.println("Snapdragon Processor used.");

	}

}
