package com.itp.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student// implements InitializingBean,DisposableBean
{

	private int rno;
	private String sname;
	private double per;
	
	public Student() {
		System.out.println("Student Class Constuctor Called");
	}

	public Student(int rno, String sname, double per) {
		super();
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}

	public int getRno() {
		return rno;
	}

	public void setRno(int rno) {
		this.rno = rno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [rno=" + rno + ", sname=" + sname + ", per=" + per + "]";
	}


	@PreDestroy
	public void xyz() 
	{
		System.out.println("Called Just Before Destruction");
		
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object Destroyed");
	}
	
	@PostConstruct
	public void abc() 
	{
	System.out.println("Called Immediately after Constructor");	
	}
	
}
