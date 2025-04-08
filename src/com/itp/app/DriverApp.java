package com.itp.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.model.Car;
import com.itp.model.Engine;
import com.itp.model.Tyre;

public class DriverApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/app-context.xml");
		
		Engine engine1=beanFactory.getBean("e1",Engine.class);
		System.out.println(engine1);
		
		Engine engine2=beanFactory.getBean("e2",Engine.class);
		System.out.println(engine2);
		
		
		Tyre tyre1=(Tyre)beanFactory.getBean("t1");
		System.out.println(tyre1);
		
		Tyre tyre2=(Tyre)beanFactory.getBean("t2");
		System.out.println(tyre2);
		
		Car car1=beanFactory.getBean("c1",Car.class);
		System.out.println(car1);
	}
}
