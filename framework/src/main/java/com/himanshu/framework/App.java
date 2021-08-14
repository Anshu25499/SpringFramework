package com.himanshu.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
    	
    	//This is the annotation based configuration.
//    	Vechile v = (Vechile)context.getBean("vechile");
//    	v.drive();
    	
    	//This is the xml based configuration.
//    	Vechile vechile = (Vechile)context.getBean("car");
//    	vechile.drive();
    	
//    	Tyre tyre = (Tyre)context.getBean("tyre");
//    	System.out.println(tyre);
    	
   	Car car = (Car)context.getBean("car");
   	car.drive();
    }
}
