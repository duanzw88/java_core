package com.java_core.abstractclass;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Employee extends Person
{
	private double salary;
	private Date   hireDay;
	public Employee(String n,double s,int year,int month,int day)
	{
		super(n);
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year,month,day);
		hireDay = calendar.getTime();
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public Date getHireDay()
	{
		return hireDay;
	}
	
	@Override
	public String getDescription()
	{
		return "Employee";
	}
	
	public void raiseSalary(double percent)
	{
		salary +=  salary * percent / 100;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		
		if(obj == null)
		{
			return false;
		}
		
		if(getClass() != obj.getClass())
		{
			return false;
		}
		
		Employee other = (Employee)obj;
		
		//return (super.getName().equals(other.getName())) 
		return Objects.equals(getName(),other.getName())
				&& salary == other.salary 
				&& (hireDay.equals(other.getHireDay()));
		
	}
	
}
