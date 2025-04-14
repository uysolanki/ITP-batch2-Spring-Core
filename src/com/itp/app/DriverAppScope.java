package com.itp.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.model.Car;
import com.itp.model.Engine;
import com.itp.model.Tyre;

public class DriverAppScope {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/app-context.xml");
		System.out.println("Hii");
		
		Engine engine1=beanFactory.getBean("e1",Engine.class);
		System.out.println(engine1);
		
		Engine engine2=beanFactory.getBean("e1",Engine.class);
		System.out.println(engine2);
		
		System.out.println(engine1==engine2);	
	}
}
//Hi
//All Args Constructor of Engine Invoked
//ToString of Engine
//All Args Constructor of Engine Invoked
//ToString of Engine
//false