package com.himanshu.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.himanshu.annotation")
public class ConfigClass {
//	@Bean
//	public Apple getpApple() {
//		return new Apple();
//	}
//	
//	@Bean
//	public MobileProcessor getMobileProcessor() {
//		return new Snapdragon();
//	}
}
