package com.java_core.abstractclass;

public class Student extends Person
{

	private String major;
	
	/**
	 * @param n  name
	 * @param m	 major
	 */
	public Student(String n,String m)
	{
		super(n);
		major = m;
	}

	@Override
	public String getDescription()
	{
		return "This is a Student:" + major; 
	}

}
