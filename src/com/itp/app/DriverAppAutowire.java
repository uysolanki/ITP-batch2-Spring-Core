package com.itp.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.model.Car;
import com.itp.model.Engine;
import com.itp.model.Tyre;

public class DriverAppAutowire {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/app-context.xml");
		
		
		Car car2=beanFactory.getBean("c2",Car.class);
		System.out.println(car2);
	}
}
