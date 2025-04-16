package com.itp.app;

import java.util.Date;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.model.Student;

public class DriverAppBeanLC {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/app-context2.xml");
		System.out.println("Hii");
		
		Student student=beanFactory.getBean("s1", Student.class);
		
		System.out.println(student);
		Date d;
		for(int i=1;i<=100000;i++)
		{
			d=new Date();
		}
		
		System.gc();
		AbstractApplicationContext abs=( AbstractApplicationContext) beanFactory;
		abs.registerShutdownHook();
		
	}
}