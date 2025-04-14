package com.itp.app;

import com.itp.model.Singleton;

public class SingletonDriver {

	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		
		System.out.println(s1==s2);
		s1.display();
		s2.display();
		
		

	}

}
