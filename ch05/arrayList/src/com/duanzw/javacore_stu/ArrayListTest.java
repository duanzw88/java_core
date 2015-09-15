package com.duanzw.javacore_stu;

import java.util.ArrayList;

public class ArrayListTest
{

	public static void main(String[] args)
	{
		/*
		ArrayList<Employee> staff = new ArrayList<Employee>();
		
		staff.add(new Employee("staff1",100,1988,1,1));
		staff.add(new Employee("staff2",200,1989,1,1));
		staff.add(new Employee("staff3",300,1990,1,1));
		
		for(Employee ee : staff)
		{
			ee.raiseSalary(5);
			System.out.println(ee.toString());
		}
		*/
		int x = 40;
		String s = Integer.toString(x);
		
		System.out.println(s);
		int y = Integer.parseInt(s);
		System.out.println(y);
		System.out.println(max(1,2,3,4,5,6,8.00));
	}
	
	public static double max(double... values)
	{
		double largest = Double.MIN_VALUE;
		for(double v:values)
		{
			if(v > largest)
			{
				largest = v;
			}
		}
		
		return largest;
	}

}
