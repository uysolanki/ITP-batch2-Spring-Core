package com.itp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.itp.config.AppContext;
import com.itp.model.Car;
import com.itp.model.Engine;
import com.itp.model.Tyre;

public class DriverAppForJavaBasedBeans {

	public static void main(String[] args) {
		ApplicationContext beanFactory = new AnnotationConfigApplicationContext(AppContext.class);
		System.out.println("Hii");
		
//		Engine engine1=beanFactory.getBean("getEngineUsingConstructor",Engine.class);
//		System.out.println(engine1);
		
		Car car1=beanFactory.getBean("c81",Car.class);
		System.out.println(car1);
		
		}
}
