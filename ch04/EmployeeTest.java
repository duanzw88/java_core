import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee harry = new Employee(2011,8,23);
		Date d = harry.getHireDay();
		d.setTime(d.getTime() - 2);
		System.out.println(harry.getHireDay().toString());
	}
}

class Employee
{
	private Date hireDay;
	
	public Employee(int year,int month,int day)
	{
		GregorianCalendar gCalendar = new GregorianCalendar(year,month - 1,day);
		hireDay = gCalendar.getTime();
		
	}
	
	public Date getHireDay()
	{
		return (Date)hireDay.clone();
	}
}
