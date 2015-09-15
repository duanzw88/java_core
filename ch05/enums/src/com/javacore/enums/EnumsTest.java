package com.javacore.enums;

public class EnumsTest
{

	public static void main(String[] args)
	{
		Employee ee = new Employee("staff",100,1,1,1);
		Class cl = ee.getClass();
		
		System.out.println(ee.getClass().getName() + ":" + cl.getName());

	}

}
