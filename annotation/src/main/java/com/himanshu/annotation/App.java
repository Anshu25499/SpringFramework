package com.himanshu.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.SimpleAliasRegistry;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
    	ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
    	
    	//Simple method to call the apple class.
//    	Apple apple = new Apple();
//    	apple.phone();
    	
    	//This is used by creating a bean in the config class.
    	Apple apple = context.getBean(Apple.class);
    	apple.phone();
    	
    }
}
