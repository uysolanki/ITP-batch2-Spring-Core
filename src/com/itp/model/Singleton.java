package com.itp.model;

public class Singleton {

	static Singleton singleton=null;
//	private Singleton() {}
	public static Singleton getInstance() {
		if(singleton==null)
		{
			singleton=new Singleton();
		}
		
		return singleton;
	}

	public void display()
	{
		System.out.println("Welcome");
	}
}
