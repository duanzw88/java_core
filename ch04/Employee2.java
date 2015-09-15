

public class Employee2
{
	private static int nextId = 1;
	
	private String name;
	private double salary;
	private int 		id;
	
	public Employee2(String name,double s)
	{
		this.name = name;
		salary = s;
		id = 0;
		
	}
	
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
	public int getId()
	{
		return id;
	}
	
	public void setId()
	{
		id = nextId;
		nextId++;
	}
	
	public static int getNextId()
	{
		return nextId;
	}
	
	public static void swap(Employee2 a,Employee2 b)
	{
		System.out.println("a -" + a.toString() + "   b - " + b.toString());
		Employee2 temp = a;
		a = b;
		b = temp;
		System.out.println("change");
		System.out.println("a -" + a.toString() + "   b - " + b.toString());
		
		
	}
	public static void upId(Employee2 a)
	{
		a.setId();
		
	}
	public static void main(String[] args)
	{
		Employee2 aa = new Employee2("aa",50000);
		Employee2 bb = new Employee2("bb",60000);
		System.out.println("aa -" + aa.toString() + "   bb - " + bb.toString());
//		System.out.println(aa.getName() + " " + aa.getSalary() + " id = " + aa.getId());
		swap(aa, bb);
//		//upId(aa);
//		System.out.println(aa.getName() + " " + aa.getSalary() + " id = " + aa.getId());
		
		
	}
}