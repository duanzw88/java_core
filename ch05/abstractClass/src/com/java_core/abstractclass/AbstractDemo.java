package com.java_core.abstractclass;

public class AbstractDemo
{

	public static void main(String[] args)
	{
//		Person[] person = new Person[2];
//		
//		person[0] = new Employee("employee",100,1988,2,1);
//		person[1] = new Student("stu","2");
//		
//		for(Person p :  person)
//		{
//			System.out.println(p.getName() +":"+ p.getDescription());
//		}
		Employee aa = new Employee(null,100,1,1,1);
		Student  ss = new Student("dd","3");
		
		if(aa instanceof Person)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}

	}

}
