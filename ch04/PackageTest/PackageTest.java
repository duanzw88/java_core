

import com.duanzw.corejava.*;

public class PackageTest
{
	public static void main(String[] args)
	{
		Employee harry = new Employee("Hacker",5000,1989,10,1);
		harry.raiseSalary(5);
		
		System.out.println("test");
		System.out.println("name" + harry.getName() + ",salary = " + harry.getSalary());
	}
}