package com.javacore.enums;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Employee
{
	private String 	name = "";
	private double	salary = 0;
	private Date 	hireDay = new Date();
	
	public Employee(String n,double s,int year,int month,int day)
	{
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year,month,day);
		hireDay = calendar.getTime();
		
	}
	public String getName()
	{
		return name;
	};
	public double getSalary()
	{
		return salary;
	}
	public Date getHireDay()
	{
		return hireDay;
	}
	
	public void raiseSalary(double precent)
	{
		salary += salary * precent / 100;
	}
	
	
	@Override
	public boolean equals(Object otherObj)
	{
		if(this == otherObj)
		{
			return true;
		}
		if(otherObj == null)
		{
			return false;
		}
		if(getClass() != otherObj.getClass())
		{
			return false;
		}
		
		
		Employee other = (Employee)otherObj;
		
		return Objects.equals(name,other.getName())
				&& salary == other.getSalary()
				&& Objects.equals(hireDay,other.getHireDay());
	}
	@Override
	public String toString()
	{
		return "Employee[name=" + name
				+ ",salary=" + salary
				+ ",hireDay=" + hireDay
				+ "}";
	}
	
	
}
